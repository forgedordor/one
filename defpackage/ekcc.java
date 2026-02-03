package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekcc extends eknw implements Serializable {
    private static final long serialVersionUID = 0;
    final ejvr a;
    final eknw b;

    public ekcc(ejvr ejvrVar, eknw eknwVar) {
        ejvrVar.getClass();
        this.a = ejvrVar;
        this.b = eknwVar;
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ejvr ejvrVar = this.a;
        return this.b.compare(ejvrVar.apply(obj), ejvrVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekcc) {
            ekcc ekccVar = (ekcc) obj;
            if (this.a.equals(ekccVar.a) && this.b.equals(ekccVar.b)) {
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
