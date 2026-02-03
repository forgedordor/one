package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class iua extends fdbo implements fdat {
    public static final iua a = new iua();

    public iua() {
        super(2, fdcu.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
