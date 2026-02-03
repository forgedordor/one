package j$.nio.file;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC0050a;
import j$.util.stream.AbstractC0140s0;
import j$.util.stream.C0131q0;
import j$.util.stream.C0135r0;
import j$.util.stream.C0138r3;
import j$.util.stream.C0150u0;
import j$.util.stream.Collectors;
import j$.util.stream.EnumC0094i3;
import j$.util.stream.EnumC0099j3;
import j$.util.stream.EnumC0145t0;
import j$.util.stream.R3;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class B implements F, BiConsumer, BiFunction, Consumer, Supplier, R3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ B(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.stream.R3
    public Object a(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        AbstractC0140s0 abstractC0140s0 = (AbstractC0140s0) ((Supplier) this.c).get();
        abstractC0050a.M(spliterator, abstractC0140s0);
        return Boolean.valueOf(abstractC0140s0.b);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 1:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            case 2:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
            default:
                Set set = Collectors.a;
                ((BiConsumer) obj4).accept(obj, ((Function) obj3).apply(obj2));
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.R3
    public Object b(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return (Boolean) new C0150u0(this, abstractC0050a, spliterator).invoke();
    }

    @Override // j$.util.stream.R3
    public int c() {
        return EnumC0094i3.u | EnumC0094i3.r;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 7:
                return new C0135r0((EnumC0145t0) this.b, (IntPredicate) this.c);
            default:
                return new C0131q0((EnumC0145t0) this.b, (Predicate) this.c);
        }
    }

    @Override // j$.nio.file.F
    public String name() {
        return (String) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.F
    public Class type() {
        return (Class) this.c;
    }

    public B(EnumC0099j3 enumC0099j3, EnumC0145t0 enumC0145t0, Supplier supplier) {
        this.a = 9;
        this.b = enumC0145t0;
        this.c = supplier;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 10:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void z(Object obj) {
        switch (this.a) {
            case 4:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.z(obj);
                consumer2.z(obj);
                break;
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    break;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                }
            case 10:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
            default:
                C0138r3 c0138r3 = (C0138r3) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (c0138r3.b.putIfAbsent(obj != null ? obj : C0138r3.d, Boolean.TRUE) == null) {
                    consumer3.z(obj);
                    break;
                }
                break;
        }
    }
}
