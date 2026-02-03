package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aubq;
import defpackage.ayki;
import defpackage.aykj;
import defpackage.aymo;
import defpackage.barn;
import defpackage.bbdl;
import defpackage.bvus;
import defpackage.bvva;
import defpackage.bvvb;
import defpackage.bwvi;
import defpackage.cqce;
import defpackage.cqnc;
import defpackage.eieu;
import defpackage.eiid;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekcv;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateConversationEncryptionStatusAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final fcsu c;
    private final eosc e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    public static final cqce a = cqce.g("BugleDataModel", "UpdateConversationEncryptionStatusAction");
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/UpdateConversationEncryptionStatusAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayki();

    /* compiled from: PG */
    public interface a {
        aykj io();
    }

    public UpdateConversationEncryptionStatusAction(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, Parcel parcel) {
        super(parcel, elgm.UPDATE_CONVERSATION_OPEN_COUNT_ACTION);
        this.e = eoscVar;
        this.g = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.h = fcsuVar5;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateConversationEncryptionStatusAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        return eijx.f(new Runnable() { // from class: aykg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v();
            }
        }, eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        eiju eijuVarA;
        aymo aymoVar = this.v;
        eieu eieuVarK = eiiy.k("UpdateConversationEncryptionStatusAction#performTask");
        try {
            eieu eieuVarK2 = eiiy.k("UpdateConversationEncryptionStatusAction#performTaskForAllIdentities");
            try {
                final ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
                ArrayList arrayList = new ArrayList();
                eieu eieuVarK3 = eiiy.k("UpdateConversationEncryptionStatusAction#getLocalSelfIdentities");
                try {
                    Stream map = Collection.EL.stream(((bbdl) this.f.b()).g()).filter(new Predicate() { // from class: aykb
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
                        public final boolean test(Object obj) {
                            return !((axcy) obj).i();
                        }
                    }).map(new Function() { // from class: aykc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            axcy axcyVar = (axcy) obj;
                            int iE = axcyVar.e();
                            Optional optionalG = ((dghj) this.a.c.b()).g(iE);
                            if (optionalG.isEmpty()) {
                                ConversationIdType conversationIdType = conversationIdTypeB;
                                cqbd cqbdVarC = UpdateConversationEncryptionStatusAction.a.c();
                                cqbdVarC.I("Self identity is not RCS enabled, skipping conversation e2ee status update");
                                cqbdVarC.c(conversationIdType);
                                cqbdVarC.m(iE);
                                cqbdVarC.M("subscriptionName", axcyVar.g());
                                cqbdVarC.r();
                            }
                            return optionalG;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: aykd
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
                        public final boolean test(Object obj) {
                            return ((Optional) obj).isPresent();
                        }
                    }).map(new Function() { // from class: ayke
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((asqx) this.a.b.b()).c(((dggk) ((Optional) obj).get()).a);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = ekgb.d;
                    ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                    eieuVarK3.close();
                    if (ekgbVar.isEmpty()) {
                        ((bvus) this.h.b()).i(conversationIdTypeB, 0, bwvi.NO_RCS_IDENTITIES_AVAILABLE);
                        ekrw ekrwVarH = d.h();
                        ekrwVarH.X(eksq.a, "BugleE2eeEtouffee");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrdVar.X(cqnc.s, conversationIdTypeB);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/UpdateConversationEncryptionStatusAction", "downgradeEncryption", 239, "UpdateConversationEncryptionStatusAction.java")).q("No RCS identities. Disabling encryption for conversation.");
                        eijuVarA = eijx.e(null);
                    } else {
                        int size = ekgbVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            bvva bvvaVarA = ((bvvb) this.g.b()).a((aubq) ekgbVar.get(i2), conversationIdTypeB);
                            if (aymoVar.x("participants_added_list")) {
                                arrayList.add(bvvaVarA.b((ekgb) Collection.EL.stream(aymoVar.m("participants_added_list")).map(new Function() { // from class: ayka
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cqce cqceVar = UpdateConversationEncryptionStatusAction.a;
                                        return (aubq) ((evwl) obj).a(aubq.a, evrr.a());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(ekcv.a)));
                            } else {
                                arrayList.add(bvvaVarA.a());
                            }
                        }
                        eijuVarA = eijx.j(arrayList).a(eiid.l(new Callable() { // from class: aykh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }), this.e);
                    }
                    eieuVarK2.close();
                    eieuVarK.b(eijuVarA);
                    eieuVarK.close();
                    return eijuVarA.h(new ejvr() { // from class: aykf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return null;
                        }
                    }, this.e);
                } finally {
                }
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

    public UpdateConversationEncryptionStatusAction(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, ConversationIdType conversationIdType) {
        super(elgm.UPDATE_CONVERSATION_OPEN_COUNT_ACTION);
        this.e = eoscVar;
        this.g = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.h = fcsuVar5;
        this.v.v("conversation_id", conversationIdType.a());
    }
}
