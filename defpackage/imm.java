package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imm extends fdbr implements fdap {
    final /* synthetic */ imn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imm(imn imnVar) {
        super(1);
        this.a = imnVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Double.valueOf(fddu.b(this.a.k.a(((Number) obj).doubleValue()), r10.e, r10.f));
    }
}
