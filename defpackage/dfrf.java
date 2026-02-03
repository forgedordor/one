package defpackage;

import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfrf implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        GroupNotification groupNotification = (GroupNotification) obj;
        if (groupNotification == null) {
            dhja.k("Null group notification produced.", new Object[0]);
        } else {
            dhja.k("Group notification produced: %s", groupNotification);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dhja.i(th, "Error while receiving notification: %s", th.getMessage());
    }
}
