package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclh extends fcbf {
    final /* synthetic */ Status a;
    final /* synthetic */ fcll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fclh(fcll fcllVar, Status status) {
        super(fcllVar.a);
        this.a = status;
        this.b = fcllVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        int i = fcsr.a;
        this.b.c().a(this.a);
    }
}
