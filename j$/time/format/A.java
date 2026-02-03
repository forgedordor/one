package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public class A {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final y b = new y();
    public static final A c = new A();

    public static Object a(TemporalField temporalField, Locale locale) {
        Object zVar;
        long j;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j2 = i;
                    map2.put(Long.valueOf(j2), eras[i]);
                    Long lValueOf = Long.valueOf(j2);
                    String str = eras[i];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            zVar = new z(map);
        } else {
            long j3 = 1;
            if (temporalField == ChronoField.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j4 = 1; j4 <= length; j4++) {
                    String strY = j$.desugar.sun.nio.fs.g.y(j4, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j4), strY);
                    linkedHashMap2.put(Long.valueOf(j4), strY.substring(0, Character.charCount(strY.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j4), j$.desugar.sun.nio.fs.g.y(j4, "LLL", locale));
                }
                if (length > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                    map.put(TextStyle.FULL, linkedHashMap);
                    map.put(TextStyle.NARROW, linkedHashMap2);
                    map.put(TextStyle.SHORT, linkedHashMap3);
                }
                zVar = new z(map);
            } else if (temporalField == ChronoField.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j5 = 1;
                while (j5 <= length2) {
                    String strX = j$.desugar.sun.nio.fs.g.x(j5, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j5), strX);
                    Long lValueOf2 = Long.valueOf(j5);
                    if (z) {
                        j = j3;
                        strSubstring = new StringBuilder().appendCodePoint(strX.codePointBefore(strX.length())).toString();
                    } else {
                        j = j3;
                        strSubstring = strX.substring(0, Character.charCount(strX.codePointAt(0)));
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(Long.valueOf(j5), j$.desugar.sun.nio.fs.g.x(j5, "ccc", locale));
                    j5 += j;
                    j3 = j;
                }
                if (length2 > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                    map.put(TextStyle.FULL, linkedHashMap4);
                    map.put(TextStyle.NARROW, linkedHashMap5);
                    map.put(TextStyle.SHORT, linkedHashMap6);
                }
                zVar = new z(map);
            } else if (temporalField == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j6 = i2;
                        map4.put(Long.valueOf(j6), amPmStrings[i2]);
                        Long lValueOf3 = Long.valueOf(j6);
                        String str2 = amPmStrings[i2];
                        map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(TextStyle.FULL, map4);
                    map.put(TextStyle.SHORT, map4);
                    map.put(TextStyle.NARROW, map5);
                }
                zVar = new z(map);
            } else {
                zVar = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, zVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public String b(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.q.d || !(temporalField instanceof ChronoField)) {
            return c(temporalField, j, textStyle, locale);
        }
        return null;
    }

    public String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object objA = a(temporalField, locale);
        if (objA instanceof z) {
            return ((z) objA).a(j, textStyle);
        }
        return null;
    }

    public Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.q.d || !(temporalField instanceof ChronoField)) {
            return e(temporalField, textStyle, locale);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(temporalField, locale);
        if (!(objA instanceof z) || (list = (List) ((z) objA).b.get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }
}
