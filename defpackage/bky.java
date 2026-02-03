package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bky implements azc {
    public final int b;

    public bky(int i) {
        this.b = i;
    }

    @Override // defpackage.azc
    public final /* synthetic */ bkn a() {
        return azc.a;
    }

    @Override // defpackage.azc
    public final List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            azd azdVar = (azd) it.next();
            lcg.b(azdVar instanceof bir, "The camera info doesn't contain internal implementation.");
            if (azdVar.a() == this.b) {
                arrayList.add(azdVar);
            }
        }
        return arrayList;
    }
}
