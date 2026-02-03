package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwp implements Serializable, ejwm {
    private static final long serialVersionUID = 0;
    private final Object a;

    public ejwp(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ejwm
    public final boolean a(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.ejwm
    public final boolean equals(Object obj) {
        if (obj instanceof ejwp) {
            return this.a.equals(((ejwp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + this.a.toString() + ")";
    }
}
