package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwz extends fcxb implements Iterator, fdcn {
    public fcwz(fcxe fcxeVar) {
        super(fcxeVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        fcxe fcxeVar = this.a;
        int i = this.b;
        if (i >= fcxeVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        fcxa fcxaVar = new fcxa(fcxeVar, i);
        b();
        return fcxaVar;
    }
}
