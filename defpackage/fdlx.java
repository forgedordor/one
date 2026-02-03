package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdlx extends fdyw implements fdks, fdll {
    public fdme d;

    public abstract void a(Throwable th);

    public abstract boolean b();

    public final fdme e() {
        fdme fdmeVar = this.d;
        if (fdmeVar != null) {
            return fdmeVar;
        }
        fdbq.c("job");
        return null;
    }

    @Override // defpackage.fdll
    public final boolean hA() {
        return true;
    }

    @Override // defpackage.fdll
    public final fdmj hy() {
        return null;
    }

    @Override // defpackage.fdks
    public final void hz() {
        Object objE;
        Object objF;
        fdyw fdywVar;
        fdzc fdzcVar;
        fdme fdmeVarE = e();
        do {
            objE = fdmeVarE.E();
            if (!(objE instanceof fdlx)) {
                if (!(objE instanceof fdll) || ((fdll) objE).hy() == null) {
                    return;
                }
                do {
                    objF = f();
                    if (objF instanceof fdzc) {
                        fdyw fdywVar2 = ((fdzc) objF).a;
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    objF.getClass();
                    fdywVar = (fdyw) objF;
                    fdhz fdhzVar = fdywVar.g;
                    fdzcVar = (fdzc) fdhzVar.a;
                    if (fdzcVar == null) {
                        fdzcVar = new fdzc(fdywVar);
                        fdhzVar.b(fdzcVar);
                    }
                } while (!this.e.d(objF, fdzcVar));
                fdywVar.g();
                return;
            }
            if (objE != this) {
                return;
            }
        } while (!fdmeVarE.d.d(objE, fdmf.g));
    }

    @Override // defpackage.fdyw
    public final String toString() {
        return fdkc.a(this) + "@" + fdkc.b(this) + "[job@" + fdkc.b(e()) + "]";
    }
}
