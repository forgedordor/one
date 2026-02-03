package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdj implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ ekdk d;

    public ekdj(ekdk ekdkVar) {
        this.d = ekdkVar;
        this.a = ekdkVar.b;
        this.b = ekdkVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        ekdk ekdkVar = this.d;
        Object objC = ekdkVar.c(i);
        this.b = ekdkVar.b(this.b);
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ekcw.b(this.c >= 0);
        this.a += 32;
        int i = this.c;
        ekdk ekdkVar = this.d;
        ekdkVar.remove(ekdkVar.c(i));
        this.b--;
        this.c = -1;
    }
}
