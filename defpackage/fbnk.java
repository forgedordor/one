package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnk {
    public static fbnd a(fbnd fbndVar, List list) {
        fbndVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbndVar = new fbnj(fbndVar, (fbni) it.next());
        }
        return fbndVar;
    }

    public static fbnd b(fbnd fbndVar, fbni... fbniVarArr) {
        return a(fbndVar, Arrays.asList(fbniVarArr));
    }

    public static fbnd c(fbnd fbndVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return a(fbndVar, arrayList);
    }

    public static fbnd d(fbnd fbndVar, fbni... fbniVarArr) {
        return c(fbndVar, Arrays.asList(fbniVarArr));
    }
}
