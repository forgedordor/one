package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjaq implements cjad {
    public final cjab a;

    public cjaq(cjab cjabVar) {
        this.a = cjabVar;
    }

    @Override // defpackage.cjad
    public final eiju a(Intent intent) {
        ejwl.a("com.google.android.apps.messaging.messaging_service_revoke_message_response".equals(intent.getAction()));
        return this.a.b(intent);
    }

    @Override // defpackage.cjad
    public final String b() {
        return "Bugle.MessagingService.RevokeMessageResponse.Latency";
    }
}
