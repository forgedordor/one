package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ains;
import defpackage.ajfo;
import defpackage.ajsn;
import defpackage.auuh;
import defpackage.axnh;
import defpackage.aymo;
import defpackage.aypk;
import defpackage.bakt;
import defpackage.bary;
import defpackage.baxe;
import defpackage.bojh;
import defpackage.bqkg;
import defpackage.bqkl;
import defpackage.brdp;
import defpackage.brdr;
import defpackage.bxgi;
import defpackage.bxgj;
import defpackage.bxna;
import defpackage.bydb;
import defpackage.cczi;
import defpackage.cdww;
import defpackage.cggc;
import defpackage.cggg;
import defpackage.chwq;
import defpackage.cmop;
import defpackage.cmqj;
import defpackage.cqbd;
import defpackage.cqca;
import defpackage.cqce;
import defpackage.crvx;
import defpackage.crwg;
import defpackage.dzfh;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.ekgb;
import defpackage.ekhv;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeleteMessageAction extends Action<Bundle> implements Parcelable {
    private final Context b;
    private final fcsu c;
    private final fcsu d;
    private final ains e;
    private final chwq f;
    private final bxna g;
    private final cmop h;
    private final cmqj i;
    private final ajfo j;
    private final cggc k;
    private final cggg l;
    private final bydb m;
    private final auuh n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private static final cqce a = cqce.g("BugleDataModel", "DeleteMessageAction");
    public static final Parcelable.Creator<Action<Bundle>> CREATOR = new axnh();

    /* compiled from: PG */
    public interface a {
        aypk aY();
    }

    public DeleteMessageAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, ains ainsVar, chwq chwqVar, bxna bxnaVar, cmop cmopVar, cmqj cmqjVar, ajfo ajfoVar, cggc cggcVar, cggg cgggVar, bydb bydbVar, auuh auuhVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, Parcel parcel) {
        super(parcel, elgm.DELETE_MESSAGE_ACTION);
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = ainsVar;
        this.f = chwqVar;
        this.g = bxnaVar;
        this.h = cmopVar;
        this.i = cmqjVar;
        this.j = ajfoVar;
        this.k = cggcVar;
        this.l = cgggVar;
        this.m = bydbVar;
        this.n = auuhVar;
        this.o = fcsuVar3;
        this.p = fcsuVar4;
        this.q = fcsuVar5;
    }

    private static Bundle h() {
        return j(false);
    }

    private static Bundle j(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success_extra", z);
        return bundle;
    }

    private final Bundle l(final List list, boolean z) {
        boolean z2;
        String strAj;
        ekhv ekhvVar = new ekhv();
        ekhvVar.j(list);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
        brdrVarD.f(new Function() { // from class: axnc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                return ((bran) obj).R;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: axnd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                brecVar.t(list);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final brdp brdpVarB = brdrVarD.b();
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
        brdrVarD2.c(MessagesTable.c.a);
        brdrVarD2.h(new Function() { // from class: axne
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                brecVar.G(brdpVarB);
                brecVar.y(list);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekhvVar.j(brdrVarD2.b().g());
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.A("+DeleteMessageAction#getMessageIdsWithReactions");
        bqkgVarA.c(bqkl.c.b);
        bqkgVarA.f(new Function() { // from class: axng
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqkk bqkkVar = (bqkk) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                bqkkVar.d(list);
                return bqkkVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekhvVar.j(bqkgVarA.b().f());
        ekgb ekgbVarG = ekhvVar.g().g();
        ekgb<MessageCoreData> ekgbVarL = ((baxe) this.c.b()).L(ekgbVarG);
        if (ekgbVarL.isEmpty()) {
            a.r("No messages retrieved to delete");
            return h();
        }
        ejxr ejxrVar = crvx.a;
        Runnable runnableA = ((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() ? ((crwg) this.q.b()).a(ekgbVarL) : null;
        this.m.k(ekgbVarL);
        ConversationIdType conversationIdTypeA = ((MessageCoreData) ekgbVarL.get(0)).A();
        int iB = ((cdww) this.d.b()).b(ekgbVarG, conversationIdTypeA);
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() && runnableA != null) {
            runnableA.run();
        }
        if (iB == ekgbVarL.size()) {
            ArrayList arrayList = new ArrayList();
            int size = ekgbVarL.size();
            for (int i = 0; i < size; i++) {
                MessageCoreData messageCoreData = (MessageCoreData) ekgbVarL.get(i);
                MessageIdType messageIdTypeC = messageCoreData.C();
                cqce cqceVar = a;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Deleted local");
                cqbdVarC.d(messageIdTypeC);
                cqbdVarC.r();
                if (messageCoreData.cY() && !messageCoreData.de()) {
                    this.e.c("Bugle.Rcs.Files.Transfer.Outgoing.Cancelled.Counts");
                }
                long jN = messageCoreData.n();
                if (jN != -1) {
                    this.f.v(jN);
                    cqbd cqbdVarC2 = cqceVar.c();
                    cqbdVarC2.I("Deleting file transfer from RCS engine.");
                    cqbdVarC2.z("rcsFileTransferSessionId", jN);
                    cqbdVarC2.r();
                }
                if (z && (strAj = messageCoreData.aj()) != null) {
                    arrayList.add(strAj);
                }
            }
            if (z) {
                this.n.b(this.b, (String[]) arrayList.toArray(new String[0]));
            }
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MessageCoreData messageCoreData2 : ekgbVarL) {
            cmop cmopVar = this.h;
            List listM = messageCoreData2.M();
            bxgi bxgiVarC = ((bxgj) cmopVar.a.b()).c(1);
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                Uri uriT = ((MessagePartCoreData) it.next()).t();
                if (uriT != null) {
                    cqca.l("Bugle", "Clearing cache for ".concat(uriT.toString()));
                    bxgiVarC.e(uriT.toString());
                }
            }
            Uri uriU = messageCoreData2.u();
            if (uriU != null) {
                arrayList2.add(uriU);
            } else {
                MessageIdType messageIdTypeC2 = messageCoreData2.C();
                cqbd cqbdVarC3 = a.c();
                cqbdVarC3.I("Local");
                cqbdVarC3.d(messageIdTypeC2);
                cqbdVarC3.I("has no telephony uri: Unable to delete from telephony.");
                cqbdVarC3.r();
            }
        }
        this.i.ae(arrayList2);
        boolean z3 = z2 | (ekgbVarL.size() == 0);
        bojh bojhVarR = ((bakt) this.p.b()).r(conversationIdTypeA);
        this.g.c(null, ((ajsn) this.o.b()).a(conversationIdTypeA, bojhVarR == null ? null : bojhVarR.ab(), bojhVarR != null && bojhVarR.an()));
        return j(z3);
    }

    private final dzfh m() {
        ArrayList arrayListF = this.v.F();
        return (arrayListF == null || arrayListF.size() == 1) ? ajfo.f : ajfo.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("DeleteMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        this.j.d(m());
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DeleteMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        ArrayList arrayList = new ArrayList();
        aymo aymoVar = this.v;
        MessageIdType messageIdTypeB = bary.b(aymoVar.l("message_id"));
        if (!messageIdTypeB.c()) {
            arrayList.add(messageIdTypeB);
        }
        ArrayList arrayListF = aymoVar.F();
        ArrayList arrayList2 = arrayListF == null ? null : (ArrayList) Collection.EL.stream(arrayListF).map(new Function() { // from class: axnf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                return bary.b((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: axnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            return l(arrayList, true);
        }
        String strL = aymoVar.l("cloud_sync_id");
        if (strL == null || TextUtils.isEmpty(strL)) {
            return h();
        }
        MessageCoreData messageCoreDataV = ((baxe) this.c.b()).v(strL);
        if (messageCoreDataV != null) {
            Bundle bundleL = l(Collections.singletonList(messageCoreDataV.C()), false);
            this.k.c();
            this.l.d();
            return bundleL;
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Cloud Message");
        cqbdVarE.A("cloudSyncId", strL);
        cqbdVarE.I("no longer exists.");
        cqbdVarE.r();
        return h();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object fS(Bundle bundle) {
        this.j.e(m());
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
