package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auez {
    public static final /* synthetic */ auey a(auex auexVar) {
        evsn evsnVarBuild = auexVar.build();
        evsnVarBuild.getClass();
        return (auey) evsnVarBuild;
    }

    public static final void b(String str, auex auexVar) {
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        auey aueyVar2 = auey.a;
        aueyVar.b |= 1;
        aueyVar.c = str;
    }

    public static final void c(audr audrVar, auex auexVar) {
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        auey aueyVar2 = auey.a;
        aueyVar.h = audrVar;
        aueyVar.b |= 32;
    }
}
