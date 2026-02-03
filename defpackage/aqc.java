package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqc {
    static void a(bhr bhrVar, List list) {
        if (bhrVar instanceof bhs) {
            Iterator it = ((bhs) bhrVar).a.iterator();
            while (it.hasNext()) {
                a((bhr) it.next(), list);
            }
        } else if (bhrVar instanceof aqb) {
            list.add(((aqb) bhrVar).a);
        } else {
            list.add(new aqa(bhrVar));
        }
    }
}
