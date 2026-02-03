package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.q;
import j$.time.temporal.j;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeM = LocalDateTime.M(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeM);
                    arrayList.add(localDateTimeM.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeM.O(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeM);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(j$.time.LocalDateTime r6, j$.time.zone.b r7) {
        /*
            j$.time.LocalDateTime r0 = r7.b
            j$.time.LocalDateTime r1 = r7.b
            j$.time.ZoneOffset r2 = r7.d
            j$.time.ZoneOffset r3 = r7.c
            boolean r4 = r7.f()
            if (r4 == 0) goto L2a
            boolean r0 = r6.isBefore(r0)
            if (r0 == 0) goto L15
            goto L45
        L15:
            int r0 = r2.getTotalSeconds()
            int r3 = r3.getTotalSeconds()
            int r0 = r0 - r3
            long r3 = (long) r0
            j$.time.LocalDateTime r0 = r1.O(r3)
            boolean r6 = r6.isBefore(r0)
            if (r6 == 0) goto L30
            goto L46
        L2a:
            boolean r0 = r6.isBefore(r0)
            if (r0 != 0) goto L31
        L30:
            return r2
        L31:
            int r0 = r2.getTotalSeconds()
            int r2 = r3.getTotalSeconds()
            int r0 = r0 - r2
            long r4 = (long) r0
            j$.time.LocalDateTime r0 = r1.O(r4)
            boolean r6 = r6.isBefore(r0)
            if (r6 == 0) goto L46
        L45:
            return r3
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneRules.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.U(j$.desugar.sun.nio.fs.g.L(j2 + zoneOffset.getTotalSeconds(), 86400)).getYear();
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        LocalDate localDateT;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        int i3 = 0;
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            long j2 = 1;
            d[] dVarArr = this.f;
            b[] bVarArr2 = new b[dVarArr.length];
            while (i3 < dVarArr.length) {
                d dVar = dVarArr[i3];
                ZoneOffset zoneOffset = dVar.h;
                DayOfWeek dayOfWeek = dVar.c;
                Month month = dVar.a;
                byte b = dVar.b;
                if (b < 0) {
                    localDateT = LocalDate.T(i2, month, month.K(q.d.isLeapYear(i2)) + 1 + b);
                    if (dayOfWeek != null) {
                        localDateT = localDateT.f(new j(dayOfWeek.getValue(), 2));
                    }
                } else {
                    localDateT = LocalDate.T(i2, month, b);
                    if (dayOfWeek != null) {
                        localDateT = localDateT.f(new j(dayOfWeek.getValue(), 1));
                    }
                }
                long j3 = j2;
                if (dVar.e) {
                    localDateT = localDateT.plusDays(j3);
                }
                LocalDateTime localDateTimeL = LocalDateTime.L(localDateT, dVar.d);
                c cVar = dVar.f;
                ZoneOffset zoneOffset2 = dVar.g;
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 0) {
                    localDateTimeL = localDateTimeL.O(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
                } else if (iOrdinal == 2) {
                    localDateTimeL = localDateTimeL.O(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds());
                }
                bVarArr2[i3] = new b(localDateTimeL, zoneOffset, dVar.i);
                i3++;
                j2 = j3;
            }
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = l;
        if (i2 < 1800) {
            return bVarArr3;
        }
        long epochSecond = LocalDateTime.of(i2 - 1, 12, 31, 0, 0).toEpochSecond(this.b[0]);
        long j4 = 1000;
        int offset = timeZone.getOffset(epochSecond * 1000);
        long j5 = 31968000 + epochSecond;
        while (epochSecond < j5) {
            long j6 = epochSecond + 7776000;
            if (offset != timeZone.getOffset(j6 * j4)) {
                while (j6 - epochSecond > 1) {
                    long j7 = epochSecond;
                    long jL = j$.desugar.sun.nio.fs.g.L(j6 + epochSecond, 2L);
                    if (timeZone.getOffset(jL * j4) == offset) {
                        epochSecond = jL;
                    } else {
                        j6 = jL;
                        epochSecond = j7;
                    }
                }
                long j8 = epochSecond;
                epochSecond = timeZone.getOffset(j8 * j4) != offset ? j8 : j6;
                ZoneOffset zoneOffsetH = h(offset);
                int offset2 = timeZone.getOffset(epochSecond * j4);
                ZoneOffset zoneOffsetH2 = h(offset2);
                if (c(epochSecond, zoneOffsetH2) == i2) {
                    b[] bVarArr4 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr4[bVarArr4.length - 1] = new b(epochSecond, zoneOffsetH, zoneOffsetH2);
                    offset = offset2;
                    bVarArr3 = bVarArr4;
                } else {
                    offset = offset2;
                }
            } else {
                epochSecond = j6;
            }
            j4 = 1000;
        }
        if (1916 <= i2 && i2 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.getYear());
            if (bVarArrB.length == 0) {
                return h(timeZone.getOffset(localDateTime.toEpochSecond(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.isAfter(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.getYear());
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.c)) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            if (Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f)) {
                return true;
            }
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.f() ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.N(new Object[]{bVar.c, bVar.d});
    }

    public final boolean g() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            long epochSecond = instantNow.getEpochSecond();
            if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int iC = c(epochSecond, d(instantNow));
            b[] bVarArrB = b(iC);
            int length = bVarArrB.length - 1;
            while (true) {
                if (length >= 0) {
                    bVar = bVarArrB[length];
                    if (epochSecond > bVar.a) {
                        break;
                    }
                    length--;
                } else {
                    bVar = null;
                    if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 >= 0) {
                                b bVar2 = bVarArrB2[length2];
                                if (epochSecond > bVar2.a) {
                                    bVar = bVar2;
                                    break;
                                }
                                length2--;
                            } else {
                                j$.time.a.b.getClass();
                                long jMin = Math.min(epochSecond - 31104000, (System.currentTimeMillis() / 1000) + 31968000);
                                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                                while (true) {
                                    if (epochDay > jMin) {
                                        break;
                                    }
                                    int offset2 = timeZone.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, h(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        int length3 = bVarArrB3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] bVarArrB4 = b(iC2);
                                                bVar = bVarArrB4[bVarArrB4.length - 1];
                                                break;
                                            }
                                            bVar = bVarArrB3[length3];
                                            if (epochSecond > bVar.a) {
                                                break;
                                            }
                                            length3--;
                                        }
                                    } else {
                                        jMin -= 7776000;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (bVar != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        return objE instanceof b ? ((b) objE).c : (ZoneOffset) objE;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public boolean isDaylightSavings(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetH = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetH = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetH.equals(d(instant));
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + String.valueOf(this.b[r1.length - 1]) + "]";
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
