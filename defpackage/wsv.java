package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wsv extends fdbb implements fdat {
    public static final wsv a = new wsv();

    public wsv() {
        super(2, bpcv.class, "setIsUrgent", "setIsUrgent(Z)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bpcv bpcvVar = (bpcv) obj;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        bpcvVar.getClass();
        int iIntValue = bpcy.c().intValue();
        int iIntValue2 = bpcy.c().intValue();
        if (iIntValue2 < 59170) {
            dqru.x("is_urgent", iIntValue2);
        }
        if (iIntValue >= 59170) {
            bpcvVar.a.put("is_urgent", bool);
        }
        return fctx.a;
    }
}
