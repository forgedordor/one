package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpx {
    public final List a;
    public final fbmw b;
    public final Object[][] c;

    public fbpx(List list, fbmw fbmwVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        fbmwVar.getClass();
        this.b = fbmwVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("addrs", this.a);
        ejwfVarB.b("attrs", this.b);
        ejwfVarB.b("customOptions", Arrays.deepToString(this.c));
        return ejwfVarB.toString();
    }
}
