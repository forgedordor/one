package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajqq extends ajsl {
    public final Optional a;
    public final embo b;
    public final int c;
    public final int d;

    public ajqq(Optional optional, embo emboVar, int i, int i2) {
        this.a = optional;
        this.b = emboVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ajsl
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    public final embo b() {
        return this.b;
    }

    @Override // defpackage.ajsl
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.ajsl
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsl) {
            ajsl ajslVar = (ajsl) obj;
            if (this.a.equals(ajslVar.c()) && this.b.equals(ajslVar.b()) && this.c == ajslVar.a() && this.d == ajslVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.d;
        embo emboVar = this.b;
        return "MessagesBatchFailureContext{rawTelephonyStatus=" + String.valueOf(this.a) + ", reason=" + emboVar.toString() + ", terminalStatus=" + this.c + ", canFallback=" + embm.a(i) + "}";
    }
}
