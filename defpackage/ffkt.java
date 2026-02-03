package defpackage;

import java.security.Provider;
import java.security.Security;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffkt extends ffkv {
    private static volatile Provider b;

    public ffkt() {
        super(c());
    }

    private static synchronized Provider c() {
        Provider provider = Security.getProvider("BC");
        if (provider instanceof ffla) {
            return provider;
        }
        if (b != null) {
            return b;
        }
        b = new ffla();
        return b;
    }
}
