package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxic extends dqpi {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bxig a;

    public bxic(bxig bxigVar) {
        this.a = bxigVar;
    }

    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        bxig bxigVar = this.a;
        eieu eieuVarK = eiiy.k("MessageChangeListener::onChangeInTransaction");
        try {
            MessagesTable.BindData bindData = (MessagesTable.BindData) dqsdVar.b();
            if (bindData != null) {
                eieu eieuVarK2 = eiiy.k("MessageChangeListener::insert");
                try {
                    bxhu bxhuVarA = bxigVar.a(1);
                    try {
                        bxhuVarA.c(1, bindData.E().b());
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK;
        bxhu bxhuVarA;
        brap brapVar;
        bxig bxigVar = this.a;
        eieu eieuVarK2 = eiiy.k("MessageChangeListener::preChangeInTransaction");
        try {
            dqyj dqyjVarD = dqsdVar.d();
            if (dqyjVarD != null) {
                eieuVarK = eiiy.k("MessageChangeListener::preChangeInTransaction::delete");
                try {
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("TableChangeObserver#preChangeInTransaction-messages1");
                    brdrVarD.f(new Function() { // from class: bxia
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = bxic.b;
                            return ((bran) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.k((brdv) dqyjVarD);
                    brdp brdpVarB = brdrVarD.b();
                    bxhuVarA = bxigVar.a(1);
                    try {
                        brapVar = (brap) brdpVarB.p();
                        while (brapVar.moveToNext()) {
                            try {
                                bxhuVarA.c(3, brapVar.q().b());
                            } finally {
                            }
                        }
                        brapVar.close();
                        bxhuVarA.b();
                        eieuVarK.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                dqyd dqydVarC = dqsdVar.c();
                if (dqydVarC != null) {
                    eieuVarK = eiiy.k("MessageChangeListener::preChangeInTransaction::update");
                    try {
                        brdr brdrVarD2 = MessagesTable.d();
                        brdrVarD2.A("TableChangeObserver#preChangeInTransaction-messages2");
                        brdrVarD2.f(new Function() { // from class: bxib
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i = bxic.b;
                                return ((bran) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekqh it = dqydVarC.e.iterator();
                        while (it.hasNext()) {
                            brdrVarD2.k((brdv) ((dqyj) it.next()));
                        }
                        bxhuVarA = this.a.a(1);
                        try {
                            brapVar = (brap) brdrVarD2.b().p();
                            while (brapVar.moveToNext()) {
                                try {
                                    bxhuVarA.c(2, brapVar.q().b());
                                } finally {
                                    try {
                                        brapVar.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            }
                            brapVar.close();
                            bxhuVarA.b();
                            eieuVarK.close();
                        } finally {
                            try {
                                bxhuVarA.b();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    } finally {
                    }
                }
            }
            eieuVarK2.close();
        } catch (Throwable th3) {
            try {
                eieuVarK2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
