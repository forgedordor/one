package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btrg extends dqpg {
    public long a;
    public long b;
    public aiad c;
    public btsp d;
    public btso e;

    public btrg() {
        super(btsn.a().M());
    }

    public final btrc a(Supplier supplier) {
        btrc btrcVar = (btrc) supplier.get();
        btrcVar.aD(aB());
        btrcVar.a = this.a;
        btrcVar.b = this.b;
        btrcVar.c = this.c;
        btrcVar.d = this.d;
        btrcVar.e = this.e;
        btrcVar.cM = aC();
        return btrcVar;
    }

    public final void b() {
        final btrc btrcVarA = a(new Supplier() { // from class: btre
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btrd();
            }
        });
        final dqsy dqsyVarA = btsn.a();
        dqru.b(btsn.a(), "restore_workflow_files", btrcVarA, new Function() { // from class: btra
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.P("restore_workflow_files", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btrb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    btrc btrcVar = btrcVarA;
                    btrcVar.a = l.longValue();
                    btrcVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(aiad aiadVar) {
        aE(2);
        this.c = aiadVar;
    }

    public final void d(btsp btspVar) {
        aE(3);
        this.d = btspVar;
    }

    public final void e(btso btsoVar) {
        aE(4);
        this.e = btsoVar;
    }

    public final void f(long j) {
        aE(1);
        this.b = j;
    }
}
