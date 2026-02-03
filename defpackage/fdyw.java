package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdyw {
    public final fdhz e;
    public final fdhz f;
    public final fdhz g;

    public fdyw() {
        fdia fdiaVar = fdia.a;
        this.e = new fdhz(this, fdiaVar);
        this.f = new fdhz(this, fdiaVar);
        this.g = new fdhz(null, fdiaVar);
    }

    public final Object f() {
        return this.e.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.e.d(r3, ((defpackage.fdzc) r5).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fdyw g() {
        /*
            r8 = this;
        L0:
            fdhz r0 = r8.f
            java.lang.Object r1 = r0.a
            fdyw r1 = (defpackage.fdyw) r1
            r2 = 0
            r3 = r1
        L8:
            r4 = r2
        L9:
            fdhz r5 = r3.e
            java.lang.Object r5 = r5.a
            if (r5 != r8) goto L19
            if (r1 != r3) goto L12
            goto L18
        L12:
            boolean r0 = r0.d(r1, r3)
            if (r0 == 0) goto L0
        L18:
            return r3
        L19:
            boolean r6 = r8.hB()
            if (r6 == 0) goto L20
            return r2
        L20:
            boolean r6 = r5 instanceof defpackage.fdzc
            if (r6 == 0) goto L3b
            if (r4 == 0) goto L34
            fdzc r5 = (defpackage.fdzc) r5
            fdyw r5 = r5.a
            fdhz r6 = r4.e
            boolean r3 = r6.d(r3, r5)
            if (r3 == 0) goto L0
            r3 = r4
            goto L8
        L34:
            fdhz r3 = r3.f
            java.lang.Object r3 = r3.a
            fdyw r3 = (defpackage.fdyw) r3
            goto L9
        L3b:
            r5.getClass()
            r4 = r5
            fdyw r4 = (defpackage.fdyw) r4
            r7 = r4
            r4 = r3
            r3 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdyw.g():fdyw");
    }

    public final fdyw h() {
        Object objF = f();
        fdzc fdzcVar = objF instanceof fdzc ? (fdzc) objF : null;
        if (fdzcVar != null) {
            return fdzcVar.a;
        }
        objF.getClass();
        return (fdyw) objF;
    }

    public boolean hB() {
        return f() instanceof fdzc;
    }

    public final fdyw i() {
        fdyw fdywVarG = g();
        if (fdywVarG != null) {
            return fdywVarG;
        }
        Object obj = this.f.a;
        while (true) {
            fdyw fdywVar = (fdyw) obj;
            if (!fdywVar.hB()) {
                return fdywVar;
            }
            obj = fdywVar.f.a;
        }
    }

    public final void j(int i) {
        l(new fdyt(i), i);
    }

    public final void k(fdyw fdywVar) {
        fdhz fdhzVar;
        fdyw fdywVar2;
        do {
            fdhzVar = fdywVar.f;
            fdywVar2 = (fdyw) fdhzVar.a;
            if (f() != fdywVar) {
                return;
            }
        } while (!fdhzVar.d(fdywVar2, this));
        if (hB()) {
            fdywVar.g();
        }
    }

    public final boolean l(fdyw fdywVar, int i) {
        fdyw fdywVarI;
        do {
            fdywVarI = i();
            if (fdywVarI instanceof fdyt) {
                return (((fdyt) fdywVarI).a & i) == 0 && fdywVarI.l(fdywVar, i);
            }
            fdywVar.f.b(fdywVarI);
            fdywVar.e.b(this);
        } while (!fdywVarI.e.d(this, fdywVar));
        fdywVar.k(this);
        return true;
    }

    public String toString() {
        return new fdca(this) { // from class: fdyv
            @Override // defpackage.fdca, defpackage.fdee
            public final Object a() {
                return fdkc.a(this.g);
            }
        } + "@" + fdkc.b(this);
    }
}
