package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpo implements dhpk {
    private static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/download/DefaultBinaryTransparencyVerifier");
    private final dhro b;

    public dhpo(dhro dhroVar) {
        dhroVar.getClass();
        this.b = dhroVar;
    }

    private static final int b(etqy etqyVar, byte[] bArr) throws GeneralSecurityException {
        erqs.a();
        eqsw eqswVar = (eqsw) eqso.f(bArr).h(erfz.a, eqsw.class);
        try {
            etqm etqmVar = etqyVar.c;
            if (etqmVar == null) {
                etqmVar = etqm.a;
            }
            byte[] bArrI = etqmVar.c.I();
            etqm etqmVar2 = etqyVar.c;
            if (etqmVar2 == null) {
                etqmVar2 = etqm.a;
            }
            eqswVar.a(bArrI, etqmVar2.b.I());
            return 0;
        } catch (GeneralSecurityException unused) {
            ((ekrd) a.j().h("com/google/android/libraries/abuse/hades/moirai/download/DefaultBinaryTransparencyVerifier", "verifyProtectionLogRootSignature", 100, "DefaultBinaryTransparencyVerifier.kt")).q("Failure verifying log root signature.");
            return fdbq.f(etqyVar, etqy.a) ? 7 : 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // defpackage.dhpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r23, defpackage.etqy r24, defpackage.dhvy r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhpo.a(byte[], etqy, dhvy, fcxy):java.lang.Object");
    }
}
