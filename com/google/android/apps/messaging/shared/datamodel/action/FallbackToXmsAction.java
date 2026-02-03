package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.ains;
import defpackage.ajhd;
import defpackage.axnu;
import defpackage.axnv;
import defpackage.aymo;
import defpackage.aypb;
import defpackage.basd;
import defpackage.chwq;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqce;
import defpackage.dqsl;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.enyw;
import defpackage.eosc;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class FallbackToXmsAction extends Action<Void> {
    public final ains c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final cogw g;
    public final ajhd h;
    public final chwq i;
    public final dqsn j;
    public final eosc k;
    public static final cqce a = cqce.g("BugleDataModel", "FallbackToXmsAction");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axnu();

    /* compiled from: PG */
    public interface a {
        axnv hG();
    }

    public FallbackToXmsAction(ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, ajhd ajhdVar, chwq chwqVar, dqsn dqsnVar, fcsu fcsuVar3, eosc eoscVar, Parcel parcel) {
        super(parcel, elgm.FALLBACK_TO_XMS_ACTION);
        this.c = ainsVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.g = cogwVar;
        this.h = ajhdVar;
        this.i = chwqVar;
        this.j = dqsnVar;
        this.f = fcsuVar3;
        this.k = eoscVar;
    }

    public static int g(int i) {
        ejwl.a(aypb.a(i));
        if (i != 0) {
            return i == 4 ? 0 : 1;
        }
        throw null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("FallbackToXmsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("FallbackToXmsAction.executeAction");
        try {
            aymo aymoVar = this.v;
            final basd basdVarB = basd.b(aymoVar.f(), "rcs_message_id");
            final int i = new int[]{1, 2, 3, 4, 5}[aymoVar.a("rcs_fallback_reason")];
            ejwl.a(aypb.a(i));
            final enyw enywVar = enyw.values()[aymoVar.a("rcs_transport_type")];
            int iIntValue = ((Integer) this.j.a("FallbackToXmsAction#executeAction", new dqsl() { // from class: axnq
                @Override // defpackage.dqsl
                public final Object a(byeu byeuVar) {
                    int i2;
                    final FallbackToXmsAction fallbackToXmsAction = this.a;
                    fcsu fcsuVar = fallbackToXmsAction.e;
                    baxe baxeVar = (baxe) fcsuVar.b();
                    basd basdVar = basdVarB;
                    final MessageCoreData messageCoreDataX = baxeVar.x(basdVar);
                    if (messageCoreDataX == null) {
                        cqbd cqbdVarB = FallbackToXmsAction.a.b();
                        cqbdVarB.h(basdVar);
                        cqbdVarB.I("missing and it can't fallback to xMS.");
                        cqbdVarB.r();
                        return 0;
                    }
                    if (!messageCoreDataX.cX()) {
                        return 0;
                    }
                    ConversationIdType conversationIdTypeA = messageCoreDataX.A();
                    if (((bakt) fallbackToXmsAction.d.b()).ad(conversationIdTypeA)) {
                        cqbd cqbdVarA = FallbackToXmsAction.a.a();
                        cqbdVarA.I("Skipping rcs during sending fallback for RBM.");
                        cqbdVarA.c(conversationIdTypeA);
                        cqbdVarA.r();
                        byeuVar.a(0);
                    }
                    int iK = messageCoreDataX.k();
                    if (iK == 2 || iK == 11) {
                        cqbd cqbdVarE = FallbackToXmsAction.a.e();
                        cqbdVarE.I("Skipping fallback for message already delivered as rcs.");
                        cqbdVarE.c(conversationIdTypeA);
                        cqbdVarE.r();
                        byeuVar.a(0);
                    }
                    final int i3 = i;
                    final enyw enywVar2 = enywVar;
                    fallbackToXmsAction.h.t(basdVar, ((baxe) fcsuVar.b()).x(basdVar), 25, enywVar2);
                    chwq chwqVar = fallbackToXmsAction.i;
                    cogw cogwVar = fallbackToXmsAction.g;
                    int iG = FallbackToXmsAction.g(i3);
                    chwqVar.H(messageCoreDataX, iG, cogwVar.f().toEpochMilli());
                    if (i3 == 0) {
                        throw null;
                    }
                    int i4 = i3 - 1;
                    if (i4 != 1) {
                        i2 = 3;
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i2 = 4;
                            } else {
                                if (i4 != 4) {
                                    throw new IllegalArgumentException("Invalid fallback reason");
                                }
                                i2 = 5;
                            }
                        }
                    } else {
                        i2 = 2;
                    }
                    int i5 = iG == 0 ? 1 : 2;
                    ains ainsVar = fallbackToXmsAction.c;
                    ainsVar.e("Bugle.Fallback.Message.Succeeded.As", i5);
                    ainsVar.e("Bugle.Fallback.Message.Succeeded.Reason", i2);
                    fallbackToXmsAction.j.g(new dqsm() { // from class: axnr
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            return eiiy.k("logNsfToClearcut");
                        }
                    }, null, new Runnable() { // from class: axns
                        @Override // java.lang.Runnable
                        public final void run() {
                            final FallbackToXmsAction fallbackToXmsAction2 = fallbackToXmsAction;
                            aofc aofcVar = (aofc) fallbackToXmsAction2.f.b();
                            final MessageCoreData messageCoreData = messageCoreDataX;
                            eiju eijuVarE = aofcVar.e(messageCoreData.v());
                            final int i6 = i3;
                            final enyw enywVar3 = enywVar2;
                            auvh.h(eijuVarE.h(new ejvr() { // from class: axnt
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    Optional optional = (Optional) obj;
                                    boolean zIsEmpty = optional.isEmpty();
                                    MessageCoreData messageCoreData2 = messageCoreData;
                                    if (zIsEmpty) {
                                        ekrw ekrwVarJ = FallbackToXmsAction.b.j();
                                        ekrwVarJ.X(eksq.a, "BugleDataModel");
                                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction", "logNfsFallbackToClearCut", 183, "FallbackToXmsAction.java")).t("Missing self identity for message %s", messageCoreData2.F());
                                        return null;
                                    }
                                    enyw enywVar4 = enywVar3;
                                    int i7 = i6;
                                    FallbackToXmsAction fallbackToXmsAction3 = fallbackToXmsAction2;
                                    fallbackToXmsAction3.h.an(messageCoreData2, FallbackToXmsAction.g(i7), enywVar4, ((aoer) optional.get()).b(), 4);
                                    return null;
                                }
                            }, fallbackToXmsAction2.k));
                        }
                    });
                    return 1;
                }
            })).intValue();
            if (iIntValue > 0) {
                this.c.e("Bugle.Fallback.Conversation.Succeeded.Messages.Count", iIntValue);
            }
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
        return "Bugle.DataModel.Action.FallbackToXmsAction.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public FallbackToXmsAction(ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, ajhd ajhdVar, chwq chwqVar, dqsn dqsnVar, fcsu fcsuVar3, eosc eoscVar, basd basdVar, int i, enyw enywVar) {
        super(elgm.FALLBACK_TO_XMS_ACTION);
        this.c = ainsVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.g = cogwVar;
        this.h = ajhdVar;
        this.i = chwqVar;
        this.j = dqsnVar;
        this.f = fcsuVar3;
        this.k = eoscVar;
        cqaz.l(basdVar);
        basd.h(this.v.f(), "rcs_message_id", basdVar);
        this.v.r("rcs_fallback_reason", i - 1);
        this.v.r("rcs_transport_type", enywVar.h);
    }
}
