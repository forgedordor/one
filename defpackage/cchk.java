package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cchk {
    public static final /* synthetic */ cchj a(cchf cchfVar) {
        evsn evsnVarBuild = cchfVar.build();
        evsnVarBuild.getClass();
        return (cchj) evsnVarBuild;
    }

    public static final void b(String str, cchi cchiVar, cchf cchfVar) {
        cchfVar.copyOnWrite();
        cchj cchjVar = (cchj) cchfVar.instance;
        cchj cchjVar2 = cchj.a;
        evub evubVar = cchjVar.b;
        if (!evubVar.b) {
            cchjVar.b = evubVar.a();
        }
        cchjVar.b.put(str, cchiVar);
    }
}
