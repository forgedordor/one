package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcv extends fdbr implements fdap {
    final /* synthetic */ dcw a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ixp e;
    final /* synthetic */ iyl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcv(dcw dcwVar, long j, int i, int i2, ixp ixpVar, iyl iylVar) {
        super(1);
        this.a = dcwVar;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = ixpVar;
        this.f = iylVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((iyk) obj).t(this.f, this.a.b.a(this.b, (this.c << 32) | (this.d & 4294967295L), this.e.q()), 0.0f);
        return fctx.a;
    }
}
