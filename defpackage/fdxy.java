package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdxy {
    public final fdhz a;
    private final fdhz b;

    public fdxy(fdxy fdxyVar) {
        fdia fdiaVar = fdia.a;
        this.a = new fdhz(null, fdiaVar);
        this.b = new fdhz(fdxyVar, fdiaVar);
    }

    public final Object m() {
        return this.a.a;
    }

    public final fdxy n() {
        Object objM = m();
        if (objM == fdxx.a) {
            return null;
        }
        return (fdxy) objM;
    }

    public final fdxy o() {
        return (fdxy) this.b.a;
    }

    public final void p() {
        this.b.b(null);
    }

    public final void q() {
        Object obj;
        fdxy fdxyVarN;
        boolean z = fdkb.a;
        if (s()) {
            return;
        }
        while (true) {
            fdxy fdxyVarO = o();
            while (fdxyVarO != null && fdxyVarO.r()) {
                fdxyVarO = (fdxy) fdxyVarO.b.a;
            }
            fdxy fdxyVarN2 = n();
            fdxyVarN2.getClass();
            while (fdxyVarN2.r() && (fdxyVarN = fdxyVarN2.n()) != null) {
                fdxyVarN2 = fdxyVarN;
            }
            fdhz fdhzVar = fdxyVarN2.b;
            do {
                obj = fdhzVar.a;
            } while (!fdhzVar.d(obj, ((fdxy) obj) == null ? null : fdxyVarO));
            if (fdxyVarO != null) {
                fdxyVarO.a.c(fdxyVarN2);
            }
            if (!fdxyVarN2.r() || fdxyVarN2.s()) {
                if (fdxyVarO == null || !fdxyVarO.r()) {
                    return;
                }
            }
        }
    }

    public abstract boolean r();

    public final boolean s() {
        return n() == null;
    }
}
