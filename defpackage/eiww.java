package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiww extends eixq {
    private final Optional a;
    private final Optional b;

    public eiww(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.eiyb
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.eiyb
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixq) {
            eixq eixqVar = (eixq) obj;
            if (this.a.equals(eixqVar.b()) && this.b.equals(eixqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "Organization{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + "}";
    }
}
