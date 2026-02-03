package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhw implements dwhx {
    private static dwhw b;
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    private dwhw() {
    }

    public static synchronized dwhw a() {
        dwhw dwhwVar = b;
        if (dwhwVar != null) {
            return dwhwVar;
        }
        dwhw dwhwVar2 = new dwhw();
        b = dwhwVar2;
        return dwhwVar2;
    }

    @Override // defpackage.dwhx
    public final void b(String str, dwqw dwqwVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dwhx) it.next()).b(str, dwqwVar);
        }
    }

    @Override // defpackage.dwhx
    public final void c(String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dwhx) it.next()).c(str, str2);
        }
    }
}
