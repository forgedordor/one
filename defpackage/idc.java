package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idc extends fdbr implements fdap {
    final /* synthetic */ iyl a;
    final /* synthetic */ idd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idc(iyl iylVar, idd iddVar) {
        super(1);
        this.a = iylVar;
        this.b = iddVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((iyk) obj).s(this.a, 0, 0, this.b.a);
        return fctx.a;
    }
}
