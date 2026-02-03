package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejph extends fdbo implements fdat {
    public ejph(Object obj) {
        super(2, obj, ejps.class, "dedupeUnitConflictAction", "dedupeUnitConflictAction(II)I", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws ejpc {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        throw new ejpc("Found multiple units");
    }
}
