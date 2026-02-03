package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtz {
    private Integer b = null;
    private Integer c = null;
    private Integer d = null;
    public equa a = equa.c;

    public final equb a() throws GeneralSecurityException {
        Integer num = this.b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.c.intValue();
        this.d.intValue();
        return new equb(iIntValue, iIntValue2, this.a);
    }

    public final void b(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void c(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void d() {
        this.d = 16;
    }
}
