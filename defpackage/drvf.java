package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvf implements eora {
    final /* synthetic */ drvi a;

    public drvf(drvi drviVar) {
        this.a = drviVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(final Throwable th) {
        this.a.a().execute(new Runnable() { // from class: drve
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th2 = th;
                if (!(th2 instanceof RuntimeException)) {
                    throw new IllegalStateException(th2);
                }
                throw ((RuntimeException) th2);
            }
        });
    }
}
