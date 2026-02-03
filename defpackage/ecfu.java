package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfu {
    public final String a;
    public final List b = new ArrayList();

    public ecfu(String str, List list) {
        this.a = str;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ecfw ecfwVar = (ecfw) it.next();
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    this.b.add(ecfwVar);
                    break;
                } else {
                    if (((ecfw) this.b.get(i)).a.equals(ecfwVar.a)) {
                        this.b.set(i, ecfwVar);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
