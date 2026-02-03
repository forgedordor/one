package com.google.android.apps.messaging.shared.datamodel.action;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ains;
import defpackage.avmp;
import defpackage.axsn;
import defpackage.aylz;
import defpackage.aypg;
import defpackage.aypj;
import defpackage.aypn;
import defpackage.cgbn;
import defpackage.cggc;
import defpackage.cogw;
import defpackage.cqce;
import defpackage.cqtf;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrg;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.evvp;
import defpackage.fcsu;
import defpackage.febt;
import defpackage.fhaz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class NoConfirmationMessageSendAction extends Action<Void> implements Parcelable {
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    public final fcsu a;
    private final cgbn e;
    private final aypg f;
    private final fcsu g;
    private final fcsu h;
    private final Context i;
    private final avmp j;
    private final fcsu k;
    private final ains l;
    private final cggc m;
    private final aypj n;
    private final fcsu o;
    private final fcsu p;
    private final cogw q;
    private final fcsu r;
    private final fcsu s;
    private static final eksp b = eksp.c("BugleNotifications");
    private static final cqce c = cqce.g("Bugle", "NoConfirmationMessageSendAction");
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/NoConfirmationMessageSendAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axsn();

    /* compiled from: PG */
    public interface a {
        aypn bb();
    }

    /* compiled from: PG */
    public interface b {
        aypg aV();

        aypj aX();

        cgbn bY();
    }

    public NoConfirmationMessageSendAction(Context context, fcsu fcsuVar, avmp avmpVar, fcsu fcsuVar2, ains ainsVar, fcsu fcsuVar3, fcsu fcsuVar4, cggc cggcVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, cogw cogwVar, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        super(elgm.NO_CONFIRMATION_MESSAGE_SEND_ACTION);
        this.s = fcsuVar;
        this.A = fcsuVar11;
        b bVar = (b) cqtf.a(b.class);
        this.e = bVar.bY();
        this.f = bVar.aV();
        this.r = fcsuVar8;
        this.i = context;
        this.j = avmpVar;
        this.k = fcsuVar2;
        this.l = ainsVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.m = cggcVar;
        this.a = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.q = cogwVar;
        this.D = fcsuVar10;
        this.n = bVar.aX();
        this.B = fcsuVar9;
        this.C = fcsuVar12;
    }

    private static String h(Intent intent, String str) {
        Bundle resultsFromIntent;
        CharSequence charSequence;
        String stringExtra = intent.getStringExtra(str);
        return (stringExtra != null || (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) == null || (charSequence = resultsFromIntent.getCharSequence(str)) == null) ? stringExtra : charSequence.toString();
    }

    private final void j(fhaz fhazVar, evvp evvpVar, febt febtVar) {
        ((aylz) this.o.b()).b(fhazVar, null, 10, 21, 44, Optional.of(febtVar), evvpVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("NoConfirmationMessageSendAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0503 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e7  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.NoConfirmationMessageSend.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public NoConfirmationMessageSendAction(Context context, fcsu fcsuVar, avmp avmpVar, fcsu fcsuVar2, ains ainsVar, fcsu fcsuVar3, fcsu fcsuVar4, cggc cggcVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, cogw cogwVar, fcsu fcsuVar12, Parcel parcel) {
        super(parcel, elgm.NO_CONFIRMATION_MESSAGE_SEND_ACTION);
        this.s = fcsuVar;
        this.A = fcsuVar11;
        b bVar = (b) cqtf.a(b.class);
        this.e = bVar.bY();
        this.f = bVar.aV();
        this.r = fcsuVar8;
        this.i = context;
        this.j = avmpVar;
        this.k = fcsuVar2;
        this.l = ainsVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.m = cggcVar;
        this.a = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.q = cogwVar;
        this.D = fcsuVar12;
        this.n = bVar.aX();
        this.B = fcsuVar9;
        this.C = fcsuVar10;
    }
}
