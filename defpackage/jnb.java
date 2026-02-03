package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnb extends fdbr implements fdap {
    final /* synthetic */ jnc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnb(jnc jncVar) {
        super(1);
        this.a = jncVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        imz imzVar = (imz) obj;
        ijb ijbVarB = imzVar.t().b();
        fdat fdatVar = this.a.a;
        if (fdatVar != null) {
            fdatVar.a(ijbVarB, imzVar.t().a);
        }
        return fctx.a;
    }
}
