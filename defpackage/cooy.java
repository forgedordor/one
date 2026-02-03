package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cooy extends copa {
    private final MessageCoreData a;

    public cooy(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.copa, defpackage.cosu
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.cosu
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cosu) {
            cosu cosuVar = (cosu) obj;
            if (cosuVar.b() == 1 && this.a.equals(cosuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageCoreDataOrWorkQueueResult{messageCoreData=" + this.a.toString() + "}";
    }
}
