/*
    THIS WAS TAKEN ALMOST WITHOUT ANY EDITING FROM LDPL
      IT *NEEDS* TO BE CLEARED AND ORDERED A LITTLE!!
*/

#ifndef CHTEXT
#define CHTEXT
#include <string>
#include <iostream>
#include <vector>
#include <fstream>
#include <sstream>
#include <fcntl.h>
#include <string.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <unistd.h>
using namespace std;

class chText 
{
    private:
    vector<string> buffer;
    size_t chText_get_str_utf8length (const string cstr);
    void createFromString (const string & cstr);
    void createFromChar (const char * cstr);
    void createFromMem (const char * mem, size_t len);

    public:
    size_t size() const;
    bool empty() const;
    size_t length() const;
    string str_rep() const;
    const char * c_str();
    chText();
    chText (const string& x);
    chText (const double& f);
    chText& operator= (const string& x);
    chText (const char * x);
    chText& operator= (const char * x);
    chText (const char * x, size_t len);
    chText (char x);
    chText& operator= (char x);
    chText operator [](size_t i) const;
    string & operator [](int i);
    friend ostream & operator << (ostream &out, const chText &c);
    friend chText operator+(const chText &c1, const chText &c2);
    friend chText operator+(const string &c1, const chText &c2);
    friend chText operator+(const chText &c1, const string &c2);
    friend chText operator+(const char * c1, const chText &c2);
    friend chText operator+(const chText &c1, const char * c2);
    friend bool operator<(const chText &c1, const chText &c2);
    friend bool operator>(const chText &c1, const chText &c2);
    friend bool operator<=(const chText &c1, const chText &c2);
    friend bool operator>=(const chText &c1, const chText &c2);
    friend bool operator==(const chText& ch1, const chText& ch2);
    friend bool operator==(const chText& ch1, const string& ch2);
    friend bool operator==(const chText& ch1, const char * ch2);
    friend bool operator==(const string& ch2, const chText& ch1);
    friend bool operator==(const char * ch2, const chText& ch1);
    friend bool operator==(const chText& ch1, const char ch2);
    friend bool operator==(const char ch2, const chText& ch1);
    friend bool operator!=(const chText& ch1, const chText& ch2);
    operator string() const 
    {
        return str_rep();
    }
    bool loadFile(const string &fileName);
    chText & operator += (const chText & txt);
    chText & operator += (const string & txt);
    chText & operator += (const char * txt);
    bool isAlphanumeric();
    bool isAlphanumeric(size_t from);
    bool isNumber();
    double getNumber();
    chText substr(size_t from, size_t count);
    chText & erase(size_t from, size_t count);
    chText substr(size_t from);
    int compare(size_t from, size_t count, const chText &other);
    int compare(const chText &other);
};

ostream & operator << (ostream &out, const chText &c);
chText operator+(const chText &c1, const chText &c2);
chText operator+(const string &c1, const chText &c2);
chText operator+(const chText &c1, const string &str);
chText operator+(const char * c1, const chText &c2);
chText operator+(const chText &c1, const char * str);
bool operator==(const chText& ch1, const chText& ch2);
bool operator==(const string& c1, const chText& ch2);
bool operator==(const chText& ch1, const string& c2);
bool operator==(const char * c1, const chText& ch2);
bool operator==(const chText& ch1, const char * c2);
bool operator==(const char c1, const chText& ch2);
bool operator==(const chText& ch1, const char c2);
bool operator<(const chText &c1, const chText &c2);
bool operator>(const chText &c1, const chText &c2);
bool operator<=(const chText &c1, const chText &c2);
bool operator>=(const chText &c1, const chText &c2);
bool operator!=(const chText& ch1, const chText& ch2);
chText to_ldpl_string(double x);
#endif

// Gets length of utf8-encoded c++ string
size_t chText::chText_get_str_utf8length(const string cstr){
    size_t len = cstr.size();
    size_t utf8len = 0;
    unsigned int c;
    for (size_t i = 0; i < len; i++)
    {
        size_t l = 0;
        c = (unsigned char) cstr[i];
        if (c >= 0 && c <= 127) l = 0;
        else if ((c & 0xE0) == 0xC0) l = 1;
        else if ((c & 0xF0) == 0xE0) l = 2;
        else if ((c & 0xF8) == 0xF0) l = 3;
        else if (c>=248 && c<=255) return 0; //invalid utf8
        i += l;
        utf8len++;
    }
    return utf8len;
}

