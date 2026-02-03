package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsi implements rrm {
    final /* synthetic */ rsm a;

    public rsi(rsm rsmVar) {
        this.a = rsmVar;
    }

    @Override // defpackage.rrm
    public final void a(boolean z) {
        ArrayList arrayList;
        rvk.j();
        rsm rsmVar = this.a;
        synchronized (rsmVar) {
            arrayList = new ArrayList(rsmVar.a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rrm) arrayList.get(i)).a(z);
        }
    }
}
