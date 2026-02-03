package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwk extends eiwf {
    private final Optional a;
    private final Optional b;
    private final Optional c;

    public eiwk(Optional optional, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
    }

    @Override // defpackage.eiwf
    public final Optional a() {
        return this.c;
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
        if (obj instanceof eiwf) {
            eiwf eiwfVar = (eiwf) obj;
            if (this.a.equals(eiwfVar.b()) && this.b.equals(eiwfVar.c()) && this.c.equals(eiwfVar.a())) {
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
        return "Alarm{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional2) + ", schedule=" + String.valueOf(optional) + "}";
    }
}
