package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackc implements acjz {
    public final ackd a;
    public final ackl b;
    public final ackj c;
    public final ackh d;
    public final ackt e;
    private final ackf f;
    private final ackr g;
    private final ackn h;
    private final ackp i;
    private final ackv j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final Optional o;

    public ackc(acke ackeVar, ackm ackmVar, ackk ackkVar, acki ackiVar, acku ackuVar, ackg ackgVar, acks acksVar, acko ackoVar, ackq ackqVar, ackw ackwVar, aciu aciuVar, acjb acjbVar, fcsu fcsuVar, acjf acjfVar, acix acixVar) {
        Optional optionalOf = Optional.of(aciuVar);
        this.k = optionalOf;
        Optional optionalOf2 = Optional.of(acjbVar);
        this.l = optionalOf2;
        Optional optionalOf3 = ((Boolean) ackx.b.e()).booleanValue() ? Optional.of((acit) fcsuVar.b()) : Optional.empty();
        this.m = optionalOf3;
        Optional optionalOf4 = ((Boolean) cqcu.a.e()).booleanValue() ? Optional.of(acjfVar) : Optional.empty();
        this.n = optionalOf4;
        Optional optionalOf5 = ((Boolean) ackx.c.e()).booleanValue() ? Optional.of(acixVar) : Optional.empty();
        this.o = optionalOf5;
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        Context context = (Context) ackeVar.a.b();
        context.getClass();
        ekgbVar.getClass();
        this.a = new ackd(context, ekgbVar);
        ekgb ekgbVarB = b(ekgb.v(optionalOf, optionalOf2, optionalOf3, optionalOf4, optionalOf5));
        Context context2 = (Context) ackmVar.a.b();
        context2.getClass();
        ekgbVarB.getClass();
        this.b = new ackl(context2, ekgbVarB);
        ekgb ekgbVarB2 = b(ekgb.v(optionalOf, optionalOf2, optionalOf3, optionalOf4, optionalOf5));
        Context context3 = (Context) ackkVar.a.b();
        context3.getClass();
        ekgbVarB2.getClass();
        this.c = new ackj(context3, ekgbVarB2);
        ekgb ekgbVarB3 = b(ekgb.v(optionalOf, optionalOf2, optionalOf3, optionalOf4, optionalOf5));
        Context context4 = (Context) ackiVar.a.b();
        context4.getClass();
        ekgbVarB3.getClass();
        this.d = new ackh(context4, ekgbVarB3);
        ekgb ekgbVarB4 = b(ekgb.v(optionalOf, optionalOf2, optionalOf3, optionalOf4, optionalOf5));
        Context context5 = (Context) ackuVar.a.b();
        context5.getClass();
        ekgbVarB4.getClass();
        this.e = new ackt(context5, ekgbVarB4);
        ekgb ekgbVarB5 = b(ekgb.u(optionalOf, optionalOf2, optionalOf4, optionalOf5));
        Context context6 = (Context) ackgVar.a.b();
        context6.getClass();
        ekgbVarB5.getClass();
        this.f = new ackf(context6, ekgbVarB5);
        ekgb ekgbVarB6 = b(ekgb.u(optionalOf, optionalOf2, optionalOf4, optionalOf5));
        Context context7 = (Context) acksVar.a.b();
        context7.getClass();
        ekgbVarB6.getClass();
        this.g = new ackr(context7, ekgbVarB6);
        ekgb ekgbVarB7 = b(ekgb.u(optionalOf, optionalOf2, optionalOf4, optionalOf5));
        Context context8 = (Context) ackoVar.a.b();
        context8.getClass();
        ekgbVarB7.getClass();
        this.h = new ackn(context8, ekgbVarB7);
        Context context9 = (Context) ackqVar.a.b();
        context9.getClass();
        ekgbVar.getClass();
        this.i = new ackp(context9, ekgbVar);
        ekgb ekgbVarB8 = b(ekgb.t(optionalOf2, optionalOf4, optionalOf5));
        Context context10 = (Context) ackwVar.a.b();
        context10.getClass();
        ekgbVarB8.getClass();
        this.j = new ackv(context10, ekgbVarB8);
    }

    private static ekgb b(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: acka
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
                return ((Optional) obj).isPresent();
            }
        }).map(new Function() { // from class: ackb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (acin) ((Optional) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    @Override // defpackage.acjz
    public final ekgb a() {
        return ekgb.A(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.a);
    }
}
