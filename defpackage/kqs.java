package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kqs implements Iterator {
    final kqt a;
    int b = 0;

    public kqs(kqt kqtVar) {
        this.a = kqtVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.d();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        kqq kqqVar = (kqq) this.a.a.get(this.b);
        this.b++;
        return kqqVar;
    }
}
