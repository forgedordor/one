package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhau {
    public final /* synthetic */ dhaw a;

    public dhau(dhaw dhawVar) {
        this.a = dhawVar;
    }

    public final void a(int i, String str) {
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((dhay) it.next()).a(i, str);
        }
    }
}
