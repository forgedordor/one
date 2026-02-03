package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcaa {
    public static final dcaa a;
    public static final dcaa b;
    public static final dcaa c;
    public final ekhx d;

    static {
        ekhx ekhxVarA;
        EnumSet enumSetAllOf = EnumSet.allOf(dcab.class);
        if (enumSetAllOf instanceof Collection) {
            ekhxVarA = enumSetAllOf.isEmpty() ? ekon.a : ekfs.a(EnumSet.copyOf((Collection) enumSetAllOf));
        } else {
            Iterator it = enumSetAllOf.iterator();
            if (it.hasNext()) {
                EnumSet enumSetOf = EnumSet.of((Enum) it.next());
                ekjc.l(enumSetOf, it);
                ekhxVarA = ekfs.a(enumSetOf);
            } else {
                ekhxVarA = ekon.a;
            }
        }
        a = new dcaa(ekhxVarA);
        b = new dcaa(ekon.a);
        c = new dcaa(ekfs.a(EnumSet.of(dcab.ZWIEBACK, new dcab[0])));
    }

    public dcaa(ekhx ekhxVar) {
        this.d = ekhxVar;
    }

    public final boolean a(dcab dcabVar) {
        return this.d.contains(dcabVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcaa) && this.d.equals(((dcaa) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
