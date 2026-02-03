package defpackage;

import j$.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hur<E> extends fcuh<E> implements List<E>, hus {
    private final hus a;
    private final int b;
    private final int c;
    private final int d;

    public hur(hus husVar, int i, int i2) {
        this.a = husVar;
        this.b = i;
        this.c = i2;
        hws.c(i, i2, husVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fcuh, java.util.List
    public final E get(int i) {
        hws.a(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        hws.c(i, i2, this.d);
        int i3 = this.b;
        return new hur(this.a, i + i3, i3 + i2);
    }
}
