package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class easj implements Parcelable, Comparable {
    public static easj c(int i, int i2) {
        try {
            eaqq eaqqVar = new eaqq(i, i2);
            int i3 = eaqqVar.a;
            ejwl.n(eknz.c(0, 23).a(Integer.valueOf(i3)), "Hours must not be out-of-range: 0 to 23, but was: %s.", i3);
            int i4 = eaqqVar.b;
            ejwl.n(eknz.c(0, 59).a(Integer.valueOf(i4)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", i4);
            return eaqqVar;
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int a();

    public abstract int b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iA;
        int iA2;
        easj easjVar = (easj) obj;
        easjVar.getClass();
        if (this == easjVar) {
            return 0;
        }
        if (a() == easjVar.a()) {
            iA = b();
            iA2 = easjVar.b();
        } else {
            iA = a();
            iA2 = easjVar.a();
        }
        return iA - iA2;
    }
}
