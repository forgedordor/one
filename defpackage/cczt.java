package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cczt extends cczg {
    private final AtomicReference e;

    public cczt(dzzh dzzhVar, Object obj) {
        super(dzzhVar, obj);
        this.e = new AtomicReference();
    }

    @Override // defpackage.cczg, defpackage.egyi
    public final /* bridge */ /* synthetic */ Object c() {
        return c();
    }

    @Override // defpackage.cczg
    protected final Object h() {
        Object obj;
        synchronized (this.b) {
            Object objG = g();
            cczs.a(this.e, objG);
            AtomicReference atomicReference = this.d;
            cczs.a(atomicReference, objG);
            obj = atomicReference.get();
            obj.getClass();
        }
        return obj;
    }

    @Override // defpackage.cczg
    /* renamed from: i */
    public final String c() {
        return this.b.d();
    }

    @Override // defpackage.cczg, defpackage.cczv
    public final String j() {
        return this.b.d();
    }

    @Override // defpackage.cczg, defpackage.cczv
    public final void k(Object obj) {
        this.d.set(obj);
    }

    @Override // defpackage.cczg, defpackage.cczv
    public final void l() {
    }
}
