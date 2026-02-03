package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rvw extends rzd {
    public rvw(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public final String a() {
        int i;
        int i2;
        int i3;
        if (o()) {
            i3 = this.b;
            i2 = i3;
        } else {
            int i4 = this.b;
            int iCharAt = this.a.charAt(i4);
            if (iCharAt == 45) {
                iCharAt = e();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i4;
            } else {
                int iE = e();
                while (true) {
                    if ((iE < 65 || iE > 90) && ((iE < 97 || iE > 122) && !((iE >= 48 && iE <= 57) || iE == 45 || iE == 95))) {
                        break;
                    }
                    iE = e();
                }
                i = this.b;
            }
            this.b = i4;
            int i5 = i;
            i2 = i4;
            i3 = i5;
        }
        if (i3 == i2) {
            return null;
        }
        String strSubstring = this.a.substring(i2, i3);
        this.b = i3;
        return strSubstring;
    }
}
