package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ipt extends fdbr implements fdae {
    final /* synthetic */ ipu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipt(ipu ipuVar) {
        super(0);
        this.a = ipuVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ipu ipuVar = this.a;
        if (ipuVar.d == ipuVar.g()) {
            ipuVar.e.i(ipuVar.g() + 1);
        }
        return fctx.a;
    }
}
