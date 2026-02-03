package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpr extends fdbo implements fdat {
    public ejpr(Object obj) {
        super(2, obj, ejps.class, "dedupeHourConflict", "dedupeHourConflict(II)I", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws ejpc {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iMin = Math.min(iIntValue, iIntValue2);
        if (Math.max(iIntValue, iIntValue2) == iMin + 12) {
            return Integer.valueOf(ejps.d(iMin));
        }
        throw new ejpc("Found multiple hours");
    }
}
