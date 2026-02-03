package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwq {
    public static final /* synthetic */ epwp a(epwo epwoVar) {
        evsn evsnVarBuild = epwoVar.build();
        evsnVarBuild.getClass();
        return (epwp) evsnVarBuild;
    }

    public static final void b(epvr epvrVar, epwo epwoVar) {
        epwoVar.copyOnWrite();
        epwp epwpVar = (epwp) epwoVar.instance;
        epwp epwpVar2 = epwp.a;
        epwpVar.c = epvrVar.a();
        epwpVar.b |= 1;
    }

    public static final void c(evqs evqsVar, epwo epwoVar) {
        epwoVar.copyOnWrite();
        epwp epwpVar = (epwp) epwoVar.instance;
        epwp epwpVar2 = epwp.a;
        epwpVar.b |= 2;
        epwpVar.d = evqsVar;
    }
}
