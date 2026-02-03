package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvj {
    public static final /* synthetic */ crvi a(crvh crvhVar) {
        evsn evsnVarBuild = crvhVar.build();
        evsnVarBuild.getClass();
        return (crvi) evsnVarBuild;
    }

    public static final void b(eykc eykcVar, crvh crvhVar) {
        eykcVar.getClass();
        crvhVar.copyOnWrite();
        crvi crviVar = (crvi) crvhVar.instance;
        crvi crviVar2 = crvi.a;
        crviVar.c = eykcVar.a();
    }

    public static final /* synthetic */ void c(crtk crtkVar, crvh crvhVar) {
        crvhVar.copyOnWrite();
        crvi crviVar = (crvi) crvhVar.instance;
        crvi crviVar2 = crvi.a;
        evtg evtgVar = crviVar.e;
        if (!evtgVar.c()) {
            crviVar.e = evsn.mutableCopy(evtgVar);
        }
        crviVar.e.add(crtkVar);
    }

    public static final /* synthetic */ void d(crul crulVar, crvh crvhVar) {
        crvhVar.copyOnWrite();
        crvi crviVar = (crvi) crvhVar.instance;
        crvi crviVar2 = crvi.a;
        evtg evtgVar = crviVar.b;
        if (!evtgVar.c()) {
            crviVar.b = evsn.mutableCopy(evtgVar);
        }
        crviVar.b.add(crulVar);
    }
}
