package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfek {
    public static final dfek c;
    public static final dfek d;
    public static final dfek e;
    public static final dfek f;

    static {
        dfej dfejVarC = c();
        dfejVarC.c(1);
        c = dfejVarC.a();
        dfej dfejVarC2 = c();
        dfejVarC2.c(2);
        d = dfejVarC2.a();
        dfej dfejVarC3 = c();
        dfejVarC3.c(3);
        e = dfejVarC3.a();
        dfej dfejVarC4 = c();
        dfejVarC4.c(4);
        f = dfejVarC4.a();
    }

    public static dfej c() {
        dfef dfefVar = new dfef();
        dfefVar.b(Duration.ZERO);
        return dfefVar;
    }

    public abstract int a();

    public abstract Duration b();
}
