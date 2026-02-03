package com.google.android.apps.messaging.shared.datamodel.ditto.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.ditto.workers.PreUploadAttachmentsRecurringWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bvkr;
import defpackage.bvtd;
import defpackage.cczn;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.ejvr;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.qaq;
import defpackage.qbb;
import defpackage.qbq;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PreUploadAttachmentsRecurringWorker extends qaq {
    public static final Duration e = Duration.ofHours(8);
    public final Context f;
    private final eigp g;

    /* compiled from: PG */
    public interface a {
        bvtd aM();
    }

    /* compiled from: PG */
    public interface b {
        eigp b();

        bvkr bD();

        bvtd bE();

        cczn iu();

        eosc q();
    }

    public PreUploadAttachmentsRecurringWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = ((b) ehli.a(context, b.class)).b();
        this.f = context;
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        if (this.b.c.contains("pre_upload_attachments_recurring_worker")) {
            return eiju.g(((qbb) qbq.a(this.f).a("pre_upload_attachments_recurring_worker")).c).h(new ejvr() { // from class: bvtf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Duration duration = PreUploadAttachmentsRecurringWorker.e;
                    return new qam();
                }
            }, eoqg.a);
        }
        eieh eiehVarC = this.g.c("PreUploadAttachmentsRecurringWorker.startWork", "com/google/android/apps/messaging/shared/datamodel/ditto/workers/PreUploadAttachmentsRecurringWorker", "startWork", 84);
        try {
            final b bVar = (b) ehli.a(this.f, b.class);
            eiju eijuVarI = bVar.bD().h().h(new ejvr() { // from class: bvte
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    if (!optional.isPresent()) {
                        return bVar.bE();
                    }
                    PreUploadAttachmentsRecurringWorker preUploadAttachmentsRecurringWorker = this.a;
                    return ((PreUploadAttachmentsRecurringWorker.a) ehlh.a(preUploadAttachmentsRecurringWorker.f, PreUploadAttachmentsRecurringWorker.a.class, (efwo) optional.get())).aM();
                }
            }, eoqg.a).i(new eooz() { // from class: bvtg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final bvtd bvtdVar = (bvtd) obj;
                    bvtd.a.m("Pre-uploading conversations' attachments...");
                    if (!Collection.EL.stream((Set) bvtdVar.m.b()).allMatch(new Predicate() { // from class: bvta
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((bvmk) obj2).b();
                        }
                    })) {
                        return eijx.e(new qam());
                    }
                    eooy eooyVar = new eooy() { // from class: bvtb
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            final bvtd bvtdVar2;
                            ekgb ekgbVar;
                            boolean z;
                            ekgb ekgbVarCY;
                            bcvf bcvfVarN = bcvg.n();
                            int i = 1;
                            ((bbmq) bcvfVarN).b = true;
                            ekgb ekgbVarX = ((bcut) bcvfVarN.a().l().p()).x();
                            boolean z2 = false;
                            if (ekgbVarX.isEmpty()) {
                                bvtd.a.m("No conversations found to upload.");
                                return eijx.e(false);
                            }
                            ArrayList arrayList = new ArrayList();
                            int i2 = ((ekoe) ekgbVarX).c;
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                bvtdVar2 = bvtdVar;
                                if (i3 >= i2) {
                                    break;
                                }
                                final ConversationIdType conversationIdType = (ConversationIdType) ekgbVarX.get(i3);
                                if (bvtdVar2.h.a()) {
                                    baes baesVar = bvtdVar2.g;
                                    int i5 = bvtdVar2.j;
                                    ejwl.a(i5 >= 0 ? i : z2);
                                    bfsa bfsaVar = baesVar.a;
                                    brdr brdrVarD = MessagesTable.d();
                                    brao[] braoVarArr = new brao[i];
                                    bran branVar = MessagesTable.c;
                                    boolean z3 = z2;
                                    brao braoVar = branVar.a;
                                    braoVarArr[z3 ? 1 : 0] = braoVar;
                                    brdrVarD.c(braoVarArr);
                                    brdrVarD.h(new Function() { // from class: bfry
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            brec brecVar = (brec) obj2;
                                            int i6 = bfsa.a;
                                            brecVar.m(conversationIdType);
                                            return brecVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    brdo[] brdoVarArr = new brdo[2];
                                    brao braoVar2 = branVar.i;
                                    ekgbVar = ekgbVarX;
                                    z = z3 ? 1 : 0;
                                    brdoVarArr[z ? 1 : 0] = new brdo(braoVar2, z);
                                    brdoVarArr[1] = new brdo(braoVar, true);
                                    brdrVarD.d(brdoVarArr);
                                    brdrVarD.y(i5);
                                    ekgbVarCY = ((bfrj) bfsaVar.f(brdrVarD).b().p()).cY(new dqqd() { // from class: bvsx
                                        @Override // defpackage.dqqd
                                        public final Object a(Object obj2) {
                                            return bvtdVar2.d.b((bdxm) obj2);
                                        }
                                    });
                                } else {
                                    ekgbVar = ekgbVarX;
                                    z = z2;
                                    ekgbVarCY = ((bgvb) bvtdVar2.f.a(conversationIdType, bvtdVar2.j).p()).cY(new dqqd() { // from class: bvsy
                                        @Override // defpackage.dqqd
                                        public final Object a(Object obj2) {
                                            return bvtdVar2.d.d((bfsb) obj2);
                                        }
                                    });
                                }
                                if (ekgbVarCY.isEmpty()) {
                                    bvtd.a.m("No messages found to upload.");
                                    return eijx.e(false);
                                }
                                arrayList.addAll(ekgbVarCY);
                                int i6 = i4 + 1;
                                i3++;
                                if (i4 >= bvtdVar2.i) {
                                    break;
                                }
                                z2 = z;
                                i4 = i6;
                                ekgbVarX = ekgbVar;
                                i = 1;
                            }
                            if (!((Boolean) bvsl.b.e()).booleanValue()) {
                                bvtdVar2.b.e(arrayList, true).s();
                                return eijx.e(true);
                            }
                            return bvtdVar2.c.a(bvsl.b(arrayList, null), true, null, bvtdVar2.k, ((Boolean) cdip.a.e()).booleanValue() ? bvtdVar2.l : Optional.empty()).h(new ejvr() { // from class: bvsz
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    cqce cqceVar = bvtd.a;
                                    return true;
                                }
                            }, bvtdVar2.e);
                        }
                    };
                    eosc eoscVar = bvtdVar.e;
                    return eijx.h(eooyVar, eoscVar).h(new ejvr() { // from class: bvtc
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqbd cqbdVarD = bvtd.a.d();
                            cqbdVarD.I("Recurring task completed.");
                            cqbdVarD.A("success", (Boolean) obj2);
                            cqbdVarD.r();
                            return new qao();
                        }
                    }, eoscVar);
                }
            }, bVar.q());
            eiehVarC.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
