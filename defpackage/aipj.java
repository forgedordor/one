package defpackage;

import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aipj {
    public final cogw a;
    public final fcsu b;
    public final ejxr c;
    public final ejxr d;

    public aipj(cogw cogwVar, final fcsu fcsuVar, final fcsu fcsuVar2) {
        this.a = cogwVar;
        this.b = fcsuVar2;
        this.d = ejxx.a(new ejxr() { // from class: aipa
            @Override // defpackage.ejxr
            public final Object get() {
                return ((aqbq) fcsuVar2.b()).a() ? (ekgp) elfe.f(((aipn) fcsuVar.b()).b).g(new Predicate() { // from class: aipg
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((aipl) obj).b == 1;
                    }
                }).b(new Function() { // from class: aiph
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        aipl aiplVar = (aipl) obj;
                        if (aiplVar.b != 1) {
                            return ellf.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                        ellf ellfVarB = ellf.b(((Integer) aiplVar.c).intValue());
                        return ellfVarB == null ? ellf.UNKNOWN_BUGLE_EVENT_TYPE : ellfVarB;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).c(new aipe()).d(new eleu(new BinaryOperator() { // from class: aipi
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (Integer) obj2;
                    }
                })) : ekoj.a;
            }
        });
        this.c = ejxx.a(new ejxr() { // from class: aipb
            @Override // defpackage.ejxr
            public final Object get() {
                return ((aqbq) fcsuVar2.b()).a() ? (ekgp) elfe.f(((aipn) fcsuVar.b()).b).g(new Predicate() { // from class: aipc
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((aipl) obj).b == 2;
                    }
                }).b(new Function() { // from class: aipd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        aipl aiplVar = (aipl) obj;
                        if (aiplVar.b != 2) {
                            return emxt.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                        emxt emxtVarB = emxt.b(((Integer) aiplVar.c).intValue());
                        return emxtVarB == null ? emxt.UNKNOWN_BUGLE_EVENT_CODE : emxtVarB;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).c(new aipe()).d(new eleu(new BinaryOperator() { // from class: aipf
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (Integer) obj2;
                    }
                })) : ekoj.a;
            }
        });
    }
}
