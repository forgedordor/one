package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auds {
    public static final /* synthetic */ audr a(audq audqVar) {
        evsn evsnVarBuild = audqVar.build();
        evsnVarBuild.getClass();
        return (audr) evsnVarBuild;
    }

    public static final void b(aufb aufbVar, audq audqVar) {
        audqVar.copyOnWrite();
        audr audrVar = (audr) audqVar.instance;
        audr audrVar2 = audr.a;
        audrVar.e = aufbVar;
        audrVar.b |= 4;
    }

    public static final void c(String str, audq audqVar) {
        audqVar.copyOnWrite();
        audr audrVar = (audr) audqVar.instance;
        audr audrVar2 = audr.a;
        audrVar.b |= 1;
        audrVar.c = str;
    }

    public static final void d(boolean z, audq audqVar) {
        audqVar.copyOnWrite();
        audr audrVar = (audr) audqVar.instance;
        audr audrVar2 = audr.a;
        audrVar.b |= 2;
        audrVar.d = z;
    }
}
