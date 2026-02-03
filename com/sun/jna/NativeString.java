package com.sun.jna;

/* compiled from: PG */
/* loaded from: classes2.dex */
class NativeString implements CharSequence, Comparable {
    static final String WIDE_STRING = "--WIDE-STRING--";
    private String encoding;
    private Pointer pointer;

    /* compiled from: PG */
    private class StringMemory extends Memory {
        public StringMemory(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return NativeString.this.toString();
        }
    }

    public NativeString(WString wString) {
        this(wString.toString(), WIDE_STRING);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }

    public boolean equals(Object obj) {
        return (obj instanceof CharSequence) && compareTo(obj) == 0;
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return WIDE_STRING.equals(this.encoding) ? this.pointer.getWideString(0L) : this.pointer.getString(0L, this.encoding);
    }

    public NativeString(String str) {
        this(str, Native.getDefaultStringEncoding());
    }

    public NativeString(String str, String str2) {
        if (str != null) {
            this.encoding = str2;
            if (WIDE_STRING.equals(str2)) {
                StringMemory stringMemory = new StringMemory((str.length() + 1) * Native.WCHAR_SIZE);
                this.pointer = stringMemory;
                stringMemory.setWideString(0L, str);
                return;
            } else {
                byte[] bytes = Native.getBytes(str, str2);
                int length = bytes.length;
                StringMemory stringMemory2 = new StringMemory(length + 1);
                this.pointer = stringMemory2;
                stringMemory2.write(0L, bytes, 0, length);
                this.pointer.setByte(length, (byte) 0);
                return;
            }
        }
        throw new NullPointerException("String must not be null");
    }

    public NativeString(String str, boolean z) {
        this(str, z ? WIDE_STRING : Native.getDefaultStringEncoding());
    }
}
