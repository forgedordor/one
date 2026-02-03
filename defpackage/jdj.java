package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdj extends fdbr implements fdae {
    final /* synthetic */ jdm a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdj(jdm jdmVar, long j) {
        super(0);
        this.a = jdmVar;
        this.b = j;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jdf jdfVarC = this.a.q().C();
        jdfVarC.getClass();
        jdfVarC.e(this.b);
        return fctx.a;
    }
}
