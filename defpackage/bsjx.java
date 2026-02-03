package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsjx extends dqpg {
    public basd a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public int j;
    public long k;
    public bvdv l;
    public eyga m;
    public boolean n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;

    public bsjx() {
        super(bsmv.e());
        this.a = basd.a;
        this.q = false;
        this.r = false;
        this.s = false;
    }

    public final bsjs a(Supplier supplier) {
        bsjs bsjsVar = (bsjs) supplier.get();
        bsjsVar.aD(aB());
        bsjsVar.a = this.a;
        bsjsVar.b = this.b;
        bsjsVar.c = this.c;
        bsjsVar.d = this.d;
        bsjsVar.e = this.e;
        bsjsVar.f = this.f;
        bsjsVar.g = this.g;
        bsjsVar.h = this.h;
        bsjsVar.i = this.i;
        bsjsVar.j = this.j;
        bsjsVar.k = this.k;
        bsjsVar.l = this.l;
        bsjsVar.m = this.m;
        bsjsVar.n = this.n;
        bsjsVar.o = this.o;
        bsjsVar.p = this.p;
        bsjsVar.q = this.q;
        bsjsVar.r = this.r;
        bsjsVar.s = this.s;
        bsjsVar.cM = aC();
        return bsjsVar;
    }

    public final void b() {
        bsjs bsjsVarA = a(new Supplier() { // from class: bsjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsjt();
            }
        });
        final dqsy dqsyVarB = bsmv.b();
        dqru.b(bsmv.b(), "pending_incoming_message_rcs_table", bsjsVarA, new Function() { // from class: bsjp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.P("pending_incoming_message_rcs_table", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bsjq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 58820) {
            dqru.x("conference_uri", i);
        }
        aE(15);
        this.p = str;
    }

    public final void d(String str) {
        aE(4);
        this.e = str;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 58820) {
            dqru.x("conversation_id", i);
        }
        aE(14);
        this.o = str;
    }

    public final void f(eyga eygaVar) {
        int i = this.aB;
        if (i < 44020) {
            dqru.x("custom_headers", i);
        }
        aE(12);
        this.m = eygaVar;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 58870) {
            dqru.x("is_delivery_report_requested", i);
        }
        aE(16);
        this.q = z;
    }

    public final void h(boolean z) {
        int i = this.aB;
        if (i < 58870) {
            dqru.x("is_display_report_requested", i);
        }
        aE(17);
        this.r = z;
    }

    public final void i(boolean z) {
        int i = this.aB;
        if (i < 58820) {
            dqru.x("is_group", i);
        }
        aE(13);
        this.n = z;
    }

    public final void j(boolean z) {
        int i = this.aB;
        if (i < 60560) {
            dqru.x("is_negative_delivery_report_requested", i);
        }
        aE(18);
        this.s = z;
    }

    public final void k(bvdv bvdvVar) {
        aE(11);
        this.l = bvdvVar;
    }

    public final void l(String str) {
        aE(3);
        this.d = str;
    }

    public final void m(basd basdVar) {
        aE(0);
        this.a = basdVar;
    }

    public final void n(long j) {
        aE(7);
        this.h = j;
    }

    public final void o(String str) {
        aE(5);
        this.f = str;
    }

    public final void p(String str) {
        aE(1);
        this.b = str;
    }

    public final void q(String str) {
        int i = this.aB;
        if (i < 59410) {
            dqru.x("self_identity", i);
        }
        aE(2);
        this.c = str;
    }

    public final void r(long j) {
        aE(6);
        this.g = j;
    }

    public final void s(long j) {
        aE(10);
        this.k = j;
    }

    public final void t(String str) {
        aE(8);
        this.i = str;
    }

    public final void u(int i) {
        aE(9);
        this.j = i;
    }
}
