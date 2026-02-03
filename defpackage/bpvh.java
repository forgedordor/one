package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.BitSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpvh extends dqpg {
    public long a;
    public MessageIdType b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;

    public bpvh() {
        super(bpxj.g());
        this.b = bary.a;
        this.d = 0L;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    public final bpvd a() {
        return b(new Supplier() { // from class: bpvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bpve();
            }
        });
    }

    public final bpvd b(Supplier supplier) {
        bpvd bpvdVar = (bpvd) supplier.get();
        bpvdVar.aD(aB());
        bpvdVar.a = this.a;
        bpvdVar.b = this.b;
        bpvdVar.c = this.c;
        bpvdVar.d = this.d;
        bpvdVar.e = this.e;
        bpvdVar.f = this.f;
        bpvdVar.g = this.g;
        bpvdVar.h = this.h;
        bpvdVar.i = this.i;
        bpvdVar.j = this.j;
        bpvdVar.k = this.k;
        bpvdVar.l = this.l;
        bpvdVar.cM = aC();
        return bpvdVar;
    }

    public final void c(bpvd bpvdVar, boolean z, BitSet bitSet) {
        this.az = bitSet == null ? null : (BitSet) bitSet.clone();
        if (z) {
            BitSet bitSet2 = this.az;
            if (bitSet2 != null) {
                bitSet2.clear(0);
            }
        } else {
            BitSet bitSet3 = this.az;
            if (bitSet3 == null || bitSet3.get(0)) {
                bpvdVar.aA(0, "_id");
                this.a = bpvdVar.a;
            }
        }
        BitSet bitSet4 = this.az;
        if (bitSet4 == null || bitSet4.get(1)) {
            this.b = bpvdVar.m();
        }
        BitSet bitSet5 = this.az;
        if (bitSet5 == null || bitSet5.get(2)) {
            this.c = bpvdVar.s();
        }
        BitSet bitSet6 = this.az;
        if (bitSet6 == null || bitSet6.get(3)) {
            this.d = bpvdVar.k();
        }
        BitSet bitSet7 = this.az;
        if (bitSet7 == null || bitSet7.get(4)) {
            this.e = bpvdVar.r();
        }
        BitSet bitSet8 = this.az;
        if (bitSet8 == null || bitSet8.get(5)) {
            this.f = bpvdVar.o();
        }
        BitSet bitSet9 = this.az;
        if (bitSet9 == null || bitSet9.get(6)) {
            this.g = bpvdVar.q();
        }
        BitSet bitSet10 = this.az;
        if (bitSet10 == null || bitSet10.get(7)) {
            this.h = bpvdVar.p();
        }
        BitSet bitSet11 = this.az;
        if (bitSet11 == null || bitSet11.get(8)) {
            this.i = bpvdVar.n();
        }
        BitSet bitSet12 = this.az;
        if (bitSet12 == null || bitSet12.get(9)) {
            this.j = bpvdVar.y();
        }
        BitSet bitSet13 = this.az;
        if (bitSet13 == null || bitSet13.get(10)) {
            this.k = bpvdVar.x();
        }
        BitSet bitSet14 = this.az;
        if (bitSet14 == null || bitSet14.get(11)) {
            this.l = bpvdVar.w();
        }
    }

    public final void d() {
        final bpvd bpvdVarB = b(new Supplier() { // from class: bpvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bpve();
            }
        });
        final dqsy dqsyVarC = bpxj.c();
        dqru.b(bpxj.c(), "link_preview", bpvdVarB, new Function() { // from class: bpux
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarC.P("link_preview", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bpuy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bpvdVarB.u((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void e(boolean z) {
        int i = this.aB;
        if (i < 61000) {
            dqru.x("deferred", i);
        }
        aE(11);
        this.l = z;
    }

    public final void f(long j) {
        aE(3);
        this.d = j;
    }

    public final void g(String str) {
        aE(8);
        this.i = str;
    }

    public final void h(String str) {
        aE(5);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.f = str;
    }

    public final void i(String str) {
        aE(7);
        this.h = str;
    }

    public final void j(String str) {
        aE(6);
        this.g = str;
    }

    public final void k(boolean z) {
        int i = this.aB;
        if (i < 22020) {
            dqru.x("link_preview_failed", i);
        }
        aE(10);
        this.k = z;
    }

    public final void l(boolean z) {
        int i = this.aB;
        if (i < 21010) {
            dqru.x("link_preview_prevented", i);
        }
        aE(9);
        this.j = z;
    }

    public final void m(String str) {
        aE(4);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.e = str;
    }

    public final void n(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void o(String str) {
        aE(2);
        this.c = str;
    }
}
