package j$.desugar.sun.nio.fs;

import j$.nio.file.C0011b;
import j$.nio.file.C0012c;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.A;
import j$.nio.file.attribute.w;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0019a;
import j$.time.chrono.AbstractC0025g;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC0026h;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.util.B;
import j$.util.C;
import j$.util.F;
import j$.util.I;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import j$.util.o0;
import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public abstract class g {
    public static Optional A(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }

    public static B B(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new B(optionalDouble.getAsDouble()) : B.c;
    }

    public static OptionalInt C(java.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? OptionalInt.of(optionalInt.getAsInt()) : OptionalInt.empty();
    }

    public static OptionalLong D(java.util.OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? OptionalLong.of(optionalLong.getAsLong()) : OptionalLong.empty();
    }

    public static FileTime E(w wVar) {
        long nano;
        if (wVar == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            nano = timeUnit.toMillis(wVar.a);
        } else {
            long epochSecond = wVar.b.getEpochSecond();
            long j = epochSecond * 1000;
            nano = (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) ? (wVar.b.getNano() / 1000000) + j : epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return FileTime.fromMillis(nano);
    }

    public static java.util.Optional F(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static OptionalDouble G(B b) {
        if (b == null) {
            return null;
        }
        boolean z = b.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(b.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static java.util.OptionalInt H(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? java.util.OptionalInt.of(optionalInt.getAsInt()) : java.util.OptionalInt.empty();
    }

    public static java.util.OptionalLong I(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? java.util.OptionalLong.of(optionalLong.getAsLong()) : java.util.OptionalLong.empty();
    }

    public static boolean J(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof A) || j$.adapter.b.t(next);
    }

    public static /* synthetic */ int K(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long L(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ String M(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static List N(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set O(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean P(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static j$.nio.file.attribute.m[] Q(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        j$.nio.file.attribute.m[] mVarArr = new j$.nio.file.attribute.m[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            mVarArr[i] = fileAttribute == null ? null : J(fileAttribute.value()) ? new h(2, fileAttribute) : fileAttribute instanceof j$.nio.file.attribute.l ? ((j$.nio.file.attribute.l) fileAttribute).a : new j$.nio.file.attribute.k(fileAttribute);
        }
        return mVarArr;
    }

    public static /* synthetic */ CopyOption[] R(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption c0012c;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                c0012c = null;
            } else if (copyOption instanceof C0011b) {
                c0012c = ((C0011b) copyOption).a;
            } else if (copyOption instanceof j$.nio.file.k) {
                c0012c = LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof StandardCopyOption) {
                StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
                c0012c = standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            } else {
                c0012c = new C0012c(copyOption);
            }
            copyOptionArr2[i] = c0012c;
        }
        return copyOptionArr2;
    }

    public static FileAttribute[] S(j$.nio.file.attribute.m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.attribute.m mVar = mVarArr[i];
            fileAttributeArr[i] = mVar == null ? null : J(mVar.value()) ? new j$.nio.file.attribute.n(mVar) : mVar instanceof j$.nio.file.attribute.k ? ((j$.nio.file.attribute.k) mVar).a : new j$.nio.file.attribute.l(mVar);
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long T(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long U(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long V(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long W(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String X(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static char Y(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static j$.time.a Z() {
        return new j$.time.a(ZoneId.systemDefault());
    }

    public static Temporal a(ChronoLocalDate chronoLocalDate, Temporal temporal) {
        return temporal.a(chronoLocalDate.toEpochDay(), ChronoField.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static j$.util.function.c b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer3);
            }
        };
    }

    public static int c(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int iCompare = Long.compare(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0019a) chronoLocalDate.getChronology()).s(chronoLocalDate2.getChronology());
    }

    public static int d(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iCompareTo = chronoLocalDateTime.toLocalDate().compareTo(chronoLocalDateTime2.toLocalDate());
        return (iCompareTo == 0 && (iCompareTo = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime())) == 0) ? chronoLocalDateTime.getChronology().s(chronoLocalDateTime2.getChronology()) : iCompareTo;
    }

    public static int e(InterfaceC0026h interfaceC0026h, InterfaceC0026h interfaceC0026h2) {
        int iCompare = Long.compare(interfaceC0026h.toEpochSecond(), interfaceC0026h2.toEpochSecond());
        return (iCompare == 0 && (iCompare = interfaceC0026h.toLocalTime().d - interfaceC0026h2.toLocalTime().d) == 0 && (iCompare = interfaceC0026h.toLocalDateTime().compareTo(interfaceC0026h2.toLocalDateTime())) == 0 && (iCompare = interfaceC0026h.getZone().getId().compareTo(interfaceC0026h2.getZone().getId())) == 0) ? interfaceC0026h.getChronology().s(interfaceC0026h2.getChronology()) : iCompare;
    }

    public static void f(Spliterator.OfDouble ofDouble, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            ofDouble.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (o0.a) {
                o0.a(ofDouble.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofDouble.forEachRemaining((DoubleConsumer) new C(consumer, 0));
        }
    }

    public static void g(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (o0.a) {
                o0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new F(consumer, 0));
        }
    }

    public static void h(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ofLong.forEachRemaining((LongConsumer) consumer);
        } else {
            if (o0.a) {
                o0.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofLong.forEachRemaining((LongConsumer) new I(consumer, 0));
        }
    }

    public static int i(InterfaceC0026h interfaceC0026h, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.k.a(interfaceC0026h, temporalField);
        }
        int i = AbstractC0025g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0026h.toLocalDateTime().get(temporalField) : interfaceC0026h.getOffset().getTotalSeconds();
        }
        throw new j$.time.temporal.l("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int j(j$.time.chrono.k kVar, TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? kVar.getValue() : j$.time.temporal.k.a(kVar, temporalField);
    }

    public static long k(j$.time.chrono.k kVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return kVar.getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.x(kVar);
    }

    public static boolean l(ChronoLocalDate chronoLocalDate, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isDateBased() : temporalField != null && temporalField.f(chronoLocalDate);
    }

    public static boolean m(j$.time.chrono.k kVar, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.ERA : temporalField != null && temporalField.f(kVar);
    }

    public static Object n(ChronoLocalDate chronoLocalDate, n nVar) {
        if (nVar == j$.time.temporal.k.a || nVar == j$.time.temporal.k.e || nVar == j$.time.temporal.k.d || nVar == j$.time.temporal.k.g) {
            return null;
        }
        return nVar == j$.time.temporal.k.b ? chronoLocalDate.getChronology() : nVar == j$.time.temporal.k.c ? ChronoUnit.DAYS : nVar.e(chronoLocalDate);
    }

    public static Object o(ChronoLocalDateTime chronoLocalDateTime, n nVar) {
        if (nVar == j$.time.temporal.k.a || nVar == j$.time.temporal.k.e || nVar == j$.time.temporal.k.d) {
            return null;
        }
        return nVar == j$.time.temporal.k.g ? chronoLocalDateTime.toLocalTime() : nVar == j$.time.temporal.k.b ? chronoLocalDateTime.getChronology() : nVar == j$.time.temporal.k.c ? ChronoUnit.NANOS : nVar.e(chronoLocalDateTime);
    }

    public static Object p(InterfaceC0026h interfaceC0026h, n nVar) {
        return (nVar == j$.time.temporal.k.e || nVar == j$.time.temporal.k.a) ? interfaceC0026h.getZone() : nVar == j$.time.temporal.k.d ? interfaceC0026h.getOffset() : nVar == j$.time.temporal.k.g ? interfaceC0026h.toLocalTime() : nVar == j$.time.temporal.k.b ? interfaceC0026h.getChronology() : nVar == j$.time.temporal.k.c ? ChronoUnit.NANOS : nVar.e(interfaceC0026h);
    }

    public static Object q(j$.time.chrono.k kVar, n nVar) {
        return nVar == j$.time.temporal.k.c ? ChronoUnit.ERAS : j$.time.temporal.k.c(kVar, nVar);
    }

    public static long r(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((chronoLocalDateTime.toLocalDate().toEpochDay() * 86400) + chronoLocalDateTime.toLocalTime().W()) - zoneOffset.getTotalSeconds();
    }

    public static long s(InterfaceC0026h interfaceC0026h) {
        return ((interfaceC0026h.toLocalDate().toEpochDay() * 86400) + interfaceC0026h.toLocalTime().W()) - interfaceC0026h.getOffset().getTotalSeconds();
    }

    public static Instant t(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(chronoLocalDateTime.toEpochSecond(zoneOffset), chronoLocalDateTime.toLocalTime().d);
    }

    public static boolean u(Spliterator.OfDouble ofDouble, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return ofDouble.tryAdvance((DoubleConsumer) consumer);
        }
        if (o0.a) {
            o0.a(ofDouble.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofDouble.tryAdvance((DoubleConsumer) new C(consumer, 0));
    }

    public static boolean v(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (o0.a) {
            o0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofInt.tryAdvance((IntConsumer) new F(consumer, 0));
    }

    public static boolean w(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return ofLong.tryAdvance((LongConsumer) consumer);
        }
        if (o0.a) {
            o0.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofLong.tryAdvance((LongConsumer) new I(consumer, 0));
    }

    public static String x(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String y(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static w z(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new w(millis);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
