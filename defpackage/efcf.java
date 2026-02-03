package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_JoinGroupResponse;
import com.google.android.rcs.client.messaging.JoinGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcf extends efep {
    private MessagingResult a;

    @Override // defpackage.efep
    public final JoinGroupResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_JoinGroupResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.efep
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
