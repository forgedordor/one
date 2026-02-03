package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffye implements Iterator {
    final /* synthetic */ ffyf a;
    private final int b;
    private int c;
    private boolean d;

    public ffye(ffyf ffyfVar) {
        this.a = ffyfVar;
        ffyfVar.b++;
        this.b = ffyfVar.a.size();
    }

    private final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ffyf ffyfVar = this.a;
        int i = ffyfVar.b - 1;
        ffyfVar.b = i;
        if (i > 0 || !ffyfVar.c) {
            return;
        }
        ffyfVar.c = false;
        List list = ffyfVar.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (list.get(size) == null) {
                list.remove(size);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.c;
        while (true) {
            i = this.b;
            if (i2 >= i || this.a.a(i2) != null) {
                break;
            }
            i2++;
        }
        if (i2 < i) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ffyf ffyfVar;
        int i;
        while (true) {
            ffyfVar = this.a;
            int i2 = this.c;
            i = this.b;
            if (i2 >= i || ffyfVar.a(i2) != null) {
                break;
            }
            this.c++;
        }
        int i3 = this.c;
        if (i3 < i) {
            this.c = i3 + 1;
            return ffyfVar.a(i3);
        }
        a();
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
