package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbop extends dqpi implements bmgk {
    public static final /* synthetic */ int b = 0;
    private static final cqce c = cqce.g("BugleDataModel", "HeavyWorkQueueEmptyObserver");
    public cbfb a;

    public cbop(cbor cborVar, cbph cbphVar, cazj cazjVar, cbaz cbazVar) {
        cborVar.getClass();
        cbphVar.getClass();
        cazjVar.getClass();
        cbazVar.getClass();
    }

    @Override // defpackage.bmgk
    public final void a() {
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("HeavyWorkQueueEmptyObserver::query");
        Function function = new Function() { // from class: cboo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cbop.b;
                return ((cbeg) obj).f;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        cbeg cbegVar = cbfi.c;
        cbfdVarA.c((cbeh) function.apply(cbegVar));
        cbfdVarA.w(cbegVar.f);
        this.a = cbfdVarA.b();
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
    }

    @Override // defpackage.bmgk
    public final void fZ() {
        c.p("Starting observation of WorkQueueWorkManagerTable");
        cbfb cbfbVar = this.a;
        if (cbfbVar == null) {
            fdbq.c(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
            cbfbVar = null;
        }
        cbfbVar.M(this);
    }
}
