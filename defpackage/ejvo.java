package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvo implements Serializable {
    private static final long serialVersionUID = 0;
    private final ejvp a;
    private final Object b;

    public ejvo(ejvp ejvpVar, Object obj) {
        this.a = ejvpVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ejvo)) {
            return false;
        }
        ejvo ejvoVar = (ejvo) obj;
        ejvp ejvpVar = this.a;
        if (ejvpVar.equals(ejvoVar.a)) {
            return ejvpVar.c(this.b, ejvoVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a(this.b);
    }

    public final String toString() {
        Object obj = this.b;
        return this.a.toString() + ".wrap(" + obj.toString() + ")";
    }
}
