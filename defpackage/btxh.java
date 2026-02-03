package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btxh extends dqpg {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;

    public btxh() {
        super(btyx.e());
        this.g = 0;
    }

    public final btxd a() {
        return b(new Supplier() { // from class: btxg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btxe();
            }
        });
    }

    public final btxd b(Supplier supplier) {
        btxd btxdVar = (btxd) supplier.get();
        btxdVar.aD(aB());
        btxdVar.a = this.a;
        btxdVar.b = this.b;
        btxdVar.c = this.c;
        btxdVar.d = this.d;
        btxdVar.e = this.e;
        btxdVar.f = this.f;
        btxdVar.g = this.g;
        btxdVar.h = this.h;
        btxdVar.i = this.i;
        btxdVar.cM = aC();
        return btxdVar;
    }

    @Deprecated
    public final btxd c() {
        final btxd btxdVarB = b(new Supplier() { // from class: btxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btxe();
            }
        });
        final dqsy dqsyVarB = btyx.b();
        dqru.b(btyx.b(), "self_participants", btxdVarB, new Function() { // from class: btxc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.O("self_participants", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btwz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    btxd btxdVar = btxdVarB;
                    btxdVar.a = String.valueOf(l);
                    btxdVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return btxdVarB;
    }

    public final void d(String str) {
        aE(7);
        this.h = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(int i) {
        aE(3);
        this.d = i;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 29080) {
            dqru.x("smsc", i);
        }
        aE(8);
        this.i = str;
    }

    public final void h(int i) {
        aE(4);
        this.e = i;
    }

    public final void i(int i) {
        aE(6);
        this.g = i;
    }

    public final void j(String str) {
        aE(5);
        this.f = str;
    }
}
