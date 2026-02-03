package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aika;
import defpackage.ajhd;
import defpackage.aqbh;
import defpackage.ayfb;
import defpackage.ayfc;
import defpackage.aypm;
import defpackage.bbdl;
import defpackage.bbfk;
import defpackage.bxna;
import defpackage.bydb;
import defpackage.cogw;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.eosc;
import defpackage.fcsu;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ResendMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    public final ajhd a;
    public final fcsu b;
    public final AtomicReference c;
    public final ayfc d;
    private final fcsu f;
    private final bbdl g;
    private final cogw h;
    private final bxna i;
    private final aika j;
    private final bbfk k;
    private final bydb l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final eosc p;
    private final aqbh q;
    private final fcsu r;
    private final fcsu s;
    private static final eksp e = eksp.c("BugleDataModel");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new ayfb();

    /* compiled from: PG */
    public interface a {
        aypm ba();
    }

    public ResendMessageAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, bbdl bbdlVar, cogw cogwVar, bxna bxnaVar, ajhd ajhdVar, aika aikaVar, bbfk bbfkVar, bydb bydbVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData, fcsu fcsuVar7, eosc eoscVar, aqbh aqbhVar, fcsu fcsuVar8, fcsu fcsuVar9, AtomicReference atomicReference, fcsu fcsuVar10) {
        super(elgm.RESEND_MESSAGE_ACTION);
        this.d = new ayfc();
        this.A = fcsuVar;
        this.B = fcsuVar3;
        this.f = fcsuVar2;
        this.g = bbdlVar;
        this.h = cogwVar;
        this.i = bxnaVar;
        this.a = ajhdVar;
        this.j = aikaVar;
        this.k = bbfkVar;
        this.l = bydbVar;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.b = fcsuVar7;
        this.p = eoscVar;
        this.q = aqbhVar;
        this.r = fcsuVar8;
        this.s = fcsuVar9;
        this.c = atomicReference;
        this.C = fcsuVar10;
        this.v.v("message_id", messageIdType.b());
        this.v.t("message_usage_stats_data", messageUsageStatisticsData);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ResendMessageAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01e2  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResendMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ResendMessageAction(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, bbdl bbdlVar, cogw cogwVar, bxna bxnaVar, ajhd ajhdVar, aika aikaVar, bbfk bbfkVar, bydb bydbVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, eosc eoscVar, aqbh aqbhVar, fcsu fcsuVar8, fcsu fcsuVar9, AtomicReference atomicReference, fcsu fcsuVar10, Parcel parcel) {
        super(parcel, elgm.RESEND_MESSAGE_ACTION);
        this.d = new ayfc();
        this.A = fcsuVar;
        this.B = fcsuVar3;
        this.f = fcsuVar2;
        this.g = bbdlVar;
        this.h = cogwVar;
        this.i = bxnaVar;
        this.a = ajhdVar;
        this.j = aikaVar;
        this.k = bbfkVar;
        this.l = bydbVar;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.b = fcsuVar7;
        this.p = eoscVar;
        this.q = aqbhVar;
        this.r = fcsuVar8;
        this.s = fcsuVar9;
        this.c = atomicReference;
        this.C = fcsuVar10;
    }
}
