package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kml extends fdbr implements fdap {
    final /* synthetic */ knx a;
    final /* synthetic */ koa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kml(knx knxVar, koa koaVar) {
        super(1);
        this.a = knxVar;
        this.b = koaVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        knx knxVar = this.a;
        knxVar.d = this.b;
        knxVar.m();
        return new kmk();
    }
}
