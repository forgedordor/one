package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dytq extends dyay {
    final /* synthetic */ dytu a;

    public dytq(dytu dytuVar) {
        this.a = dytuVar;
    }

    @Override // defpackage.dyay
    public final void a() {
        dyrf.a(new Runnable() { // from class: dytn
            @Override // java.lang.Runnable
            public final void run() {
                dytu dytuVar = this.a.a;
                dytuVar.h(true);
                dytuVar.q(((dyrq) dytuVar.e).b.b(), ((dyrq) dytuVar.e).b.a());
            }
        });
    }

    @Override // defpackage.dyay
    public final void b(final Object obj) {
        dyrf.a(new Runnable() { // from class: dyto
            @Override // java.lang.Runnable
            public final void run() {
                dytu dytuVar = this.a.a;
                dytuVar.q(((dyrq) dytuVar.e).b.b(), obj);
            }
        });
    }

    @Override // defpackage.dyay
    public final void c(final ekgb ekgbVar) {
        dyrf.a(new Runnable() { // from class: dytp
            @Override // java.lang.Runnable
            public final void run() {
                dytu dytuVar = this.a.a;
                dytuVar.q(ekgbVar, ((dyrq) dytuVar.e).b.a());
            }
        });
    }
}
