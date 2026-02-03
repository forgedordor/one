package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdl {
    public final ckdk a;
    public final basd b;
    private final MessageIdType c;

    public ckdl(ckdk ckdkVar) {
        this.a = ckdkVar;
        MessageIdType messageIdTypeB = bary.b(ckdkVar.b);
        this.c = messageIdTypeB;
        String str = ckdkVar.c;
        basd basdVarA = basd.a(true == fdbq.f(str, "") ? null : str);
        this.b = basdVarA;
        if (messageIdTypeB.c()) {
            throw new IllegalArgumentException("Creating a DeleteMessageDataWrapper with empty deletedMessageId");
        }
        if (!basdVarA.k()) {
            throw new IllegalArgumentException("Creating a DeleteMessageDataWrapper with empty deletedRcsMessageId");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckdl) && fdbq.f(this.a, ((ckdl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteMessageDataWrapper(deleteMessageData=" + this.a + ")";
    }
}
