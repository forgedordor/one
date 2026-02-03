package defpackage;

import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class elfd extends elfe {
    private final Stream a;
    public final Function b;
    public final Function c;

    public elfd(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.a = stream;
        function.getClass();
        this.b = function;
        function2.getClass();
        this.c = function2;
    }

    @Override // defpackage.elfe
    public final elfe b(Function function) {
        return new elfd(this.a, this.b.mo536andThen(function), this.c);
    }

    @Override // defpackage.elfe
    public final elfe c(Function function) {
        return new elfd(this.a, this.b, this.c.mo536andThen(function));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.elfe
    public final Object d(eleu eleuVar) {
        final Function function = this.b;
        Function function2 = new Function() { // from class: elfb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return function.apply(obj);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        final Function function3 = this.c;
        return this.a.collect(ekcv.b(function2, new Function() { // from class: elfb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function32) {
                return Function$CC.$default$andThen(this, function32);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return function3.apply(obj);
            }

            public final /* synthetic */ Function compose(Function function32) {
                return Function$CC.$default$compose(this, function32);
            }
        }, eleuVar.a));
    }

    @Override // defpackage.elfe
    public final Stream e() {
        return this.a.map(new Function() { // from class: elfc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elfd elfdVar = this.a;
                return new AbstractMap.SimpleImmutableEntry(elfdVar.b.apply(obj), elfdVar.c.apply(obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
