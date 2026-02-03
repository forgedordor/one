package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cecq {
    public static final cecq a;
    public static final cecq b;
    public static final cecq c;
    public static final cecq d;
    public static final cecq e;
    public static final cecq f;
    public static final cecq g;
    public static final cecq h;
    public static final cecq i;
    public static final cecq j;
    private static final /* synthetic */ cecq[] k;

    static {
        cecq cecqVar = new cecq("UNKNOWN", 0);
        a = cecqVar;
        cecq cecqVar2 = new cecq("WRONG_CODE_SELECTED", 1);
        b = cecqVar2;
        cecq cecqVar3 = new cecq("CANCELED_VERIFICATION", 2);
        c = cecqVar3;
        cecq cecqVar4 = new cecq("CANCELED_VERIFICATION_ON_WEB", 3);
        d = cecqVar4;
        cecq cecqVar5 = new cecq("DENY_VERIFICATION", 4);
        e = cecqVar5;
        cecq cecqVar6 = new cecq("EMOJI_DOWNLOAD_FAILED", 5);
        f = cecqVar6;
        cecq cecqVar7 = new cecq("TIME_OUT", 6);
        g = cecqVar7;
        cecq cecqVar8 = new cecq("SUCCESS", 7);
        h = cecqVar8;
        cecq cecqVar9 = new cecq("NEW_REQUEST_WHILE_WAITING", 8);
        i = cecqVar9;
        cecq cecqVar10 = new cecq("UKEY2_ERROR", 9);
        j = cecqVar10;
        cecq[] cecqVarArr = {cecqVar, cecqVar2, cecqVar3, cecqVar4, cecqVar5, cecqVar6, cecqVar7, cecqVar8, cecqVar9, cecqVar10};
        k = cecqVarArr;
        fczb.a(cecqVarArr);
    }

    private cecq(String str, int i2) {
    }

    public static cecq[] values() {
        return (cecq[]) k.clone();
    }
}
