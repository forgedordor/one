package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aijz;
import defpackage.ajfo;
import defpackage.auue;
import defpackage.auuh;
import defpackage.avnq;
import defpackage.axmz;
import defpackage.ayoy;
import defpackage.bahv;
import defpackage.bakt;
import defpackage.baxe;
import defpackage.bbfn;
import defpackage.bxjh;
import defpackage.bxlc;
import defpackage.cdww;
import defpackage.cgoq;
import defpackage.cgpi;
import defpackage.chwq;
import defpackage.cmop;
import defpackage.cmqj;
import defpackage.cokd;
import defpackage.cqce;
import defpackage.cqdn;
import defpackage.crwg;
import defpackage.crwr;
import defpackage.cryo;
import defpackage.csiw;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.elka;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeleteConversationAction extends Action<Void> implements Parcelable {
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    public final fcsu a;
    private final Context d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final aijz j;
    private final chwq k;
    private final Optional l;
    private final cmqj m;
    private final cmop n;
    private final ajfo o;
    private final bxlc p;
    private final bbfn q;
    private final bahv r;
    private final auuh s;
    private static final cqce b = cqce.g("BugleDataModel", "DeleteConversationAction");
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/DeleteConversationAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axmz();

    /* compiled from: PG */
    public interface a {
        ayoy aR();
    }

    public DeleteConversationAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, aijz aijzVar, chwq chwqVar, Optional optional, cmqj cmqjVar, fcsu fcsuVar7, cmop cmopVar, ajfo ajfoVar, bxlc bxlcVar, bbfn bbfnVar, bahv bahvVar, auuh auuhVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, Parcel parcel) {
        super(parcel, elgm.DELETE_CONVERSATION_ACTION);
        this.d = context;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = aijzVar;
        this.k = chwqVar;
        this.l = optional;
        this.m = cmqjVar;
        this.a = fcsuVar7;
        this.n = cmopVar;
        this.o = ajfoVar;
        this.p = bxlcVar;
        this.q = bbfnVar;
        this.r = bahvVar;
        this.s = auuhVar;
        this.A = fcsuVar8;
        this.B = fcsuVar6;
        this.C = fcsuVar9;
        this.D = fcsuVar10;
        this.E = fcsuVar11;
        this.F = fcsuVar12;
        this.G = fcsuVar13;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("DeleteConversationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DeleteConversation.ExcuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle fP() {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.DeleteConversationAction.fP():android.os.Bundle");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public DeleteConversationAction(Context context, fcsu<cdww> fcsuVar, fcsu<auue> fcsuVar2, fcsu<bakt> fcsuVar3, fcsu<baxe> fcsuVar4, fcsu<cokd> fcsuVar5, fcsu<bxjh> fcsuVar6, aijz aijzVar, chwq chwqVar, Optional<cqdn> optional, cmqj cmqjVar, fcsu<avnq> fcsuVar7, cmop cmopVar, ajfo ajfoVar, bxlc bxlcVar, bbfn bbfnVar, bahv bahvVar, auuh auuhVar, fcsu<Optional<csiw>> fcsuVar8, fcsu<cgpi> fcsuVar9, fcsu<cgoq> fcsuVar10, fcsu<cryo> fcsuVar11, fcsu<crwr> fcsuVar12, fcsu<crwg> fcsuVar13, ConversationIdType conversationIdType, long j, SuperSortLabel superSortLabel, elka elkaVar, boolean z) {
        super(elgm.DELETE_CONVERSATION_ACTION);
        this.d = context;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = aijzVar;
        this.k = chwqVar;
        this.l = optional;
        this.m = cmqjVar;
        this.a = fcsuVar7;
        this.n = cmopVar;
        this.o = ajfoVar;
        this.p = bxlcVar;
        this.q = bbfnVar;
        this.r = bahvVar;
        this.s = auuhVar;
        this.A = fcsuVar8;
        this.C = fcsuVar9;
        this.D = fcsuVar10;
        this.E = fcsuVar11;
        this.F = fcsuVar12;
        this.G = fcsuVar13;
        if (!conversationIdType.b()) {
            this.v.v("conversation_id", conversationIdType.a());
        }
        this.v.s("cutoff_timestamp", j);
        this.v.r("conversation_origin", elkaVar == null ? -1 : elkaVar.u);
        this.v.p("conversation_only_if_empty", z);
        this.v.r("supersort_filter", superSortLabel.i);
        this.B = fcsuVar6;
    }
}
