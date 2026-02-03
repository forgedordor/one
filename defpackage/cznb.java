package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cznb implements egzv<Boolean> {
    final /* synthetic */ czmx a;

    public cznb(czmx czmxVar) {
        this.a = czmxVar;
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            czmx.a.r("Media editor library failed to load.");
            return;
        }
        czmx czmxVar = this.a;
        czmxVar.h.c(czmxVar.O.Q, czmxVar.H.a, new Runnable() { // from class: czna
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.n();
            }
        });
        czmxVar.O.Q.invalidate();
        czmxVar.O.Q.requestLayout();
    }

    @Override // defpackage.egzv
    public final void hn() {
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
    }
}
