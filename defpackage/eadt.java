package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadt {
    public static final /* synthetic */ int a = 0;
    private static final eclu b = new eclu(eabk.a);
    private static final Object c = new Object();
    private static volatile ecjl d = null;

    public static ecjh a(dzyn dzynVar) {
        ecji ecjiVarH = ecjj.h();
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(dzynVar.d);
        ecfaVar.f("phenotype");
        ecfaVar.g("all_accounts.pb");
        ecjiVarH.f(ecfaVar.a());
        ecjiVarH.e(eabk.a);
        ecjiVarH.d(b);
        ecjiVarH.c();
        ecjj ecjjVarA = ecjiVarH.a();
        ecjl ecjlVar = d;
        if (ecjlVar == null) {
            synchronized (c) {
                ecjlVar = d;
                if (ecjlVar == null) {
                    eclv eclvVar = eclv.a;
                    HashMap map = new HashMap();
                    eosd eosdVarE = dzynVar.e();
                    ecev ecevVarC = dzynVar.c();
                    ecjm.a(eckx.a, map);
                    ecjl ecjlVar2 = new ecjl(eosdVarE, ecevVarC, eclvVar, map);
                    d = ecjlVar2;
                    ecjlVar = ecjlVar2;
                }
            }
        }
        return ecjlVar.a(ecjjVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = b(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eadt.b(java.io.File):boolean");
    }
}
