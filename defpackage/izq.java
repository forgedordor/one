package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izq extends fdbr implements fdat {
    final /* synthetic */ izs[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izq(izs[] izsVarArr) {
        super(2);
        this.a = izsVarArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Float.valueOf(iyx.a((iyk) obj, true, this.a, ((Number) obj2).floatValue()));
    }
}
