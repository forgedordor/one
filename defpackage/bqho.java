package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqho extends dqpg {
    public MessageIdType a;
    public cgvx b;

    public bqho() {
        super(bqik.a().M());
        this.a = bary.a;
    }

    public final bqhm a() {
        bqhn bqhnVar = new bqhn();
        bqhnVar.aD(aB());
        bqhnVar.a = this.a;
        bqhnVar.b = this.b;
        bqhnVar.cM = aC();
        return bqhnVar;
    }

    public final void b(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void c(cgvx cgvxVar) {
        aE(1);
        this.b = cgvxVar;
    }
}
