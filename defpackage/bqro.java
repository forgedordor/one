package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqro extends dqpg {
    public long a;
    public MessageIdType b;

    public bqro() {
        super(bqsm.b());
        this.b = bary.a;
    }

    public final bqrm a() {
        bqrn bqrnVar = new bqrn();
        bqrnVar.aD(aB());
        bqrnVar.a = this.a;
        bqrnVar.b = this.b;
        bqrnVar.cM = aC();
        return bqrnVar;
    }

    public final void b(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }
}
