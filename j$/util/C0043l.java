package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0043l implements Iterator, InterfaceC0185z {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C0043l(C0044m c0044m) {
        this.b = c0044m.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0185z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                Iterator$EL.forEachRemaining(this.b, consumer);
                break;
            default:
                Iterator$EL.forEachRemaining(this.b, new j$.nio.file.t(consumer, 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0047p((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0043l(r rVar) {
        this.b = rVar.a.iterator();
    }
}
