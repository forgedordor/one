package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class irm extends icr implements jgg, jfv, jbd {
    public jbo a;
    public boolean b;
    private isa c;

    public irm(isa isaVar, jbo jboVar) {
        this.a = jboVar;
        this.c = isaVar;
    }

    private final void j() {
        isa isaVar;
        fdci fdciVar = new fdci();
        jgh.b(this, new irl());
        irm irmVar = (irm) fdciVar.a;
        if (irmVar == null || (isaVar = irmVar.c) == null) {
            isaVar = this.c;
        }
        f(isaVar);
    }

    private final void k() {
        fdce fdceVar = new fdce();
        fdceVar.a = true;
        jgh.d(this, new irk(fdceVar));
        if (fdceVar.a) {
            j();
        }
    }

    private final void n() {
        if (this.b) {
            this.b = false;
            if (this.C) {
                fdci fdciVar = new fdci();
                jgh.b(this, new irj(fdciVar));
                irm irmVar = (irm) fdciVar.a;
                if (irmVar != null) {
                    irmVar.j();
                } else {
                    f(null);
                }
            }
        }
    }

    @Override // defpackage.jfv
    public final long a() {
        return this.a != null ? jbo.a(jbg.g(this)) : jge.a;
    }

    @Override // defpackage.icr
    public final /* synthetic */ void dM() {
        jfu.a(this);
    }

    @Override // defpackage.jfv
    public final void dV() {
        n();
    }

    @Override // defpackage.jfv
    public final void dW(irs irsVar, iru iruVar, long j) {
        if (iruVar == iru.b) {
            List list = irsVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (h(((ise) list.get(i)).i)) {
                    int i2 = irsVar.e;
                    if (irw.a(i2, 4)) {
                        this.b = true;
                        k();
                        return;
                    } else {
                        if (irw.a(i2, 5)) {
                            n();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void eb() {
        jfu.b(this);
    }

    public abstract void f(isa isaVar);

    public final void g(isa isaVar) {
        if (fdbq.f(this.c, isaVar)) {
            return;
        }
        this.c = isaVar;
        if (this.b) {
            k();
        }
    }

    public abstract boolean h(int i);

    protected final jhv i() {
        return (jhv) jbe.a(this, jmh.p);
    }

    @Override // defpackage.icr
    public final void s() {
        n();
    }

    @Override // defpackage.jfv
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.jfv
    public final /* synthetic */ void A() {
    }
}
