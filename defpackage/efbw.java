package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbw extends efdt {
    private MessagingResult a;
    private ekgb b;

    @Override // defpackage.efdt
    public final GetGroupNotificationsResponse a() {
        ekgb ekgbVar;
        MessagingResult messagingResult = this.a;
        if (messagingResult != null && (ekgbVar = this.b) != null) {
            return new AutoValue_GetGroupNotificationsResponse(messagingResult, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" result");
        }
        if (this.b == null) {
            sb.append(" notifications");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efdt
    public final void b(List list) {
        this.b = ekgb.n(list);
    }

    @Override // defpackage.efdt
    public final void c(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
