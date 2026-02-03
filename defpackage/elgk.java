package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class elgk implements Comparable, Serializable {
    protected final elgj a;

    protected elgk(elgj elgjVar) {
        this.a = elgjVar;
    }

    protected final void b(elgk elgkVar) {
        elgkVar.a.equals(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        elgk elgkVar = (elgk) obj;
        if (this == elgkVar) {
            return 0;
        }
        b(elgkVar);
        return Double.compare(100000.0d, 100000.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elgk)) {
            return false;
        }
        b((elgk) obj);
        return true;
    }

    public int hashCode() {
        return 53336526;
    }

    public String toString() {
        return Double.toString(100000.0d);
    }
}
