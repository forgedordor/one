package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfy {
    public final clfv a;
    public final MessageIdType b;
    public final basd c;

    public clfy(clfv clfvVar) {
        this.a = clfvVar;
        MessageIdType messageIdTypeB = bary.b(clfvVar.b);
        this.b = messageIdTypeB;
        String str = clfvVar.c;
        this.c = basd.a(true == fdbq.f(str, "") ? null : str);
        if (messageIdTypeB.c()) {
            throw new IllegalArgumentException("Creating a ReplyMessageDataWrapper with empty repliedToMessageId");
        }
    }

    public static final clfy a(MessageIdType messageIdType, basd basdVar) {
        messageIdType.getClass();
        basdVar.getClass();
        clfu clfuVar = (clfu) clfv.a.createBuilder();
        clfuVar.getClass();
        String strB = messageIdType.b();
        strB.getClass();
        clfw.b(strB, clfuVar);
        String strF = basdVar.f();
        clfuVar.copyOnWrite();
        ((clfv) clfuVar.instance).c = strF;
        return new clfy(clfw.a(clfuVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clfy) && fdbq.f(this.a, ((clfy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyMessageDataWrapper(replyMessageData=" + this.a + ")";
    }
}
