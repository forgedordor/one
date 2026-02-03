package defpackage;

import android.util.Rational;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvf implements Comparator {
    private final Rational a;

    public bvf(Rational rational) {
        this.a = rational;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Rational rational = this.a;
        return Float.compare(bvg.a((Rational) obj2, rational), bvg.a((Rational) obj, rational));
    }
}
