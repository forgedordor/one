package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdfl implements fdev {
    final /* synthetic */ fdev a;
    final /* synthetic */ Comparator b;

    public fdfl(fdev fdevVar, Comparator comparator) {
        this.a = fdevVar;
        this.b = comparator;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        ArrayList arrayList = new ArrayList();
        fdep fdepVar = new fdep((fdeq) this.a);
        while (fdepVar.hasNext()) {
            arrayList.add(fdepVar.next());
        }
        fcva.s(arrayList, this.b);
        return arrayList.iterator();
    }
}
