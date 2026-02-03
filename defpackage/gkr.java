package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class gkr extends fdbo implements fdat {
    public static final gkr a = new gkr();

    public gkr() {
        super(2, fdcu.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
