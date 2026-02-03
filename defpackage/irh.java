package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irh extends fdbr implements fdae {
    final /* synthetic */ iri a;
    final /* synthetic */ icr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irh(iri iriVar, icr icrVar) {
        super(0);
        this.a = iriVar;
        this.b = icrVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.c(this.b);
        return fctx.a;
    }
}
