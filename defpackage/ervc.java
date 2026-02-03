package defpackage;

import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ervc implements ervf {
    private final ervo a;

    public ervc(ervo ervoVar) {
        this.a = ervoVar;
    }

    @Override // defpackage.ervf
    public final Object a(String str) {
        Iterator it = ervg.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, null);
    }
}
