package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfy extends fcbf {
    final /* synthetic */ fbng a;
    final /* synthetic */ Status b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcfy(fcfz fcfzVar, fbng fbngVar, Status status) {
        super(fcfzVar.a);
        this.a = fbngVar;
        this.b = status;
    }

    @Override // defpackage.fcbf
    public final void a() {
        this.a.a(this.b, new fbrg());
    }
}
