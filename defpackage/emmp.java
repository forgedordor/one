package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmp {
    public static final /* synthetic */ emff a(emfa emfaVar) {
        evsn evsnVarBuild = emfaVar.build();
        evsnVarBuild.getClass();
        return (emff) evsnVarBuild;
    }

    public static final void b(enpl enplVar, emfa emfaVar) {
        emfaVar.copyOnWrite();
        emff emffVar = (emff) emfaVar.instance;
        emff emffVar2 = emff.a;
        emffVar.j = enplVar;
        emffVar.b |= 256;
    }

    public static final void c(emfc emfcVar, emfa emfaVar) {
        emfaVar.copyOnWrite();
        emff emffVar = (emff) emfaVar.instance;
        emff emffVar2 = emff.a;
        emffVar.c = emfcVar.U;
        emffVar.b |= 1;
    }

    public static final void d(emfe emfeVar, emfa emfaVar) {
        emfeVar.getClass();
        emfaVar.copyOnWrite();
        emff emffVar = (emff) emfaVar.instance;
        emff emffVar2 = emff.a;
        emffVar.d = emfeVar.t;
        emffVar.b |= 4;
    }
}
