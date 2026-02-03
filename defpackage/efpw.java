package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpw extends efos {
    static final ejvj a = new efpv();
    static final ejvj b = new efqw();
    static final ejvj c = new efpr();

    @Override // defpackage.efos
    public final void c(efiw efiwVar, final cjhh cjhhVar) {
        efiwVar.c().ifPresent(new Consumer() { // from class: efps
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Iterable iterable = (Iterable) Collection.EL.stream((ekhx) obj).map(new Function() { // from class: efpu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (cjhb) efpw.c.fH().fM((efjs) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b);
                cjhh cjhhVar2 = cjhhVar;
                cjhhVar2.copyOnWrite();
                cjhi cjhiVar = (cjhi) cjhhVar2.instance;
                evsy evsyVar = cjhi.a;
                evsx evsxVar = cjhiVar.i;
                if (!evsxVar.c()) {
                    cjhiVar.i = evsn.mutableCopy(evsxVar);
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    cjhiVar.i.h(((cjhb) it.next()).e);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.efos
    public final void d(efiw efiwVar, cjhh cjhhVar) {
        cjjv cjjvVar = (cjjv) cjjw.a.createBuilder();
        String strF = efiwVar.f();
        cjjvVar.copyOnWrite();
        cjjw cjjwVar = (cjjw) cjjvVar.instance;
        cjjwVar.b |= 1;
        cjjwVar.c = strF;
        cjhhVar.copyOnWrite();
        cjhi cjhiVar = (cjhi) cjhhVar.instance;
        cjjw cjjwVar2 = (cjjw) cjjvVar.build();
        evsy evsyVar = cjhi.a;
        cjjwVar2.getClass();
        cjhiVar.d = cjjwVar2;
        cjhiVar.c |= 1;
    }

    @Override // defpackage.efos
    public final void e(efiw efiwVar, cjhh cjhhVar) {
        evvp evvpVarB = evwz.b((Instant) efiwVar.e().get());
        cjhhVar.copyOnWrite();
        cjhi cjhiVar = (cjhi) cjhhVar.instance;
        evsy evsyVar = cjhi.a;
        evvpVarB.getClass();
        cjhiVar.h = evvpVarB;
        cjhiVar.c |= 16;
    }

    @Override // defpackage.efos
    public final void f(cjhi cjhiVar, efit efitVar) {
        evsx evsxVar = cjhiVar.i;
        evsy evsyVar = cjhi.a;
        if (new evsz(evsxVar, evsyVar).isEmpty()) {
            return;
        }
        Stream stream = Collection.EL.stream(new evsz(cjhiVar.i, evsyVar));
        final ejvj ejvjVar = c;
        ((efhk) efitVar).f = Optional.of((ekhx) stream.map(new Function() { // from class: efpt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (efjs) ejvjVar.fM((cjhb) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b));
    }

    @Override // defpackage.efos
    public final void g(cjhi cjhiVar, efit efitVar) {
        cjjw cjjwVar = cjhiVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        String str = cjjwVar.c;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        ((efhk) efitVar).a = str;
    }

    @Override // defpackage.efos
    public final void h(cjhi cjhiVar, efit efitVar) {
        if ((cjhiVar.c & 16) != 0) {
            evvp evvpVar = cjhiVar.h;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            ((efhk) efitVar).e = Optional.of(evwz.d(evvpVar));
        }
    }
}
