package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekno extends eknw implements Serializable {
    public static final ekno a = new ekno();
    private static final long serialVersionUID = 0;
    private transient eknw b;
    private transient eknw c;

    private ekno() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.eknw
    public final eknw a() {
        eknw eknwVar = this.b;
        if (eknwVar != null) {
            return eknwVar;
        }
        eknp eknpVar = new eknp(this);
        this.b = eknpVar;
        return eknpVar;
    }

    @Override // defpackage.eknw
    public final eknw b() {
        eknw eknwVar = this.c;
        if (eknwVar != null) {
            return eknwVar;
        }
        eknq eknqVar = new eknq(this);
        this.c = eknqVar;
        return eknqVar;
    }

    @Override // defpackage.eknw
    public final eknw c() {
        return ekop.a;
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
