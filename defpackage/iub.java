package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class iub extends fdbo implements fdat {
    public static final iub a = new iub();

    public iub() {
        super(2, fdcu.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
