package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbm extends efbd {
    private MessagingResult a;

    @Override // defpackage.efbd
    public final AddUserToGroupResponse a() {
        MessagingResult messagingResult = this.a;
        if (messagingResult != null) {
            return new AutoValue_AddUserToGroupResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.efbd
    public final void b(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
