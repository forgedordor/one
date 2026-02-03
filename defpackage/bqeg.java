package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqeg extends dqpg {
    public MessageIdType a;
    public MessageIdType b;
    public basd c;
    public Instant d;
    public Instant e;

    public bqeg() {
        super(bqfo.c());
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = basd.a;
        this.d = Instant.EPOCH;
        this.e = Instant.EPOCH;
    }

    public final bqec a(Supplier supplier) {
        bqec bqecVar = (bqec) supplier.get();
        bqecVar.aD(aB());
        bqecVar.a = this.a;
        bqecVar.b = this.b;
        bqecVar.c = this.c;
        bqecVar.d = this.d;
        bqecVar.e = this.e;
        bqecVar.cM = aC();
        return bqecVar;
    }

    public final void b() {
        bqec bqecVarA = a(new Supplier() { // from class: bqee
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqed();
            }
        });
        final dqsy dqsyVarA = bqfo.a();
        dqru.b(bqfo.a(), "message_edits", bqecVarA, new Function() { // from class: bqdy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.P("message_edits", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqdz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void d(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void e(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void f(basd basdVar) {
        aE(2);
        this.c = basdVar;
    }

    public final void g(Instant instant) {
        aE(4);
        this.e = instant;
    }
}
