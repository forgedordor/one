package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrs {
    public final fbte a;
    public final fbmw b;
    public final fbro c;

    public fbrs(fbte fbteVar, fbmw fbmwVar, fbro fbroVar) {
        this.a = fbteVar;
        fbmwVar.getClass();
        this.b = fbmwVar;
        this.c = fbroVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbrs)) {
            return false;
        }
        fbrs fbrsVar = (fbrs) obj;
        return ejwh.a(this.a, fbrsVar.a) && ejwh.a(this.b, fbrsVar.b) && ejwh.a(this.c, fbrsVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("addressesOrError", this.a.toString());
        ejwfVarB.b("attributes", this.b);
        ejwfVarB.b("serviceConfigOrError", this.c);
        return ejwfVarB.toString();
    }
}
