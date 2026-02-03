package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzi {
    private Integer b = null;
    public eqzj a = eqzj.c;

    public final eqzk a() throws GeneralSecurityException {
        Integer num = this.b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new eqzk(num.intValue(), this.a);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void b(int i) throws InvalidAlgorithmParameterException {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }
}
