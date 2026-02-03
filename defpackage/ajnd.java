package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajnd extends ajnp {
    public final Optional a;
    public final Optional b;
    public final Optional c;

    public ajnd(Optional optional, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
    }

    @Override // defpackage.ajnp
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.ajnp
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.ajnp
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnp) {
            ajnp ajnpVar = (ajnp) obj;
            if (this.a.equals(ajnpVar.a()) && this.b.equals(ajnpVar.b()) && this.c.equals(ajnpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "GlobalConfigurationUpdate{rcsSetting=" + String.valueOf(this.a) + ", readReceiptBehavior=" + String.valueOf(optional2) + ", typingIndicatorBehavior=" + String.valueOf(optional) + "}";
    }
}
