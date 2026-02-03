package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.z;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.C0037f;
import j$.util.Map;
import j$.util.S;
import j$.util.Spliterator;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.A;
import j$.util.stream.AbstractC0050a;
import j$.util.stream.AbstractC0070e;
import j$.util.stream.AbstractC0171y1;
import j$.util.stream.B;
import j$.util.stream.C;
import j$.util.stream.C0054a3;
import j$.util.stream.C0105l;
import j$.util.stream.C0121o0;
import j$.util.stream.C0126p0;
import j$.util.stream.C0148t3;
import j$.util.stream.C0158v3;
import j$.util.stream.C0168x3;
import j$.util.stream.Collectors;
import j$.util.stream.EnumC0089h3;
import j$.util.stream.InterfaceC0128p2;
import j$.util.stream.L3;
import j$.util.stream.LongStream;
import java.nio.file.DirectoryStream;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final /* synthetic */ class h implements z, DirectoryStream.Filter, j$.nio.file.attribute.m, TemporalAccessor, BiPredicate, IntPredicate, Predicate, Supplier, BiConsumer, Function, BinaryOperator, DoubleFunction, LongFunction, Consumer, BooleanSupplier, InterfaceC0128p2 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long A(TemporalField temporalField) {
        throw new j$.time.temporal.l("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object I(n nVar) {
        return nVar == j$.time.temporal.k.a ? (ZoneId) this.b : j$.time.temporal.k.c(this, nVar);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof C) {
            return B.g((C) objApply);
        }
        if (S.D(objApply)) {
            return A.g(AbstractC0070e.o(objApply));
        }
        C0037f.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean c(TemporalField temporalField) {
        return false;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.nio.file.z
    public boolean g(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.k.a(this, temporalField);
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 20:
                C0148t3 c0148t3 = (C0148t3) this.b;
                return c0148t3.d.tryAdvance(c0148t3.e);
            case 21:
                C0158v3 c0158v3 = (C0158v3) this.b;
                return c0158v3.d.tryAdvance(c0158v3.e);
            case 22:
                C0168x3 c0168x3 = (C0168x3) this.b;
                return c0168x3.d.tryAdvance(c0168x3.e);
            default:
                L3 l3 = (L3) this.b;
                return l3.d.tryAdvance(l3.e);
        }
    }

    public void h(EnumC0089h3 enumC0089h3) {
        ((EnumMap) this.b).put((EnumMap) enumC0089h3, (EnumC0089h3) 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.m j(TemporalField temporalField) {
        return j$.time.temporal.k.d(this, temporalField);
    }

    @Override // j$.nio.file.attribute.m
    public String name() {
        return "posix:permissions";
    }

    public /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // j$.nio.file.attribute.m
    public Object value() {
        return Collections.unmodifiableSet(j$.nio.file.C.h((Set) ((FileAttribute) this.b).value()));
    }

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 8:
                return ((AbstractC0050a) this.b).J(0);
            case 9:
                return (Spliterator) this.b;
            default:
                CharSequence charSequence = (CharSequence) this.b;
                Set set = Collectors.a;
                return new StringJoiner(charSequence, "", "");
        }
    }

    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m537negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.b).test(obj, obj2);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ Predicate mo538negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                return !((Predicate) this.b).test(obj);
            default:
                return this.b.equals(obj);
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void z(Object obj) {
        switch (this.a) {
            case 17:
                ((InterfaceC0128p2) this.b).z((InterfaceC0128p2) obj);
                break;
            case 18:
                ((ArrayList) this.b).add(obj);
                break;
            default:
                ((C0054a3) this.b).z(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo535accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo535accept(j$.nio.file.C.b(obj));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 10:
                ToIntFunction toIntFunction = (ToIntFunction) this.b;
                int[] iArr = (int[]) obj;
                Set set = Collectors.a;
                iArr[0] = toIntFunction.applyAsInt(obj2) + iArr[0];
                break;
            default:
                C0105l c0105l = (C0105l) this.b;
                long[] jArr = (long[]) obj;
                Set set2 = Collectors.a;
                jArr[0] = c0105l.applyAsLong(obj2) + jArr[0];
                break;
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof LongStream) {
            return C0126p0.g((LongStream) objApply);
        }
        if (AbstractC0070e.B(objApply)) {
            return C0121o0.g(AbstractC0070e.s(objApply));
        }
        C0037f.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        BinaryOperator binaryOperator = (BinaryOperator) this.b;
        Map map = (Map) obj;
        Set set = Collectors.a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Map.EL.a(map, entry.getKey(), entry.getValue(), binaryOperator);
        }
        return map;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Supplier supplier = (Supplier) this.b;
        Set set = Collectors.a;
        return supplier.get();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void k(long j) {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void end() {
    }
}
