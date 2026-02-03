package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjp implements yis {
    private final MessageId a;
    private final String b;

    public zjp(MessageId messageId) {
        this.a = messageId;
        String strA = messageId.a();
        strA.getClass();
        this.b = strA;
    }

    @Override // defpackage.yis
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.dkfe
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjp) && fdbq.f(this.a, ((zjp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HiddenMessageUiData(messageId=" + this.a + ")";
    }
}
