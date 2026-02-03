package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqx<T> extends fcuh<T> {
    public final int a;
    public final List b;
    private final int c;

    public oqx(int i, int i2, List list) {
        this.a = i;
        this.c = i2;
        this.b = list;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a + this.b.size() + this.c;
    }

    @Override // defpackage.fcuh, java.util.List
    public final T get(int i) {
        if (i >= 0 && i < this.a) {
            return null;
        }
        int i2 = this.a;
        List list = this.b;
        if (i < list.size() + i2 && i2 <= i) {
            return (T) list.get(i - i2);
        }
        int size = i2 + list.size();
        if (i < a() && size <= i) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + a());
    }
}
