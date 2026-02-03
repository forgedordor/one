package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubr {
    public static final /* synthetic */ aubq a(aubn aubnVar) {
        evsn evsnVarBuild = aubnVar.build();
        evsnVarBuild.getClass();
        return (aubq) evsnVarBuild;
    }

    public static final void b(String str, aubn aubnVar) {
        str.getClass();
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubq aubqVar2 = aubq.a;
        aubqVar.b |= 2;
        aubqVar.d = str;
    }

    public static final void c(aubp aubpVar, aubn aubnVar) {
        aubpVar.getClass();
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubq aubqVar2 = aubq.a;
        aubqVar.c = aubpVar.f;
        aubqVar.b |= 1;
    }
}
