package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvg extends huy {
    private final Object[] c;
    private final hvk d;

    public hvg(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int iB = hvl.b(i2);
        this.d = new hvk(objArr, fddu.g(i, iB), iB, i3);
    }

    @Override // defpackage.huy, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        hvk hvkVar = this.d;
        if (hvkVar.hasNext()) {
            this.a++;
            return hvkVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i - hvkVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        hvk hvkVar = this.d;
        int i3 = hvkVar.b;
        if (i <= i3) {
            this.a = i2;
            return hvkVar.previous();
        }
        Object[] objArr = this.c;
        this.a = i2;
        return objArr[i2 - i3];
    }
}
