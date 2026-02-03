package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclp implements fboa {
    final /* synthetic */ fcma a;

    public fclp(fcma fcmaVar) {
        this.a = fcmaVar;
    }

    @Override // defpackage.fboa
    public final void a(fbog fbogVar) {
        Status statusB = fboi.b(fbogVar);
        if (Status.f.getCode().equals(statusB.getCode())) {
            this.a.c(statusB);
        }
    }
}
