package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcn {
    public final mcm a;
    public final ekgb b;

    static {
        mgb.O(0);
        mgb.O(1);
    }

    public mcn(mcm mcmVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= mcmVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = mcmVar;
        this.b = ekgb.n(list);
    }

    public final int a() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mcn mcnVar = (mcn) obj;
            if (this.a.equals(mcnVar.a) && ekjz.h(this.b, mcnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
