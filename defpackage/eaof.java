package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaof extends earz {
    public final Integer a;
    public final List b;

    public eaof(Integer num, List list) {
        this.a = num;
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.b = list;
    }

    @Override // defpackage.earz
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.earz
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof earz) {
            earz earzVar = (earz) obj;
            if (this.a.equals(earzVar.a()) && this.b.equals(earzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EVChargeOptions{connectorCount=" + this.a + ", connectorAggregations=" + this.b.toString() + "}";
    }
}
