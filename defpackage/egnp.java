package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egnp extends fdjq implements fdkh {
    private final fdjq a;
    private final fdkh b;

    public egnp(fdjq fdjqVar, fdkh fdkhVar) {
        this.a = fdjqVar;
        this.b = fdkhVar;
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        fcyhVar.getClass();
        runnable.getClass();
        long j = eiid.a;
        if (eiid.q()) {
            runnable = eiid.j(runnable);
        }
        this.a.a(fcyhVar, runnable);
    }

    @Override // defpackage.fdkh
    public final fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        fcyhVar.getClass();
        return this.b.c(j, runnable, fcyhVar);
    }

    @Override // defpackage.fdkh
    public final void d(long j, fdis fdisVar) {
        this.b.d(j, fdisVar);
    }
}
