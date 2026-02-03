package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbsy {
    public final String a;
    public final Collection b;

    public fbsy(fbsx fbsxVar) {
        String str = fbsxVar.a;
        this.a = str;
        List<fbrk> list = fbsxVar.b;
        HashSet hashSet = new HashSet(list.size());
        for (fbrk fbrkVar : list) {
            fbrkVar.getClass();
            String str2 = fbrkVar.c;
            ejwl.i(str.equals(str2), "service names %s != %s", str2, str);
            ejwl.f(hashSet.add(fbrkVar.b), "duplicate name %s", fbrkVar.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList(fbsxVar.b));
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("name", this.a);
        ejwfVarB.b("schemaDescriptor", null);
        ejwfVarB.b("methods", this.b);
        ejwfVarB.c();
        return ejwfVarB.toString();
    }
}
