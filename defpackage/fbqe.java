package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqe {
    public final List a;
    public final fbmw b;
    public final Object c;

    public fbqe(List list, fbmw fbmwVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        fbmwVar.getClass();
        this.b = fbmwVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbqe)) {
            return false;
        }
        fbqe fbqeVar = (fbqe) obj;
        return ejwh.a(this.a, fbqeVar.a) && ejwh.a(this.b, fbqeVar.b) && ejwh.a(this.c, fbqeVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("addresses", this.a);
        ejwfVarB.b("attributes", this.b);
        ejwfVarB.b("loadBalancingPolicyConfig", this.c);
        return ejwfVarB.toString();
    }
}
