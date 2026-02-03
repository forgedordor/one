package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwn extends fdbr implements fdap {
    final /* synthetic */ iyl a;
    final /* synthetic */ cyt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwn(iyl iylVar, cyt cytVar) {
        super(1);
        this.a = iylVar;
        this.b = cytVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((iyk) obj).s(this.a, 0, 0, this.b.c.c());
        return fctx.a;
    }
}
