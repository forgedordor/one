package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cid implements bpu {
    final /* synthetic */ List a;
    final /* synthetic */ azd b;
    final /* synthetic */ cif c;

    public cid(cif cifVar, List list, azd azdVar) {
        this.c = cifVar;
        this.a = list;
        this.b = azdVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [azd, bir] */
    @Override // defpackage.bpu
    public final void a(Throwable th) {
        this.c.b = null;
        List list = this.a;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.u((bhr) it.next());
        }
        list.clear();
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.b = null;
    }
}
