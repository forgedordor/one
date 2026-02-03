package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fceo implements Runnable {
    final /* synthetic */ fcep a;

    public fceo(fcep fcepVar) {
        this.a = fcepVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcfd fcfdVar = this.a.b;
        fchm fchmVar = fcfdVar.m;
        fcfdVar.l = null;
        fcfdVar.m = null;
        fchmVar.n(Status.p.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
