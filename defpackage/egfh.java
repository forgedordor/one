package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfh {
    public static final /* synthetic */ egfg a(egfd egfdVar) {
        evsn evsnVarBuild = egfdVar.build();
        evsnVarBuild.getClass();
        return (egfg) evsnVarBuild;
    }

    public static final void b(boolean z, egfd egfdVar) {
        egfdVar.copyOnWrite();
        egfg egfgVar = (egfg) egfdVar.instance;
        egfg egfgVar2 = egfg.a;
        egfgVar.b |= 1;
        egfgVar.c = z;
    }

    public static final void c(int i, egfd egfdVar) {
        egfdVar.copyOnWrite();
        egfg egfgVar = (egfg) egfdVar.instance;
        egfg egfgVar2 = egfg.a;
        egfgVar.e = i - 1;
        egfgVar.b |= 2;
    }
}
