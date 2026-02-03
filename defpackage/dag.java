package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dag extends fdbr implements fdap {
    final /* synthetic */ iyl a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ fdap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dag(iyl iylVar, long j, long j2, fdap fdapVar) {
        super(1);
        this.a = iylVar;
        this.b = j;
        this.c = j2;
        this.d = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fdap fdapVar = this.d;
        long j = this.b;
        int iB = kjb.b(j);
        long j2 = this.c;
        int iB2 = kjb.b(j2);
        ((iyk) obj).u(this.a, kjb.a(j) + kjb.a(j2), iB + iB2, 0.0f, fdapVar);
        return fctx.a;
    }
}
