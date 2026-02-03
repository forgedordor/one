package defpackage;

import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgva implements eora {
    final /* synthetic */ RcsEngineProxyImpl a;

    public dgva(RcsEngineProxyImpl rcsEngineProxyImpl) {
        this.a = rcsEngineProxyImpl;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((dgiq) obj).T()) {
            dhja.l(this.a.C, "Ignoring SIM removed, since we have valid RCS config", new Object[0]);
            return;
        }
        RcsEngineProxyImpl rcsEngineProxyImpl = this.a;
        dhja.l(rcsEngineProxyImpl.C, "Handling SIM removed", new Object[0]);
        rcsEngineProxyImpl.onSimAbsentInternal();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        RcsEngineProxyImpl rcsEngineProxyImpl = this.a;
        dhja.j(th, rcsEngineProxyImpl.C, "Failed retrieve RCS Configuration %s", th.getMessage());
        rcsEngineProxyImpl.onSimAbsentInternal();
    }
}
