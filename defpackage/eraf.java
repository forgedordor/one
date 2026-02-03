package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eraf {
    public erag a = null;
    public erah b = null;
    public erai c = null;
    private eqst f = null;
    public eraj d = eraj.c;
    public erwn e = null;

    public final erak a() throws GeneralSecurityException {
        erag eragVar = this.a;
        if (eragVar == null) {
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("Hash type is not set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("DEM parameters are not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        erag eragVar2 = erag.d;
        if (eragVar != eragVar2 && this.c == null) {
            throw new GeneralSecurityException("Point format is not set");
        }
        if (eragVar != eragVar2 || this.c == null) {
            return new erak(this.a, this.b, this.c, this.f, this.d, this.e);
        }
        throw new GeneralSecurityException("For Curve25519 point format must not be set");
    }

    public final void b(eqst eqstVar) throws GeneralSecurityException {
        if (!erak.a.contains(eqstVar)) {
            throw new GeneralSecurityException(a.b(eqstVar, "Invalid DEM parameters ", "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.f = eqstVar;
    }
}
