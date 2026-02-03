package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class danv implements ddix {
    public static final cczv a = cdag.f(cdag.b, "federated_analytics_suggestion_context_fetch_period_millis", TimeUnit.DAYS.toMillis(1));
    private final Optional b;
    private final eosc c;
    private ListIterator d;
    private boolean e;
    private final cogw f;

    public danv(Optional optional, eosc eoscVar, cogw cogwVar) {
        this.b = optional;
        this.c = eoscVar;
        this.f = cogwVar;
    }

    @Override // defpackage.ddix
    public final void a(ddkb ddkbVar) {
        Callable callable = new Callable() { // from class: dant
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c();
            }
        };
        eosc eoscVar = this.c;
        eijx.g(callable, eoscVar).k(auwc.a(new danu(ddkbVar)), eoscVar);
    }

    final synchronized ListIterator c() {
        if (this.e) {
            return this.d;
        }
        final long epochMilli = this.f.f().toEpochMilli() - ((Long) a.e()).longValue();
        Optional optional = this.b;
        optional.isPresent();
        optional.get();
        brna brnaVarA = brnk.a();
        brnaVarA.A("getP2pSmartSuggestionItemSuggestionSuggestionInfoAfterCutoffTimestamp");
        brnaVarA.d(new Function() { // from class: abwc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brnj brnjVar = (brnj) obj;
                brnjVar.b(epochMilli);
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarY = brnaVarA.b().y(new ejvr() { // from class: abwd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                brml brmlVar = (brml) obj;
                return new cdem(brmlVar.c(), bbez.a((brlo) brmlVar.cQ()));
            }
        });
        this.e = true;
        ekqh it = ekgbVarY.iterator();
        this.d = it;
        return it;
    }

    @Override // defpackage.ddix
    public final void b() {
    }

    @Override // defpackage.ddix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
