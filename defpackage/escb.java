package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class escb {
    public static esgu a(escc esccVar, Class cls) {
        return esccVar.a(new esde(esdd.class, cls));
    }

    public static Object b(escc esccVar, esde esdeVar) {
        esgu esguVarA = esccVar.a(esdeVar);
        if (esguVarA == null) {
            return null;
        }
        return esguVarA.a();
    }

    public static Object c(escc esccVar, Class cls) {
        return b(esccVar, new esde(esdd.class, cls));
    }

    public static Set d(escc esccVar, Class cls) {
        esde esdeVar = new esde(esdd.class, cls);
        esdg esdgVar = (esdg) esccVar;
        if (esdgVar.a.contains(esdeVar)) {
            return (Set) esdgVar.b.c(esdeVar).a();
        }
        throw new esct(String.format("Attempting to request an undeclared dependency Set<%s>.", esdeVar));
    }
}
