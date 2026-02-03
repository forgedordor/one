package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejot implements ejoz {
    @Override // defpackage.ejoz
    public final List a(ezcy ezcyVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ejoy.d((ezgi) it.next(), Optional.empty(), 3));
        }
        ejoy.c(arrayList);
        return arrayList;
    }
}
