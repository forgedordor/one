package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvc {
    final /* synthetic */ dcvk a;

    public dcvc(dcvk dcvkVar) {
        this.a = dcvkVar;
    }

    public final void a(dcvl dcvlVar) {
        dcvk dcvkVar = this.a;
        dcvkVar.a = dcvlVar;
        Iterator it = dcvkVar.c.iterator();
        while (it.hasNext()) {
            ((dcvj) it.next()).b();
        }
        dcvkVar.c.clear();
        dcvkVar.b = null;
    }
}
