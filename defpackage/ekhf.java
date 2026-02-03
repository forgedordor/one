package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhf extends ekqg {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public ekhf(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iA = this.a;
        if (iA <= 0) {
            eknh eknhVar = (eknh) this.c.next();
            this.b = eknhVar.b();
            iA = eknhVar.a();
        }
        this.a = iA - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
