package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgip extends fgmf {
    public final fgkt a;
    private final char b;
    private final int c;
    private String d;
    private final StringBuilder e;

    public fgip(char c, int i, int i2) {
        fgkt fgktVar = new fgkt();
        this.a = fgktVar;
        this.e = new StringBuilder();
        this.b = c;
        this.c = i;
        String.valueOf(c);
        Integer numValueOf = Integer.valueOf(i);
        numValueOf.getClass();
        fgkt.e(numValueOf, fgktVar.b);
        fgktVar.a = numValueOf;
        fgktVar.c = i2;
    }

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        int iB;
        fgin fginVar = (fgin) fgmlVar;
        int i = fginVar.f;
        int i2 = fginVar.d;
        CharSequence charSequence = fginVar.c.a;
        if (fginVar.g < 4 && i < charSequence.length() && (iB = fgmp.b(this.b, charSequence, i, charSequence.length()) - i) >= this.c && fgmp.c(charSequence, i + iB, charSequence.length()) == charSequence.length()) {
            fgkt fgktVar = this.a;
            Integer numValueOf = Integer.valueOf(iB);
            numValueOf.getClass();
            fgkt.e(fgktVar.a, numValueOf);
            fgktVar.b = numValueOf;
            return new fgid(-1, -1, true);
        }
        int length = charSequence.length();
        for (int i3 = this.a.c; i3 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i3--) {
            i2++;
        }
        return new fgid(i2, -1, false);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void d(fgly fglyVar) {
        if (this.d == null) {
            this.d = fglyVar.a.toString();
            return;
        }
        StringBuilder sb = this.e;
        sb.append(fglyVar.a);
        sb.append('\n');
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void l() {
        fgkf.b(this.d.trim());
        this.a.d = this.e.toString();
    }
}
