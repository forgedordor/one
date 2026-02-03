package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivi extends fdbr implements fdat {
    final /* synthetic */ ivj[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivi(ivj[] ivjVarArr) {
        super(2);
        this.a = ivjVarArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Float.valueOf(iyx.a((iyk) obj, false, this.a, ((Number) obj2).floatValue()));
    }
}