// Fills buffer with utf8-encoded c++ string
void chText::createFromString(const string & cstr){
    createFromMem(cstr.c_str(), cstr.size());
}
// Fills buffer with utf8-encoded c++ string
void chText::createFromChar(const char * cstr){
    // If we copy the implementation we can do without the `strlen` call.
    createFromMem(cstr, strlen(cstr));
}
// Fills buffer with utf8-encoded c++ string
void chText::createFromMem(const char * cstr, size_t cstrlen){
    buffer.clear();
    size_t chPos = 0;
    for(size_t i = 0; i < cstrlen; ++i){
        string ch = "";
        char c = cstr[i];
        if (c >= 0 && c <= 127){
            ch += c;
        }
        else if ((c & 0xE0) == 0xC0){
            ch += c;
            ch += cstr[++i];
        }
        else if ((c & 0xF0) == 0xE0){
            ch += c;
            ch += cstr[++i];
            ch += cstr[++i];
        }
        else if ((c & 0xF8) == 0xF0){
            ch += c;
            ch += cstr[++i];
            ch += cstr[++i];
            ch += cstr[++i];
        }
        buffer.push_back(ch);
        chPos++;
    }
}
size_t chText::size() const {
    return buffer.size();
}
bool chText::empty() const {
    return buffer.empty();
}
size_t chText::length() const {
    return size();
}
string chText::str_rep() const
{
    string stringRep = "";
    for(size_t i = 0; i < size(); ++i){
        stringRep += buffer[i];
    }
    return stringRep;
}
const char * chText::c_str()
{
    return this->str_rep().c_str();
}
// default constructor
chText::chText(){}
// conversion from string (constructor):
chText::chText (const string& x) {
    createFromString(x);
}

// conversion from double (constructor):
chText::chText (const double& f) {
    std::string str = to_string (f);
    str.erase(str.find_last_not_of('0') + 1, std::string::npos);
    str.erase ( str.find_last_not_of('.') + 1, std::string::npos );
    createFromString(str);
}

