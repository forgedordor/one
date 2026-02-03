package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwo implements Serializable, ejwm {
    private static final long serialVersionUID = 0;
    private final Class a;

    public ejwo(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.ejwm
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }

    @Override // defpackage.ejwm
    public final boolean equals(Object obj) {
        if (!(obj instanceof ejwo)) {
            return false;
        }
        Class cls = ((ejwo) obj).a;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
