package com.google.android.apps.messaging.wearable.action;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import defpackage.cqtf;
import defpackage.dapu;
import defpackage.defh;
import defpackage.dens;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eksp;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CheckWearableAppVersionAction extends Action<Void> {
    public Context c;
    private dens d;
    public static final eksp a = eksp.c("BugleWearable");
    static final Uri b = new Uri.Builder().scheme("wear").path("/bugle/watch_version/").build();
    public static final Parcelable.Creator<CheckWearableAppVersionAction> CREATOR = new dapu();

    /* compiled from: PG */
    public interface a {
        Context T();

        dens dk();
    }

    public CheckWearableAppVersionAction() {
        super(elgm.CHECK_WEARABLE_APP_VERSION_ACTION);
        j();
    }

    public static void h() {
        new CheckWearableAppVersionAction().z();
    }

    private final void j() {
        a aVar = (a) cqtf.a(a.class);
        this.c = aVar.T();
        this.d = aVar.dk();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("CheckWearableAppVersionAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CheckWearableAppVersion.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        this.d.c(b).a(new defh() { // from class: dapt
            @Override // defpackage.defh
            public final void e(Object obj) {
                int iP;
                CheckWearableAppVersionAction checkWearableAppVersionAction = this.a;
                denx denxVar = (denx) obj;
                if (denxVar != null) {
                    try {
                        if (denxVar.b.d()) {
                            eksp ekspVar = CheckWearableAppVersionAction.a;
                            ekrw ekrwVarN = ekspVar.n();
                            ekrz ekrzVar = cqnc.S;
                            ekrwVarN.X(ekrzVar, "CheckWearableAppVersionAction");
                            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/wearable/action/CheckWearableAppVersionAction", "doBackgroundWork", 92, "CheckWearableAppVersionAction.java")).q("Successfully retrieved watch's RPC version from DataClient");
                            dcji dcjiVar = new dcji(denxVar);
                            int i = 0;
                            while (dcjiVar.hasNext()) {
                                denv denvVar = (denv) dcjiVar.next();
                                if (denvVar != null && (iP = deoa.a(denvVar).a.p("1")) > i) {
                                    i = iP;
                                }
                            }
                            ekrw ekrwVarN2 = ekspVar.n();
                            ekrwVarN2.X(ekrzVar, "CheckWearableAppVersionAction");
                            ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/wearable/action/CheckWearableAppVersionAction", "saveWearableApiLevel", 117, "CheckWearableAppVersionAction.java")).r("Wearable RPC version is %d", i);
                            SharedPreferences.Editor editorEdit = checkWearableAppVersionAction.c.getSharedPreferences("watch_protocol_version_file", 0).edit();
                            if (i > 0) {
                                editorEdit.putInt("watch_protocol_version_key", i);
                            }
                            editorEdit.apply();
                        }
                    } finally {
                        denxVar.b();
                    }
                }
                if (denxVar != null) {
                }
            }
        });
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public CheckWearableAppVersionAction(Parcel parcel) {
        super(parcel, elgm.CHECK_WEARABLE_APP_VERSION_ACTION);
        j();
    }
}
