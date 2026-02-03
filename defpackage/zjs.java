package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjs implements yis {
    public final List a;
    private final MessageId b;
    private final long c;
    private final String d;

    public zjs(List list, MessageId messageId, long j) {
        this.a = list;
        this.b = messageId;
        this.c = j;
        String strA = messageId.a();
        strA.getClass();
        this.d = strA;
    }

    @Override // defpackage.yis
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.dkfe
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjs)) {
            return false;
        }
        zjs zjsVar = (zjs) obj;
        return fdbq.f(this.a, zjsVar.a) && fdbq.f(this.b, zjsVar.b) && this.c == zjsVar.c;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BugleMultiPartMessageUiData(messageBubbles=" + this.a + ", messageId=" + this.b + ", timestamp=" + this.c + ")";
    }
}
