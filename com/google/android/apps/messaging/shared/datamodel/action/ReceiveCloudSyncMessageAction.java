package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.ajhd;
import defpackage.alre;
import defpackage.anuh;
import defpackage.auue;
import defpackage.axcy;
import defpackage.axtl;
import defpackage.axzl;
import defpackage.ayqa;
import defpackage.ayqd;
import defpackage.baqi;
import defpackage.bauh;
import defpackage.baxe;
import defpackage.bbca;
import defpackage.bbdl;
import defpackage.bveg;
import defpackage.cmuq;
import defpackage.cpjp;
import defpackage.cqca;
import defpackage.cqce;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveCloudSyncMessageAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final ajhd f;
    public final cmuq g;
    public final bveg h;
    public final fcsu i;
    public final fcsu j;
    public final anuh k;
    public final fcsu l;
    private final bbdl m;
    private final ayqd n;
    private final dqsn o;
    public static final cqce a = cqce.g("BugleDataModel", "ReceiveCloudSyncMessageAction");
    public static final Parcelable.Creator<Action<?>> CREATOR = new axzl();

    /* compiled from: PG */
    public interface a {
        ayqa bj();
    }

    public ReceiveCloudSyncMessageAction(fcsu<auue> fcsuVar, fcsu<bbca> fcsuVar2, fcsu<baxe> fcsuVar3, fcsu<baqi> fcsuVar4, bbdl bbdlVar, ajhd ajhdVar, cmuq cmuqVar, ayqd ayqdVar, bveg bvegVar, fcsu<cpjp> fcsuVar5, dqsn dqsnVar, fcsu<bauh> fcsuVar6, anuh anuhVar, fcsu<alre> fcsuVar7, Parcel parcel) {
        super(parcel, elgm.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.m = bbdlVar;
        this.f = ajhdVar;
        this.g = cmuqVar;
        this.n = ayqdVar;
        this.h = bvegVar;
        this.i = fcsuVar5;
        this.o = dqsnVar;
        this.j = fcsuVar6;
        this.k = anuhVar;
        this.l = fcsuVar7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReceiveCloudSyncMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        final axcy axcyVarD = this.m.d();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        this.o.d("ReceiveCloudSyncMessageAction.executeAction", new Runnable() { // from class: axzk
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                Parcelable[] parcelableArr;
                int i;
                axzk axzkVar = this;
                ReceiveCloudSyncMessageAction receiveCloudSyncMessageAction = axzkVar.a;
                Parcelable[] parcelableArrD = receiveCloudSyncMessageAction.v.D();
                int i2 = 0;
                while (i2 < parcelableArrD.length) {
                    Bundle bundle = (Bundle) parcelableArrD[i2];
                    String string = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                    MessageCoreData messageCoreDataV = TextUtils.isEmpty(string) ? null : ((baxe) receiveCloudSyncMessageAction.d.b()).v(string);
                    Set set = hashSet2;
                    Set set2 = hashSet;
                    if (messageCoreDataV == null) {
                        axcy axcyVar = axcyVarD;
                        int iE = axcyVar.e();
                        String string2 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.SENDER");
                        string2.getClass();
                        fcsu fcsuVar = receiveCloudSyncMessageAction.i;
                        brvp brvpVarF = bbbd.f(string2);
                        boolean zE = ((cpjp) fcsuVar.b()).e(brvpVarF.f);
                        ArrayList arrayList = new ArrayList();
                        cczv cczvVar = alvx.a;
                        ArrayList parcelableArrayList = ((Boolean) new alvq().get()).booleanValue() ? bundle.getParcelableArrayList("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS_MI") : null;
                        if (parcelableArrayList != null) {
                            int size = parcelableArrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                arrayList.add(receiveCloudSyncMessageAction.k.a(((alre) receiveCloudSyncMessageAction.l.b()).a((evwl) parcelableArrayList.get(i3))));
                                i3++;
                                parcelableArrD = parcelableArrD;
                            }
                            parcelableArr = parcelableArrD;
                        } else {
                            parcelableArr = parcelableArrD;
                            String[] stringArray = bundle.getStringArray("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS");
                            if (stringArray == null) {
                                throw new IllegalStateException("Other participants are null");
                            }
                            for (String str : stringArray) {
                                arrayList.add(bbbd.b(str));
                            }
                        }
                        String string3 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                        String string4 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.TEXT");
                        String string5 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.SUBJECT");
                        long j = bundle.getLong("com.google.android.apps.messaging.cloudsync.extra.TIME_RECEIVED_MS");
                        long j2 = bundle.getLong("com.google.android.apps.messaging.cloudsync.extra.TIME_SENT_MS");
                        boolean z = bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.INCOMING");
                        boolean z2 = !z || bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.READ");
                        boolean z3 = z2 || bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED");
                        if (bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.HAS_ATTACHMENTS")) {
                            i = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                            if (!z2 && !zE && receiveCloudSyncMessageAction.g.c(-1)) {
                                i = 104;
                            }
                        } else {
                            i = 100;
                        }
                        int i4 = i;
                        String string6 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.CORRELATION_ID");
                        boolean z4 = arrayList.size() > 1;
                        fcsu fcsuVar2 = receiveCloudSyncMessageAction.b;
                        auue auueVar = (auue) fcsuVar2.b();
                        eieu eieuVarK = eiiy.k("CloudSyncDatabaseOperations#getCloudSyncConversation");
                        try {
                            ecem.b();
                            ConversationIdType conversationIdTypeA = auue.a(auueVar.c(arrayList));
                            eieuVarK.close();
                            final bvdk bvdkVarG = ((baxe) receiveCloudSyncMessageAction.d.b()).G(conversationIdTypeA, brvpVarF.f, zE, z4);
                            if (conversationIdTypeA.b()) {
                                conversationIdTypeA = ((auue) fcsuVar2.b()).b(bvdkVarG, arrayList);
                            }
                            final ConversationIdType conversationIdType = conversationIdTypeA;
                            if (conversationIdType.b()) {
                                ReceiveCloudSyncMessageAction.a.r("Could not get or create cloud sync conversation");
                            } else {
                                SelfIdentityId selfIdentityIdF = axcyVar.f();
                                MessageCoreData messageCoreDataD = receiveCloudSyncMessageAction.h.d(string3, conversationIdType, z ? ((bbca) receiveCloudSyncMessageAction.c.b()).j(brvpVarF) : ((SelfIdentityIdImpl) selfIdentityIdF).a, selfIdentityIdF, string4, string5, j2, j, z3, z2, i4, string6);
                                ((bauh) receiveCloudSyncMessageAction.j.b()).a(messageCoreDataD);
                                final baqi baqiVar = (baqi) receiveCloudSyncMessageAction.e.b();
                                final MessageIdType messageIdTypeC = messageCoreDataD.C();
                                final long jO = messageCoreDataD.o();
                                eieuVarK = eiiy.k("ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata");
                                try {
                                    baqiVar.d(new Runnable() { // from class: baqd
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cqaz.h();
                                            final baqi baqiVar2 = baqiVar;
                                            final long j3 = jO;
                                            final ConversationIdType conversationIdType2 = conversationIdType;
                                            final MessageIdType messageIdType = messageIdTypeC;
                                            final bvdk bvdkVar = bvdkVarG;
                                            botm.m(conversationIdType2, new Consumer() { // from class: baqe
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj) {
                                                    long jX = ((bojh) obj).x();
                                                    long j4 = j3;
                                                    if (j4 > jX) {
                                                        bvdk bvdkVar2 = bvdkVar;
                                                        MessageIdType messageIdType2 = messageIdType;
                                                        baqiVar2.g(conversationIdType2, messageIdType2, Long.valueOf(j4), bvdkVar2, null, true);
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                        }
                                    }, "ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata", conversationIdType);
                                    eieuVarK.close();
                                    ajhd ajhdVar = receiveCloudSyncMessageAction.f;
                                    elof elofVar = (elof) elpg.b.createBuilder();
                                    elofVar.copyOnWrite();
                                    elpg elpgVar = (elpg) elofVar.instance;
                                    elpgVar.i = 2;
                                    elpgVar.c = 2 | elpgVar.c;
                                    boolean zCM = messageCoreDataD.cM();
                                    elofVar.copyOnWrite();
                                    elpg elpgVar2 = (elpg) elofVar.instance;
                                    elpgVar2.d |= 1073741824;
                                    elpgVar2.ag = zCM;
                                    ajhdVar.H(messageCoreDataD, iE, elofVar);
                                    set2.add(conversationIdType);
                                    if (z && !z2) {
                                        set.add(conversationIdType);
                                    }
                                    cqbd cqbdVarC = ReceiveCloudSyncMessageAction.a.c();
                                    cqbdVarC.I("Received message.");
                                    cqbdVarC.d(messageCoreDataD.C());
                                    cqbdVarC.u(',');
                                    cqbdVarC.c(messageCoreDataD.A());
                                    cqbdVarC.A("cloudSyncId", string3);
                                    cqbdVarC.r();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } else {
                        parcelableArr = parcelableArrD;
                        cqbd cqbdVarE = ReceiveCloudSyncMessageAction.a.e();
                        cqbdVarE.I("Message already added.");
                        cqbdVarE.A("cloudSyncId", string);
                        cqbdVarE.r();
                        if (((auue) receiveCloudSyncMessageAction.b.b()).e(string, bundle, messageCoreDataV)) {
                            ConversationIdType conversationIdTypeA2 = messageCoreDataV.A();
                            set2.add(conversationIdTypeA2);
                            set.add(conversationIdTypeA2);
                        }
                    }
                    i2++;
                    axzkVar = this;
                    parcelableArrD = parcelableArr;
                }
            }
        });
        axtl.d(4, this);
        this.n.g();
        cqca.b = false;
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveCloudSyncMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveCloudSyncMessageAction(fcsu<auue> fcsuVar, fcsu<bbca> fcsuVar2, fcsu<baxe> fcsuVar3, fcsu<baqi> fcsuVar4, bbdl bbdlVar, ajhd ajhdVar, cmuq cmuqVar, ayqd ayqdVar, bveg bvegVar, fcsu<cpjp> fcsuVar5, dqsn dqsnVar, fcsu<bauh> fcsuVar6, anuh anuhVar, fcsu<alre> fcsuVar7, Parcelable[] parcelableArr) {
        super(elgm.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.m = bbdlVar;
        this.f = ajhdVar;
        this.g = cmuqVar;
        this.n = ayqdVar;
        this.h = bvegVar;
        this.i = fcsuVar5;
        this.o = dqsnVar;
        this.j = fcsuVar6;
        this.k = anuhVar;
        this.l = fcsuVar7;
        this.v.H(parcelableArr);
    }
}
