package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhz implements ergr {
    public erhz() throws GeneralSecurityException {
        if (!eqza.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
