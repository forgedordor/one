package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gid implements kfp {
    public final int a;
    public final int b;
    public final int c;
    private final hid d;
    private final gic e = new gic(this);

    public gid(hid hidVar) {
        this.d = hidVar;
        this.a = fdgn.N(hidVar.a, hidVar.b, 0, 6);
        this.b = fdgn.P(hidVar.a, hidVar.b, 0, 6);
        this.c = hidVar.c.length();
    }

    @Override // defpackage.kfp
    public final kfm a(juo juoVar) {
        String strSubstring = juoVar.b;
        int length = strSubstring.length();
        int i = this.c;
        int i2 = 0;
        if (length > i) {
            fddq fddqVarR = fddu.r(0, i);
            strSubstring.getClass();
            fddqVarR.getClass();
            strSubstring = strSubstring.substring(fddqVarR.f().intValue(), fddqVarR.e().intValue() + 1);
            strSubstring.getClass();
        }
        String str = "";
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            int i4 = i3 + 1;
            str = str + strSubstring.charAt(i2);
            if (i4 == this.a || i3 + 2 == this.b) {
                str = str + this.d.b;
            }
            i2++;
            i3 = i4;
        }
        return new kfm(new juo(str), this.e);
    }
}
