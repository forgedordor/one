package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.alqk;
import defpackage.alqm;
import defpackage.alrj;
import defpackage.axya;
import defpackage.axyb;
import defpackage.axyc;
import defpackage.aypx;
import defpackage.baxe;
import defpackage.baxh;
import defpackage.botb;
import defpackage.botm;
import defpackage.brap;
import defpackage.brdo;
import defpackage.brdr;
import defpackage.bveg;
import defpackage.cjpo;
import defpackage.cqnc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekcv;
import defpackage.ekhx;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessPendingRevocationsAction extends Action<Void> implements Parcelable {
    public final aypx a;
    public final fcsu b;
    private final fcsu d;
    private final fcsu e;
    private static final eksp c = eksp.c("BugleRcs");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axyb();

    /* compiled from: PG */
    public interface a {
        axyc hX();
    }

    public ProcessPendingRevocationsAction(fcsu fcsuVar, aypx aypxVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(elgm.PROCESS_PENDING_REVOCATIONS_ACTION);
        this.d = fcsuVar;
        this.a = aypxVar;
        this.e = fcsuVar2;
        this.b = fcsuVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessPendingRevocationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("ProcessPendingRevocationsAction.executeAction");
        try {
            v();
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessPendingRevocations.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        baxe baxeVar = (baxe) this.d.b();
        Set setI = ((cjpo) this.e.b()).i();
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getMessagesPendingRevocation");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getMessagesPendingRevocation");
            brdrVarD.h(new Function() { // from class: bavc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.L(3);
                    int iIntValue = MessagesTable.g().intValue();
                    if (iIntValue < 41040) {
                        dqru.x("rcs_message_id_with_text_type", iIntValue);
                    }
                    brecVar.ap(new dqpn("messages.rcs_message_id_with_text_type", 6));
                    brecVar.ae(15);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final ekhx ekhxVar = (ekhx) Collection.EL.stream(setI).map(new Function() { // from class: bave
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aubq) obj).d;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(ekcv.b);
            brdrVarD.h(new Function() { // from class: bavf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.X(ekhxVar);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.d(new brdo(MessagesTable.c.i, true));
            botb botbVarE = botm.e();
            botbVarE.g(new Function() { // from class: bavg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = baxe.a;
                    return ((bopp) obj).y;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.i(new Function() { // from class: bavh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    cqce cqceVar = baxe.a;
                    botlVar.ap(new dqpk("conversations._id", 1, MessagesTable.c.b));
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.n(botbVarE.b(), "normalized_destination_expression");
            brap brapVar = (brap) brdrVarD.b().p();
            try {
                ArrayList<baxh> arrayList = new ArrayList();
                while (brapVar.moveToNext()) {
                    MessageCoreData messageCoreDataA = ((bveg) baxeVar.e.b()).a();
                    messageCoreDataA.aO(brapVar);
                    arrayList.add(new baxh(messageCoreDataA, ((alrj) baxeVar.d.b()).r(brapVar.de("normalized_destination_expression"))));
                }
                brapVar.close();
                eieuVarK.close();
                eiju eijuVarE = eijx.e(true);
                for (final baxh baxhVar : arrayList) {
                    alqm alqmVar = baxhVar.b;
                    if (alqmVar.e().isEmpty()) {
                        eksl ekslVar = (eksl) c.j();
                        ekslVar.X(cqnc.e, baxhVar.a.F().f());
                        ekslVar.X(cqnc.q, ((alqk) alqmVar).o());
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingRevocationsAction", "processMessagePendingRevokes", 136, "ProcessPendingRevocationsAction.java")).q("Skipping revocation for message with invalid remote destination");
                    } else {
                        eijuVarE = eijuVarE.i(new eooz() { // from class: axxz
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                if (!((Boolean) obj).booleanValue()) {
                                    return eijx.e(false);
                                }
                                baxh baxhVar2 = baxhVar;
                                chvm chvmVar = (chvm) this.a.b.b();
                                return auvw.c(chvmVar.c, fcyi.a, fdjz.a, new chvh(chvmVar, baxhVar2.a, baxhVar2.b, null));
                            }
                        }, eoqg.a);
                    }
                }
                return eijuVarE.h(new axya(this), eoqg.a);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessPendingRevocationsAction(fcsu fcsuVar, aypx aypxVar, fcsu fcsuVar2, fcsu fcsuVar3, Parcel parcel) {
        super(parcel, elgm.PROCESS_PENDING_REVOCATIONS_ACTION);
        this.d = fcsuVar;
        this.a = aypxVar;
        this.e = fcsuVar2;
        this.b = fcsuVar3;
    }
}
