package com.google.android.rcs.client.messaging;

import defpackage.ekgb;
import defpackage.ekjz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GetMessagesResponse extends GetMessagesResponse {
    private final MessagingResult a;
    private final ekgb b;

    public AutoValue_GetMessagesResponse(MessagingResult messagingResult, ekgb ekgbVar) {
        this.a = messagingResult;
        this.b = ekgbVar;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesResponse
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesResponse
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetMessagesResponse) {
            GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
            if (this.a.equals(getMessagesResponse.a()) && ekjz.h(this.b, getMessagesResponse.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.b;
        return "GetMessagesResponse{result=" + this.a.toString() + ", messages=" + ekgbVar.toString() + "}";
    }
}
