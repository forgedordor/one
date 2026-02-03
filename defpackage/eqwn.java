package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwn extends eqtf {
    public final eqwm a;
    public final int b;

    private eqwn(eqwm eqwmVar, int i) {
        this.a = eqwmVar;
        this.b = i;
    }

    public static eqwn b(eqwm eqwmVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new eqwn(eqwmVar, i);
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.a != eqwm.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqwn)) {
            return false;
        }
        eqwn eqwnVar = (eqwn) obj;
        return eqwnVar.a == this.a && eqwnVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(eqwn.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.a.c + "salt_size_bytes: " + this.b + ")";
    }
}
