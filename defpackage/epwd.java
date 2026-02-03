package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwd {
    public static final /* synthetic */ epwc a(epwb epwbVar) {
        evsn evsnVarBuild = epwbVar.build();
        evsnVarBuild.getClass();
        return (epwc) evsnVarBuild;
    }

    public static final void b(String str, epwb epwbVar) {
        epwbVar.copyOnWrite();
        epwc epwcVar = (epwc) epwbVar.instance;
        epwc epwcVar2 = epwc.a;
        epwcVar.b |= 2;
        epwcVar.d = str;
    }

    public static final void c(epvy epvyVar, epwb epwbVar) {
        epwbVar.copyOnWrite();
        epwc epwcVar = (epwc) epwbVar.instance;
        epwc epwcVar2 = epwc.a;
        epwcVar.e = epvyVar;
        epwcVar.b |= 4;
    }
}
