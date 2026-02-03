package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsz {
    private final List a = new ArrayList();

    public final synchronized rfa a(Class cls) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rsy rsyVar = (rsy) list.get(i);
            if (rsyVar.a.isAssignableFrom(cls)) {
                return rsyVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, rfa rfaVar) {
        this.a.add(new rsy(cls, rfaVar));
    }
}
