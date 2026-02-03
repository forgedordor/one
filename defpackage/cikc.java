package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cikc extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final fcsu b;
    public final cogw c;
    public final bbdl d;
    public final byeb e;
    public final dqsn f;
    public final bxlc g;
    public final ains h;
    private final eosc i;

    public cikc(eosc eoscVar, fcsu fcsuVar, cogw cogwVar, bbdl bbdlVar, byeb byebVar, dqsn dqsnVar, bxlc bxlcVar, ains ainsVar) {
        this.i = eoscVar;
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = bbdlVar;
        this.e = byebVar;
        this.f = dqsnVar;
        this.g = bxlcVar;
        this.h = ainsVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("MarkAllRcsGroupsAsLeftHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cike.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return eijx.g(new Callable() { // from class: cijx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cikc cikcVar = this.a;
                final axcy axcyVarD = cikcVar.d.d();
                final long epochMilli = cikcVar.c.f().toEpochMilli();
                botb botbVarE = botm.e();
                botbVarE.A("getAllActiveRcsGroups");
                botbVarE.s();
                bopp boppVar = botm.c;
                botbVarE.c(boppVar.a, boppVar.M);
                botbVarE.i(new Function() { // from class: cika
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        eksp ekspVar = cikc.a;
                        botlVar.j(2);
                        botlVar.y(2);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = botbVarE.b().z();
                cikcVar.h.c("Bugle.Groups.MarkedLeft.Count");
                ((eksl) ((eksl) cikc.a.h()).h("com/google/android/apps/messaging/shared/rcs/groups/leave/MarkAllRcsGroupsAsLeftHandler", "processPendingWorkItemAsync", 103, "MarkAllRcsGroupsAsLeftHandler.java")).r("Marking %d groups as left.", ekgbVarZ.size());
                int size = ekgbVarZ.size();
                for (int i = 0; i < size; i++) {
                    bojh bojhVar = (bojh) ekgbVarZ.get(i);
                    final ConversationIdType conversationIdTypeC = bojhVar.C();
                    final long jV = bojhVar.v();
                    cikcVar.f.d("MarkAllRcsGroupsAsLeftHandler#processPendingWorkItemAsync", new Runnable() { // from class: cikb
                        @Override // java.lang.Runnable
                        public final void run() {
                            final cikc cikcVar2 = cikcVar;
                            byeb byebVar = cikcVar2.e;
                            axcy axcyVar = axcyVarD;
                            long j = epochMilli;
                            final ConversationIdType conversationIdType = conversationIdTypeC;
                            byebVar.n(axcyVar, j, conversationIdType, jV, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
                            ((bakt) cikcVar2.b.b()).N(conversationIdType);
                            cikcVar2.f.g(new dqsm() { // from class: cijy
                                @Override // defpackage.dqsm
                                public final eieu a() {
                                    eksp ekspVar = cikc.a;
                                    return eiiy.k("MARGALH::notifyConversationMetadataChanged::runAfterCommit");
                                }
                            }, null, new Runnable() { // from class: cijz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cikcVar2.g.d(conversationIdType);
                                }
                            });
                        }
                    });
                }
                return cbcw.i();
            }
        }, this.i);
    }
}
