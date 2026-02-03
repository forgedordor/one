package defpackage;

import android.util.Range;
import android.util.Rational;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdk {
    private static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        map2.put(1, cgq.a);
        map2.put(2, cgq.d);
        map2.put(4096, cgq.e);
        map2.put(8192, cgq.e);
        HashMap map3 = new HashMap();
        map3.put(1, cgq.a);
        map3.put(2, cgq.d);
        map3.put(4096, cgq.e);
        map3.put(8192, cgq.e);
        HashMap map4 = new HashMap();
        map4.put(1, cgq.a);
        map4.put(4, cgq.d);
        map4.put(4096, cgq.e);
        map4.put(16384, cgq.e);
        map4.put(2, cgq.a);
        map4.put(8, cgq.d);
        map4.put(8192, cgq.e);
        map4.put(32768, cgq.e);
        HashMap map5 = new HashMap();
        map5.put(256, cgq.d);
        map5.put(512, cgq.b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        char c;
        String strConcat;
        int iDoubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue() * new Rational(i8, i9).doubleValue());
        if (bbs.h("VideoConfigUtil")) {
            c = 1;
            strConcat = String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue));
        } else {
            c = 1;
            strConcat = "";
        }
        if (!cax.e.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (bbs.h("VideoConfigUtil")) {
                Object[] objArr = new Object[2];
                objArr[0] = range;
                objArr[c] = num;
                strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format("\nClamped to range %s -> %dbps", objArr)));
            }
            iDoubleValue = iIntValue;
        }
        bbs.a("VideoConfigUtil", strConcat);
        return iDoubleValue;
    }

    static cdg b(cax caxVar, Range range) {
        Range range2 = bdp.a;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int i = ((bwz) caxVar).b;
        if (i == 0) {
            i = iIntValue;
        }
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(i);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (true == zEquals) {
            obj = "<UNSPECIFIED>";
        }
        bbs.a("VideoConfigUtil", String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj));
        return new cdg(iIntValue, i);
    }

    public static cdn c(bxh bxhVar, azv azvVar, cbg cbgVar) {
        lcg.d(azvVar.b(), a.h(azvVar, "Dynamic range must be a fully specified dynamic range [provided dynamic range: ", "]"));
        String str = "video/avc";
        String str2 = bxhVar.a() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (cbgVar != null) {
            Set set = (Set) cgx.b.get(Integer.valueOf(azvVar.h));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) cgx.a.get(Integer.valueOf(azvVar.i));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (bki bkiVar : cbgVar.d()) {
                if (set.contains(Integer.valueOf(bkiVar.f())) && set2.contains(Integer.valueOf(bkiVar.a()))) {
                    String strJ = bkiVar.j();
                    if (Objects.equals(str2, strJ)) {
                        bbs.a("VideoConfigUtil", a.a(str2, "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: ", "]"));
                    } else if (bxhVar.a() == -1) {
                        bbs.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + azvVar + "]");
                    }
                    str2 = strJ;
                    break;
                }
            }
            bkiVar = null;
        } else {
            bkiVar = null;
        }
        if (bkiVar == null) {
            if (bxhVar.a() == -1) {
                int i = azvVar.h;
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException(a.h(azvVar, "Unsupported dynamic range: ", "\nNo supported default mime type available."));
                        }
                        str = "video/dolby-vision";
                    }
                }
            } else {
                str = str2;
            }
            if (cbgVar == null) {
                bbs.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str + ", dynamic range: " + azvVar + "]");
            } else {
                bbs.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str + ", dynamic range: " + azvVar + "]");
            }
            str2 = str;
        }
        Integer num = -1;
        bki bkiVar2 = bkiVar != null ? bkiVar : null;
        num.getClass();
        return new cdf(str2, bkiVar2);
    }

    public static cgq d(String str, int i) {
        cgq cgqVar;
        Map map = (Map) a.get(str);
        if (map != null && (cgqVar = (cgq) map.get(Integer.valueOf(i))) != null) {
            return cgqVar;
        }
        bbs.f("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return cgq.a;
    }
}
