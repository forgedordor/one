package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auaq {
    public final Map a = new HashMap();
    public final eosd b;
    public final egzh c;
    public final Executor d;
    public final cogw e;
    private final cqtq f;

    public auaq(eosd eosdVar, egzh egzhVar, cogw cogwVar, cqtp cqtpVar) {
        this.b = eosdVar;
        this.c = egzhVar;
        this.d = new eoss(eosdVar);
        this.e = cogwVar;
        this.f = cqtpVar.a(new auao());
    }

    public final cquc a(auap auapVar) {
        return this.f.a(auapVar, "Subscribe Typing updates", "Typing update callback", "Typing update unregister");
    }

    public final eiju b() {
        return eijx.g(new Callable() { // from class: auam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (ekgp) Collection.EL.stream(this.a.a.entrySet()).collect(ekcv.a(new Function() { // from class: auai
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (ConversationIdType) ((Map.Entry) obj).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: auaj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ekgp.j((Map) ((Map.Entry) obj).getValue());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
            }
        }, this.d);
    }

    public final void c(final String str) {
        this.f.c(new Supplier() { // from class: auak
            @Override // java.util.function.Supplier
            public final Object get() {
                return str;
            }
        }, "notifyCallbacks");
    }
}
