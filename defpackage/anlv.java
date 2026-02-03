package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class anlv extends fdbo implements fdap {
    public static final anlv a = new anlv();

    public anlv() {
        super(1, MessagePartData.class, "isEndOfEmergency", "isEndOfEmergency()Z", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessagePartData messagePartData = (MessagePartData) obj;
        messagePartData.getClass();
        return Boolean.valueOf(messagePartData.be());
    }
}
