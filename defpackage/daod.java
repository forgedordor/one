package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daod {
    public int a = -1;
    final /* synthetic */ daoe b;
    private final String c;

    public daod(daoe daoeVar, String str) {
        this.b = daoeVar;
        this.c = str;
    }

    final void a(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        daoe daoeVar = this.b;
        daoeVar.e.j(this.c, i);
        Iterator it = daoeVar.d.iterator();
        while (it.hasNext()) {
            ((dany) it.next()).a();
        }
    }
}
