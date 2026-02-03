package j$.desugar.sun.nio.fs;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.MonthDay;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.C0183x;
import j$.util.C0184y;
import j$.util.Map;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/* loaded from: classes9.dex */
public final /* synthetic */ class n implements Predicate, TemporalAdjuster, Function, UnaryOperator, IntFunction, BinaryOperator, Supplier, BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 23:
                ((Collection) obj).add(obj2);
                break;
            default:
                ((List) obj).add(obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            case 13:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                Map map = (Map) obj;
                Set set = Collectors.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    Object objPutIfAbsent = Map.EL.putIfAbsent(map, key, value);
                    if (objPutIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, objPutIfAbsent, value));
                    }
                }
                return map;
            case 20:
                int[] iArr = (int[]) obj;
                Set set2 = Collectors.a;
                iArr[0] = iArr[0] + ((int[]) obj2)[0];
                return iArr;
            case 24:
                Collection collection = (Collection) obj;
                Set set3 = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            default:
                List list = (List) obj;
                Set set4 = Collectors.a;
                list.addAll((List) obj2);
                return list;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 16:
                break;
            case 21:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    public Object e(TemporalAccessor temporalAccessor) {
        int i = this.a;
        n nVar = j$.time.temporal.k.a;
        switch (i) {
            case 1:
                return Instant.K(temporalAccessor);
            case 2:
                return LocalDate.L(temporalAccessor);
            case 3:
                return MonthDay.from(temporalAccessor);
            case 4:
                n nVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.I(nVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 5:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.c(chronoField)) {
                    return LocalTime.O(temporalAccessor.A(chronoField));
                }
                return null;
            case 6:
                return (ZoneId) temporalAccessor.I(nVar);
            case 7:
                return (Chronology) temporalAccessor.I(j$.time.temporal.k.b);
            case 8:
                return (TemporalUnit) temporalAccessor.I(j$.time.temporal.k.c);
            case 9:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.c(chronoField2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField2));
                }
                return null;
            case 10:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.I(nVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.I(j$.time.temporal.k.d);
            case 11:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.c(chronoField3)) {
                    return LocalDate.U(temporalAccessor.A(chronoField3));
                }
                return null;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 19:
                Set set = Collectors.a;
                return new int[1];
            case 22:
                return new C0183x();
            case 25:
                return new ArrayList();
            default:
                return new C0184y();
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo538negate() {
        switch (this.a) {
            case 0:
                break;
            case 13:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal o(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.a(temporal.j(chronoField).d, chronoField);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            case 13:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            case 13:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.a;
                return true;
            default:
                return Objects.isNull(obj);
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "ZoneId";
            case 7:
                return "Chronology";
            case 8:
                return "Precision";
            case 9:
                return "ZoneOffset";
            case 10:
                return "Zone";
            case 11:
                return "LocalDate";
            case 12:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 18:
                break;
            case 20:
                break;
            case 24:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo536andThen(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 16:
                break;
            case 21:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
            case 16:
                return obj;
            case 21:
                Set set = Collectors.a;
                return Integer.valueOf(((int[]) obj)[0]);
            default:
                Set set2 = Collectors.a;
                return g.N(((List) obj).toArray());
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
