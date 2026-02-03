package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxc extends fdbr implements fdap {
    final /* synthetic */ cxf a;
    final /* synthetic */ iyl b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxc(cxf cxfVar, iyl iylVar, long j) {
        super(1);
        this.a = cxfVar;
        this.b = iylVar;
        this.c = j;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iby ibyVar = this.a.c.b;
        ((iyk) obj).t(this.b, ibyVar.a((r0.a << 32) | (r0.b & 4294967295L), this.c, kji.a), 0.0f);
        return fctx.a;
    }
}
