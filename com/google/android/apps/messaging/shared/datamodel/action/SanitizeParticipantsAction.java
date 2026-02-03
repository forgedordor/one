package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.aygb;
import defpackage.ayqk;
import defpackage.bbca;
import defpackage.bbce;
import defpackage.bbdl;
import defpackage.brvp;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SanitizeParticipantsAction extends Action<ekgb<ParticipantsTable.BindData>> implements Parcelable {
    public static final Parcelable.Creator<Action<ekgb<ParticipantsTable.BindData>>> CREATOR = new aygb();
    public final fcsu a;
    public final fcsu b;
    public final dqsn c;
    private final Context d;

    /* compiled from: PG */
    public interface a {
        ayqk bq();
    }

    public SanitizeParticipantsAction(Context context, fcsu<bbca> fcsuVar, fcsu<bbce> fcsuVar2, dqsn dqsnVar) {
        super(elgm.SANITIZE_PARTICIPANTS_ACTION);
        this.d = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SanitizeParticipantsAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarG = ((bbca) this.a.b()).g();
        int size = ekgbVarG.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVarG.get(i2);
            if (!bbdl.k(bindData) && !PhoneNumberUtils.compare(this.d, bindData.T(), bindData.V())) {
                ekfwVar.h(bindData);
            } else if (!bindData.T().startsWith("+") && bindData.V().startsWith("+")) {
                brvp brvpVarC = bindData.C();
                brvpVarC.I(bindData.V());
                ekfwVar.h(brvpVarC.a());
            }
        }
        final ekgb ekgbVarG2 = ekfwVar.g();
        if (!ekgbVarG2.isEmpty()) {
            this.c.d("SanitizeParticipantsAction#sanitizeParticipants", new Runnable() { // from class: ayga
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = 0;
                    while (true) {
                        ekgb ekgbVar = ekgbVarG2;
                        if (i3 >= ((ekoe) ekgbVar).c) {
                            return;
                        }
                        final SanitizeParticipantsAction sanitizeParticipantsAction = this.a;
                        final ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) ekgbVar.get(i3);
                        sanitizeParticipantsAction.c.d("SanitizeParticipantsAction#sanitizeParticipant", new Runnable() { // from class: ayfy
                            @Override // java.lang.Runnable
                            public final void run() {
                                bsbs bsbsVarF = ParticipantsTable.f();
                                bsbsVarF.al();
                                bsbsVarF.ap("sanitizeParticipant");
                                final ParticipantsTable.BindData bindData3 = bindData2;
                                bsbsVarF.B(bindData3.S());
                                bsbsVarF.n(bindData3.u());
                                bsbsVarF.v(bindData3.Q());
                                bsbsVarF.t(bindData3.P());
                                bsbsVarF.M(bindData3.x());
                                bsbsVarF.H(bindData3.T());
                                bsbsVarF.N(bindData3.V());
                                bsbsVarF.l(bindData3.N());
                                bsbsVarF.U(new Function() { // from class: ayfz
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsbx bsbxVar = (bsbx) obj;
                                        Parcelable.Creator<Action<ekgb<ParticipantsTable.BindData>>> creator = SanitizeParticipantsAction.CREATOR;
                                        bsbxVar.v(-2);
                                        bsbxVar.k(bindData3.R());
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bsbsVarF.F(bindData3.F());
                                bsbsVarF.J(bindData3.G());
                                bbax.a(bindData3).c(bsbsVarF);
                                boolean zBooleanValue = ((Boolean) ((cczi) bbcb.b.get()).e()).booleanValue();
                                SanitizeParticipantsAction sanitizeParticipantsAction2 = sanitizeParticipantsAction;
                                int iB = zBooleanValue ? ((bbce) sanitizeParticipantsAction2.b.b()).b(bsbsVarF, bbcx.e) : ((Boolean) ((cczi) bbcb.a.get()).e()).booleanValue() ? ((bbce) sanitizeParticipantsAction2.b.b()).a(bsbsVarF.b()) : bsbsVarF.b().a().size();
                                ((bbca) sanitizeParticipantsAction2.a.b()).p(iB, iB != 1 ? "Failed to sanitize participant." : "Successfully sanitized participants.");
                            }
                        });
                        i3++;
                    }
                }
            });
        }
        return ekgbVarG2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SanitizeParticipants.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SanitizeParticipantsAction(Context context, fcsu<bbca> fcsuVar, fcsu<bbce> fcsuVar2, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.SANITIZE_PARTICIPANTS_ACTION);
        this.d = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = dqsnVar;
    }
}
