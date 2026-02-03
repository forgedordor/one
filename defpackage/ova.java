package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ova extends vo {
    public final oog a;
    private boolean d;

    public ova(mr mrVar, fcyh fcyhVar, fcyh fcyhVar2) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        oog oogVar = new oog(mrVar, new ml(this), fcyhVar, fcyhVar2);
        this.a = oogVar;
        super.E(3);
        A(new ouy(this));
        F(new ouz(this));
        fdpl fdplVar = oogVar.i;
        fdpl fdplVar2 = oogVar.j;
    }

    public static final void l(ova ovaVar) {
        if (ovaVar.c != 3 || ovaVar.d) {
            return;
        }
        ovaVar.d = true;
        super.E(1);
    }

    public final void F(fdap fdapVar) {
        oog oogVar = this.a;
        AtomicReference atomicReference = oogVar.k;
        if (atomicReference.get() == null) {
            fdap fdapVar2 = oogVar.m;
            fdapVar2.getClass();
            atomicReference.set(fdapVar2);
            ory oryVar = oogVar.g.e;
            oryVar.a.a(fdapVar2);
            opc opcVar = (opc) oryVar.b.c();
            if (opcVar != null) {
                fdapVar2.invoke(opcVar);
            }
        }
        oogVar.l.add(fdapVar);
    }

    public final void G() {
        this.a.g.e();
    }

    @Override // defpackage.vo
    public final int a() {
        oog oogVar = this.a;
        owg owgVar = (owg) oogVar.f.get();
        return owgVar != null ? owgVar.f() : oogVar.g.d.f();
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return -1L;
    }
}
