package defpackage;

import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfuz extends dfvb {
    private final GroupNotification a;

    public dfuz(GroupNotification groupNotification) {
        this.a = groupNotification;
    }

    @Override // defpackage.dfvb
    public final GroupNotification a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfvb) {
            return this.a.equals(((dfvb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReceiveGroupNotifyRequest{groupNotification=" + this.a.toString() + "}";
    }
}
