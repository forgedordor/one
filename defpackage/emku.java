package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emku {
    public static final /* synthetic */ elwc a(elwb elwbVar) {
        evsn evsnVarBuild = elwbVar.build();
        evsnVarBuild.getClass();
        return (elwc) evsnVarBuild;
    }

    public static final void b(enmr enmrVar, elwb elwbVar) {
        enmrVar.getClass();
        elwbVar.copyOnWrite();
        elwc elwcVar = (elwc) elwbVar.instance;
        elwc elwcVar2 = elwc.a;
        elwcVar.c = enmrVar.e;
        elwcVar.b |= 1;
    }

    public static final void c(boolean z, elwb elwbVar) {
        elwbVar.copyOnWrite();
        elwc elwcVar = (elwc) elwbVar.instance;
        elwc elwcVar2 = elwc.a;
        elwcVar.b |= 2;
        elwcVar.d = z;
    }
}
