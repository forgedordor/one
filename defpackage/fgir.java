package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgir extends fgmf {
    private final fgkv a = new fgkv();
    private final fglz b;

    public fgir(fglz fglzVar) {
        this.b = fglzVar;
    }

    public static boolean i(CharSequence charSequence, int i, char c) {
        return fgmp.c(charSequence, fgmp.b(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        return null;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void e(fglr fglrVar) {
        fglrVar.a(this.b, this.a);
    }
}
