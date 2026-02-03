package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_CreateGroupResponse;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbs extends efdn {
    private MessagingResult a;

    @Override // defpackage.efdn
    public final CreateGroupResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_CreateGroupResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.efdn
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
