package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eknw implements Comparator {
    protected eknw() {
    }

    public static eknw d(Comparator comparator) {
        return comparator instanceof eknw ? (eknw) comparator : new ekdn(comparator);
    }

    public eknw a() {
        return new eknp(this);
    }

    public eknw b() {
        return new eknq(this);
    }

    public eknw c() {
        return new ekoq(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final List e(Iterable iterable) {
        Object[] objArrR = ekis.r(iterable);
        Arrays.sort(objArrR, this);
        return ekjz.a(Arrays.asList(objArrR));
    }
}
