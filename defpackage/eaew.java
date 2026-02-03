package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaew implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws IOException {
        InputStream inputStreamA = new echh().a(eceqVar);
        try {
            eaar eaarVarC = eaar.c(evqz.K(inputStreamA));
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return eaarVarC;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
