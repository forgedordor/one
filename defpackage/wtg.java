package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wtg extends fdbb implements fdat {
    public static final wtg a = new wtg();

    public wtg() {
        super(2, bpcv.class, "setSubject", "setSubject(Ljava/lang/String;)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bpcv bpcvVar = (bpcv) obj;
        String str = (String) obj2;
        bpcvVar.getClass();
        int iIntValue = bpcy.c().intValue();
        int iIntValue2 = bpcy.c().intValue();
        if (iIntValue2 < 59170) {
            dqru.x("subject", iIntValue2);
        }
        if (iIntValue >= 59170) {
            dqru.v(bpcvVar.a, "subject", str);
        }
        return fctx.a;
    }
}
