package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knt extends fdbr implements fdae {
    final /* synthetic */ knx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knt(knx knxVar) {
        super(0);
        this.a = knxVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        knx knxVar = this.a;
        ivy ivyVarA = knxVar.a();
        if (ivyVarA == null || !ivyVarA.u()) {
            ivyVarA = null;
        }
        boolean z = false;
        if (ivyVarA != null && knxVar.c() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
