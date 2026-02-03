package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfm {
    public final ckfl a;
    public final MessageIdType b;
    public final basd c;
    public final Instant d;

    public ckfm(ckfl ckflVar) {
        this.a = ckflVar;
        MessageIdType messageIdTypeB = bary.b(ckflVar.b);
        this.b = messageIdTypeB;
        String str = ckflVar.c;
        basd basdVarA = basd.a(true == fdbq.f(str, "") ? null : str);
        this.c = basdVarA;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(ckflVar.d);
        instantOfEpochMilli.getClass();
        this.d = instantOfEpochMilli;
        if (messageIdTypeB.c()) {
            throw new IllegalArgumentException("Creating an EditMessageDataWrapper with empty editedMessageId");
        }
        if (!basdVarA.k()) {
            throw new IllegalArgumentException("Creating an EditMessageDataWrapper with empty editedRcsMessageId");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckfm) && fdbq.f(this.a, ((ckfm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EditMessageDataWrapper(editMessageData=" + this.a + ")";
    }
}
