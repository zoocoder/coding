//Reverse a string in place.

void reverse(char* str) {
  char* end = str;
  char temp;
  if (str) {
    while(*end) { //find end of array
      ++end;
    }
    --end; //go back one since end is NULL

    while (str < end) {
      temp = *str;
      *str++ = *end;
      *end-- = temp;
    }
  }
}
