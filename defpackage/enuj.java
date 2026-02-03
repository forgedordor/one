package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuj {
    public static final /* synthetic */ emvy a(emvx emvxVar) {
        evsn evsnVarBuild = emvxVar.build();
        evsnVarBuild.getClass();
        return (emvy) evsnVarBuild;
    }

    public static final void b(boolean z, emvx emvxVar) {
        emvxVar.copyOnWrite();
        emvy emvyVar = (emvy) emvxVar.instance;
        emvy emvyVar2 = emvy.a;
        emvyVar.b |= 2;
        emvyVar.d = z;
    }

    public static final void c(boolean z, emvx emvxVar) {
        emvxVar.copyOnWrite();
        emvy emvyVar = (emvy) emvxVar.instance;
        emvy emvyVar2 = emvy.a;
        emvyVar.b |= 1;
        emvyVar.c = z;
    }

    public static final void d(boolean z, emvx emvxVar) {
        emvxVar.copyOnWrite();
        emvy emvyVar = (emvy) emvxVar.instance;
        emvy emvyVar2 = emvy.a;
        emvyVar.b |= 4;
        emvyVar.e = z;
    }
}
