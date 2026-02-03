package defpackage;

import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccw {
    static int a(int i, int i2, int i3, int i4, int i5, Range range) {
        int iDoubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        String strConcat = bbs.h("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(iDoubleValue)) : "";
        if (!bwi.a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (bbs.h("AudioConfigUtil")) {
                strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format("\nClamped to range %s -> %dbps", range, num)));
            }
        }
        bbs.a("AudioConfigUtil", strConcat);
        return iDoubleValue;
    }

    static int b(Range range, int i, int i2, final int i3) {
        int i4 = 0;
        ArrayList arrayList = null;
        int iIntValue = i3;
        while (true) {
            if (!range.contains((Range) Integer.valueOf(iIntValue))) {
                bbs.a("AudioConfigUtil", a.y(range, iIntValue, "Sample rate ", "Hz is not in target range "));
            } else {
                if (ccf.h(iIntValue, i, i2)) {
                    return iIntValue;
                }
                bbs.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i + " and source format " + i2);
            }
            if (arrayList == null) {
                bbs.a("AudioConfigUtil", a.e(i3, "Trying common sample rates in proximity order to target ", "Hz"));
                arrayList = new ArrayList(cbi.a);
                Collections.sort(arrayList, new Comparator() { // from class: ccv
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i5 = i3;
                        int iAbs = Math.abs(iIntValue2 - i5) - Math.abs(((Integer) obj2).intValue() - i5);
                        return (int) (iAbs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(iAbs));
                    }
                });
            }
            if (i4 >= arrayList.size()) {
                bbs.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    static cdg c(Range range, int i, int i2, int i3, Rational rational) {
        int iB;
        int iB2;
        if (rational == null) {
            iB = b(range, i2, i3, i);
        } else {
            Range rangeCreate = bwi.b;
            if (!range.equals(rangeCreate)) {
                rangeCreate = Range.create(Integer.valueOf(cdh.a(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(cdh.a(((Integer) range.getUpper()).intValue(), rational)));
            }
            iB = b(rangeCreate, i2, i3, cdh.a(i, rational));
            if (!cdh.b(rational)) {
                iB2 = fdcu.b(iB / rational.floatValue());
                bbs.a("AudioConfigUtil", String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(iB), Integer.valueOf(iB2), range, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), rational));
                return new cdg(iB, iB2);
            }
            Objects.toString(rational);
            bbs.f("CaptureEncodeRates", "Invalid capture-to-encode ratio: ".concat(rational.toString()));
        }
        iB2 = iB;
        bbs.a("AudioConfigUtil", String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(iB), Integer.valueOf(iB2), range, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), rational));
        return new cdg(iB, iB2);
    }

    static void d(bwi bwiVar) {
        int i = ((bwl) bwiVar).d;
        bbs.a("AudioConfigUtil", "Using default AUDIO source format: 2");
    }

    static void e(bwi bwiVar) {
        int i = ((bwl) bwiVar).e;
        bbs.a("AudioConfigUtil", "Using default AUDIO source: 5");
    }
}
