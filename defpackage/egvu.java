package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvu extends fdjq implements fdkh {
    private final fdjq a;
    private final fdjq b;
    private final eygg c;

    public egvu(fdjq fdjqVar, fdjq fdjqVar2, eygg eyggVar) {
        this.a = fdjqVar;
        this.b = fdjqVar2;
        this.c = eyggVar;
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        fcyhVar.getClass();
        runnable.getClass();
        if (((Boolean) this.c.b()).booleanValue()) {
            this.b.a(fcyhVar, runnable);
        } else {
            this.a.a(fcyhVar, runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fdjq, fdkh] */
    @Override // defpackage.fdkh
    public final fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        fcyhVar.getClass();
        return ((Boolean) this.c.b()).booleanValue() ? this.b.c(j, runnable, fcyhVar) : ((fdkh) this.a).c(j, runnable, fcyhVar);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fdjq, fdkh] */
    @Override // defpackage.fdkh
    public final void d(long j, fdis fdisVar) {
        if (((Boolean) this.c.b()).booleanValue()) {
            this.b.d(j, fdisVar);
        } else {
            ((fdkh) this.a).d(j, fdisVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof egvu)) {
            return false;
        }
        eygg eyggVar = this.c;
        egvu egvuVar = (egvu) obj;
        if (fdbq.f(eyggVar.b(), egvuVar.c.b())) {
            return ((Boolean) eyggVar.b()).booleanValue() ? fdbq.f(this.b, egvuVar.b) : fdbq.f(this.a, egvuVar.a);
        }
        return false;
    }

    @Override // defpackage.fdjq
    public final boolean ey(fcyh fcyhVar) {
        fcyhVar.getClass();
        return ((Boolean) this.c.b()).booleanValue() ? this.b.ey(fcyhVar) : this.a.ey(fcyhVar);
    }

    public final int hashCode() {
        return ((Boolean) this.c.b()).booleanValue() ? this.b.hashCode() : this.a.hashCode();
    }
}
