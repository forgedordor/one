package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwq implements Serializable, ejwm {
    private static final long serialVersionUID = 0;
    final ejwm a;

    public ejwq(ejwm ejwmVar) {
        this.a = ejwmVar;
    }

    @Override // defpackage.ejwm
    public final boolean a(Object obj) {
        return !this.a.a(obj);
    }

    @Override // defpackage.ejwm
    public final boolean equals(Object obj) {
        if (obj instanceof ejwq) {
            return this.a.equals(((ejwq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.a.toString() + ")";
    }
}
