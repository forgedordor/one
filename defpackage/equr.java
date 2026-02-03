package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equr {
    private Integer b = null;
    public equs a = equs.c;

    public final equt a() throws GeneralSecurityException {
        Integer num = this.b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new equt(num.intValue(), this.a);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void b(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }
}
