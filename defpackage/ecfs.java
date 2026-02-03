package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfs {
    public final String a;
    public final List b = new ArrayList();

    public ecfs(String str, List list) {
        this.a = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ecfu ecfuVar = (ecfu) it.next();
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    this.b.add(ecfuVar);
                    break;
                } else {
                    if (((ecfu) this.b.get(i)).a.equals(ecfuVar.a)) {
                        this.b.set(i, ecfuVar);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
