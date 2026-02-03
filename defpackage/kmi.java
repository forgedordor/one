package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmi extends fdbr implements fdap {
    final /* synthetic */ knx a;
    final /* synthetic */ fdae b;
    final /* synthetic */ koc c;
    final /* synthetic */ kji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmi(knx knxVar, fdae fdaeVar, koc kocVar, kji kjiVar) {
        super(1);
        this.a = knxVar;
        this.b = fdaeVar;
        this.c = kocVar;
        this.d = kjiVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        knx knxVar = this.a;
        knxVar.b.addView(knxVar, knxVar.c);
        knxVar.n(this.b, this.c, this.d);
        return new kmh(knxVar);
    }
}
