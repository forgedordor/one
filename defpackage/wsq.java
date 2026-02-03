package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wsq extends fdbb implements fdat {
    public static final wsq a = new wsq();

    public wsq() {
        super(2, bpcv.class, "setIsEncrypted", "setIsEncrypted(Z)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bpcv bpcvVar = (bpcv) obj;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        bpcvVar.getClass();
        int iIntValue = bpcy.c().intValue();
        int iIntValue2 = bpcy.c().intValue();
        if (iIntValue2 < 59720) {
            dqru.x("is_encrypted", iIntValue2);
        }
        if (iIntValue >= 59720) {
            bpcvVar.a.put("is_encrypted", bool);
        }
        return fctx.a;
    }
}
