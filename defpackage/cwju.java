package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwju extends cqdj {
    final /* synthetic */ cwjw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwju(cwjw cwjwVar) {
        super("Bugle.Async.RecentItemBuffer.ReadFromShared.Duration");
        this.a = cwjwVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        cwjw cwjwVar = this.a;
        String strF = cwjwVar.c.f(cwjwVar.d, null);
        CopyOnWriteArrayList copyOnWriteArrayList = cwjwVar.a;
        copyOnWriteArrayList.clear();
        if (strF != null) {
            Iterator it = ejxk.b(',').g(strF).iterator();
            while (it.hasNext()) {
                copyOnWriteArrayList.add((String) it.next());
            }
        }
        return null;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((cwjv) it.next()).a();
        }
    }
}
