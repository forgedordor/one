package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbu {
    public static final /* synthetic */ sbt a(sbs sbsVar) {
        evsn evsnVarBuild = sbsVar.build();
        evsnVarBuild.getClass();
        return (sbt) evsnVarBuild;
    }

    public static final void b(String str, sbs sbsVar) {
        str.getClass();
        sbsVar.copyOnWrite();
        sbt sbtVar = (sbt) sbsVar.instance;
        sbt sbtVar2 = sbt.a;
        sbtVar.b |= 2;
        sbtVar.d = str;
    }

    public static final void c(String str, sbs sbsVar) {
        str.getClass();
        sbsVar.copyOnWrite();
        sbt sbtVar = (sbt) sbsVar.instance;
        sbt sbtVar2 = sbt.a;
        sbtVar.b |= 1;
        sbtVar.c = str;
    }
}
