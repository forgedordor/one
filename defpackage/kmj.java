package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmj extends fdbr implements fdae {
    final /* synthetic */ knx a;
    final /* synthetic */ fdae b;
    final /* synthetic */ koc c;
    final /* synthetic */ kji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmj(knx knxVar, fdae fdaeVar, koc kocVar, kji kjiVar) {
        super(0);
        this.a = knxVar;
        this.b = fdaeVar;
        this.c = kocVar;
        this.d = kjiVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.n(this.b, this.c, this.d);
        return fctx.a;
    }
}
