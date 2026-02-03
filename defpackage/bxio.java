package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxio extends dqpi {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bxip a;

    public bxio(bxip bxipVar) {
        this.a = bxipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        dqyd dqydVarC = dqsdVar.c();
        if (dqydVarC != null) {
            eieu eieuVarK = eiiy.k("TranscriptionChangeListener::onChangeInTransaction::update");
            try {
                String[] strArr = VmtTable.a;
                bvcy bvcyVar = new bvcy(VmtTable.a);
                bvcyVar.A("VmtTableChangeObserver#onChangeInTransaction-transcriptions2");
                bvcyVar.c((bvcn) new Function() { // from class: bxim
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = bxio.b;
                        return ((bvcm) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(VmtTable.c));
                bvcyVar.e(new Function() { // from class: bxin
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvdc bvdcVar = (bvdc) obj;
                        int i = bxio.b;
                        bvdcVar.c(aonp.VMT_STATUS_COMPLETE);
                        return bvdcVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekqh it = dqydVarC.e.iterator();
                while (it.hasNext()) {
                    bvcyVar.k((bvdb) ((dqyj) it.next()));
                }
                bxil bxilVar = new bxil(this.a.a);
                try {
                    bvco bvcoVar = (bvco) bvcyVar.b().p();
                    while (bvcoVar.moveToNext()) {
                        try {
                            String strC = bvcoVar.c();
                            ekrw ekrwVarO = bxilVar.a.o();
                            ekrwVarO.X(new ekrz("operation", String.class, false, false), "UPDATE");
                            ekrwVarO.X(new ekrz("table_type", Integer.class, false, false), 11);
                            ekrwVarO.X(new ekrz("item_id", String.class, false, false), strC);
                            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/observer/VmtTableContentChangeObserver$ClosableBatchScheduler", "queue", 165, "VmtTableContentChangeObserver.java")).q("Voice transcriptions change in transaction is observed. Queues work item.");
                            List list = bxilVar.b;
                            list.add(strC);
                            if (list.size() >= ((Integer) bxhi.a.e()).intValue()) {
                                bxilVar.a();
                            }
                        } finally {
                        }
                    }
                    bvcoVar.close();
                    bxilVar.a();
                    eieuVarK.close();
                } finally {
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
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
    }
}
