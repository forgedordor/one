package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alfo extends alls {
    private final String a;
    private final Optional b;

    public alfo(String str, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null regionCode");
        }
        this.a = str;
        this.b = optional;
    }

    @Override // defpackage.alls
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.alls
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alls) {
            alls allsVar = (alls) obj;
            if (this.a.equals(allsVar.b()) && this.b.equals(allsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PhoneCountry{regionCode=" + this.a + ", callCode=" + this.b.toString() + "}";
    }
}
