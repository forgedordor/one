package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fczt implements Iterator, fdcn {
    final /* synthetic */ fczu a;
    private String b;
    private boolean c;

    public fczt(fczu fczuVar) {
        this.a = fczuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.b;
        if (line == null && !this.c) {
            line = this.a.a.readLine();
            this.b = line;
            if (line == null) {
                this.c = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.b;
        this.b = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
