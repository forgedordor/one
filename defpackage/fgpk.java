package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpk extends fgpo {
    public fgpk(fgmu fgmuVar, int i) {
        super(fgmuVar, i, false, i);
    }

    @Override // defpackage.fgpn, defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        int i2;
        char cCharAt;
        int iC = super.c(fgpzVar, charSequence, i);
        if (iC < 0 || iC == (i2 = this.b + i)) {
            return iC;
        }
        if (this.c && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
            i2++;
        }
        return iC > i2 ? ~(i2 + 1) : iC < i2 ? ~iC : iC;
    }
}
