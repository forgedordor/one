package defpackage;

import com.google.android.gms.wearable.internal.SendMessageResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detv extends deto {
    public detv(dcgq dcgqVar) {
        super(dcgqVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onSendMessage(SendMessageResponse sendMessageResponse) {
        a(new desr(detm.a(sendMessageResponse.a), sendMessageResponse.b));
    }
}
