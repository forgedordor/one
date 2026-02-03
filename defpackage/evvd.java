package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evvd implements Iterator {
    final /* synthetic */ evvf a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public evvd(evvf evvfVar) {
        this.a = evvfVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        evvf evvfVar = this.a;
        if (i >= evvfVar.b) {
            return !evvfVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        evvf evvfVar = this.a;
        return i < evvfVar.b ? (evvc) evvfVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        evvf evvfVar = this.a;
        evvfVar.e();
        int i = this.b;
        if (i >= evvfVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            evvfVar.c(i);
        }
    }
}
