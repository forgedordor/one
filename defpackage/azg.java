package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azg {
    public static final azg a;
    public static final azg b;
    public final LinkedHashSet c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        azf.a(0, linkedHashSet);
        a = new azg(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        azf.a(1, linkedHashSet2);
        b = new azg(linkedHashSet2);
    }

    public azg(LinkedHashSet linkedHashSet) {
        this.c = linkedHashSet;
    }

    public final biu a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((biu) it.next()).c());
        }
        List listC = c(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            biu biuVar = (biu) it2.next();
            if (listC.contains(biuVar.c())) {
                linkedHashSet2.add(biuVar);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (biu) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            bir birVarF = ((biu) it4.next()).f();
            sb.append(String.format(" Id:%s  Lens:%s", birVarF.l(), Integer.valueOf(birVarF.a())));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.c;
        sb2.append(String.format("PhyId:%s  Filters:%s", null, Integer.valueOf(linkedHashSet3.size())));
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            azc azcVar = (azc) it5.next();
            sb2.append(" Id:");
            sb2.append(azcVar.a());
            if (azcVar instanceof bky) {
                sb2.append(" LensFilter:");
                sb2.append(((bky) azcVar).b);
            }
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", string, sb2.toString()));
    }

    public final Integer b() {
        Iterator it = this.c.iterator();
        Integer num = null;
        while (it.hasNext()) {
            azc azcVar = (azc) it.next();
            if (azcVar instanceof bky) {
                Integer numValueOf = Integer.valueOf(((bky) azcVar).b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final List c(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList = ((azc) it.next()).b(DesugarCollections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }
}
