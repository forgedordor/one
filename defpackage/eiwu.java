package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwu extends eixo {
    private final Optional a;
    private final Optional b;

    public eiwu(Optional optional, Optional optional2) {
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
        if (obj instanceof eixo) {
            eixo eixoVar = (eixo) obj;
            if (this.a.equals(eixoVar.b()) && this.b.equals(eixoVar.c())) {
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
        return "OrderItem{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + "}";
    }
}
