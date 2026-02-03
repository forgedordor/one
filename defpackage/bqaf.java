package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqaf extends dqpg {
    public MessageIdType a;
    public String b;

    public bqaf() {
        super(bqbb.b());
        this.a = bary.a;
    }

    public final bqad a() {
        bqae bqaeVar = new bqae();
        bqaeVar.aD(aB());
        bqaeVar.a = this.a;
        bqaeVar.b = this.b;
        bqaeVar.cM = aC();
        return bqaeVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }
}
