package j$.util.stream;

import j$.util.C0183x;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0105l implements Supplier, BiConsumer, BinaryOperator, Function, ToLongFunction, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0105l(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                ((Set) obj).add(obj2);
                break;
            case 5:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
            case 15:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 16:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 17:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 21:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            default:
                ((C0183x) obj).a((C0183x) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
            case 5:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 21:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 18:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        Set set = Collectors.a;
        return 1L;
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 4:
                break;
            case 7:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return new HashSet();
            case 2:
                return new j$.util.A();
            case 10:
                return new HashMap();
            case 11:
                Set set = Collectors.a;
                return new long[1];
            case 14:
                return new LinkedHashSet();
            case 19:
                return new double[4];
            default:
                return new double[3];
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Double[i];
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                List list = (List) obj;
                Set set = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 6:
                StringJoiner stringJoiner = (StringJoiner) obj;
                StringJoiner stringJoiner2 = (StringJoiner) obj2;
                stringJoiner.getClass();
                stringJoiner2.getClass();
                if (stringJoiner2.d == null) {
                    return stringJoiner;
                }
                stringJoiner2.a();
                return stringJoiner.add(stringJoiner2.d[0]);
            case 8:
                Set set2 = (Set) obj;
                Set set3 = (Set) obj2;
                Set set4 = Collectors.a;
                if (set2.size() < set3.size()) {
                    set3.addAll(set2);
                    return set3;
                }
                set2.addAll(set3);
                return set2;
            default:
                long[] jArr = (long[]) obj;
                Set set5 = Collectors.a;
                jArr[0] = jArr[0] + ((long[]) obj2)[0];
                return jArr;
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 3:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo536andThen(Function function) {
        switch (this.a) {
            case 4:
                break;
            case 7:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 20:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            case 21:
            default:
                double[] dArr2 = (double[]) obj;
                Collectors.a(dArr2, d);
                dArr2[2] = dArr2[2] + d;
                break;
            case 22:
                ((C0183x) obj).accept(d);
                break;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                Set set = Collectors.a;
                return obj;
            case 7:
                return ((StringJoiner) obj).toString();
            default:
                Set set2 = Collectors.a;
                return Long.valueOf(((long[]) obj)[0]);
        }
    }
}
