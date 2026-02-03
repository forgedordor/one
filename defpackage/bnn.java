package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnn implements Comparator {
    private final Rational a;
    private final RectF b;
    private final Rational c;

    public bnn(Rational rational, Rational rational2) {
        this.a = rational;
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = a(rational);
    }

    private final RectF a(Rational rational) {
        Rational rational2 = this.c;
        if (rational.floatValue() == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
        }
        return new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    private static final float b(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    private static final float c(RectF rectF, RectF rectF2) {
        float fWidth = rectF.width() < rectF2.width() ? rectF.width() : rectF2.width();
        if (rectF.height() >= rectF2.height()) {
            rectF = rectF2;
        }
        return fWidth * rectF.height();
    }

    private static final boolean d(RectF rectF, RectF rectF2) {
        return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF rectFA = a(rational);
        RectF rectFA2 = a(rational2);
        RectF rectF = this.b;
        boolean zD = d(rectFA, rectF);
        boolean zD2 = d(rectFA2, rectF);
        if (zD && zD2) {
            return (int) Math.signum(b(rectFA) - b(rectFA2));
        }
        if (zD) {
            return -1;
        }
        if (zD2) {
            return 1;
        }
        return -((int) Math.signum(c(rectFA, rectF) - c(rectFA2, rectF)));
    }
}
