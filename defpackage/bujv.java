package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bujv extends dqpg {
    public int a;
    public String b;
    public buku c;

    public bujv() {
        super(bukt.a().M());
    }

    public final bujr a(Supplier supplier) {
        bujr bujrVar = (bujr) supplier.get();
        bujrVar.aD(aB());
        bujrVar.a = this.a;
        bujrVar.b = this.b;
        bujrVar.c = this.c;
        bujrVar.cM = aC();
        return bujrVar;
    }

    @Deprecated
    public final void b() {
        bujr bujrVarA = a(new Supplier() { // from class: buju
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bujs();
            }
        });
        final dqsy dqsyVarA = bukt.a();
        dqru.b(bukt.a(), "supersort_labels", bujrVarA, new Function() { // from class: bujp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.O("supersort_labels", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bujq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(int i) {
        aE(0);
        this.a = i;
    }

    public final void d(String str) {
        aE(1);
        this.b = str;
    }

    public final void e(buku bukuVar) {
        aE(2);
        this.c = bukuVar;
    }
}
