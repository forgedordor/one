package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwq extends eixk {
    private final Optional a;
    private final Optional b;

    public eiwq(Optional optional, Optional optional2) {
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
        if (obj instanceof eixk) {
            eixk eixkVar = (eixk) obj;
            if (this.a.equals(eixkVar.b()) && this.b.equals(eixkVar.c())) {
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
        return "ListItem{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + "}";
    }
}
