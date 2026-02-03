package defpackage;

import android.telephony.gba.UaSecurityProtocolIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkc extends dhku {
    public final UaSecurityProtocolIdentifier a;

    public dhkc(UaSecurityProtocolIdentifier uaSecurityProtocolIdentifier) {
        if (uaSecurityProtocolIdentifier == null) {
            throw new NullPointerException("Null identifier");
        }
        this.a = uaSecurityProtocolIdentifier;
    }

    @Override // defpackage.dhku
    public final UaSecurityProtocolIdentifier a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhku) {
            return this.a.equals(((dhku) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UaSecurityProtocolIdentifierWrapper{identifier=" + this.a.toString() + "}";
    }
}
