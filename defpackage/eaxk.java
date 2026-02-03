package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eaxk extends eayo {
    private final eayr a;
    private final Optional b;

    public eaxk(eayr eayrVar, Optional optional) {
        this.a = eayrVar;
        this.b = optional;
    }

    @Override // defpackage.eayo
    public final eayr a() {
        return this.a;
    }

    @Override // defpackage.eayo
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayo) {
            eayo eayoVar = (eayo) obj;
            if (this.a.equals(eayoVar.a()) && this.b.equals(eayoVar.b())) {
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
        return "EventRecord{eventVector=" + this.a.toString() + ", aggregateValue=" + optional.toString() + "}";
    }
}
