package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhel extends dheg<Void> {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private final deyw b;

    public dhel(deyw deywVar) {
        this.b = deywVar;
    }

    private static final String g(ewfp ewfpVar) {
        int iOrdinal = ewfpVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "Unknown" : "Reset Provisioning Engine" : "Request re-configuration" : "Send keep-alive";
    }

    public final String a(ewfq ewfqVar) {
        ewfp ewfpVarB = ewfp.b(ewfqVar.b);
        if (ewfpVarB == null) {
            ewfpVarB = ewfp.UNRECOGNIZED;
        }
        return g(ewfpVarB);
    }

    public final void b(dhek dhekVar, ewfp ewfpVar) {
        int iA = ewfpVar.a();
        ConcurrentHashMap concurrentHashMap = a;
        Integer numValueOf = Integer.valueOf(iA);
        if (concurrentHashMap.containsKey(numValueOf)) {
            dhja.q("There is already an FCM tickle listener for message: %s!", g(ewfpVar));
        }
        dhja.c("Adding FCM tickle listener for action %s", g(ewfpVar));
        concurrentHashMap.put(numValueOf, dhekVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // defpackage.dheg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(android.content.Context r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhel.c(android.content.Context, android.content.Intent):void");
    }

    public final void f(ewfp ewfpVar) {
        int iA = ewfpVar.a();
        ConcurrentHashMap concurrentHashMap = a;
        Integer numValueOf = Integer.valueOf(iA);
        if (!concurrentHashMap.containsKey(numValueOf)) {
            dhja.q("There is no FCM tickle listener for action %s!", g(ewfpVar));
        } else {
            dhja.c("Removing FCM tickle listener for action %s", g(ewfpVar));
            concurrentHashMap.remove(numValueOf);
        }
    }
}
