package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enye {
    public static final /* synthetic */ enxw a(enxv enxvVar) {
        evsn evsnVarBuild = enxvVar.build();
        evsnVarBuild.getClass();
        return (enxw) evsnVarBuild;
    }

    public static final void b(enxi enxiVar, enxv enxvVar) {
        enxiVar.getClass();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxw enxwVar2 = enxw.a;
        enxwVar.f = enxiVar.D;
        enxwVar.b |= 8;
    }

    public static final void c(enxk enxkVar, enxv enxvVar) {
        enxkVar.getClass();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxw enxwVar2 = enxw.a;
        enxwVar.g = enxkVar.f;
        enxwVar.b |= 16;
    }

    public static final void d(int i, enxv enxvVar) {
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxw enxwVar2 = enxw.a;
        enxwVar.e = i - 1;
        enxwVar.b |= 4;
    }
}
