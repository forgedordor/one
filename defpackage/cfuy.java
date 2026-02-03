package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfuy {
    public static final cfuy a;
    public static final cfuy b;
    public static final cfuy c;
    public static final cfuy d;
    public static final cfuy e;
    public static final cfuy f;
    public static final cfuy g;
    public static final cfuy h;
    public static final cfuy i;
    public static final cfuy j;
    public static final cfuy k;
    public static final cfuy l;
    private static final /* synthetic */ cfuy[] m;

    static {
        cfuy cfuyVar = new cfuy("REQUEST_TO_CONNECT", 0);
        a = cfuyVar;
        cfuy cfuyVar2 = new cfuy("WAIT_TIMER_EXPIRED", 1);
        b = cfuyVar2;
        cfuy cfuyVar3 = new cfuy("PONG_WATCHDOG_EXPIRED", 2);
        c = cfuyVar3;
        cfuy cfuyVar4 = new cfuy("CHANNEL_ESTABLISHED", 3);
        d = cfuyVar4;
        cfuy cfuyVar5 = new cfuy("TRANSIENT_CONNECTION_ERROR", 4);
        e = cfuyVar5;
        cfuy cfuyVar6 = new cfuy("PERMANENT_CONNECTION_ERROR", 5);
        f = cfuyVar6;
        cfuy cfuyVar7 = new cfuy("NETWORK_CONNECTED", 6);
        g = cfuyVar7;
        cfuy cfuyVar8 = new cfuy("MAX_RETRIES_EXHAUSTED", 7);
        h = cfuyVar8;
        cfuy cfuyVar9 = new cfuy("BUGLE_NOTIFIED", 8);
        i = cfuyVar9;
        cfuy cfuyVar10 = new cfuy("MESSAGE_PENDING", 9);
        j = cfuyVar10;
        cfuy cfuyVar11 = new cfuy("PENDING_MESSAGE_TIMEOUT_EXPIRED", 10);
        k = cfuyVar11;
        cfuy cfuyVar12 = new cfuy("AUTH_TOKEN_UPDATED", 11);
        l = cfuyVar12;
        cfuy[] cfuyVarArr = {cfuyVar, cfuyVar2, cfuyVar3, cfuyVar4, cfuyVar5, cfuyVar6, cfuyVar7, cfuyVar8, cfuyVar9, cfuyVar10, cfuyVar11, cfuyVar12};
        m = cfuyVarArr;
        fczb.a(cfuyVarArr);
    }

    private cfuy(String str, int i2) {
    }

    public static cfuy[] values() {
        return (cfuy[]) m.clone();
    }
}
