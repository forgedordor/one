package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtp extends fguu {
    private final String a;

    public fgtp(String str) {
        this.a = str;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrh fgrhVar = fgrsVar2.h;
        if (fgrhVar == null) {
            return false;
        }
        String str = this.a;
        String strE = fgrhVar.e("class");
        int length = strE.length();
        int length2 = str.length();
        if (length == 0 || length < length2) {
            return false;
        }
        if (length == length2) {
            return str.equalsIgnoreCase(strE);
        }
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(strE.charAt(i2))) {
                if (!z) {
                    i = i2;
                }
                z = true;
            } else {
                if (z && i2 - i == length2 && strE.regionMatches(true, i, str, 0, length2)) {
                    return true;
                }
                z = false;
            }
        }
        if (z && length - i == length2) {
            return strE.regionMatches(true, i, str, 0, length2);
        }
        return false;
    }

    public final String toString() {
        return String.format(".%s", this.a);
    }
}