// conversion from string (assignment):
chText& chText::operator= (const string& x) {
    createFromString(x);
    return *this;
}
// conversion from char * (constructor):
chText::chText (const char * x) {
    createFromChar(x);
}
// conversion from char * (assignment):
chText& chText::operator= (const char * x) {
    createFromChar(x);
    return *this;
}
// conversion from char * and size (constructor):
chText::chText (const char * x, size_t len) {
    createFromMem(x, len);
}
// conversion from char (constructor):
chText::chText (char x) {
    createFromMem(&x, 1);
}
// conversion from char (assignment):
chText& chText::operator= (char x) {
    createFromMem(&x, 1);
    return *this;
}
// [] for reading
chText chText::operator [](size_t i) const {
    if(i >= buffer.size()){
        cout << "Out-of-bounds index access." << endl;
        exit(1);
    }
    chText c = buffer[i];
    return c;
}
// [] for setting
string & chText::operator [](int i) {
    if(i >= buffer.size()){
        cout << "Out-of-bounds index access." << endl;
        exit(1);
    }
    return buffer[i];
}
bool chText::loadFile(const string &fileName){
    int fd = open(fileName.c_str(), O_RDONLY);
    if (fd == -1)
        return false;
    struct stat buf;
    if (fstat(fd, &buf) == -1) {
        close(fd);
        return false;
    }
    size_t flen = buf.st_size;
    void *fmmap = mmap(NULL, flen, PROT_READ, MAP_SHARED, fd, 0);
    if (fmmap == MAP_FAILED) {
        close(fd);
        return false;
    }
    createFromMem((const char *)fmmap, flen);
    munmap(fmmap, flen);
    close(fd);
    return true;
}
// += operator
chText & chText::operator += (const chText & txt){
    buffer.insert(buffer.end(), txt.buffer.begin(), txt.buffer.end());
    return *this;
}
// += operator
chText & chText::operator += (const string & txt){
    chText c2 = txt;
    buffer.insert(buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return *this;
}
// += operator
chText & chText::operator += (const char * txt){
    chText c2 = txt;
    buffer.insert(buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return *this;
}

bool chText::isAlphanumeric(){
    for(const string & s : buffer){
        for(const char & c : s)
            if(!isalnum(c)) return false;
    }
    return true;
}

bool chText::isAlphanumeric(size_t from){
    for(size_t i = from; i < size(); ++i){
        for(const char & c : buffer[i])
            if(!isalnum(c)) return false;
    }
    return true;
}

bool chText::isNumber(){
    string number = "";
    for(size_t i = 0; i < size(); ++i){
        number += buffer[i];
    }
    unsigned int firstchar = 0;
    if(number[0] == '-') firstchar = 1;
    if(number[firstchar] == '.') return false; //.12 is not a valid decimal in LDPL, 0.12 is.
    if(number[firstchar] == '+') return false; //+5 is not a valid decimal in LDPL, 5 is.
    istringstream iss(number);
    double f;
    iss >> f;
    bool isNumber = iss.eof() && !iss.fail();
    //If it is a number, it might be an octal literal (e.g. 025, 067, 003 etc)
    //so we proceed to fix the original number to make it decimal.
    if(isNumber){
        string f_number = "";
        unsigned int i;
        for(i = 1; i < number.length(); ++i){
            //If prev char not 0
            if(number[i - 1] != '0'){
                //if prev char is -, continue check
                if(number[i - 1] == '-') f_number += '-';
                //if prev char is number, break
                else break;
            }
            //If prev number is 0
            else if(number[i] == '.') {
                f_number += '0';
            }
        }
        f_number += number.substr(i - 1);
        number = f_number;
        return true;
    }else{
        return false;
    }
}

double chText::getNumber(){
    string number = "";
    for(size_t i = 0; i < size(); ++i){
        number += buffer[i];
    }
    return stod(number);
}

chText chText::substr(size_t from, size_t count){
    count = from + count > buffer.size() ? buffer.size() - from : count;
    chText newText;
    newText.buffer.insert(newText.buffer.begin(), buffer.begin() + from, buffer.begin() + from + count);
    return newText;
}

chText & chText::erase(size_t from, size_t count){
    buffer.erase(buffer.begin() + from, buffer.begin() + from + count);
    return *this;
}

chText chText::substr(size_t from){
    chText newText;
    newText.buffer.insert(newText.buffer.begin(), buffer.begin() + from, buffer.end());
    return newText;
}

// NOTE: returns 0 on equality, -1 if the string is shorter, and 1 in any other case.
int chText::compare(size_t from, size_t count, const chText &other){
    // Fix count to respect the actual end of the buffer.
    count = from + count > buffer.size() ? buffer.size() - from : count;
    // Compare sizes before anything else for efficiency.
    if (count < other.buffer.size()) return -1;
    if (count > other.buffer.size()) return 1;
    for(size_t i = from, j = 0; j < count; ++i, ++j)
        if (buffer[i] != other.buffer[j])
            return 1; // We already know it's not shorter, see above.
    return 0;
}

int chText::compare(const chText &other){
    if (*this == other) return 0;
    if (this->size() < other.size()) return -1;
    else return 1;
}

ostream & operator << (ostream &out, const chText &c){
    for(const string & s : c.buffer){
        out << s;
    }
    return out;
}

chText operator+(const chText &c1, const chText &c2){
    chText res = c1;
    res.buffer.insert(res.buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return res;
}

chText operator+(const string &c1, const chText &c2){
    chText res = c1;
    res.buffer.insert(res.buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return res;
}

chText operator+(const chText &c1, const string &str){
    chText res = c1;
    chText c2 = str;
    res.buffer.insert(res.buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return res;
}

chText operator+(const char * c1, const chText &c2){
    chText res = c1;
    res.buffer.insert(res.buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return res;
}

chText operator+(const chText &c1, const char * str){
    chText res = c1;
    chText c2 = str;
    res.buffer.insert(res.buffer.end(), c2.buffer.begin(), c2.buffer.end());
    return res;
}

bool operator==(const chText& ch1, const chText& ch2){
    return ch1.buffer == ch2.buffer;
}

bool operator==(const string& c1, const chText& ch2){
    const chText ch1 = c1;
    return ch1 == ch2;
}

bool operator==(const chText& ch1, const string& c2){
    const chText ch2 = c2;
    return ch1 == ch2;
}

bool operator==(const char * c1, const chText& ch2){
    const chText ch1 = c1;
    return ch1 == ch2;
}

bool operator==(const chText& ch1, const char * c2){
    const chText ch2 = c2;
    return ch1 == ch2;
}

bool operator==(const char c1, const chText& ch2){
    const chText ch1 = c1;
    return ch1 == ch2;
}

bool operator==(const chText& ch1, const char c2){
    const chText ch2 = c2;
    return ch1 == ch2;
}

bool operator<(const chText &c1, const chText &c2){
    size_t max = c1.buffer.size() > c2.buffer.size() ? c2.buffer.size() : c1.buffer.size();
    for(size_t i = 0; i < max; ++i){
        if(c1.buffer[i] < c2.buffer[i]) return true;
        else if (c1.buffer[i] > c2.buffer[i]) return false;
    }
    return false;
}

bool operator>(const chText &c1, const chText &c2){
    size_t max = c1.buffer.size() > c2.buffer.size() ? c2.buffer.size() : c1.buffer.size();
    for(size_t i = 0; i < max; ++i){
        if(c1.buffer[i] > c2.buffer[i]) return true;
        else if (c1.buffer[i] < c2.buffer[i]) return false;
    }
    return false;
}

bool operator<=(const chText &c1, const chText &c2){
    size_t max = c1.buffer.size() > c2.buffer.size() ? c2.buffer.size() : c1.buffer.size();
    for(size_t i = 0; i < max; ++i){
        if(c1.buffer[i] <= c2.buffer[i]) return true;
        else if (c1.buffer[i] >= c2.buffer[i]) return false;
    }
    return false;
}

bool operator>=(const chText &c1, const chText &c2){
    size_t max = c1.buffer.size() > c2.buffer.size() ? c2.buffer.size() : c1.buffer.size();
    for(size_t i = 0; i < max; ++i){
        if(c1.buffer[i] >= c2.buffer[i]) return true;
        else if (c1.buffer[i] <= c2.buffer[i]) return false;
    }
    return false;
}

bool operator!=(const chText& ch1, const chText& ch2){
    return ch1.buffer != ch2.buffer;
}