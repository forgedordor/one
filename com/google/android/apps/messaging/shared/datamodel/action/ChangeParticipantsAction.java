package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ChangeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.axmb;
import defpackage.axmc;
import defpackage.aymo;
import defpackage.bbbd;
import defpackage.bbdl;
import defpackage.brvp;
import defpackage.bxkp;
import defpackage.byeb;
import defpackage.ciai;
import defpackage.cicm;
import defpackage.cicq;
import defpackage.cicr;
import defpackage.cogw;
import defpackage.cqce;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.emaf;
import defpackage.fcsu;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ChangeParticipantsAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final fcsu c;
    public final bxkp d;
    public final byeb e;
    public final bbdl f;
    public final fcsu g;
    public final fcsu h;
    private final cogw i;
    private final dqsn j;
    private final cicm k;
    public static final cqce a = cqce.g("BugleAction", "ChangeParticipantsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axmb();

    /* compiled from: PG */
    public interface a {
        axmc hB();
    }

    public ChangeParticipantsAction(fcsu fcsuVar, fcsu fcsuVar2, bxkp bxkpVar, byeb byebVar, bbdl bbdlVar, cogw cogwVar, dqsn dqsnVar, cicm cicmVar, fcsu fcsuVar3, fcsu fcsuVar4, Bundle bundle) {
        super(bundle, elgm.CHANGE_PARTICIPANTS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = bxkpVar;
        this.e = byebVar;
        this.f = bbdlVar;
        this.i = cogwVar;
        this.j = dqsnVar;
        this.k = cicmVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ChangeParticipantsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("ChangeParticipantsAction.executeAction");
        try {
            aymo aymoVar = this.v;
            String strL = aymoVar.l(RcsIntents.EXTRA_USER_ID);
            final long jE = aymoVar.e("rcs.intent.extra.sessionid", -1L);
            String strL2 = aymoVar.l(RcsIntents.EXTRA_REFERRER);
            if (strL2 == null) {
                strL2 = strL;
            }
            final int iB = aymoVar.b(RcsIntents.EXTRA_EVENT, -1);
            GroupInfo groupInfo = (GroupInfo) aymoVar.h(RcsIntents.EXTRA_GROUP_INFO);
            cicq cicqVarW = cicr.w();
            final int i = 0;
            cicqVarW.j(false);
            cicqVarW.p(false);
            cicqVarW.q(true);
            cicqVarW.w(emaf.GROUP_NOTIFICATION_VANILLA_RCS);
            cicqVarW.z(jE);
            if (groupInfo != null) {
                ((ciai) cicqVarW).a = Optional.of(groupInfo);
            }
            final ConversationIdType conversationIdTypeA = this.k.a(cicqVarW.D());
            if (conversationIdTypeA.b()) {
                a.r("No conversation found for incoming participant change.");
            } else {
                final brvp brvpVarF = bbbd.f(strL);
                switch (iB) {
                    case 50020:
                        i = BasePaymentResult.ERROR_REQUEST_FAILED;
                        break;
                    case 50021:
                        i = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                        break;
                }
                final long epochMilli = this.i.f().toEpochMilli();
                final String str = strL2;
                this.j.d("ChangeParticipantsAction#executeAction", new Runnable() { // from class: axma
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zAn;
                        String str2 = str;
                        ChangeParticipantsAction changeParticipantsAction = this.a;
                        axcy axcyVarD = changeParticipantsAction.f.d();
                        brvp brvpVarF2 = bbbd.f(str2);
                        fcsu fcsuVar = changeParticipantsAction.b;
                        String strJ = ((bbca) fcsuVar.b()).j(brvpVarF2);
                        boolean zA = ((aqmv) changeParticipantsAction.h.b()).a();
                        brvp brvpVar = brvpVarF;
                        if (zA) {
                            boolean zU = ((bbca) fcsuVar.b()).u(brvpVar, 2);
                            cqbd cqbdVarA = ChangeParticipantsAction.a.a();
                            cqbdVarA.I(true != zU ? "No matching contact found for user" : "User updated from contacts");
                            cqbdVarA.r();
                        } else {
                            brvpVarF2.v(strJ);
                            bxkp bxkpVar = changeParticipantsAction.d;
                            bxkpVar.e(brvpVarF2, 2);
                            bxkpVar.e(brvpVar, 2);
                        }
                        ConversationIdType conversationIdType = conversationIdTypeA;
                        int i2 = iB;
                        ParticipantsTable.BindData bindDataA = brvpVar.a();
                        if (i2 == 50021) {
                            zAn = ((bakt) changeParticipantsAction.c.b()).ai(bindDataA, conversationIdType, true);
                            if (zAn) {
                                cqbd cqbdVarC = ChangeParticipantsAction.a.c();
                                cqbdVarC.j(((bbcc) changeParticipantsAction.g.b()).a(bindDataA, true));
                                cqbdVarC.I("left");
                                cqbdVarC.c(conversationIdType);
                                cqbdVarC.r();
                            } else {
                                cqbd cqbdVarB = ChangeParticipantsAction.a.b();
                                cqbdVarB.I("Failed to remove");
                                cqbdVarB.j(((bbcc) changeParticipantsAction.g.b()).a(bindDataA, true));
                                cqbdVarB.I("from");
                                cqbdVarB.c(conversationIdType);
                                cqbdVarB.r();
                            }
                        } else {
                            zAn = ((bakt) changeParticipantsAction.c.b()).an(bindDataA, conversationIdType);
                            if (zAn) {
                                cqbd cqbdVarC2 = ChangeParticipantsAction.a.c();
                                fcsu fcsuVar2 = changeParticipantsAction.g;
                                cqbdVarC2.j(((bbcc) fcsuVar2.b()).a(brvpVarF2.a(), true));
                                cqbdVarC2.I("added");
                                cqbdVarC2.j(((bbcc) fcsuVar2.b()).a(bindDataA, true));
                                cqbdVarC2.I("to");
                                cqbdVarC2.c(conversationIdType);
                                cqbdVarC2.r();
                            } else {
                                cqbd cqbdVarB2 = ChangeParticipantsAction.a.b();
                                cqbdVarB2.I("Failed to add");
                                fcsu fcsuVar3 = changeParticipantsAction.g;
                                cqbdVarB2.j(((bbcc) fcsuVar3.b()).a(bindDataA, true));
                                cqbdVarB2.I("referred by");
                                cqbdVarB2.j(((bbcc) fcsuVar3.b()).a(brvpVarF2.a(), true));
                                cqbdVarB2.I("to");
                                cqbdVarB2.c(conversationIdType);
                                cqbdVarB2.r();
                            }
                        }
                        if (!zAn) {
                            cqbd cqbdVarB3 = ChangeParticipantsAction.a.b();
                            cqbdVarB3.I("Not inserting tombstone because of unsuccessful add/remove of participant.");
                            cqbdVarB3.r();
                        } else {
                            long j = jE;
                            long j2 = epochMilli;
                            int i3 = i;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bindDataA);
                            changeParticipantsAction.e.k(Optional.empty(), conversationIdType, axcyVarD, brvpVarF2.a(), arrayList, i3, j2, j);
                        }
                    }
                });
            }
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ChangeParticipants.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ChangeParticipantsAction(fcsu fcsuVar, fcsu fcsuVar2, bxkp bxkpVar, byeb byebVar, bbdl bbdlVar, cogw cogwVar, dqsn dqsnVar, cicm cicmVar, fcsu fcsuVar3, fcsu fcsuVar4, Parcel parcel) {
        super(parcel, elgm.CHANGE_PARTICIPANTS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = bxkpVar;
        this.e = byebVar;
        this.f = bbdlVar;
        this.i = cogwVar;
        this.j = dqsnVar;
        this.k = cicmVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
    }
}
