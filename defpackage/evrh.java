package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evrh extends evqc implements RandomAccess, evss, evup {
    public static final double[] a;
    public static final evrh b;
    public double[] c;
    public int d;

    static {
        double[] dArr = new double[0];
        a = dArr;
        b = new evrh(dArr, 0, false);
    }

    evrh() {
        this(a, 0, true);
    }

    public static int f(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String i(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        hu();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i3 = i + 1;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[f(length)];
            System.arraycopy(this.c, 0, dArr2, 0, i);
            System.arraycopy(this.c, i, dArr2, i3, this.d - i);
            this.c = dArr2;
        }
        this.c[i] = dDoubleValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.evqc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        hu();
        evth.d(collection);
        if (!(collection instanceof evrh)) {
            return super.addAll(collection);
        }
        evrh evrhVar = (evrh) collection;
        int i = evrhVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.c;
        if (i3 > dArr.length) {
            this.c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(evrhVar.c, 0, this.c, this.d, evrhVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.evss
    public final double d(int i) {
        j(i);
        return this.c[i];
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evrh)) {
            return super.equals(obj);
        }
        evrh evrhVar = (evrh) obj;
        if (this.d != evrhVar.d) {
            return false;
        }
        double[] dArr = evrhVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.evtg
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final evss e(int i) {
        if (i >= this.d) {
            return new evrh(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(d(i));
    }

    public final void h(double d) {
        hu();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            double[] dArr = new double[f(length)];
            System.arraycopy(this.c, 0, dArr, 0, this.d);
            this.c = dArr;
        }
        double[] dArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr2[i2] = d;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.d; i++) {
            iB = (iB * 31) + evth.b(Double.doubleToLongBits(this.c[i]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        hu();
        j(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        hu();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.c;
        System.arraycopy(dArr, i2, dArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        hu();
        j(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public evrh(double[] dArr, int i, boolean z) {
        super(z);
        this.c = dArr;
        this.d = i;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
