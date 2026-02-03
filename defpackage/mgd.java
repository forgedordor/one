package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgd {
    public final String a;

    private mgd(String str) {
        this.a = str;
    }

    public static mgd a(mfr mfrVar) {
        String str;
        mfrVar.L(2);
        int iJ = mfrVar.j();
        int i = iJ >> 1;
        int i2 = iJ & 1;
        int iJ2 = mfrVar.j() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = iJ2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new mgd(sb.toString());
    }
}
