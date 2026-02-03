package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auew {
    public static final /* synthetic */ auet a(aues auesVar) {
        evsn evsnVarBuild = auesVar.build();
        evsnVarBuild.getClass();
        return (auet) evsnVarBuild;
    }

    public static final void b(String str, aues auesVar) {
        auesVar.copyOnWrite();
        auet auetVar = (auet) auesVar.instance;
        auet auetVar2 = auet.a;
        auetVar.b |= 1;
        auetVar.c = str;
    }
}
