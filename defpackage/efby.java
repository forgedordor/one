package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetMessagesResponse;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efby extends efdx {
    private MessagingResult a;
    private ekgb b;

    @Override // defpackage.efdx
    public final GetMessagesResponse a() {
        ekgb ekgbVar;
        MessagingResult messagingResult = this.a;
        if (messagingResult != null && (ekgbVar = this.b) != null) {
            return new AutoValue_GetMessagesResponse(messagingResult, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" result");
        }
        if (this.b == null) {
            sb.append(" messages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efdx
    public final void b(List list) {
        this.b = ekgb.n(list);
    }

    @Override // defpackage.efdx
    public final void c(MessagingResult messagingResult) {
        if (messagingResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = messagingResult;
    }
}
