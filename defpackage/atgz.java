package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgz implements athk {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final atjr b = atjr.j;

    @Override // defpackage.athk
    public final atjr a() {
        return this.b;
    }

    @Override // defpackage.athk
    public final Object b(fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.athk
    public final Object g(fcxy fcxyVar) {
        this.a.set(true);
        return fctx.a;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.athk
    public final boolean l() {
        return this.a.get();
    }

    @Override // defpackage.athk
    public final Object h(atha athaVar, atii atiiVar, fcxy fcxyVar) {
        return atiiVar;
    }
}
