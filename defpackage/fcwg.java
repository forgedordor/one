package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwg<E> extends fcuh<E> implements RandomAccess {
    public final List a;
    public int b;
    public int c;

    public fcwg(List list) {
        this.a = list;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fcuh, java.util.List
    public final E get(int i) {
        fcud.b(i, this.c);
        return (E) this.a.get(this.b + i);
    }
}
