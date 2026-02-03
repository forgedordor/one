package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknj extends cknq {
    public final MessageIdType a;
    public final basd b;
    private final ckno c;

    public cknj(MessageIdType messageIdType, basd basdVar, ckno cknoVar) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        if (basdVar == null) {
            throw new NullPointerException("Null rcsMessageId");
        }
        this.b = basdVar;
        this.c = cknoVar;
    }

    @Override // defpackage.cknq
    public final MessageIdType a() {
        return this.a;
    }

    @Override // defpackage.cknq
    public final basd b() {
        return this.b;
    }

    @Override // defpackage.cknq
    public final ckno c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cknq) {
            cknq cknqVar = (cknq) obj;
            if (this.a.equals(cknqVar.a()) && this.b.equals(cknqVar.b()) && this.c.equals(cknqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ckno cknoVar = this.c;
        basd basdVar = this.b;
        return "ReactedMessageData{messageId=" + this.a.toString() + ", rcsMessageId=" + basdVar.toString() + ", reactedMessageContent=" + cknoVar.toString() + "}";
    }
}
