// x<<y is equivalent to x*(2^(y))
// vice versa for right shift

// in java
// << represents signed right shift
// so if we want to do -2<<1 it would represent -2 as (2^32-2)=2^32-1 -1 so
// 1111....101
// and after shift it would fill the leading bits with 1 instead of 0 in case of
// negative number
// and 0s in case of positive number

// <<< represents unsigned right shift
// then the leading bits are filled with 0 needless
