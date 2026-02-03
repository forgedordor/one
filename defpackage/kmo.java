package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmo extends fdbr implements fdap {
    final /* synthetic */ knx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmo(knx knxVar) {
        super(1);
        this.a = knxVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ivy ivyVarR = ((ivy) obj).r();
        ivyVarR.getClass();
        knx knxVar = this.a;
        knxVar.g.b(ivyVarR);
        knxVar.l();
        return fctx.a;
    }
}
