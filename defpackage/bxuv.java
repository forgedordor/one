package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxuv {
    public final MessageId a;
    public final int b;

    public bxuv(MessageId messageId, int i) {
        this.a = messageId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxuv)) {
            return false;
        }
        bxuv bxuvVar = (bxuv) obj;
        return fdbq.f(this.a, bxuvVar.a) && this.b == bxuvVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Hit(id=" + this.a + ", position=" + this.b + ")";
    }
}
