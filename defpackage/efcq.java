package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcq extends effn {
    private MessagingResult a;

    @Override // defpackage.effn
    public final RemoveUserFromGroupResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_RemoveUserFromGroupResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.effn
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
