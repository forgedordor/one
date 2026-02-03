package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjn extends fgmg {
    @Override // defpackage.fgmj
    public final fgmk a(fgml fgmlVar, fgil fgilVar) {
        fgin fginVar = (fgin) fgmlVar;
        if (fginVar.g >= 4) {
            return null;
        }
        CharSequence charSequence = fginVar.c.a;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = fginVar.f; i4 < length; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i3++;
                } else if (cCharAt == '-') {
                    i++;
                } else {
                    if (cCharAt != '_') {
                        return null;
                    }
                    i2++;
                }
            }
        }
        if (i < 3 || i2 != 0) {
            if ((i2 >= 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0)) {
                return null;
            }
        } else if (i3 != 0) {
            i2 = 0;
            return i2 >= 3 ? null : null;
        }
        String.valueOf(charSequence.subSequence(fginVar.d, charSequence.length()));
        fgig fgigVar = new fgig(new fgjo());
        fgigVar.b = charSequence.length();
        return fgigVar;
    }
}
