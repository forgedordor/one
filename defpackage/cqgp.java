package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqgp implements Consumer {
    public final /* synthetic */ cqgu a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        cqgu cqguVar = this.a;
        cqgl cqglVar = (cqgl) obj;
        cqgl cqglVar2 = (cqgl) cqguVar.i.getAndSet(cqglVar);
        cqguVar.j.set(cqglVar2);
        eksl ekslVar = (eksl) cqgu.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "onNetworkStateChanged", 210, "NetworkStateMonitorLThroughRServiceState.java");
        Integer numValueOf = Integer.valueOf(cqguVar.f);
        ekslVar.I("NetworkStateMonitorLThroughRServiceState onNetworkStateChanged for subId %d: %s to %s", numValueOf, cqglVar2, cqglVar);
        cqguVar.d.accept(numValueOf);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
