package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqsu extends dqpg {
    public long a;
    public String b;
    public long c;
    public int d;
    public aiwt e;
    public String f;

    public bqsu() {
        super(bqub.b());
        this.c = 0L;
        this.d = 0;
    }

    public final bqsq a(Supplier supplier) {
        bqsq bqsqVar = (bqsq) supplier.get();
        bqsqVar.aD(aB());
        bqsqVar.a = this.a;
        bqsqVar.b = this.b;
        bqsqVar.c = this.c;
        bqsqVar.d = this.d;
        bqsqVar.e = this.e;
        bqsqVar.f = this.f;
        bqsqVar.cM = aC();
        return bqsqVar;
    }

    @Deprecated
    public final void b() {
        final bqsq bqsqVarA = a(new Supplier() { // from class: bqst
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqsr();
            }
        });
        final dqsy dqsyVarA = bqub.a();
        dqru.b(bqub.a(), "message_status", bqsqVarA, new Function() { // from class: bqso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.O("message_status", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqsp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bqsq bqsqVar = bqsqVarA;
                    bqsqVar.a = l.longValue();
                    bqsqVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(aiwt aiwtVar) {
        aE(4);
        this.e = aiwtVar;
    }

    public final void d(String str) {
        aE(5);
        this.f = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(int i) {
        aE(3);
        this.d = i;
    }

    public final void g(long j) {
        aE(2);
        this.c = j;
    }
}
