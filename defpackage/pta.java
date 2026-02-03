package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pta {
    public static final pta a;
    public final psu b;
    public final psz c;
    public final psz d;

    static {
        psu psuVar = psu.b;
        psz pszVar = psz.b;
        a = new pta(psuVar, pszVar, pszVar);
        new pta(psu.b, psz.b, psz.c);
        new pta(psu.a, psz.c, psz.b);
        new pta(psu.d, psz.b, psz.c);
        new pta(psu.c, psz.c, psz.b);
    }

    public pta(psu psuVar, psz pszVar, psz pszVar2) {
        psuVar.getClass();
        pszVar.getClass();
        pszVar2.getClass();
        this.b = psuVar;
        this.c = pszVar;
        this.d = pszVar2;
    }

    public static final pwl c(pxc pxcVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : pxcVar.a) {
            if (obj instanceof pwl) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (pwl) arrayList.get(0);
        }
        return null;
    }

    public final boolean a(pxc pxcVar) {
        if (!fdbq.f(this.d, psz.c)) {
            return false;
        }
        pwl pwlVarC = c(pxcVar);
        return pwlVarC == null || !fdbq.f(pwlVarC.b(), pwi.b) || fcva.g(psu.a, psu.c).contains(this.b);
    }

    public final boolean b(pxc pxcVar) {
        if (!fdbq.f(this.c, psz.c)) {
            return false;
        }
        pwl pwlVarC = c(pxcVar);
        return pwlVarC == null || !fdbq.f(pwlVarC.b(), pwi.a) || fcva.g(psu.b, psu.d).contains(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pta)) {
            return false;
        }
        pta ptaVar = (pta) obj;
        return fdbq.f(this.b, ptaVar.b) && fdbq.f(this.c, ptaVar.c) && fdbq.f(this.d, ptaVar.d);
    }

    public final int hashCode() {
        return (((this.b.e * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Bounds:{alignment=" + this.b + ", width=" + this.c + ", height=" + this.d + '}';
    }
}
