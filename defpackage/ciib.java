package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciib extends cayv {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleGroupManagement");
    private final bxlc c;

    public ciib(bxlc bxlcVar) {
        this.c = bxlcVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("GroupSessionStartFailedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ciid.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final long j = ((ciid) evuhVar).b;
        ejwl.b(j != -1, "Invalid session ID.");
        botb botbVarE = botm.e();
        botbVarE.A("processPendingWorkItemAsync-conversations");
        botbVarE.i(new Function() { // from class: ciia
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                int i = ciib.a;
                botlVar.J(j);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bojh bojhVar = (bojh) botbVarE.b().l();
        if (bojhVar == null) {
            eksl ekslVar = (eksl) b.j();
            ekslVar.X(cqnc.L, Long.valueOf(j));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartFailedHandler", "processPendingWorkItemAsync", 70, "GroupSessionStartFailedHandler.java")).q("Found no conversation for session start failed event.");
            return eijx.e(cbcw.i());
        }
        ConversationIdType conversationIdTypeC = bojhVar.C();
        bote boteVar = new bote();
        boteVar.ap("processPendingWorkItemAsync#update");
        boteVar.T(-1L);
        boteVar.A(5);
        boteVar.f(conversationIdTypeC);
        this.c.d(conversationIdTypeC);
        ekrw ekrwVarN = b.n();
        ekrwVarN.X(cqnc.L, Long.valueOf(j));
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartFailedHandler", "processPendingWorkItemAsync", 84, "GroupSessionStartFailedHandler.java")).q("Session start failed for a new RCS group. Updated conversation join state to group creation failed.");
        return eijx.e(cbcw.i());
    }
}
