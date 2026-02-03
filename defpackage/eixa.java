package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eixa extends eixv {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public eixa(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    @Override // defpackage.eixv
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.eiyb
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.eiyb
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.eixv
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixv) {
            eixv eixvVar = (eixv) obj;
            if (this.a.equals(eixvVar.b()) && this.b.equals(eixvVar.c()) && this.c.equals(eixvVar.d()) && this.d.equals(eixvVar.a())) {
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
        return "SafetyCheck{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional3) + ", duration=" + String.valueOf(optional2) + ", checkinTime=" + String.valueOf(optional) + "}";
    }
}
