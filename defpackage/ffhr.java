package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffhr implements ffht {
    private final String a;
    private final String b;
    private final String c;

    public ffhr(String str) {
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        this.a = str;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            this.b = str.substring(0, iIndexOf);
            strSubstring = str.substring(iIndexOf + 1);
        } else {
            this.b = str;
            strSubstring = null;
        }
        this.c = strSubstring;
    }

    @Override // defpackage.ffhu
    public String b() {
        return this.b;
    }

    @Override // defpackage.ffhu
    public String c() {
        return this.a;
    }

    @Override // defpackage.ffhu
    public String d() {
        return this.c;
    }
}
