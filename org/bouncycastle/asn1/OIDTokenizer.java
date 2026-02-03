package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class OIDTokenizer {
    private final String a;
    private int b = 0;

    public OIDTokenizer(String str) {
        this.a = str;
    }

    public final String a() {
        int i = this.b;
        if (i == -1) {
            return null;
        }
        String str = this.a;
        int iIndexOf = str.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = str.substring(this.b);
            this.b = -1;
            return strSubstring;
        }
        String strSubstring2 = str.substring(this.b, iIndexOf);
        this.b = iIndexOf + 1;
        return strSubstring2;
    }

    public final boolean b() {
        return this.b != -1;
    }
}
