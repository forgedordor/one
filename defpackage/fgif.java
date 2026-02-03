package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgif extends fgmf {
    private final fgkl a = new fgkl();

    public static boolean h(fgml fgmlVar, int i) {
        fgin fginVar = (fgin) fgmlVar;
        CharSequence charSequence = fginVar.c.a;
        return fginVar.g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // defpackage.fgmi
    public final /* synthetic */ fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        fgin fginVar = (fgin) fgmlVar;
        int i = fginVar.f;
        if (!h(fgmlVar, i)) {
            return null;
        }
        int i2 = fginVar.e + fginVar.g;
        boolean zF = fgmp.f(fginVar.c.a, i + 1);
        int i3 = i2 + 1;
        if (zF) {
            i3 = i2 + 2;
        }
        return new fgid(-1, i3, false);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean k(fgkk fgkkVar) {
        return true;
    }
}
