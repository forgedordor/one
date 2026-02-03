package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbun {
    private final cbul a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public cbun(cbul cbulVar) {
        this.a = cbulVar;
    }

    public static /* synthetic */ cbum a(cbun cbunVar, ccpl ccplVar, boolean z, int i) {
        epvr epvrVar = (i & 2) != 0 ? epvr.CIPHER_SUITE_P256_AES128 : null;
        boolean z2 = z & ((i & 4) == 0);
        ccplVar.getClass();
        epvrVar.getClass();
        ConcurrentHashMap concurrentHashMap = cbunVar.b;
        String strB = ccplVar.b();
        Object cbvjVar = concurrentHashMap.get(strB);
        if (cbvjVar == null) {
            cbwb cbwbVar = (cbwb) cbunVar.a;
            cbyh cbyhVarA = cbwbVar.a.a(ccplVar, epvrVar, z2);
            cbwh cbwhVar = cbwbVar.b;
            cbwk cbwkVar = new cbwk(cbwhVar.a, cbwhVar.b, cbyhVarA);
            cbvjVar = new cbvj(cbwkVar, cbwkVar);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(strB, cbvjVar);
            if (objPutIfAbsent != null) {
                cbvjVar = objPutIfAbsent;
            }
        }
        return (cbum) cbvjVar;
    }
}
