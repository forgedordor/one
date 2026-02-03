package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwy extends eixt {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public eiwy(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    @Override // defpackage.eixt
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

    @Override // defpackage.eixt
    public final Optional d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixt) {
            eixt eixtVar = (eixt) obj;
            if (this.a.equals(eixtVar.b()) && this.b.equals(eixtVar.c()) && this.c.equals(eixtVar.a()) && this.d.equals(eixtVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "Person{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional3) + ", email=" + String.valueOf(optional2) + ", telephone=" + String.valueOf(optional) + "}";
    }
}
