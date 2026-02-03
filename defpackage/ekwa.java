package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwa implements Iterator {
    final /* synthetic */ ekwb a;
    private int b = 0;

    public ekwa(ekwb ekwbVar) {
        this.a = ekwbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        ekwb ekwbVar = this.a;
        if (i >= ekwbVar.size()) {
            throw new NoSuchElementException();
        }
        ekwc ekwcVar = ekwbVar.b;
        Object obj = ekwcVar.b[ekwbVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
