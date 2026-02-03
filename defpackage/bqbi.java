package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqbi extends dqpg {
    public long a;
    public MessageIdType b;
    public ezah c;
    public ezgd d;

    public bqbi() {
        super(bqcn.e());
        this.b = bary.a;
        this.c = ezah.UNKNOWN_CLASSIFICATION_TYPE;
    }

    public final bqbg a() {
        bqbh bqbhVar = new bqbh();
        bqbhVar.aD(aB());
        ezgd ezgdVar = this.d;
        if (ezgdVar == null) {
            throw new IllegalStateException("field classification_details cannot be null");
        }
        bqbhVar.a = this.a;
        bqbhVar.b = this.b;
        bqbhVar.c = this.c;
        bqbhVar.d = ezgdVar;
        bqbhVar.cM = aC();
        return bqbhVar;
    }

    public final void b(ezgd ezgdVar) {
        int i = this.aB;
        if (i < 58480) {
            dqru.x("classification_details", i);
        }
        aE(3);
        this.d = ezgdVar;
    }

    public final void c(ezah ezahVar) {
        aE(2);
        this.c = ezahVar;
    }

    public final void d(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }
}
