package com.sun.jna;

import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StringArray extends Memory implements Function.PostCallRead {
    private String encoding;
    private List<NativeString> natives;
    private Object[] original;

    public StringArray(WString[] wStringArr) {
        this(wStringArr, "--WIDE-STRING--");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.sun.jna.WString] */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        String wideString;
        boolean z = this.original instanceof WString[];
        boolean zEquals = "--WIDE-STRING--".equals(this.encoding);
        for (int i = 0; i < this.original.length; i++) {
            Pointer pointer = getPointer(Native.POINTER_SIZE * i);
            if (pointer != null) {
                wideString = zEquals ? pointer.getWideString(0L) : pointer.getString(0L, this.encoding);
                if (z) {
                    wideString = new WString(wideString);
                }
            } else {
                wideString = null;
            }
            this.original[i] = wideString;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public String toString() {
        return (true != "--WIDE-STRING--".equals(this.encoding) ? "const char*[]" : "const wchar_t*[]").concat(String.valueOf(String.valueOf(Arrays.asList(this.original))));
    }

    private StringArray(Object[] objArr, String str) {
        super((objArr.length + 1) * Native.POINTER_SIZE);
        this.natives = new ArrayList();
        this.original = objArr;
        this.encoding = str;
        int i = 0;
        while (true) {
            Pointer pointer = null;
            if (i >= objArr.length) {
                setPointer(Native.POINTER_SIZE * r1, null);
                return;
            }
            Object obj = objArr[i];
            if (obj != null) {
                NativeString nativeString = new NativeString(obj.toString(), str);
                this.natives.add(nativeString);
                pointer = nativeString.getPointer();
            }
            setPointer(Native.POINTER_SIZE * i, pointer);
            i++;
        }
    }

    public StringArray(String[] strArr) {
        this(strArr, false);
    }

    public StringArray(String[] strArr, String str) {
        this((Object[]) strArr, str);
    }

    public StringArray(String[] strArr, boolean z) {
        this((Object[]) strArr, z ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }
}
