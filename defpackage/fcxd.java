package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcxd extends fcxb implements Iterator, fdcn {
    public fcxd(fcxe fcxeVar) {
        super(fcxeVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        fcxe fcxeVar = this.a;
        int i = this.b;
        if (i >= fcxeVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        Object[] objArr = fcxeVar.c;
        objArr.getClass();
        Object obj = objArr[i];
        b();
        return obj;
    }
}
