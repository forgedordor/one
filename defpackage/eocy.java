package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eocy {
    public static final /* synthetic */ eocx a(eocw eocwVar) {
        evsn evsnVarBuild = eocwVar.build();
        evsnVarBuild.getClass();
        return (eocx) evsnVarBuild;
    }

    public static final void b(int i, eocw eocwVar) {
        eocwVar.copyOnWrite();
        eocx eocxVar = (eocx) eocwVar.instance;
        eocx eocxVar2 = eocx.a;
        eocxVar.b |= 4;
        eocxVar.g = i;
    }

    public static final void c(eocu eocuVar, eocw eocwVar) {
        eocwVar.copyOnWrite();
        eocx eocxVar = (eocx) eocwVar.instance;
        eocx eocxVar2 = eocx.a;
        eocxVar.e = eocuVar;
        eocxVar.b |= 1;
    }

    public static final void d(int i, eocw eocwVar) {
        eocwVar.copyOnWrite();
        eocx eocxVar = (eocx) eocwVar.instance;
        eocx eocxVar2 = eocx.a;
        eocxVar.f = i - 1;
        eocxVar.b |= 2;
    }
}
