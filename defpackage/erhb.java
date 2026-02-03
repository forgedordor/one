package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhb {
    private Integer c = null;
    private Integer d = null;
    public erhc a = null;
    public erhd b = erhd.d;

    public final erhe a() throws GeneralSecurityException {
        Integer num = this.c;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.c));
        }
        Integer num2 = this.d;
        int iIntValue = num2.intValue();
        erhc erhcVar = this.a;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (erhcVar == erhc.a) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (erhcVar == erhc.b) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (erhcVar == erhc.c) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (erhcVar == erhc.d) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (erhcVar != erhc.e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new erhe(this.c.intValue(), this.d.intValue(), this.b, this.a);
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
