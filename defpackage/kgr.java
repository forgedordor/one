package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgr {
    public static final float a(long j, float f, kio kioVar) {
        float fA;
        long jC = kjl.c(j);
        if (kjn.b(jC, 4294967296L)) {
            if (kioVar.ee() <= 1.05d) {
                return kioVar.em(j);
            }
            fA = kjl.a(j) / kjl.a(kioVar.et(f));
        } else {
            if (!kjn.b(jC, 8589934592L)) {
                return Float.NaN;
            }
            fA = kjl.a(j);
        }
        return fA * f;
    }

    public static final jxx b(jxx jxxVar, jxx jxxVar2) {
        return jxxVar == null ? jxxVar2 : jxxVar.d(jxxVar2);
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new BackgroundColorSpan(ijg.b(j)), i, i2);
        }
    }

    public static final void d(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new ForegroundColorSpan(ijg.b(j)), i, i2);
        }
    }

    public static final void e(Spannable spannable, long j, kio kioVar, int i, int i2) {
        long jC = kjl.c(j);
        if (kjn.b(jC, 4294967296L)) {
            g(spannable, new AbsoluteSizeSpan(fdcu.b(kioVar.em(j)), false), i, i2);
        } else if (kjn.b(jC, 8589934592L)) {
            g(spannable, new RelativeSizeSpan(kjl.a(j)), i, i2);
        }
    }

    public static final void f(Spannable spannable, kfu kfuVar, int i, int i2) {
        if (kfuVar != null) {
            ArrayList arrayList = new ArrayList(fcva.p(kfuVar, 10));
            Iterator<E> it = kfuVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((kfs) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            g(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2);
        }
    }

    public static final void g(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final float h(float f, kio kioVar) {
        if (kjl.e(0L, kjl.a)) {
            return f;
        }
        long jC = kjl.c(0L);
        if (kjn.b(jC, 4294967296L)) {
            return kioVar.em(0L);
        }
        if (kjn.b(jC, 8589934592L)) {
            return kjl.a(0L) * f;
        }
        return Float.NaN;
    }
}
