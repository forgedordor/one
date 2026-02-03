package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqum implements dqtz {
    final /* synthetic */ dqsy a;
    final /* synthetic */ ekgb b;
    final /* synthetic */ dqsd c;

    public dqum(dqsy dqsyVar, ekgb ekgbVar, dqsd dqsdVar) {
        this.a = dqsyVar;
        this.b = ekgbVar;
        this.c = dqsdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqtz
    public final void a(boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i2 >= ((ekoe) ekgbVar).c) {
                return;
            }
            ekgb ekgbVar2 = (ekgb) ekgbVar.get(i2);
            int size = ekgbVar2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size) {
                    dqwf dqwfVar = (dqwf) ekgbVar2.get(i3);
                    if (z) {
                        final dqsd dqsdVar = this.c;
                        dqsy dqsyVar = this.a;
                        final dqwl dqwlVarC = dqwfVar.c();
                        List listD = dqwfVar.d();
                        final dqpi dqpiVarB = dqwfVar.b();
                        final List listUnmodifiableList = DesugarCollections.unmodifiableList(listD);
                        dqwl.F(new Supplier() { // from class: dqvk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                dqpi dqpiVar = dqpiVarB;
                                try {
                                    dqpiVar.e(dqwlVarC, dqsdVar, ekis.j(listUnmodifiableList));
                                    return null;
                                } catch (Throwable th) {
                                    ((ekrd) ((ekrd) dqwl.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPost", 1052, "QueryBase.java")).t("got exception invoking onChangeInTransactionWithObject on %s", dqpiVar);
                                    throw th;
                                }
                            }
                        });
                        ekrd ekrdVar = (ekrd) dqwl.c.a(dqwl.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPost", 1058, "QueryBase.java");
                        dqwv dqwvVar = dqwlVarC.e;
                        dqoy dqoyVar = (dqoy) dqwvVar;
                        ekrdVar.I("onChangeInTransactionWithObject: table: %s; loggingTag: %s; listener: %s", dqwl.aa(dqoyVar.a), String.valueOf(dqoyVar.t), dqpiVarB.getClass().getName());
                        String strValueOf = String.valueOf(dqpiVarB.h);
                        dqsyVar.B(strValueOf, new Runnable() { // from class: dqvl
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((Map) dqwl.a.get()).remove(dqpiVarB);
                            }
                        });
                        dqsyVar.B(strValueOf, new Runnable() { // from class: dqvm
                            @Override // java.lang.Runnable
                            public final void run() {
                                final dqwl dqwlVar = dqwlVarC;
                                final dqpi dqpiVar = dqpiVarB;
                                dqwl.F(new Supplier() { // from class: dqvc
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        ekrd ekrdVar2 = (ekrd) dqwl.c.a(dqwl.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "invokeInTransactionAndPostTransaction", 1078, "QueryBase.java");
                                        dqwl dqwlVar2 = dqwlVar;
                                        String str = ((dqoy) dqwlVar2.e).a;
                                        dqpi dqpiVar2 = dqpiVar;
                                        ekrdVar2.B("onChangeAfterTransactionWithObject: table: %s; cl: %s", dqwl.aa(str), dqpiVar2.h);
                                        try {
                                            dqpiVar2.ga(dqwlVar2);
                                            return null;
                                        } catch (Throwable th) {
                                            ((ekrd) ((ekrd) dqwl.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "invokeInTransactionAndPostTransaction", 1085, "QueryBase.java")).t("got exception invoking onChangeAfterTransactionWithObject on %s", dqpiVar2);
                                            return null;
                                        }
                                    }
                                });
                            }
                        });
                    } else {
                        dqwfVar.d().set(dqwfVar.a(), null);
                    }
                    i3++;
                }
            }
            i2 = i;
        }
    }
}
