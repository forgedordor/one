package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhz extends dqpi {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bxig a;

    public bxhz(bxig bxigVar) {
        this.a = bxigVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK = eiiy.k("MessageAnnotationChangeListener::onChangeInTransaction");
        try {
            bpyn bpynVar = (bpyn) dqsdVar.b();
            if (bpynVar != null) {
                eieu eieuVarK2 = eiiy.k("MessageAnnotationChangeListener::onChangeInTransaction::insert");
                try {
                    bxhu bxhuVarA = this.a.a(4);
                    try {
                        bpynVar.aA(0, "_id");
                        bxhuVarA.c(1, bpynVar.a);
                        bxhuVarA.b();
                        eieuVarK2.close();
                        eieuVarK.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            }
            eieuVarK.close();
            dqyd dqydVarC = dqsdVar.c();
            if (dqydVarC != null) {
                eieuVarK = eiiy.k("MessageAnnotationChangeListener::onChangeInTransaction::update");
                try {
                    bpzs bpzsVarA = bpzx.a();
                    bpzsVarA.A("MessageAnnotationChangeListener#onChangeInTransaction");
                    bpzsVarA.d(new Function() { // from class: bxhy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = bxhz.b;
                            return ((bpzc) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekqh it = dqydVarC.e.iterator();
                    while (it.hasNext()) {
                        bpzsVarA.k((bpzv) ((dqyj) it.next()));
                    }
                    bxhu bxhuVarA2 = this.a.a(4);
                    try {
                        bpze bpzeVar = (bpze) bpzsVarA.b().p();
                        while (bpzeVar.moveToNext()) {
                            try {
                                bxhuVarA2.c(2, bpzeVar.e());
                            } finally {
                            }
                        }
                        bpzeVar.close();
                        bxhuVarA2.b();
                        eieuVarK.close();
                    } finally {
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // defpackage.dqpi
    public final /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
        eieu eieuVarK = eiiy.k("MessageAnnotationChangeListener::preChangeInTransaction");
        try {
            dqyj dqyjVarD = dqsdVar.d();
            if (dqyjVarD != null) {
                eieu eieuVarK2 = eiiy.k("MessageAnnotationChangeListener::preChangeInTransaction::delete");
                try {
                    bpzs bpzsVarA = bpzx.a();
                    bpzsVarA.A("MessageAnnotationChangeListener#preChangeInTransaction");
                    bpzsVarA.d(new Function() { // from class: bxhx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i = bxhz.b;
                            return ((bpzc) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bpzsVarA.k((bpzv) dqyjVarD);
                    bpzr bpzrVarB = bpzsVarA.b();
                    bxhu bxhuVarA = this.a.a(4);
                    try {
                        bpze bpzeVar = (bpze) bpzrVarB.p();
                        while (bpzeVar.moveToNext()) {
                            try {
                                bxhuVarA.c(3, bpzeVar.e());
                            } finally {
                            }
                        }
                        bpzeVar.close();
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
