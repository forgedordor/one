package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekua {
    public static final eksy a;
    private static final Set b;

    static {
        Set setSingleton = Collections.singleton(ekrl.a);
        b = setSingleton;
        a = new ektz(setSingleton);
    }

    public static eksy a(ekrz... ekrzVarArr) {
        HashSet hashSet = new HashSet(b);
        Collections.addAll(hashSet, ekrzVarArr);
        return new ektz(hashSet);
    }

    public static String b(eksx eksxVar) {
        return ektc.b(eksxVar.k());
    }

    public static boolean c(eksx eksxVar, ektv ektvVar, Set set) {
        return (eksxVar.j() == null && ektvVar.a() <= set.size() && set.containsAll(ektvVar.c())) ? false : true;
    }

    public static void d(ektv ektvVar, ektl ektlVar, StringBuilder sb) {
        eksw ekswVar = new eksw(sb);
        ektvVar.d(ektlVar, ekswVar);
        if (ekswVar.c) {
            ekswVar.b.append(ekswVar.a);
        }
    }
}
