package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgj implements Serializable {
    private static final long serialVersionUID = 1;
    public final List a = new LinkedList();
    public final List b = new ArrayList();

    public final void a(String str) {
        this.a.add(str);
    }

    public final boolean b(String str) {
        ffgp ffgpVar;
        String strA = ffgv.a(str);
        List list = this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                ffgpVar = null;
                break;
            }
            ffgpVar = (ffgp) it.next();
            if (strA.equals(ffgpVar.a) || strA.equals(ffgpVar.b)) {
                break;
            }
        }
        return list.contains(ffgpVar);
    }
}
