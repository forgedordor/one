package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espk extends fbur {
    final /* synthetic */ dcer a;

    public espk(dcer dcerVar) {
        this.a = dcerVar;
    }

    @Override // defpackage.fbur
    public final Status a(int i) {
        return this.a.d(i) ? Status.b : Status.i.withDescription("Rejected by (1st-party only) security policy");
    }
}
