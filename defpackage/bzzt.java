package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzt {
    public static final cqce a = cqce.g("BugleCms", "CmsObjectNotificationResolver");
    public final dqsn b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final bxlc g;
    public final aurx h;
    public final caww i;
    public final bzqz j;

    public bzzt(dqsn dqsnVar, bzqz bzqzVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, aurx aurxVar, bxlc bxlcVar, caww cawwVar) {
        this.b = dqsnVar;
        this.j = bzqzVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = bxlcVar;
        this.h = aurxVar;
        this.i = cawwVar;
    }

    public static bzzu a(String str, String str2) {
        return new bzzu(cpyz.NO_RETRY, String.format("MMS transactionId is not in the expected format. trId:%s, contentLoc: %s", str, str2));
    }
}
