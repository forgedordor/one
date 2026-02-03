package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class batr implements batq {
    public final MessageCoreData a;

    public batr(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.batq
    public final /* synthetic */ void a(fdap fdapVar, fdap fdapVar2) {
        batp.b(this, fdapVar, fdapVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof batr) && fdbq.f(this.a, ((batr) obj).a);
    }

    public final int hashCode() {
        MessageCoreData messageCoreData = this.a;
        if (messageCoreData == null) {
            return 0;
        }
        return messageCoreData.hashCode();
    }

    public final String toString() {
        return "NullableMessageCoreData(messageCoreData=" + this.a + ")";
    }
}
