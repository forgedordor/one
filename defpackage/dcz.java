package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcz extends fdbr implements fdap {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcz(long j) {
        super(1);
        this.a = j;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = this.a;
        ikl iklVar = (ikl) obj;
        iklVar.x(Float.intBitsToFloat((int) (j >> 32)));
        iklVar.y(Float.intBitsToFloat((int) (j & 4294967295L)));
        iklVar.C(ila.a(0.0f, 0.0f));
        return fctx.a;
    }
}
