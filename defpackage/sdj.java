package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdj {
    public static final /* synthetic */ sdi a(sdh sdhVar) {
        evsn evsnVarBuild = sdhVar.build();
        evsnVarBuild.getClass();
        return (sdi) evsnVarBuild;
    }

    public static final void b(sbr sbrVar, sdh sdhVar) {
        sdhVar.copyOnWrite();
        sdi sdiVar = (sdi) sdhVar.instance;
        sdi sdiVar2 = sdi.a;
        sdiVar.c = sbrVar;
        sdiVar.b |= 1;
    }

    public static final void c(sbt sbtVar, sdh sdhVar) {
        sdhVar.copyOnWrite();
        sdi sdiVar = (sdi) sdhVar.instance;
        sdi sdiVar2 = sdi.a;
        sdiVar.d = sbtVar;
        sdiVar.b |= 2;
    }
}
