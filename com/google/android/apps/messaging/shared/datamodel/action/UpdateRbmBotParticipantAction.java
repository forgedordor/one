package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.ayky;
import defpackage.aykz;
import defpackage.aymo;
import defpackage.bakt;
import defpackage.bbca;
import defpackage.bxlc;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateRbmBotParticipantAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayky();
    public final fcsu a;
    public final dqsn b;
    private final fcsu c;
    private final bxlc d;

    /* compiled from: PG */
    public interface a {
        aykz ir();
    }

    public UpdateRbmBotParticipantAction(fcsu fcsuVar, fcsu fcsuVar2, bxlc bxlcVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_RBM_BOT_PARTICIPANT_ACTION);
        this.a = fcsuVar;
        this.c = fcsuVar2;
        this.d = bxlcVar;
        this.b = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateRbmBotParticipantAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        String strL = aymoVar.l("rbmBotId");
        final String strL2 = aymoVar.l("updatedName");
        final ParticipantColor participantColorB = ParticipantColor.b(aymoVar.l("updatedColor"));
        final ParticipantsTable.BindData bindDataD = ((bbca) this.a.b()).d(strL);
        bindDataD.getClass();
        final String strR = bindDataD.R();
        if (TextUtils.equals(bindDataD.O(), strL2) && bindDataD.n() == participantColorB.c) {
            return null;
        }
        this.b.d("UpdateRbmBotParticipantAction.executeAction", new Runnable() { // from class: aykx
            @Override // java.lang.Runnable
            public final void run() {
                final UpdateRbmBotParticipantAction updateRbmBotParticipantAction = this.a;
                final String str = strL2;
                final ParticipantsTable.BindData bindData = bindDataD;
                ((Boolean) updateRbmBotParticipantAction.b.c("UpdateRbmBotParticipantAction#updateParticipantDisplayDestination", new ejxr() { // from class: aykv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        bsbs bsbsVarF = ParticipantsTable.f();
                        bsbsVarF.ap("updateParticipantDisplayDestination");
                        bsbsVarF.r(str);
                        final ParticipantsTable.BindData bindData2 = bindData;
                        bsbsVarF.U(new Function() { // from class: aykw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                Parcelable.Creator<Action<Void>> creator = UpdateRbmBotParticipantAction.CREATOR;
                                bsbxVar.r(bindData2.T());
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int iE = bsbsVarF.b().e();
                        ((bbca) updateRbmBotParticipantAction.a.b()).p(iE, iE != 1 ? "Failed to update participant's display destination." : "Successfully updated participants's display destination.");
                        return Boolean.valueOf(iE == 1);
                    }
                })).booleanValue();
                ((bbca) updateRbmBotParticipantAction.a.b()).q(strR, participantColorB);
            }
        });
        ((bakt) this.c.b()).R(strR);
        this.d.b();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateRbmBotParticipant.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
