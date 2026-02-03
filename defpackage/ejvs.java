package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvs extends ejvp implements Serializable {
    private static final long serialVersionUID = 0;
    private final ejvr a;
    private final ejvp b;

    public ejvs(ejvr ejvrVar, ejvp ejvpVar) {
        this.a = ejvrVar;
        this.b = ejvpVar;
    }

    @Override // defpackage.ejvp
    public final int a(Object obj) {
        return this.a.apply(obj).hashCode();
    }

    @Override // defpackage.ejvp
    protected final boolean b(Object obj, Object obj2) {
        ejvr ejvrVar = this.a;
        return this.b.c(ejvrVar.apply(obj), ejvrVar.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejvs) {
            ejvs ejvsVar = (ejvs) obj;
            if (this.a.equals(ejvsVar.a) && this.b.equals(ejvsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ejvr ejvrVar = this.a;
        return this.b.toString() + ".onResultOf(" + ejvrVar.toString() + ")";
    }
}
