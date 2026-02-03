package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdnb extends fdjq {
    public static final fdnb a = new fdnb();

    private fdnb() {
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        fdng fdngVar = (fdng) fcyhVar.get(fdng.a);
        if (fdngVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        fdngVar.b = true;
    }

    @Override // defpackage.fdjq
    public final boolean ey(fcyh fcyhVar) {
        return false;
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
