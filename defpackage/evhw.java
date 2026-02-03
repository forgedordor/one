package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhw {
    public static final /* synthetic */ evhv a(evhu evhuVar) {
        evsn evsnVarBuild = evhuVar.build();
        evsnVarBuild.getClass();
        return (evhv) evsnVarBuild;
    }

    public static final void b(String str, evhu evhuVar) {
        str.getClass();
        evhuVar.copyOnWrite();
        evhv evhvVar = (evhv) evhuVar.instance;
        evhv evhvVar2 = evhv.a;
        evhvVar.b |= 1;
        evhvVar.c = str;
    }

    public static final void c(long j, evhu evhuVar) {
        evhuVar.copyOnWrite();
        evhv evhvVar = (evhv) evhuVar.instance;
        evhv evhvVar2 = evhv.a;
        evhvVar.b |= 2;
        evhvVar.d = j;
    }
}
