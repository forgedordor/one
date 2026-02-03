package defpackage;

import android.text.TextUtils;
import defpackage.dqpd;
import defpackage.dqpo;
import defpackage.dqqj;
import defpackage.dqwl;
import defpackage.dqws;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqws<C extends dqqj<C, Q, B, D, R2>, Q extends dqwl<C, Q, B, D, R2>, B extends dqws<C, Q, B, D, R2>, D extends dqpd<C, Q, B, D, R2>, R2 extends dqpo<R2>> {
    public final dqwu a;

    protected dqws(String str, String[] strArr, String str2, String str3, String str4, String str5) {
        dqwu dqwuVarB = dqwv.B();
        this.a = dqwuVarB;
        dqox dqoxVar = (dqox) dqwuVarB;
        dqoxVar.w = str5;
        dqoxVar.a = str;
        dqwuVarB.f(false);
        dqwuVarB.c(Arrays.asList(strArr));
        dqox dqoxVar2 = (dqox) dqwuVarB;
        dqoxVar2.l = null;
        dqoxVar2.k = str2;
        dqoxVar2.i = str3 == null ? null : new dqxm(str3);
        dqoxVar2.j = null;
        dqoxVar2.f = str4;
        dqwuVarB.g(false);
        dqwuVarB.h(false);
    }

    private final void a(dqts dqtsVar, int i) {
        boolean z;
        boolean z2;
        dqot dqotVar = (dqot) dqtsVar;
        dqwl dqwlVar = dqotVar.a;
        if (dqwlVar.c()) {
            throw new IllegalArgumentException("cannot join on @Query");
        }
        dqoy dqoyVar = (dqoy) dqwlVar.e;
        if (dqoyVar.l != null) {
            throw new IllegalArgumentException("cannot specify having on joined table");
        }
        ekgb ekgbVar = dqoyVar.p;
        if (ekgbVar != null && !ekgbVar.isEmpty()) {
            throw new IllegalArgumentException("cannot specify union on joined table");
        }
        if (!TextUtils.isEmpty(dqwlVar.n)) {
            throw new IllegalArgumentException("cannot specify limit on joined table");
        }
        if (!TextUtils.isEmpty(dqoyVar.n)) {
            throw new IllegalArgumentException("cannot specify offset on joined table");
        }
        if (dqoyVar.b) {
            throw new IllegalArgumentException("cannot specify distinct on joined table");
        }
        if (dqoyVar.i != null) {
            throw new IllegalArgumentException("cannot specify order by on joined table");
        }
        dqpo dqpoVar = dqotVar.b;
        if (dqpoVar != null) {
            z = false;
            z2 = true;
        } else {
            z = true;
            z2 = true;
        }
        dqpo dqpoVar2 = dqotVar.c;
        if (z != (dqpoVar2 == null ? z2 : false)) {
            throw new IllegalArgumentException("joinColumn and parentJoinColumn must both be null or both be not null");
        }
        this.a.b().h(new dqth(dqwlVar, dqpoVar, dqpoVar2, dqotVar.d, dqotVar.e, i, dqotVar.g, dqotVar.f));
    }

    public final void A(String str) {
        ((dqox) this.a).t = new dqsb(str);
    }

    public final void B(int i) {
        ((dqox) this.a).n = String.valueOf(i);
    }

    public final void C(dqxe dqxeVar) {
        ((dqox) this.a).i = dqxeVar;
    }

    @Deprecated
    public final void D(String str) {
        ((dqox) this.a).i = new dqxm(str);
    }

    public final void E(dqts dqtsVar) {
        a(dqtsVar, 4);
    }

    public final void F(dqts dqtsVar) {
        a(dqtsVar, 1);
    }

    public final void G(dqtr dqtrVar) {
        a(dqtrVar.g(), 2);
    }

    public final void H(dqts dqtsVar) {
        a(dqtsVar, 2);
    }

    public abstract dqwl b();

    public final dqws j(dqtr dqtrVar) {
        E(dqtrVar.g());
        return this;
    }

    public final void k(dqyj dqyjVar) {
        dqox dqoxVar = (dqox) this.a;
        if (dqoxVar.g == null) {
            if (dqoxVar.h == null) {
                int i = ekgb.d;
                dqoxVar.g = new ekfw();
            } else {
                int i2 = ekgb.d;
                dqoxVar.g = new ekfw();
                dqoxVar.g.j(dqoxVar.h);
                dqoxVar.h = null;
            }
        }
        dqoxVar.g.h(dqyjVar);
    }

    protected final void l() {
        dqoy dqoyVar = (dqoy) this.a.a();
        if (TextUtils.isEmpty(dqoyVar.m) && !TextUtils.isEmpty(dqoyVar.n)) {
            throw new IllegalStateException("offset requires limit");
        }
    }

    public final void m(dqpo... dqpoVarArr) {
        ekgb ekgbVarF = dqru.f(dqpoVarArr);
        ((dqox) this.a).b = ekgbVarF == null ? null : ekgb.n(ekgbVarF);
    }

    public final void n(dqxe dqxeVar, String str) {
        dqox dqoxVar = (dqox) this.a;
        if (dqoxVar.d == null) {
            if (dqoxVar.e == null) {
                int i = ekgb.d;
                dqoxVar.d = new ekfw();
            } else {
                int i2 = ekgb.d;
                dqoxVar.d = new ekfw();
                dqoxVar.d.j(dqoxVar.e);
                dqoxVar.e = null;
            }
        }
        dqoxVar.d.h(new dqof(dqxeVar, str));
    }

    public final void o(String str, String str2) {
        dqox dqoxVar = (dqox) this.a;
        if (dqoxVar.r == null) {
            if (dqoxVar.s == null) {
                dqoxVar.r = new ekgi();
            } else {
                dqoxVar.r = new ekgi();
                dqoxVar.r.g(dqoxVar.s);
                dqoxVar.s = null;
            }
        }
        dqoxVar.r.i(str, str2);
    }

    public final void p(dqwl dqwlVar) {
        dqox dqoxVar = (dqox) this.a;
        if (dqoxVar.p == null) {
            if (dqoxVar.q == null) {
                int i = ekgb.d;
                dqoxVar.p = new ekfw();
            } else {
                int i2 = ekgb.d;
                dqoxVar.p = new ekfw();
                dqoxVar.p.j(dqoxVar.q);
                dqoxVar.q = null;
            }
        }
        dqoxVar.p.h(dqwlVar);
    }

    public final void q() {
        this.a.d(true);
    }

    public final void r() {
        this.a.e(true);
    }

    public final void s() {
        this.a.g(true);
    }

    public final void t(dqpo dqpoVar, int i) {
        dqpo dqpoVar2;
        dqpo dqpoVar3;
        if (dqpoVar.c() == null) {
            throw new IllegalArgumentException(a.b(dqpoVar, "column ", " is not a foreign key"));
        }
        String strE = dqpoVar.e();
        dqwu dqwuVar = this.a;
        boolean zEquals = strE.equals(dqwuVar.j());
        dqpo dqpoVarC = dqpoVar.c();
        if (zEquals) {
            dqpoVar2 = dqpoVar;
            dqpoVar3 = dqpoVarC;
        } else {
            if (!dqpoVarC.e().equals(dqwuVar.j())) {
                throw new IllegalArgumentException("joining column to unrelated table");
            }
            dqpoVar3 = dqpoVar;
            dqpoVar2 = dqpoVarC;
        }
        dqwl dqwlVarA = dqpoVar3.a();
        dqwuVar.b().h(new dqth(dqwlVarA, dqpoVar3, dqpoVar2, "=", null, i, true, dqwlVarA.o));
    }

    public final void u() {
        this.a.f(true);
    }

    public final void v() {
        this.a.h(true);
    }

    public final void w(dqpo... dqpoVarArr) {
        ((dqox) this.a).k = (String) DesugarArrays.stream(dqpoVarArr).map(new Function() { // from class: dqwq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dqpo) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
    }

    public final void x(dqxe dqxeVar) {
        ((dqox) this.a).l = dqxeVar;
    }

    public final void y(int i) {
        ((dqox) this.a).m = String.valueOf(i);
    }

    public final void z(String str) {
        ((dqox) this.a).m = str;
    }
}
