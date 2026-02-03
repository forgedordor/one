package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avnj extends cmwg {
    final /* synthetic */ fcsu a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ eosc c;

    public avnj(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("CleanupConversationStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        final fcsu fcsuVar = this.a;
        final fcsu fcsuVar2 = this.b;
        return eijx.f(new Runnable() { // from class: avni
            @Override // java.lang.Runnable
            public final void run() {
                eieu eieuVarK = eiiy.k("DeleteDatabaseOperations#getSoftDeletedConversations");
                try {
                    cqaz.h();
                    botb botbVarE = botm.e();
                    botbVarE.A("getSoftDeletedConversations");
                    botbVarE.i(new Function() { // from class: cdwl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            int iIntValue = botm.g().intValue();
                            if (iIntValue < 29020) {
                                dqru.x("delete_timestamp", iIntValue);
                            }
                            botlVar.ap(new dqty("conversations.delete_timestamp", 7, 0L));
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgb<bojh> ekgbVarZ = botbVarE.b().z();
                    eieuVarK.close();
                    for (bojh bojhVar : ekgbVarZ) {
                        fcsu fcsuVar3 = fcsuVar2;
                        cqaz.k(bojhVar.u() > 0);
                        avnh avnhVar = (avnh) fcsuVar3.b();
                        avnk avnkVarF = avnl.f();
                        avnkVarF.f(elka.CONVERSATION_FROM_BG_STARTUP_TASK);
                        avnkVarF.b(bojhVar.C());
                        avnkVarF.c(bojhVar.u());
                        avnhVar.b(avnkVarF.a());
                    }
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.c);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
