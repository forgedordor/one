package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhw extends dqpi {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bxig a;

    public bxhw(bxig bxigVar) {
        this.a = bxigVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK = eiiy.k("ConversationChangeListener::onChangeInTransaction");
        try {
            dqyd dqydVarC = dqsdVar.c();
            if (dqydVarC != null) {
                eieu eieuVarK2 = eiiy.k("ConversationChangeListener::onChangeInTransaction::update");
                try {
                    botb botbVarE = botm.e();
                    botbVarE.A("ConversationChangeListener#onChangeInTransaction");
                    ekqh it = dqydVarC.e.iterator();
                    while (it.hasNext()) {
                        botbVarE.k((botf) ((dqyj) it.next()));
                    }
                    bxhu bxhuVarA = this.a.a(2);
                    try {
                        botbVarE.d();
                        bopr boprVar = (bopr) botbVarE.b().p();
                        while (boprVar.moveToNext()) {
                            try {
                                bxhuVarA.c(2, boprVar.h().a());
                            } finally {
                            }
                        }
                        boprVar.close();
                        bxhuVarA.b();
                        eieuVarK2.close();
                    } finally {
                    }
                } finally {
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dqpi
    public final /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK = eiiy.k("ConversationChangeListener::preChangeInTransaction");
        try {
            dqyj dqyjVarD = dqsdVar.d();
            if (dqyjVarD != null) {
                eieu eieuVarK2 = eiiy.k("ConversationChangeListener::preChangeInTransaction::delete");
                try {
                    botb botbVarE = botm.e();
                    botbVarE.A("ConversationChangeListener#preChangeInTransaction");
                    botbVarE.d();
                    botbVarE.g(new Function() { // from class: bxhv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = bxhw.b;
                            return ((bopp) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    botbVarE.k((botf) dqyjVarD);
                    bosz boszVarB = botbVarE.b();
                    bxhu bxhuVarA = this.a.a(2);
                    try {
                        bopr boprVar = (bopr) boszVarB.p();
                        while (boprVar.moveToNext()) {
                            try {
                                bxhuVarA.c(3, boprVar.h().a());
                            } finally {
                            }
                        }
                        boprVar.close();
                        bxhuVarA.b();
                        eieuVarK2.close();
                    } finally {
                    }
                } finally {
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
