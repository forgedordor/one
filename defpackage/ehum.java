package defpackage;

import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehum {
    public final Random a;

    public ehum(Random random) {
        this.a = random;
    }

    public static ekhx a(Set set, cvw cvwVar, ehul ehulVar) {
        if (!cvwVar.containsKey(ehulVar)) {
            return ekon.a;
        }
        ekhv ekhvVar = new ekhv();
        for (ehul ehulVar2 : (Set) cvwVar.get(ehulVar)) {
            if (set.contains(ehulVar2)) {
                ekhvVar.c(ehulVar2);
            } else {
                ekhvVar.j(a(set, cvwVar, ehulVar2));
            }
        }
        return ekhvVar.g();
    }

    public static void b(cvw cvwVar, ehul ehulVar, ehul ehulVar2) {
        Set setNewSetFromMap = (Set) cvwVar.get(ehulVar);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new csq());
            cvwVar.put(ehulVar, setNewSetFromMap);
        }
        setNewSetFromMap.add(ehulVar2);
    }
}
