package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmu extends fdbr implements fdap {
    final /* synthetic */ knx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmu(knx knxVar) {
        super(1);
        this.a = knxVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        kjg kjgVar = new kjg(((kjg) obj).a);
        knx knxVar = this.a;
        knxVar.f.b(kjgVar);
        knxVar.m();
        return fctx.a;
    }
}
