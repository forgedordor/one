package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblo {
    private final dhip a;
    private final dfcg b;

    public eblo(dhip dhipVar, dfcg dfcgVar) {
        this.a = dhipVar;
        this.b = dfcgVar;
    }

    public final ebln a(ebqv ebqvVar, ebmp ebmpVar) {
        HashSet hashSet = new HashSet();
        Iterator it = ejxk.d(",").g((String) dfbx.b.a()).iterator();
        while (it.hasNext()) {
            hashSet.add((String) it.next());
        }
        return new eblt(ebqvVar, this.a, this.b, ebmpVar, ekhx.o(hashSet));
    }
}
