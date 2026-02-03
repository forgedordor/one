package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evsa extends evqc implements RandomAccess, evsw, evup {
    public static final float[] a;
    public static final evsa b;
    public float[] c;
    public int d;

    static {
        float[] fArr = new float[0];
        a = fArr;
        b = new evsa(fArr, 0, false);
    }

    evsa() {
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
        float fFloatValue = ((Float) obj).floatValue();
        hu();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i3 = i + 1;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[f(length)];
            System.arraycopy(this.c, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i3, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = fFloatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.evqc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        hu();
        evth.d(collection);
        if (!(collection instanceof evsa)) {
            return super.addAll(collection);
        }
        evsa evsaVar = (evsa) collection;
        int i = evsaVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.c;
        if (i3 > fArr.length) {
            this.c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(evsaVar.c, 0, this.c, this.d, evsaVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.evsw
    public final float d(int i) {
        j(i);
        return this.c[i];
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evsa)) {
            return super.equals(obj);
        }
        evsa evsaVar = (evsa) obj;
        if (this.d != evsaVar.d) {
            return false;
        }
        float[] fArr = evsaVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.evtg
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final evsw e(int i) {
        if (i >= this.d) {
            return new evsa(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    public final void h(float f) {
        hu();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            float[] fArr = new float[f(length)];
            System.arraycopy(this.c, 0, fArr, 0, this.d);
            this.c = fArr;
        }
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        hu();
        j(i);
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        hu();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c;
        System.arraycopy(fArr, i2, fArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        hu();
        j(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public evsa(float[] fArr, int i, boolean z) {
        super(z);
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
