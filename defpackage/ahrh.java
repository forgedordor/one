package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrh {
    public static final /* synthetic */ ahrg a(ahrf ahrfVar) {
        evsn evsnVarBuild = ahrfVar.build();
        evsnVarBuild.getClass();
        return (ahrg) evsnVarBuild;
    }

    public static final void b(ahrj ahrjVar, ahrf ahrfVar) {
        ahrfVar.copyOnWrite();
        ahrg ahrgVar = (ahrg) ahrfVar.instance;
        ahrg ahrgVar2 = ahrg.a;
        ahrgVar.d = ahrjVar;
        ahrgVar.b |= 2;
    }

    public static final void c(ahrj ahrjVar, ahrf ahrfVar) {
        ahrjVar.getClass();
        ahrfVar.copyOnWrite();
        ahrg ahrgVar = (ahrg) ahrfVar.instance;
        ahrg ahrgVar2 = ahrg.a;
        ahrgVar.c = ahrjVar;
        ahrgVar.b |= 1;
    }

    public static final void d(ahrv ahrvVar, ahrf ahrfVar) {
        ahrfVar.copyOnWrite();
        ahrg ahrgVar = (ahrg) ahrfVar.instance;
        ahrg ahrgVar2 = ahrg.a;
        ahrgVar.e = ahrvVar;
        ahrgVar.b |= 4;
    }
}
