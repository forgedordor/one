package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.ainv;
import defpackage.aipo;
import defpackage.alrj;
import defpackage.alvg;
import defpackage.alvx;
import defpackage.ayed;
import defpackage.ayqf;
import defpackage.bakt;
import defpackage.bopp;
import defpackage.bopr;
import defpackage.botb;
import defpackage.botm;
import defpackage.bvdk;
import defpackage.bxlc;
import defpackage.cczv;
import defpackage.cdzz;
import defpackage.cgfy;
import defpackage.cggb;
import defpackage.cggc;
import defpackage.cggg;
import defpackage.cmmo;
import defpackage.cmot;
import defpackage.cnqj;
import defpackage.cnqk;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.crmx;
import defpackage.crny;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekhx;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RemoveSelfNumberFromConversationsAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final bxlc e;
    private final crny f;
    private final crmx g;
    private final cmot h;
    private final aipo i;
    private final cggg j;
    private final cggc k;
    private final dqsn l;
    private final Context m;
    private final fcsu n;
    public static final cqce a = cqce.g("Bugle", "RemoveSelfNumberFromConversationsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayed();

    /* compiled from: PG */
    public interface a {
        ayqf bn();
    }

    public RemoveSelfNumberFromConversationsAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, crny crnyVar, crmx crmxVar, cmot cmotVar, aipo aipoVar, cggg cgggVar, cggc cggcVar, bxlc bxlcVar, dqsn dqsnVar, fcsu fcsuVar4, Context context, int i) {
        super(elgm.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = crnyVar;
        this.g = crmxVar;
        this.h = cmotVar;
        this.i = aipoVar;
        this.j = cgggVar;
        this.k = cggcVar;
        this.e = bxlcVar;
        this.l = dqsnVar;
        this.m = context;
        this.n = fcsuVar4;
        this.v.r("sub_id", i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("RemoveSelfNumberFromConversationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RemoveSelfNumberFromConversations.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        String str = "targetThreadId";
        int i = 1;
        Optional optionalI = this.f.h(this.v.b("sub_id", -1)).i(true);
        botb botbVarE = botm.e();
        botbVarE.A("RemoveSelfNumberFromConversationsAction#doBackgroundWork");
        botbVarE.s();
        bopp boppVar = botm.c;
        int i2 = 2;
        botbVarE.c(boppVar.a, boppVar.q, boppVar.E, boppVar.G, boppVar.F, boppVar.b);
        botbVarE.i(new Function() { // from class: ayec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                cqce cqceVar = RemoveSelfNumberFromConversationsAction.a;
                botlVar.j(1);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopr boprVar = (bopr) botbVarE.b().p();
        while (boprVar.moveToNext()) {
            try {
                final ConversationIdType conversationIdTypeH = boprVar.h();
                fcsu fcsuVar = this.b;
                List<ParticipantsTable.BindData> listK = ((bakt) fcsuVar.b()).K(conversationIdTypeH);
                if (listK.size() >= i2) {
                    crmx crmxVar = this.g;
                    HashSet hashSetC = crmxVar.C();
                    ekhx ekhxVarD = crmxVar.d();
                    int i3 = 0;
                    int i4 = 0;
                    for (ParticipantsTable.BindData bindData : listK) {
                        int i5 = i;
                        String strT = bindData.T();
                        fcsu fcsuVar2 = fcsuVar;
                        Optional optionalOf = Optional.of(((alrj) this.n.b()).q(bindData));
                        if (optionalOf.equals(optionalI)) {
                            i3 = i5;
                            i = i3;
                        } else {
                            cczv cczvVar = alvx.a;
                            if ((!((Boolean) new alvg().get()).booleanValue() || ekhxVarD.contains(optionalOf.get())) && (((Boolean) new alvg().get()).booleanValue() || hashSetC.contains(strT))) {
                                i = i5;
                            } else {
                                i4 = i5;
                                i = i4;
                            }
                        }
                        fcsuVar = fcsuVar2;
                    }
                    fcsu fcsuVar3 = fcsuVar;
                    int i6 = i;
                    if (i3 == 0 || i4 == 0) {
                        i = i6;
                        i2 = 2;
                    } else {
                        final bvdk bvdkVarJ = boprVar.j();
                        final boolean z = !boprVar.w();
                        final boolean z2 = !boprVar.x();
                        final String strR = boprVar.r();
                        cnqj cnqjVarK = boprVar.k();
                        ContentResolver contentResolver = this.m.getContentResolver();
                        final ArrayList arrayList = new ArrayList();
                        Iterator it = listK.iterator();
                        while (it.hasNext()) {
                            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it.next();
                            Iterator it2 = it;
                            if (!Optional.of(((alrj) this.n.b()).q(bindData2)).equals(optionalI)) {
                                arrayList.add(bindData2);
                            }
                            it = it2;
                        }
                        final long jD = this.h.d(arrayList);
                        if (jD < 0) {
                            a.r("failed to create thread.");
                        } else if (((bakt) fcsuVar3.b()).o(cmmo.b, jD).b()) {
                            ContentValues contentValues = new ContentValues(i6);
                            Long lValueOf = Long.valueOf(jD);
                            contentValues.put("thread_id", lValueOf);
                            aipo aipoVar = this.i;
                            ainv ainvVarB = aipoVar.b("Bugle.Telephony.Update.Sms.Thread.Latency");
                            int iB = cdzz.b(contentResolver, Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", new String[]{Long.toString(cnqk.a(cnqjVarK))});
                            ainvVarB.c();
                            cqce cqceVar = a;
                            cqbd cqbdVarC = cqceVar.c();
                            cqbdVarC.G(iB);
                            cqbdVarC.I("SMS moved.");
                            cqbdVarC.A("from threadId", cnqjVarK);
                            cqbdVarC.z(str, jD);
                            cqbdVarC.r();
                            ContentValues contentValues2 = new ContentValues(1);
                            contentValues2.put("thread_id", lValueOf);
                            ainv ainvVarB2 = aipoVar.b("Bugle.Telephony.Update.Mms.Thread.Latency");
                            int iB2 = cnqjVarK.c() ? cdzz.b(contentResolver, Telephony.Mms.CONTENT_URI, contentValues2, "thread_id=?", new String[]{Long.toString(cnqk.a(cnqjVarK))}) : 0;
                            ainvVarB2.c();
                            cqbd cqbdVarC2 = cqceVar.c();
                            cqbdVarC2.G(iB2);
                            cqbdVarC2.I("MMS moved.");
                            cqbdVarC2.A("from threadId", cnqjVarK);
                            cqbdVarC2.z(str, jD);
                            cqbdVarC2.r();
                            String str2 = str;
                            this.l.d("removeSelfNumberFromConversation", new Runnable() { // from class: ayeb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RemoveSelfNumberFromConversationsAction removeSelfNumberFromConversationsAction = this.a;
                                    bakt baktVar = (bakt) removeSelfNumberFromConversationsAction.b.b();
                                    baqz baqzVarZ = bara.z();
                                    baqzVarZ.x(new cnqj(jD));
                                    bvdk bvdkVar = bvdkVarJ;
                                    baqzVarZ.f(bvdkVar);
                                    baqzVarZ.p(arrayList);
                                    baqzVarZ.n(!z);
                                    baqzVarZ.o(!z2);
                                    ((bake) baqzVarZ).a = Optional.ofNullable(strR);
                                    baqzVarZ.k(false);
                                    baqzVarZ.l(false);
                                    ConversationIdType conversationIdTypeA = baktVar.j(baqzVarZ.y()).a();
                                    boolean zB = conversationIdTypeA.b();
                                    final ConversationIdType conversationIdType = conversationIdTypeH;
                                    if (zB) {
                                        cqbd cqbdVarE = RemoveSelfNumberFromConversationsAction.a.e();
                                        cqbdVarE.I("Unable to create target conversationId and move ");
                                        cqbdVarE.c(conversationIdType);
                                        cqbdVarE.r();
                                        return;
                                    }
                                    String[] strArr = MessagesTable.a;
                                    brdu brduVar = new brdu();
                                    brduVar.ap("moveMessageToNewConversationLocally-messages");
                                    brduVar.n(conversationIdTypeA);
                                    brduVar.X(new Function() { // from class: ayea
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            brec brecVar = (brec) obj;
                                            cqce cqceVar2 = RemoveSelfNumberFromConversationsAction.a;
                                            brecVar.m(conversationIdType);
                                            return brecVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int iE = brduVar.b().e();
                                    cqce cqceVar2 = RemoveSelfNumberFromConversationsAction.a;
                                    cqbd cqbdVarC3 = cqceVar2.c();
                                    cqbdVarC3.G(iE);
                                    cqbdVarC3.I("messages moved from");
                                    cqbdVarC3.b(iE);
                                    cqbdVarC3.I("to target");
                                    cqbdVarC3.c(conversationIdTypeA);
                                    cqbdVarC3.r();
                                    String[] strArr2 = PartsTable.a;
                                    bsjh bsjhVar = new bsjh();
                                    bsjhVar.ap("moveMessageToNewConversationLocally-parts");
                                    bsjhVar.k(conversationIdTypeA);
                                    bsjl bsjlVar = new bsjl();
                                    bsjlVar.i(conversationIdType);
                                    bsjhVar.C(bsjlVar);
                                    bsjhVar.b().e();
                                    if (!((cdww) removeSelfNumberFromConversationsAction.d.b()).g(conversationIdType)) {
                                        ((baqi) removeSelfNumberFromConversationsAction.c.b()).a(conversationIdType, true, bvdkVar);
                                        cqceVar2.r("Source conversation not empty.");
                                    }
                                    ((baqi) removeSelfNumberFromConversationsAction.c.b()).b(conversationIdTypeA, true, bvdkVar);
                                    bxlc bxlcVar = removeSelfNumberFromConversationsAction.e;
                                    bxlcVar.k(conversationIdType);
                                    bxlcVar.k(conversationIdTypeA);
                                }
                            });
                            cggc cggcVar = this.k;
                            cgfy cgfyVar = (cgfy) cggb.a.createBuilder();
                            cgfyVar.copyOnWrite();
                            cggb.a((cggb) cgfyVar.instance);
                            cggcVar.d((cggb) cgfyVar.build());
                            this.j.d();
                            str = str2;
                            i2 = 2;
                            i = 1;
                        } else {
                            a.r("thread without current self already exists.");
                        }
                        i = i6;
                        i2 = 2;
                    }
                }
            } finally {
            }
        }
        boprVar.close();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RemoveSelfNumberFromConversationsAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, crny crnyVar, crmx crmxVar, cmot cmotVar, aipo aipoVar, cggg cgggVar, cggc cggcVar, bxlc bxlcVar, dqsn dqsnVar, fcsu fcsuVar4, Context context, Parcel parcel) {
        super(parcel, elgm.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = crnyVar;
        this.g = crmxVar;
        this.h = cmotVar;
        this.i = aipoVar;
        this.j = cgggVar;
        this.k = cggcVar;
        this.e = bxlcVar;
        this.l = dqsnVar;
        this.m = context;
        this.n = fcsuVar4;
    }
}
