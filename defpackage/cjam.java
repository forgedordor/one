package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjam implements cjad {
    public final cjab a;

    public cjam(cjab cjabVar) {
        this.a = cjabVar;
    }

    @Override // defpackage.cjad
    public final eiju a(Intent intent) {
        return this.a.b(intent);
    }

    @Override // defpackage.cjad
    public final String b() {
        return "Bugle.MessagingService.RemoveUserFromGroupResponse.Latency";
    }
}
