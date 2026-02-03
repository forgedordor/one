package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyka {
    public static final /* synthetic */ ezso a(ezsl ezslVar) {
        evsn evsnVarBuild = ezslVar.build();
        evsnVarBuild.getClass();
        return (ezso) evsnVarBuild;
    }

    public static final void b(String str, ezsl ezslVar) {
        str.getClass();
        ezslVar.copyOnWrite();
        ezso ezsoVar = (ezso) ezslVar.instance;
        ezso ezsoVar2 = ezso.a;
        ezsoVar.e = str;
    }

    public static final void c(ezpp ezppVar, ezsl ezslVar) {
        ezslVar.copyOnWrite();
        ezso ezsoVar = (ezso) ezslVar.instance;
        ezso ezsoVar2 = ezso.a;
        ezsoVar.c = ezppVar;
        ezsoVar.b |= 1;
    }

    public static final void d(ezol ezolVar, ezsl ezslVar) {
        ezslVar.copyOnWrite();
        ezso ezsoVar = (ezso) ezslVar.instance;
        ezso ezsoVar2 = ezso.a;
        ezsoVar.d = ezolVar;
        ezsoVar.b |= 2;
    }

    public static final void e(ezpx ezpxVar, ezsl ezslVar) {
        ezslVar.copyOnWrite();
        ezso ezsoVar = (ezso) ezslVar.instance;
        ezso ezsoVar2 = ezso.a;
        ezsoVar.f = ezpxVar;
        ezsoVar.b |= 4;
    }

    public static final /* synthetic */ void f(ezsn ezsnVar, ezsl ezslVar) {
        ezsnVar.getClass();
        ezslVar.copyOnWrite();
        ezso ezsoVar = (ezso) ezslVar.instance;
        ezso ezsoVar2 = ezso.a;
        evtg evtgVar = ezsoVar.g;
        if (!evtgVar.c()) {
            ezsoVar.g = evsn.mutableCopy(evtgVar);
        }
        ezsoVar.g.add(ezsnVar);
    }

    public static final void h(ezsl ezslVar) {
        ezslVar.copyOnWrite();
        ezso ezsoVar = (ezso) ezslVar.instance;
        ezso ezsoVar2 = ezso.a;
        ezsoVar.h = 2;
    }
}
