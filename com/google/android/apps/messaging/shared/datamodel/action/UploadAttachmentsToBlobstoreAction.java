package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.auvh;
import defpackage.aylc;
import defpackage.aymo;
import defpackage.ayqp;
import defpackage.bvsl;
import defpackage.ceku;
import defpackage.efwo;
import defpackage.egej;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.elgm;
import defpackage.eooz;
import defpackage.eosc;
import defpackage.fcsu;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UploadAttachmentsToBlobstoreAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aylc();
    public final bvsl a;
    public final ceku b;
    public final fcsu c;
    public final Optional d;
    private final eosc e;
    private final egej f;

    /* compiled from: PG */
    public interface a {
        ayqp bu();
    }

    public UploadAttachmentsToBlobstoreAction(bvsl bvslVar, ceku cekuVar, fcsu fcsuVar, eosc eoscVar, Optional optional, egej egejVar, Parcel parcel) {
        super(parcel, elgm.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION);
        this.a = bvslVar;
        this.b = cekuVar;
        this.c = fcsuVar;
        this.e = eoscVar;
        this.d = optional;
        this.f = egejVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UploadAttachmentsToBlobstoreAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UploadAttachmentsToBlobstore.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        aymo aymoVar = this.v;
        final ArrayList arrayListM = aymoVar.m("parts_key");
        final boolean zY = aymoVar.y("is_batch_pre_upload_key");
        final String strL = aymoVar.l("part_id_key");
        if (arrayListM == null || arrayListM.isEmpty()) {
            return null;
        }
        Optional optional = this.d;
        auvh.f((optional.isEmpty() ? eijx.e("") : eiju.g(this.f.b((efwo) optional.get()))).i(new eooz() { // from class: ayla
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final String str = (String) obj;
                final ArrayList arrayList = new ArrayList();
                final UploadAttachmentsToBlobstoreAction uploadAttachmentsToBlobstoreAction = this.a;
                Iterable$EL.forEach(arrayListM, new Consumer() { // from class: aylb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj2;
                        ((bbae) uploadAttachmentsToBlobstoreAction.c.b()).d(messagePartCoreData, str);
                        if (ayqp.f(messagePartCoreData, true)) {
                            arrayList.add(messagePartCoreData);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Optional optionalEmpty = ((Boolean) cdip.a.e()).booleanValue() ? uploadAttachmentsToBlobstoreAction.d : Optional.empty();
                ceku cekuVar = uploadAttachmentsToBlobstoreAction.b;
                return uploadAttachmentsToBlobstoreAction.a.a(arrayList, zY, strL, cekuVar, optionalEmpty);
            }
        }, this.e), "Error uploading blobs");
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UploadAttachmentsToBlobstoreAction(bvsl bvslVar, ceku cekuVar, fcsu fcsuVar, eosc eoscVar, Optional optional, egej egejVar, ArrayList arrayList, String str, boolean z) {
        super(elgm.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION);
        this.a = bvslVar;
        this.b = cekuVar;
        this.c = fcsuVar;
        this.e = eoscVar;
        this.d = optional;
        this.f = egejVar;
        if (!arrayList.isEmpty()) {
            this.v.u("parts_key", arrayList);
        }
        this.v.p("is_batch_pre_upload_key", z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.v.v("part_id_key", str);
    }
}
