package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehuq extends fbou {
    final /* synthetic */ ehry a;
    final /* synthetic */ ehur b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehuq(ehur ehurVar, fbng fbngVar, ehry ehryVar) {
        super(fbngVar);
        this.a = ehryVar;
        this.b = ehurVar;
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        ((ecog) this.a.b.get()).b(r0.b.a() - r0.c, this.b.b.a, Integer.valueOf(status.getCode().value()));
        super.a(status, fbrgVar);
    }
}
