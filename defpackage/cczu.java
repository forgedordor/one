package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cczu implements cczv {
    private final Supplier a;
    private cczg b;

    public cczu(Supplier supplier) {
        this.a = supplier;
    }

    private final cczg a() {
        cczg cczgVar;
        Supplier supplier = this.a;
        synchronized (supplier) {
            if (this.b == null) {
                dzzh dzzhVar = (dzzh) supplier.get();
                this.b = new cczg(dzzhVar, dzzhVar.c());
            }
            cczgVar = this.b;
            cczgVar.getClass();
        }
        return cczgVar;
    }

    @Override // defpackage.cczv
    public final Object e() {
        return a().e();
    }

    @Override // defpackage.cczv
    public final Object f() {
        return a().c;
    }

    @Override // defpackage.cczv
    public final String j() {
        return a().j();
    }

    @Override // defpackage.cczv
    public final void k(Object obj) {
        throw null;
    }

    @Override // defpackage.cczv
    public final void l() {
        synchronized (this.a) {
            if (this.b != null) {
                a().l();
            }
        }
    }

    @Override // defpackage.cczv
    public final void m() {
        throw null;
    }
}
