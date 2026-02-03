package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexn {
    public static final fexn a = new fexn(fcva.av(new ArrayList()), null);
    public final ffea b;
    private final Set c;

    public fexn(Set set, ffea ffeaVar) {
        this.c = set;
        this.b = ffeaVar;
    }

    public final fexn a(ffea ffeaVar) {
        return fdbq.f(this.b, ffeaVar) ? this : new fexn(this.c, ffeaVar);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fexn)) {
            return false;
        }
        fexn fexnVar = (fexn) obj;
        return fdbq.f(fexnVar.c, this.c) && fdbq.f(fexnVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() + 1517;
        ffea ffeaVar = this.b;
        return (iHashCode * 41) + (ffeaVar != null ? ffeaVar.hashCode() : 0);
    }
}
