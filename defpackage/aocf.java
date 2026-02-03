package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class aocf implements aoer {
    public static final eksp a = eksp.c("BugleSelfIdentity");
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final asaz D;
    final Optional b;
    public final fcsu c;
    final fcsu d;
    public final cqbm e;
    public final fcsu f;
    public final fcsu g;
    private final ParticipantsTable.BindData h;
    private final Context i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final eosc m;
    private final fcsu n;
    private final fcsu o;
    private final SelfIdentityId p;
    private final ejxr q;
    private final ejxr r;
    private final ejxr s;
    private final Optional t;
    private final eosc u;
    private final eosc v;
    private final fcsu w;
    private final anpj x;
    private final fcsu y;
    private final fcsu z;

    public aocf(Context context, final fcsu fcsuVar, final fcsu fcsuVar2, final fcsu fcsuVar3, final fcsu fcsuVar4, fcsu fcsuVar5, final fcsu fcsuVar6, fcsu fcsuVar7, cqbm cqbmVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, final ParticipantsTable.BindData bindData, Optional optional, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, asaz asazVar) {
        this.i = context;
        this.j = fcsuVar;
        this.k = fcsuVar5;
        this.l = fcsuVar7;
        this.m = eoscVar2;
        this.n = fcsuVar14;
        this.o = fcsuVar15;
        this.c = fcsuVar16;
        ejwl.a(bindData.r() != -2);
        this.h = bindData;
        this.b = optional;
        this.p = aofa.b(bindData.R());
        this.q = ejxx.a(new ejxr() { // from class: aobu
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = aocf.a;
                return ((aoix) fcsuVar2.b()).a(((crny) fcsuVar.b()).h(bindData.r()));
            }
        });
        this.r = ejxx.a(new ejxr() { // from class: aobw
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = aocf.a;
                aofz aofzVar = (aofz) fcsuVar3.b();
                alrj alrjVar = (alrj) fcsuVar6.b();
                ParticipantsTable.BindData bindData2 = bindData;
                return aofzVar.a(alrjVar.A(bindData2), ((crny) fcsuVar.b()).h(bindData2.r()));
            }
        });
        this.s = ejxx.a(new ejxr() { // from class: aobx
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = aocf.a;
                return ((aofw) fcsuVar4.b()).a();
            }
        });
        this.t = Optional.of(((alrj) fcsuVar6.b()).o(bindData));
        this.e = cqbmVar;
        this.u = eoscVar;
        this.v = eoscVar3;
        this.d = fcsuVar8;
        this.f = fcsuVar9;
        this.g = fcsuVar10;
        this.w = fcsuVar11;
        this.x = ((aqtu) fcsuVar12.b()).a() ? ((aofp) fcsuVar13.b()).a() : new anpk(aoff.a);
        this.y = fcsuVar18;
        this.z = fcsuVar17;
        this.A = fcsuVar19;
        this.B = fcsuVar20;
        this.C = fcsuVar21;
        this.D = asazVar;
    }

    private final boolean B(SelfIdentityId selfIdentityId) {
        return ((SelfIdentityIdImpl) this.p).a.equals(selfIdentityId.b());
    }

    @Override // defpackage.aoer
    public final eiju A(final int i, final Optional optional) {
        return (eiju) ((Optional) this.d.b()).map(new Function() { // from class: aoby
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = i;
                aogn aognVar = (aogn) obj;
                aocf aocfVar = this.a;
                return (i2 == 2 || i2 == 3) ? aognVar.a(aocfVar, optional) : eijx.e(aognVar.c(aocfVar, aocfVar.b));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(eijx.e(Optional.empty()));
    }

    @Override // defpackage.aoer
    public final int a() {
        return this.h.s();
    }

    @Override // defpackage.aoer
    public final int b() {
        int iR = this.h.r();
        if (iR != -1) {
            return iR;
        }
        ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/DefaultSelfIdentity", "getSubId", 282, "DefaultSelfIdentity.java")).t("SelfIdentity %s wraps a subId = -1", h());
        return -1;
    }

    @Override // defpackage.aoer
    public final Uri c() {
        Optional optional = this.b;
        Uri uriE = null;
        if (!optional.isEmpty()) {
            Optional optionalO = o();
            if (!optionalO.isEmpty()) {
                uriE = ((cpbn) this.n.b()).e(((ProfilesTable.BindData) optional.get()).q(), ((ProfilesTable.BindData) optional.get()).v(), (alqm) optionalO.get(), null);
            }
        }
        return uriE != null ? uriE : ((axjf) this.k.b()).a(this.h);
    }

    @Override // defpackage.aoer
    public final Uri d() {
        fcsu fcsuVar = this.j;
        ParticipantsTable.BindData bindData = this.h;
        return cpbr.l(this.i, bindData.r(), Integer.toString(((crny) fcsuVar.b()).h(bindData.r()).d() + 1), a());
    }

    @Override // defpackage.aoer
    public final anpj e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aocf) {
            return B(((aocf) obj).h());
        }
        return false;
    }

    @Override // defpackage.aoer
    public final anpj f() {
        return (anpj) this.q.get();
    }

    @Override // defpackage.aoer
    public final anpj g() {
        return ((aofy) this.r.get()).a();
    }

    @Override // defpackage.aoer
    public final SelfIdentityId h() {
        return aofa.b(this.h.R());
    }

    public final int hashCode() {
        return h().hashCode();
    }

    @Override // defpackage.aoer
    public final aoft i() {
        return (aoft) this.s.get();
    }

    @Override // defpackage.aoer
    public final aoip j() {
        return (aoip) o().filter(new Predicate() { // from class: aocb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                eksp ekspVar = aocf.a;
                return ((alqm) obj).e().isPresent();
            }
        }).filter(new Predicate() { // from class: aocc
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((crmx) this.a.g.b()).I(((aubq) ((alqm) obj).e().get()).d);
            }
        }).map(new Function() { // from class: aocd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoiq) this.a.f.b()).a((alqm) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aoce
            @Override // java.util.function.Supplier
            public final Object get() {
                ((eksl) ((eksl) aocf.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/DefaultSelfIdentity", "getRcsConfig", 378, "DefaultSelfIdentity.java")).q("messaging identity is not available, returning default config.");
                return aohv.a;
            }
        });
    }

    @Override // defpackage.aoer
    public final awxn k() {
        throw new UnsupportedOperationException("This class does not use MyIdentity, use MyIdentityBasedSelfIdentity instead");
    }

    @Override // defpackage.aoer
    public final eiju l() {
        return eijx.g(new Callable() { // from class: aobz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.j();
            }
        }, this.v);
    }

    @Override // defpackage.aoer
    public final eiju m(final boolean z, final boolean z2) {
        return ((aokn) this.o.b()).a(this).h(new ejvr() { // from class: aobv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((aokc) this.a.c.b()).a(z ? ajlj.GROUP : ajlj.ONE_ON_ONE, z2, (aokm) obj);
            }
        }, this.m);
    }

    @Override // defpackage.aoer
    public final eiju n(final ajna ajnaVar) {
        return eiju.g(this.u.submit(eiid.l(new Callable() { // from class: aoca
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = true != ajnaVar.g ? 0 : 3;
                aocf aocfVar = this.a;
                return Boolean.valueOf(((cqey) aocfVar.e.a()).d(i, aocfVar.b()) == cqgk.AVAILABLE);
            }
        })));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alqm, java.lang.Object] */
    @Override // defpackage.aoer
    public final Optional o() {
        Optional optional = this.t;
        optional.isPresent();
        return optional.get().E() ? optional : ((aoin) this.l.b()).a(b());
    }

    @Override // defpackage.aoer
    public final String p() {
        return this.h.O();
    }

    @Override // defpackage.aoer
    public final String q() {
        return ejwk.b(this.h.W());
    }

    @Override // defpackage.aoer
    public final String r() {
        String strQ = q();
        String strP = p();
        return strP != null ? a.q(strP, strQ, " ") : strQ;
    }

    @Override // defpackage.aoer
    public final String s() {
        return this.h.Q();
    }

    @Override // defpackage.aoer
    public final String t() {
        return this.h.T();
    }

    public final String toString() {
        return String.format("SelfIdentity{id:%s, subId: %s} has rows {%s}", h(), Integer.valueOf(b()), this.p);
    }

    @Override // defpackage.aoer
    public final boolean u() {
        if (((aquo) this.A.b()).a()) {
            return !((ewtm) this.B.b()).b.contains(Integer.valueOf(((crny) this.j.b()).h(b()).c()));
        }
        return false;
    }

    @Override // defpackage.aoer
    public final boolean v() {
        if (((aqtr) this.C.b()).a()) {
            return true;
        }
        if (!((aqts) this.z.b()).a()) {
            return false;
        }
        return ((ewtm) this.y.b()).b.contains(Integer.valueOf(((crny) this.j.b()).h(b()).c()));
    }

    @Override // defpackage.aoer
    public final boolean w() {
        return ((crny) this.j.b()).h(this.h.r()).C();
    }

    @Override // defpackage.aoer
    public final boolean x() {
        int iC = ((crny) this.j.b()).c();
        return iC >= 0 && b() == iC;
    }

    @Override // defpackage.aoer
    public final boolean y() {
        return ((crny) this.j.b()).h(this.h.r()).B();
    }

    @Override // defpackage.aoer
    public final boolean z(aoer aoerVar) {
        if (!this.D.a()) {
            return B(aoerVar.h());
        }
        if (B(aoerVar.h())) {
            return true;
        }
        Optional optionalO = o();
        Optional optionalO2 = aoerVar.o();
        if (optionalO.isPresent() && optionalO2.isPresent()) {
            return optionalO.equals(optionalO2);
        }
        return false;
    }
}
