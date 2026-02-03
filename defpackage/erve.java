package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erve implements ervf {
    private final ervo a;

    public erve(ervo ervoVar) {
        this.a = ervoVar;
    }

    @Override // defpackage.ervf
    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = ervg.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
