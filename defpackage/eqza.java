package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqza {
    public static boolean a(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !eqzb.a();
        }
        if (eqzb.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                eqzb.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
