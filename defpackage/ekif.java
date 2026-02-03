package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekif extends ekgi {
    private transient Object[] d;
    private transient Object[] e;
    private final Comparator f;

    public ekif(Comparator comparator) {
        comparator.getClass();
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // defpackage.ekgi
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekih c() {
        int i = this.b;
        if (i == 0) {
            return ekih.w(this.f);
        }
        if (i == 1) {
            Comparator comparator = this.f;
            Object obj = this.d[0];
            obj.getClass();
            Object obj2 = this.e[0];
            obj2.getClass();
            return ekih.z(comparator, obj, obj2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.d, i);
        Comparator comparator2 = this.f;
        Arrays.sort(objArrCopyOf, comparator2);
        Object[] objArr = new Object[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (comparator2.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + String.valueOf(objArrCopyOf[i3]) + " and " + String.valueOf(objArrCopyOf[i2]));
                }
            }
            Object obj3 = this.d[i2];
            obj3.getClass();
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator2);
            Object obj4 = this.e[i2];
            obj4.getClass();
            objArr[iBinarySearch] = obj4;
        }
        return new ekih(new ekoo(ekgb.h(objArrCopyOf), comparator2), ekgb.h(objArr));
    }

    @Override // defpackage.ekgi
    @Deprecated
    public final /* bridge */ /* synthetic */ ekgp b() {
        throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
    }

    @Override // defpackage.ekgi
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void i(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.d.length;
        if (i > length) {
            int iF = ekfm.f(length, i);
            this.d = Arrays.copyOf(this.d, iF);
            this.e = Arrays.copyOf(this.e, iF);
        }
        ekcw.a(obj, obj2);
        Object[] objArr = this.d;
        int i2 = this.b;
        objArr[i2] = obj;
        this.e[i2] = obj2;
        this.b = i2 + 1;
    }

    @Override // defpackage.ekgi
    public final /* synthetic */ void g(Map map) {
        super.g(map);
    }
}
