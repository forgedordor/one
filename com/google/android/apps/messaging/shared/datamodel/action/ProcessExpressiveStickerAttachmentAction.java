package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.axwr;
import defpackage.axws;
import defpackage.cogw;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessExpressiveStickerAttachmentAction extends Action<Void> implements Parcelable {
    private final Context b;
    private final fcsu c;
    private final cogw d;
    private final MessagePartCoreData e;
    private static final cqce a = cqce.g("Bugle", "ProcessExpressiveStickerAttachmentAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axwr();

    /* compiled from: PG */
    public interface a {
        axws hV();
    }

    public ProcessExpressiveStickerAttachmentAction(Context context, fcsu fcsuVar, cogw cogwVar, Parcel parcel) {
        super(parcel, elgm.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION);
        this.b = context;
        this.c = fcsuVar;
        this.d = cogwVar;
        this.e = (MessagePartCoreData) this.v.h("part_key");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessExpressiveStickerAttachmentAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessExpressiveStickerAttachmentAction.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessExpressiveStickerAttachmentAction(Context context, fcsu fcsuVar, cogw cogwVar, MessagePartCoreData messagePartCoreData) {
        super(elgm.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION);
        this.b = context;
        this.c = fcsuVar;
        this.d = cogwVar;
        this.e = messagePartCoreData;
        this.v.t("part_key", messagePartCoreData);
    }
}
