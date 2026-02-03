package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brls extends dqpg {
    public String a;
    public MessageIdType b;
    public long c;
    public ezgi d;
    public ezan e;
    public ezai f;
    public ezaj g;

    public brls() {
        super(brnk.e());
        this.b = bary.a;
        this.c = 0L;
        this.e = ezan.UNKNOWN_SUGGESTION_TYPE;
        this.f = ezai.UNKNOWN_STATUS;
        this.g = ezaj.UNCONSUMED;
    }

    public final brlo a() {
        return b(new Supplier() { // from class: brlq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new brlp();
            }
        });
    }

    public final brlo b(Supplier supplier) {
        brlo brloVar = (brlo) supplier.get();
        brloVar.aD(aB());
        ezgi ezgiVar = this.d;
        if (ezgiVar == null) {
            throw new IllegalStateException("field suggestion cannot be null");
        }
        brloVar.a = this.a;
        brloVar.b = this.b;
        brloVar.c = this.c;
        brloVar.d = ezgiVar;
        brloVar.e = this.e;
        brloVar.f = this.f;
        brloVar.g = this.g;
        brloVar.cM = aC();
        return brloVar;
    }

    public final void c(long j) {
        aE(2);
        this.c = j;
    }

    public final void d(ezan ezanVar) {
        aE(4);
        this.e = ezanVar;
    }

    public final void e(ezgi ezgiVar) {
        aE(3);
        this.d = ezgiVar;
    }

    public final void f(ezai ezaiVar) {
        aE(5);
        this.f = ezaiVar;
    }

    public final void g(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }
}
