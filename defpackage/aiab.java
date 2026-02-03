package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiab {
    public static final /* synthetic */ aiaa a(ahzz ahzzVar) {
        evsn evsnVarBuild = ahzzVar.build();
        evsnVarBuild.getClass();
        return (aiaa) evsnVarBuild;
    }

    public static final void b(String str, ahzz ahzzVar) {
        ahzzVar.copyOnWrite();
        aiaa aiaaVar = (aiaa) ahzzVar.instance;
        aiaa aiaaVar2 = aiaa.a;
        aiaaVar.b |= 2;
        aiaaVar.d = str;
    }

    public static final void c(evvp evvpVar, ahzz ahzzVar) {
        ahzzVar.copyOnWrite();
        aiaa aiaaVar = (aiaa) ahzzVar.instance;
        aiaa aiaaVar2 = aiaa.a;
        aiaaVar.e = evvpVar;
        aiaaVar.b |= 4;
    }

    public static final void d(long j, ahzz ahzzVar) {
        ahzzVar.copyOnWrite();
        aiaa aiaaVar = (aiaa) ahzzVar.instance;
        aiaa aiaaVar2 = aiaa.a;
        aiaaVar.b |= 8;
        aiaaVar.f = j;
    }

    public static final void e(long j, ahzz ahzzVar) {
        ahzzVar.copyOnWrite();
        aiaa aiaaVar = (aiaa) ahzzVar.instance;
        aiaa aiaaVar2 = aiaa.a;
        aiaaVar.b |= 16;
        aiaaVar.g = j;
    }

    public static final void f(long j, ahzz ahzzVar) {
        ahzzVar.copyOnWrite();
        aiaa aiaaVar = (aiaa) ahzzVar.instance;
        aiaa aiaaVar2 = aiaa.a;
        aiaaVar.b |= 1;
        aiaaVar.c = j;
    }
}
