package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwa extends fdjq implements fdkh {
    private final /* synthetic */ fdkh a;
    private final fdjq b;

    /* JADX WARN: Multi-variable type inference failed */
    public egwa(fdjq fdjqVar) {
        this.a = (fdkh) fdjqVar;
        this.b = fdjqVar;
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        fcyhVar.getClass();
        runnable.getClass();
        this.b.a(fcyhVar, runnable);
    }

    @Override // defpackage.fdkh
    public final fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        fcyhVar.getClass();
        return this.a.c(j, runnable, fcyhVar);
    }

    @Override // defpackage.fdkh
    public final void d(long j, fdis fdisVar) {
        this.a.d(j, fdisVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof egwa) && fdbq.f(((egwa) obj).b, this.b);
    }

    @Override // defpackage.fdjq
    public final boolean ey(fcyh fcyhVar) {
        fcyhVar.getClass();
        return !ecem.g();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
