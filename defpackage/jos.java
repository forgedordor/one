package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jos extends fdbr implements fdae {
    final /* synthetic */ lvc a;
    final /* synthetic */ lvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jos(lvc lvcVar, lvh lvhVar) {
        super(0);
        this.a = lvcVar;
        this.b = lvhVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.d(this.b);
        return fctx.a;
    }
}
