package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxc {
    public static final evvp a;
    public static final evvp b;
    public static final evvp c;
    private static final ThreadLocal d;

    static {
        evvo evvoVar = (evvo) evvp.a.createBuilder();
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).b = -62135596800L;
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).c = 0;
        a = (evvp) evvoVar.build();
        evvo evvoVar2 = (evvo) evvp.a.createBuilder();
        evvoVar2.copyOnWrite();
        ((evvp) evvoVar2.instance).b = 253402300799L;
        evvoVar2.copyOnWrite();
        ((evvp) evvoVar2.instance).c = 999999999;
        b = (evvp) evvoVar2.build();
        evvo evvoVar3 = (evvo) evvp.a.createBuilder();
        evvoVar3.copyOnWrite();
        ((evvp) evvoVar3.instance).b = 0L;
        evvoVar3.copyOnWrite();
        ((evvp) evvoVar3.instance).c = 0;
        c = (evvp) evvoVar3.build();
        d = new evxa();
        k("now");
        k("getEpochSecond");
        k("getNano");
    }

    public static long a(evvp evvpVar) {
        i(evvpVar);
        return eolp.b(eolp.c(evvpVar.b, 1000L), evvpVar.c / 1000000);
    }

    @Deprecated
    public static evrj b(evvp evvpVar, evvp evvpVar2) {
        i(evvpVar);
        i(evvpVar2);
        long jD = eolp.d(evvpVar2.b, evvpVar.b);
        int i = evvpVar2.c;
        int i2 = evvpVar.c;
        long j = i - i2;
        int i3 = (int) j;
        eolq.a(j == ((long) i3), "checkedSubtract", i, i2);
        return evwy.g(jD, i3);
    }

    public static evvp c(long j) {
        return f(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static evvp d(long j) {
        return f(j / 1000000000, (int) (j % 1000000000));
    }

    public static evvp e(long j) {
        return f(j, 0);
    }

    public static evvp f(long j, int i) {
        if (!j(j)) {
            throw new IllegalArgumentException(ejxq.a("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = eolp.b(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = eolp.d(j, 1L);
        }
        evvo evvoVar = (evvo) evvp.a.createBuilder();
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).b = j;
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).c = i;
        evvp evvpVar = (evvp) evvoVar.build();
        i(evvpVar);
        return evvpVar;
    }

    public static evvp g(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException(a.a(str, "Failed to parse timestamp: invalid timestamp \"", "\""), 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = ((SimpleDateFormat) d.get()).parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt += strSubstring.charAt(i) - '0';
                }
            }
        }
        int i2 = iIndexOf2 + 1;
        if (str.charAt(iIndexOf2) != 'Z') {
            String strSubstring4 = str.substring(i2);
            int iIndexOf4 = strSubstring4.indexOf(58);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid offset value: ".concat(String.valueOf(strSubstring4)), 0);
            }
            try {
                long j = ((Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60) + Long.parseLong(strSubstring4.substring(iIndexOf4 + 1))) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j : time + j;
            } catch (NumberFormatException e) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(String.valueOf(strSubstring4)), 0);
                parseException.initCause(e);
                throw parseException;
            }
        } else if (str.length() != i2) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(iIndexOf2) + "\"", 0);
        }
        try {
            return f(time, iCharAt);
        } catch (IllegalArgumentException e2) {
            ParseException parseException2 = new ParseException(a.a(str, "Failed to parse timestamp ", " Timestamp is out of range."), 0);
            parseException2.initCause(e2);
            throw parseException2;
        }
    }

    public static String h(evvp evvpVar) {
        i(evvpVar);
        long j = evvpVar.b;
        int i = evvpVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) d.get()).format(new Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            sb.append(i % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i / 1000000)) : i % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i)));
        }
        sb.append("Z");
        return sb.toString();
    }

    public static void i(evvp evvpVar) {
        long j = evvpVar.b;
        boolean zJ = j(j);
        int i = evvpVar.c;
        if (!zJ || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(ejxq.a("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean j(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void k(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
