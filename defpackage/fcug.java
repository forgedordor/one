package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcug<E> extends fcuh<E> implements RandomAccess {
    private final fcuh a;
    private final int b;
    private final int c;

    public fcug(fcuh fcuhVar, int i, int i2) {
        this.a = fcuhVar;
        this.b = i;
        fcud.d(i, i2, fcuhVar.a());
        this.c = i2 - i;
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
