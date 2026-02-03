package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cath extends cayv {
    public final cqce a = cqce.g("BugleDataModel", "ClearSessionIdsHandler");
    public final dqsn b;
    public final bxlc c;
    private final eosc d;

    public cath(bxlc bxlcVar, dqsn dqsnVar, eosc eoscVar) {
        this.c = bxlcVar;
        this.b = dqsnVar;
        this.d = eoscVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ClearSessionIdsHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        Callable callable = new Callable() { // from class: catd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cath cathVar = this.a;
                cathVar.b.d("ClearSessionIdsAction.executeAction", new Runnable() { // from class: catg
                    @Override // java.lang.Runnable
                    public final void run() {
                        String[] strArr = botm.a;
                        bote boteVar = new bote();
                        boteVar.ap("processPendingWorkItemAsync-conversations1");
                        boteVar.ak();
                        boteVar.T(-1L);
                        boteVar.b().e();
                        bote boteVar2 = new bote();
                        boteVar2.ap("processPendingWorkItemAsync-conversations2");
                        boteVar2.ak();
                        boteVar2.A(4);
                        boteVar2.ad(new Function() { // from class: catf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                botl botlVar = (botl) obj;
                                botlVar.j(2);
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boteVar2.b().e();
                        cathVar.c.h("ClearSessionIdsAction");
                    }
                });
                cathVar.a.m("Finished transaction and notify change");
                return cbcw.i();
            }
        };
        eosc eoscVar = this.d;
        return eijx.g(callable, eoscVar).e(Throwable.class, new ejvr() { // from class: cate
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.a.o("Fail to clear session ids", (Throwable) obj);
                return cbcw.k();
            }
        }, eoscVar);
    }
}
