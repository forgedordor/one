package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eint implements eora {
    final /* synthetic */ einu a;
    final /* synthetic */ einv b;

    public eint(einu einuVar, einv einvVar) {
        this.a = einuVar;
        this.b = einvVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.a.a.set(obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        einv einvVar = this.b;
        ejvr ejvrVar = einvVar.a;
        SettableFuture settableFuture = einvVar.b;
        try {
            Throwable th2 = (Throwable) ejvrVar.apply(th);
            th2.getClass();
            settableFuture.setException(th2);
        } catch (Throwable th3) {
            settableFuture.setException(new einw(ekgb.p(new Throwable[]{th, th3})));
        }
    }
}
