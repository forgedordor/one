package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxu implements eora {
    final /* synthetic */ cyxw a;

    public cyxu(cyxw cyxwVar) {
        this.a = cyxwVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        cyxw cyxwVar = this.a;
        if (cyxwVar.d()) {
            cyxwVar.h = null;
            return;
        }
        if (bool.booleanValue()) {
            cyxwVar.b();
        } else {
            cyxwVar.a();
        }
        cyxwVar.h = null;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.h = null;
    }
}
