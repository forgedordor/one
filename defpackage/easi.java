package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class easi implements Parcelable, Comparable {
    public static easi e(int i, int i2, int i3) {
        eaqo eaqoVar = new eaqo(i, i2, i3);
        int i4 = eaqoVar.b;
        eknz eknzVarC = eknz.c(1, 12);
        Integer numValueOf = Integer.valueOf(i4);
        ejwl.d(eknzVarC.a(numValueOf), "Month must not be out of range of 1 to 12, but was: %s.", i4);
        int i5 = eaqoVar.c;
        eknz eknzVarC2 = eknz.c(1, 31);
        Integer numValueOf2 = Integer.valueOf(i5);
        ejwl.d(eknzVarC2.a(numValueOf2), "Day must not be out of range of 1 to 31, but was: %s.", i5);
        if (Arrays.asList(4, 6, 9, 11).contains(numValueOf)) {
            ejwl.g(eknz.c(1, 30).a(numValueOf2), "%s is not a valid day for month %s.", i5, i4);
        }
        if (i4 == 2) {
            int i6 = eaqoVar.a;
            ejwl.j(eknz.c(1, Integer.valueOf(i6 % 4 == 0 ? 29 : 28)).a(numValueOf2), "%s is not a valid day for month %s in year %s.", numValueOf2, 2, Integer.valueOf(i6));
        }
        return eaqoVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(easi easiVar) {
        int iA;
        int iA2;
        easiVar.getClass();
        if (this == easiVar) {
            return 0;
        }
        if (c() != easiVar.c()) {
            iA = c();
            iA2 = easiVar.c();
        } else if (b() != easiVar.b()) {
            iA = b();
            iA2 = easiVar.b();
        } else {
            iA = a();
            iA2 = easiVar.a();
        }
        return iA - iA2;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(c()), String.format(Locale.getDefault(), "%02d", Integer.valueOf(b())), String.format(Locale.getDefault(), "%02d", Integer.valueOf(a())));
    }
}
