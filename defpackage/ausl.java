package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausl {
    public static final ausl a;
    public static final ausl b;
    public static final ausl c;
    public static final ausl d;
    public static final ausl e;
    public static final ausl f;
    public static final ausl g;
    public static final ausl h;
    public static final ausl i;
    public static final ausl j;
    public static final ausl k;
    public static final ausl l;
    public static final ausl m;
    public static final ausl n;
    private static final /* synthetic */ ausl[] o;

    static {
        ausl auslVar = new ausl("READINESS_UNSPECIFIED", 0);
        a = auslVar;
        ausl auslVar2 = new ausl("READY", 1);
        b = auslVar2;
        ausl auslVar3 = new ausl("OS_INELIGIBLE", 2);
        c = auslVar3;
        ausl auslVar4 = new ausl("GMS_CORE_INELIGIBLE", 3);
        d = auslVar4;
        ausl auslVar5 = new ausl("LOCAL_MULTI_DEVICE_FEATURE_ON", 4);
        e = auslVar5;
        ausl auslVar6 = new ausl("LOCAL_BACKUP_AND_RESTORE_FEATURE_OFF", 5);
        f = auslVar6;
        ausl auslVar7 = new ausl("LOCAL_MISSING_FOLSOM_CONSENT", 6);
        g = auslVar7;
        ausl auslVar8 = new ausl("LOCAL_SETTING_ENCRYPTED", 7);
        h = auslVar8;
        ausl auslVar9 = new ausl("LOCAL_INITIAL_SYNC_NOT_COMPLETE", 8);
        i = auslVar9;
        ausl auslVar10 = new ausl("CMS_SERVER_MULTI_DEVICE_FEATURE_ON", 9);
        j = auslVar10;
        ausl auslVar11 = new ausl("CMS_SERVER_MISSING_BACKUP_KEY", 10);
        k = auslVar11;
        ausl auslVar12 = new ausl("FOLSOM_KEYS_NOT_SYNCED", 11);
        l = auslVar12;
        ausl auslVar13 = new ausl("FOLSOM_KEYS_EMPTY_KEY_MATERIAL", 12);
        m = auslVar13;
        ausl auslVar14 = new ausl("FOLSOM_KEYS_NOT_RETRIEVABLE", 13);
        n = auslVar14;
        ausl[] auslVarArr = {auslVar, auslVar2, auslVar3, auslVar4, auslVar5, auslVar6, auslVar7, auslVar8, auslVar9, auslVar10, auslVar11, auslVar12, auslVar13, auslVar14};
        o = auslVarArr;
        fczb.a(auslVarArr);
    }

    private ausl(String str, int i2) {
    }

    public static ausl[] values() {
        return (ausl[]) o.clone();
    }
}
