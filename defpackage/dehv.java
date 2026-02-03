package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dehv implements deic {
    public final String a;
    public final dehz b;
    public final Object c;
    public boolean d;
    private final deih e;
    private final deig f;

    public dehv(deih deihVar) {
        dehz dehzVar = new dehz(eoqg.a, new dzfh("DelegatingInternalTimeSignalSupplier"));
        String str = "DelegatingInternalTimeSignalSupplier[" + System.identityHashCode(this) + "]";
        this.a = str;
        this.c = new Object();
        deihVar.getClass();
        this.e = deihVar;
        this.b = dehzVar;
        deig deigVar = new deig() { // from class: dehu
            @Override // defpackage.deig
            public final void a(deib deibVar) {
                dehv dehvVar = this.a;
                synchronized (dehvVar.c) {
                    if (dehvVar.d) {
                        deht.a.n().D("%s: Discarding timeSignal=%s, instance is disposed()", dehvVar.a, deibVar);
                        return;
                    }
                    deht.a.n().D("%s: Notifying listener about timeSignal=%s", dehvVar.a, deibVar);
                    dehz dehzVar2 = dehvVar.b;
                    dehzVar2.getClass();
                    dehzVar2.f(deibVar);
                }
            }
        };
        this.f = deigVar;
        deihVar.b(deigVar);
        deht.a.n().t("%s: Construction complete", str);
    }

    @Override // defpackage.deic
    public final defn a() {
        deht.a.n().t("%s: dispose() called", this.a);
        synchronized (this.c) {
            if (this.d) {
                return degc.c(null);
            }
            this.b.e();
            this.d = true;
            deih deihVar = this.e;
            deihVar.c(this.f);
            return deihVar.a();
        }
    }

    @Override // defpackage.deic
    public final void d(deig deigVar) {
        deht.a.n().D("%s: Adding listener %s", this.a, deigVar);
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("dispose() has been called");
            }
            dehz dehzVar = this.b;
            if (dehzVar.b() != 0) {
                throw new IllegalStateException("listener already set");
            }
            deigVar.getClass();
            dehzVar.d(deigVar);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            str = "DelegatingInternalTimeSignalSupplier{supplierIdentity='" + this.a + "', sharedTimeSignalSupplier=" + String.valueOf(this.e) + ", internalListenersManager=" + String.valueOf(this.b) + ", sharedTimeSignalSupplierListener=" + String.valueOf(this.f) + ", disposed=" + this.d + "}";
        }
        return str;
    }
}
