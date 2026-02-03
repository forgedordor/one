package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentUris;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.aipo;
import defpackage.axyq;
import defpackage.axyr;
import defpackage.aymo;
import defpackage.ayqd;
import defpackage.baxe;
import defpackage.bxlc;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cggc;
import defpackage.cmof;
import defpackage.cmqf;
import defpackage.cmqj;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.crny;
import defpackage.ekpg;
import defpackage.elgm;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessTelephonyChangeAction extends ThrottledAction implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    private static final UriMatcher d;
    private final fcsu e;
    private final fcsu f;
    private final crny g;
    private final cggc h;
    private final bxlc i;
    private final fcsu j;
    private final fcsu k;
    private static final cqce c = cqce.g("BugleDataModel", "ProcessTelephonyChangeAction");
    static final cczi a = cdag.e(cdag.b, "process_telephony_change_full_sync_threshold", 5);
    static final cczi b = cdag.f(cdag.b, "process_telephony_change_spot_sync_age_limit_during_full_sync_millis", 3600000);

    /* compiled from: PG */
    public interface a {
        axyr ia();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("sms", "#", 0);
        uriMatcher.addURI("sms", "inbox/#", 1);
        uriMatcher.addURI("sms", "sent/#", 2);
        uriMatcher.addURI("sms", "outbox/#", 3);
        uriMatcher.addURI("sms", "failed/#", 4);
        uriMatcher.addURI("mms", "#", 10);
        uriMatcher.addURI("mms", "inbox/#", 11);
        uriMatcher.addURI("mms", "sent/#", 12);
        uriMatcher.addURI("mms", "outbox/#", 13);
        CREATOR = new axyq();
    }

    public ProcessTelephonyChangeAction(Context context, fcsu<baxe> fcsuVar, fcsu<cmqf> fcsuVar2, crny crnyVar, aipo aipoVar, ayqd ayqdVar, cggc cggcVar, bxlc bxlcVar, cmof cmofVar, fcsu<cmqj> fcsuVar3, fcsu<cogw> fcsuVar4, Uri uri) {
        super(elgm.PROCESS_TELEPHONY_CHANGE_ACTION);
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = crnyVar;
        this.h = cggcVar;
        this.i = bxlcVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(uri);
        this.v.u("uri_list", arrayList);
    }

    public static Uri l(Uri uri) {
        if (uri == null) {
            return null;
        }
        int iMatch = d.match(uri);
        if (iMatch == 0) {
            return uri;
        }
        if (iMatch == 1 || iMatch == 2 || iMatch == 3 || iMatch == 4) {
            return m(Telephony.Sms.CONTENT_URI, uri);
        }
        switch (iMatch) {
            case 10:
                return uri;
            case 11:
            case 12:
            case 13:
                return m(Telephony.Mms.CONTENT_URI, uri);
            default:
                return null;
        }
    }

    private static Uri m(Uri uri, Uri uri2) {
        try {
            return Uri.withAppendedPath(uri, Long.toString(ContentUris.parseId(uri2)));
        } catch (NumberFormatException | UnsupportedOperationException unused) {
            cqbd cqbdVarB = c.b();
            cqbdVarB.I("invalid uri");
            cqbdVarB.I(uri2);
            cqbdVarB.I("for");
            cqbdVarB.I(uri);
            cqbdVarB.r();
            return null;
        }
    }

    private static boolean n(MessageCoreData messageCoreData) {
        return messageCoreData != null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessTelephonyChange.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 116;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 10L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "ProcessTelephonyChangeAction";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b1  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction.i():void");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void j(ThrottledAction throttledAction) {
        aymo aymoVar = this.v;
        ArrayList arrayListM = throttledAction.v.m("uri_list");
        ArrayList arrayListM2 = aymoVar.m("uri_list");
        HashSet hashSetG = ekpg.g(arrayListM.size() + arrayListM2.size());
        hashSetG.addAll(arrayListM);
        hashSetG.addAll(arrayListM2);
        ArrayList arrayList = new ArrayList(hashSetG.size());
        arrayList.addAll(hashSetG);
        aymoVar.u("uri_list", arrayList);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessTelephonyChangeAction(fcsu fcsuVar, fcsu fcsuVar2, crny crnyVar, cggc cggcVar, bxlc bxlcVar, fcsu fcsuVar3, fcsu fcsuVar4, Parcel parcel) {
        super(parcel, elgm.PROCESS_TELEPHONY_CHANGE_ACTION);
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = crnyVar;
        this.h = cggcVar;
        this.i = bxlcVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
    }
}
