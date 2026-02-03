package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zow {
    public final yit a;
    public final boolean b;
    public final fdvc c;
    private final MessageId d;

    public zow(yit yitVar, MessageId messageId, boolean z, fdvc fdvcVar) {
        fdvcVar.getClass();
        this.a = yitVar;
        this.d = messageId;
        this.b = z;
        this.c = fdvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zow)) {
            return false;
        }
        zow zowVar = (zow) obj;
        return fdbq.f(this.a, zowVar.a) && fdbq.f(this.d, zowVar.d) && this.b == zowVar.b && fdbq.f(this.c, zowVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ScheduledMessagesListItemUiData(scheduledMessage=" + this.a + ", messageId=" + this.d + ", isVisible=" + this.b + ", isTalkbackEnabled=" + this.c + ")";
    }
}
