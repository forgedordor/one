package defpackage;

import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnuj extends aivg {
    public static final cczi a = cdag.h(cdag.b, "forward_sync_log_message_counts_to_clearcut", true);
    private final BiConsumer b;

    public cnuj(fcsu fcsuVar, cnun cnunVar, Executor executor, BiConsumer biConsumer) {
        super(fcsuVar, cnunVar, executor);
        this.b = biConsumer;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return this.b;
    }

    public final void b(final UUID uuid, final ekgb ekgbVar, final evuh evuhVar) {
        l(new Supplier() { // from class: cnuh
            @Override // java.util.function.Supplier
            public final Object get() {
                cczi ccziVar = cnuj.a;
                return evuhVar;
            }
        }, new Function() { // from class: cnui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enpu enpuVar = (enpu) obj;
                cczi ccziVar = cnuj.a;
                evqs evqsVarA = cnru.a(uuid);
                enpuVar.copyOnWrite();
                enqw enqwVar = (enqw) enpuVar.instance;
                enqw enqwVar2 = enqw.a;
                enqwVar.b |= 1;
                enqwVar.e = evqsVarA;
                enpuVar.a(ekgbVar);
                return enpuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void c(final ekgb ekgbVar, final evuh evuhVar) {
        l(new Supplier() { // from class: cnuf
            @Override // java.util.function.Supplier
            public final Object get() {
                cczi ccziVar = cnuj.a;
                return evuhVar;
            }
        }, new Function() { // from class: cnug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enpu enpuVar = (enpu) obj;
                cczi ccziVar = cnuj.a;
                enpuVar.a(ekgbVar);
                return enpuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
