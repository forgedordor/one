package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iml extends fdbr implements fdap {
    final /* synthetic */ imn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iml(imn imnVar) {
        super(1);
        this.a = imnVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(this.a.n.a(fddu.b(dDoubleValue, r8.e, r8.f)));
    }
}
