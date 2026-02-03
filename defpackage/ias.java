package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ias extends iat implements Iterator, fdcn {
    public ias(iaf iafVar, Iterator it) {
        super(iafVar, it);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        if (this.c != null) {
            return new iar(this);
        }
        throw new IllegalStateException();
    }
}
