package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class our<T> extends AbstractList<T> implements owg<T> {
    public final List a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public our() {
        this.a = new ArrayList();
        this.e = true;
    }

    @Override // defpackage.owg
    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.b + this.g;
    }

    @Override // defpackage.owg
    public final int d() {
        return this.c;
    }

    @Override // defpackage.owg
    public final int e() {
        return this.b;
    }

    @Override // defpackage.owg
    public final int f() {
        return this.b + this.f + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        int i2 = i - this.b;
        if (i >= 0 && i < f()) {
            if (i2 < 0 || i2 >= this.f) {
                return null;
            }
            return (T) i(i2);
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + f());
    }

    @Override // defpackage.owg
    public final Object i(int i) {
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((owb) list.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((owb) list.get(i2)).b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "leading " + this.b + ", dataCount " + this.f + ", trailing " + this.c + ' ' + fcva.aF(this.a, " ", null, null, null, 62);
    }

    public our(our ourVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = true;
        arrayList.addAll(ourVar.a);
        this.b = ourVar.b;
        this.c = ourVar.c;
        this.d = ourVar.d;
        this.e = ourVar.e;
        this.f = ourVar.f;
        this.g = ourVar.g;
    }
}
