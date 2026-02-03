package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcaf extends fcbf {
    final /* synthetic */ fbng a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcaf(fcam fcamVar, fbng fbngVar, String str) {
        super(fcamVar.e);
        this.a = fbngVar;
        this.b = str;
    }

    @Override // defpackage.fcbf
    public final void a() {
        fcam.g(this.a, Status.o.withDescription(String.format("Unable to find compressor by name %s", this.b)), new fbrg());
    }
}
