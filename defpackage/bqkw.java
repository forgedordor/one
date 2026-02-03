package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqkw extends dqpg {
    public MessageIdType a;
    public MessageIdType b;
    public ahqp c;
    public basd d;

    public bqkw() {
        super(bqmc.c());
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ahqp.b(0);
        this.d = basd.a;
    }

    public final bqks a() {
        return b(new Supplier() { // from class: bqku
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqkt();
            }
        });
    }

    public final bqks b(Supplier supplier) {
        bqks bqksVar = (bqks) supplier.get();
        bqksVar.aD(aB());
        bqksVar.a = this.a;
        bqksVar.b = this.b;
        bqksVar.c = this.c;
        bqksVar.d = this.d;
        bqksVar.cM = aC();
        return bqksVar;
    }

    public final bqks c() {
        bqks bqksVarB = b(new Supplier() { // from class: bqkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqkt();
            }
        });
        final dqsy dqsyVarA = bqmc.a();
        dqru.b(bqmc.a(), "message_replies", bqksVarB, new Function() { // from class: bqko
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.P("message_replies", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqkp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return bqksVarB;
    }

    public final void d(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void e(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void f(ahqp ahqpVar) {
        aE(2);
        this.c = ahqpVar;
    }

    public final void g(basd basdVar) {
        aE(3);
        this.d = basdVar;
    }
}
