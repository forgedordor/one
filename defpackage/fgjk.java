package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjk extends fgmf {
    private final fgld a = new fgld();
    private final int b;
    private boolean c;

    public fgjk(int i) {
        this.b = i;
    }

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        fgin fginVar = (fgin) fgmlVar;
        if (!fginVar.h) {
            int i = fginVar.g;
            int i2 = this.b;
            if (i >= i2) {
                return new fgid(-1, fginVar.e + i2, false);
            }
            return null;
        }
        if (this.a.f == null) {
            return null;
        }
        fgkk fgkkVarB = fgmlVar.a().b();
        boolean z = true;
        if (!(fgkkVarB instanceof fglj) && !(fgkkVarB instanceof fgld)) {
            z = false;
        }
        this.c = z;
        return new fgid(fginVar.f, -1, false);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean k(fgkk fgkkVar) {
        if (!this.c) {
            return true;
        }
        fgkk fgkkVarB = this.a.b();
        if (!(fgkkVarB instanceof fglc)) {
            return true;
        }
        return true;
    }
}
