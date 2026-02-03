package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acjm extends acjo {
    private final SpannableString a;
    private final long b;
    private final MessageIdType c;

    public acjm(SpannableString spannableString, long j, MessageIdType messageIdType) {
        this.a = spannableString;
        this.b = j;
        this.c = messageIdType;
    }

    @Override // defpackage.acjo
    public final long a() {
        return this.b;
    }

    @Override // defpackage.acjo
    public final SpannableString b() {
        return this.a;
    }

    @Override // defpackage.acjo
    public final MessageIdType c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acjo) {
            acjo acjoVar = (acjo) obj;
            if (this.a.equals(acjoVar.b()) && this.b == acjoVar.a() && this.c.equals(acjoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        MessageIdType messageIdType = this.c;
        return "ProblematicMessage{displayText=" + this.a.toString() + ", timestamp=" + this.b + ", messageId=" + messageIdType.toString() + "}";
    }
}
