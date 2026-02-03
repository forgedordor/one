package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxif extends dqpi {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bxig a;

    public bxif(bxig bxigVar) {
        this.a = bxigVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK;
        bxhu bxhuVarA;
        eieu eieuVarK2 = eiiy.k("ParticipantChangeListener::onChangeInTransaction");
        try {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) dqsdVar.b();
            if (bindData != null) {
                eieuVarK = eiiy.k("ParticipantChangeListener::onChangeInTransaction::insert");
                try {
                    bxhuVarA = this.a.a(3);
                    try {
                        bxhuVarA.c(1, bindData.R());
                        bxhuVarA.b();
                        eieuVarK.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                dqyd dqydVarC = dqsdVar.c();
                if (dqydVarC != null) {
                    eieuVarK = eiiy.k("ParticipantChangeListener::onChangeInTransaction::update");
                    try {
                        bsbo bsboVarE = ParticipantsTable.e();
                        bsboVarE.A("ParticipantChangeListener#onChangeInTransaction");
                        bsboVarE.f(new Function() { // from class: bxid
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i = bxif.b;
                                return ((brzh) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekqh it = dqydVarC.e.iterator();
                        while (it.hasNext()) {
                            bsboVarE.k((bsbt) ((dqyj) it.next()));
                        }
                        bxhuVarA = this.a.a(3);
                        try {
                            brzj brzjVar = (brzj) bsboVarE.b().p();
                            while (brzjVar.moveToNext()) {
                                try {
                                    bxhuVarA.c(2, brzjVar.o());
                                } finally {
                                }
                            }
                            brzjVar.close();
                            bxhuVarA.b();
                            eieuVarK.close();
                        } finally {
                            try {
                                bxhuVarA.b();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                    }
                }
            }
            eieuVarK2.close();
        } catch (Throwable th2) {
            try {
                eieuVarK2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.dqpi
    public final /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK = eiiy.k("ParticipantChangeListener::preChangeInTransaction");
        try {
            dqyj dqyjVarD = dqsdVar.d();
            if (dqyjVarD != null) {
                eieu eieuVarK2 = eiiy.k("ParticipantChangeListener::preChangeInTransaction::delete");
                try {
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.A("ParticipantChangeListener#preChangeInTransaction");
                    bsboVarE.f(new Function() { // from class: bxie
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = bxif.b;
                            return ((brzh) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsboVarE.k((bsbt) dqyjVarD);
                    bsbm bsbmVarB = bsboVarE.b();
                    bxhu bxhuVarA = this.a.a(3);
                    try {
                        brzj brzjVar = (brzj) bsbmVarB.p();
                        while (brzjVar.moveToNext()) {
                            try {
                                bxhuVarA.c(3, brzjVar.o());
                            } finally {
                            }
                        }
                        brzjVar.close();
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
