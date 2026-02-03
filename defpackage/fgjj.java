package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjj extends fgmf {
    private final fglc a;
    private boolean b;
    private int c;

    public fgjj(fglc fglcVar) {
        this.a = fglcVar;
    }

    public static boolean i(CharSequence charSequence, int i) {
        char cCharAt;
        return i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\t' || cCharAt == ' ';
    }

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        fgin fginVar = (fgin) fgmlVar;
        if (fginVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return new fgid(fginVar.d, -1, false);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean k(fgkk fgkkVar) {
        if (!(fgkkVar instanceof fgld)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }
}
