package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.auuh;
import defpackage.ayjw;
import defpackage.ayjx;
import defpackage.cggc;
import defpackage.cggg;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.elgm;
import defpackage.fcsu;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateCloudSyncMessageAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayjw();
    public final fcsu a;
    public final fcsu b;
    private final Context c;
    private final cggc d;
    private final cggg e;
    private final dqsn f;
    private final auuh g;

    /* compiled from: PG */
    public interface a {
        ayjx in();
    }

    public UpdateCloudSyncMessageAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, cggc cggcVar, cggg cgggVar, dqsn dqsnVar, auuh auuhVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_CLOUD_SYNC_MESSAGE_ACTION);
        this.c = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = cggcVar;
        this.e = cgggVar;
        this.f = dqsnVar;
        this.g = auuhVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateCloudSyncMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) this.f.c("UpdateCloudSyncMessageAction#executeAction", new ejxr() { // from class: ayjv
            @Override // defpackage.ejxr
            public final Object get() {
                UpdateCloudSyncMessageAction updateCloudSyncMessageAction = this.a;
                boolean zE = false;
                for (Parcelable parcelable : updateCloudSyncMessageAction.v.D()) {
                    Bundle bundle = (Bundle) parcelable;
                    String string = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                    MessageCoreData messageCoreDataV = ((baxe) updateCloudSyncMessageAction.b.b()).v(string);
                    if (messageCoreDataV == null) {
                        arrayList.add(string);
                    } else {
                        zE |= ((auue) updateCloudSyncMessageAction.a.b()).e(string, bundle, messageCoreDataV);
                    }
                }
                return Boolean.valueOf(zE);
            }
        })).booleanValue()) {
            this.d.c();
            this.e.d();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        this.g.d(this.c, (String[]) arrayList.toArray(new String[0]));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateCloudSyncMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
