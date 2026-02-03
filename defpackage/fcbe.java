package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbe {
    private ArrayList b = new ArrayList();
    public volatile fbnv a = fbnv.IDLE;

    final void a(fbnv fbnvVar) {
        fbnvVar.getClass();
        if (this.a == fbnvVar || this.a == fbnv.SHUTDOWN) {
            return;
        }
        this.a = fbnvVar;
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        this.b = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
