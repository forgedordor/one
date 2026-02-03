package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cchy {
    public static final /* synthetic */ cchw a(cchr cchrVar) {
        evsn evsnVarBuild = cchrVar.build();
        evsnVarBuild.getClass();
        return (cchw) evsnVarBuild;
    }

    public static final void b(String str, ccht cchtVar, cchr cchrVar) {
        cchrVar.copyOnWrite();
        cchw cchwVar = (cchw) cchrVar.instance;
        cchw cchwVar2 = cchw.a;
        evub evubVar = cchwVar.b;
        if (!evubVar.b) {
            cchwVar.b = evubVar.a();
        }
        cchwVar.b.put(str, cchtVar);
    }
}
