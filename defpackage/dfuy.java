package defpackage;

import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfuy extends dfva {
    public GroupNotification a;

    @Override // defpackage.dfva
    public final dfvb a() {
        GroupNotification groupNotification = this.a;
        if (groupNotification != null) {
            return new dfuz(groupNotification);
        }
        throw new IllegalStateException("Missing required properties: groupNotification");
    }
}
