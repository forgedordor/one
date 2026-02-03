package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqix extends dqpg {
    public long a;
    public MessageIdType b;
    public cklv c;
    public MessageIdType d;
    public ckml e;
    public ckmb f;
    public ckmb g;

    public bqix() {
        super(bqkl.h());
        MessageIdType messageIdType = bary.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = ckml.b(0);
    }

    public final bqit a() {
        return b(new Supplier() { // from class: bqiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqiu();
            }
        });
    }

    public final bqit b(Supplier supplier) {
        bqit bqitVar = (bqit) supplier.get();
        bqitVar.aD(aB());
        bqitVar.a = this.a;
        bqitVar.b = this.b;
        bqitVar.c = this.c;
        bqitVar.d = this.d;
        bqitVar.e = this.e;
        bqitVar.f = this.f;
        bqitVar.g = this.g;
        bqitVar.cM = aC();
        return bqitVar;
    }

    public final void c(ckmb ckmbVar) {
        int i = this.aB;
        if (i < 59520) {
            dqru.x("animation_effect", i);
        }
        aE(6);
        this.g = ckmbVar;
    }

    public final void d(ckmb ckmbVar) {
        int i = this.aB;
        if (i < 59060) {
            dqru.x("applied_reaction", i);
        }
        aE(5);
        this.f = ckmbVar;
    }

    public final void e(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void f(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 46020) {
            dqru.x("reacted_message_id", i);
        }
        aE(3);
        this.d = messageIdType;
    }

    public final void g(ckml ckmlVar) {
        int i = this.aB;
        if (i < 48000) {
            dqru.x("reaction", i);
        }
        aE(4);
        this.e = ckmlVar;
    }

    public final void h(cklv cklvVar) {
        aE(2);
        this.c = cklvVar;
    }
}
