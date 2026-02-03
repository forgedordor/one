package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knw extends fdbr implements fdae {
    final /* synthetic */ fdch a;
    final /* synthetic */ knx b;
    final /* synthetic */ kjd c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knw(fdch fdchVar, knx knxVar, kjd kjdVar, long j, long j2) {
        super(0);
        this.a = fdchVar;
        this.b = knxVar;
        this.c = kjdVar;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        knx knxVar = this.b;
        this.a.a = knxVar.d.a(this.c, this.d, knxVar.e, this.e);
        return fctx.a;
    }
}
