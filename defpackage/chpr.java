package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpr {
    public static final chpr a;
    public static final chpr b;
    public static final chpr c;
    public static final chpr d;
    public static final chpr e;
    public static final chpr f;
    public static final chpr g;
    public static final chpr h;
    public static final chpr i;
    public static final chpr j;
    public static final chpr k;
    public static final chpr l;
    public static final chpr m;
    public static final chpr n;
    public static final chpr o;
    public static final chpr p;
    public static final chpr q;
    private static final /* synthetic */ chpr[] s;
    public final int r;

    static {
        chpr chprVar = new chpr("UNKNOWN", 0, 0);
        a = chprVar;
        chpr chprVar2 = new chpr("CAN_SHARE", 1, 1);
        b = chprVar2;
        chpr chprVar3 = new chpr("FLAGS_DISABLED", 2, 2);
        c = chprVar3;
        chpr chprVar4 = new chpr("INVALID_SELF_IDENTITY", 3, 3);
        d = chprVar4;
        chpr chprVar5 = new chpr("MISSING_SELF_RCS", 4, 4);
        e = chprVar5;
        chpr chprVar6 = new chpr("MISSING_SELF_E2EE", 5, 5);
        f = chprVar6;
        chpr chprVar7 = new chpr("INVALID_SELF_TOKEN", 6, 6);
        g = chprVar7;
        chpr chprVar8 = new chpr("NOT_SIGNED_IN", 7, 7);
        h = chprVar8;
        chpr chprVar9 = new chpr("INVALID_PERSON_ID", 8, 8);
        i = chprVar9;
        chpr chprVar10 = new chpr("NO_ELIGIBLE_RECIPIENTS", 9, 9);
        j = chprVar10;
        chpr chprVar11 = new chpr("INVALID_SELF_PROFILE", 10, 10);
        k = chprVar11;
        chpr chprVar12 = new chpr("DIRECT_SHARE_LIMIT_EXCEEDED", 11, 11);
        l = chprVar12;
        chpr chprVar13 = new chpr("COMPOSE_DISABLED", 12, 12);
        m = chprVar13;
        chpr chprVar14 = new chpr("SHARING_DISABLED_BY_SETTINGS", 13, 13);
        n = chprVar14;
        chpr chprVar15 = new chpr("MAX_GROUP_SIZE_REACHED", 14, 14);
        o = chprVar15;
        chpr chprVar16 = new chpr("MISSING_CONVERSATION_E2EE", 15, 15);
        p = chprVar16;
        chpr chprVar17 = new chpr("MISSING_CONVERSATION_RCS", 16, 16);
        q = chprVar17;
        chpr[] chprVarArr = {chprVar, chprVar2, chprVar3, chprVar4, chprVar5, chprVar6, chprVar7, chprVar8, chprVar9, chprVar10, chprVar11, chprVar12, chprVar13, chprVar14, chprVar15, chprVar16, chprVar17};
        s = chprVarArr;
        fczb.a(chprVarArr);
    }

    private chpr(String str, int i2, int i3) {
        this.r = i3;
    }

    public static chpr[] values() {
        return (chpr[]) s.clone();
    }
}
