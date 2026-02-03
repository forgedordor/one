package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eipa {
    public static final Optional a = Optional.empty();
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final eipd d;
    public final eipl e;

    protected eipa(eipd eipdVar, eipl eiplVar) {
        new Handler(Looper.getMainLooper());
        this.b = new AtomicReference(a);
        this.c = new AtomicBoolean(false);
        this.d = eipdVar;
        this.e = eiplVar;
        eiow eiowVar = (eiow) eiplVar;
        eiowVar.c = new eiov();
        if (eiowVar.c == null) {
            return;
        }
        Collection.EL.stream(((didn) eiplVar).a).map(new Function() { // from class: eiom
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eipk) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: eion
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
                int i = eiow.d;
                eizm eizmVar = ((eiqt) obj).d().e;
                if (eizmVar == null) {
                    eizmVar = eizm.a;
                }
                return eizmVar.b;
            }
        }).forEach(new Consumer() { // from class: eioo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((eiqt) obj).f();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
