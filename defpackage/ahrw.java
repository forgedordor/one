package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrw {
    public static final /* synthetic */ ahrv a(ahru ahruVar) {
        evsn evsnVarBuild = ahruVar.build();
        evsnVarBuild.getClass();
        return (ahrv) evsnVarBuild;
    }

    public static final void b(ahrm ahrmVar, ahru ahruVar) {
        ahruVar.copyOnWrite();
        ahrv ahrvVar = (ahrv) ahruVar.instance;
        ahrv ahrvVar2 = ahrv.a;
        ahrvVar.c = ahrmVar;
        ahrvVar.b = 2;
    }

    public static final void c(ahrs ahrsVar, ahru ahruVar) {
        ahruVar.copyOnWrite();
        ahrv ahrvVar = (ahrv) ahruVar.instance;
        ahrv ahrvVar2 = ahrv.a;
        ahrvVar.c = ahrsVar;
        ahrvVar.b = 1;
    }
}
