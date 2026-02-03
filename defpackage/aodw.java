package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aodw implements aoer {
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/MyIdentityBasedSelfIdentity");
    private final ejxr A;
    private final awxn B;
    private final aofe C;
    public final awxn a;
    public final Optional b;
    public final fcsu c;
    public final cqbm d;
    public final fcsu e;
    public final fcsu f;
    private final Optional h;
    private final fcsu i;
    private final Context j;
    private final cpbn k;
    private final alrj l;
    private final fcsu m;
    private final fcsu n;
    private final fdjx o;
    private final fdjx p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final aqts w;
    private final aqtr x;
    private final ejxr y;
    private final ejxr z;

    public aodw(awxn awxnVar, Optional optional, fcsu fcsuVar, Optional optional2, aofe aofeVar, Context context, awzf awzfVar, fcsu fcsuVar2, cpbn cpbnVar, alrj alrjVar, cqbm cqbmVar, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar, fdjx fdjxVar2, final fcsu fcsuVar5, final fcsu fcsuVar6, final fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, aqts aqtsVar, aqtr aqtrVar) {
        awxnVar.getClass();
        optional.getClass();
        fcsuVar.getClass();
        optional2.getClass();
        context.getClass();
        awzfVar.getClass();
        fcsuVar2.getClass();
        cpbnVar.getClass();
        alrjVar.getClass();
        cqbmVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        aqtsVar.getClass();
        aqtrVar.getClass();
        this.a = awxnVar;
        this.h = optional;
        this.i = fcsuVar;
        this.b = optional2;
        this.C = aofeVar;
        this.j = context;
        this.c = fcsuVar2;
        this.k = cpbnVar;
        this.l = alrjVar;
        this.d = cqbmVar;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
        this.o = fdjxVar;
        this.p = fdjxVar2;
        this.q = fcsuVar8;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.e = fcsuVar11;
        this.f = fcsuVar12;
        this.t = fcsuVar13;
        this.u = fcsuVar14;
        this.v = fcsuVar15;
        this.w = aqtsVar;
        this.x = aqtrVar;
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: aodn
            @Override // defpackage.ejxr
            public final Object get() {
                aodw aodwVar = this.a;
                Optional optionalL = ((crny) aodwVar.c.b()).l(aodwVar.a);
                final fcsu fcsuVar16 = fcsuVar5;
                final fdap fdapVar = new fdap() { // from class: aodh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return ((aoix) fcsuVar16.b()).a((crof) obj);
                    }
                };
                return (anpj) optionalL.map(new Function() { // from class: aodj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(new anpk(aoio.b));
            }
        });
        ejxrVarA.getClass();
        this.y = ejxrVarA;
        ejxr ejxrVarA2 = ejxx.a(new ejxr() { // from class: aodo
            @Override // defpackage.ejxr
            public final Object get() {
                final aodw aodwVar = this.a;
                Optional optionalL = ((crny) aodwVar.c.b()).l(aodwVar.a);
                final fcsu fcsuVar16 = fcsuVar6;
                final fdap fdapVar = new fdap() { // from class: aodl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return ((aofz) fcsuVar16.b()).a(aodwVar.a.f(), (crof) obj);
                    }
                };
                return optionalL.map(new Function() { // from class: aodm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
        ejxrVarA2.getClass();
        this.z = ejxrVarA2;
        ejxr ejxrVarA3 = ejxx.a(new ejxr() { // from class: aodp
            @Override // defpackage.ejxr
            public final Object get() {
                return ((aofw) fcsuVar7.b()).a();
            }
        });
        ejxrVarA3.getClass();
        this.A = ejxrVarA3;
        this.B = awxnVar;
    }

    private final awyv D(aoer aoerVar) {
        return ((awyu) this.m.b()).a(aoerVar.k());
    }

    @Override // defpackage.aoer
    public final eiju A(final int i, final Optional optional) {
        if (i == 0) {
            throw null;
        }
        optional.getClass();
        Optional optional2 = (Optional) this.n.b();
        final fdap fdapVar = new fdap() { // from class: aoda
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i2 = i;
                aogn aognVar = (aogn) obj;
                aodw aodwVar = this;
                return (i2 == 2 || i2 == 3) ? aognVar.a(aodwVar, optional) : eijx.e(aognVar.d(aodwVar, aodwVar.b));
            }
        };
        Object objOrElseGet = optional2.map(new Function() { // from class: aodb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aodc
            @Override // java.util.function.Supplier
            public final Object get() {
                return eijx.e(Optional.empty());
            }
        });
        objOrElseGet.getClass();
        return (eiju) objOrElseGet;
    }

    public final Integer B() {
        Optional optionalD = D(this).d();
        optionalD.getClass();
        return (Integer) fdct.b(optionalD);
    }

    public final Set C() {
        ekhx ekhxVarA = D(this).a();
        ekhxVarA.getClass();
        return ekhxVarA;
    }

    @Override // defpackage.aoer
    public final int a() {
        Optional optionalL = ((crny) this.c.b()).l(this.a);
        final fdap fdapVar = new fdap() { // from class: aocx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Integer.valueOf(((crof) obj).b());
            }
        };
        Object objOrElse = optionalL.map(new Function() { // from class: aodi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0);
        objOrElse.getClass();
        return ((Number) objOrElse).intValue();
    }

    @Override // defpackage.aoer
    public final int b() {
        final awyv awyvVarD = D(this);
        Collection collectionA = awyvVarD.a();
        collectionA.getClass();
        Object obj = null;
        if (collectionA instanceof List) {
            List list = (List) collectionA;
            if (list.size() == 1) {
                obj = list.get(0);
            }
        } else {
            Iterator it = collectionA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                }
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        Object objOrElseGet = awyvVarD.d().orElseGet(new Supplier() { // from class: aodk
            @Override // java.util.function.Supplier
            public final Object get() {
                ekhx ekhxVarA = awyvVarD.a();
                ekhxVarA.getClass();
                return (Integer) fcva.M(ekhxVarA);
            }
        });
        objOrElseGet.getClass();
        return ((Number) objOrElseGet).intValue();
    }

    @Override // defpackage.aoer
    public final Uri c() {
        aofr aofrVar = (aofr) this.i.b();
        Uri uriF = this.k.f(aofrVar.b, aofrVar.a, (alqm) this.a.f().orElse(this.l.f()), new ParticipantColor(), false, false, false);
        uriF.getClass();
        return uriF;
    }

    @Override // defpackage.aoer
    public final Uri d() {
        Integer numB = B();
        if (numB != null) {
            return cpbr.l(this.j, numB.intValue(), String.valueOf(this.C.a + 1), a());
        }
        Uri uri = Uri.EMPTY;
        uri.getClass();
        return uri;
    }

    @Override // defpackage.aoer
    public final anpj e() {
        return ((aqtu) this.r.b()).a() ? ((aofp) this.s.b()).a() : new anpk(aoff.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aodw) && fdbq.f(((aodw) obj).B.b(), this.B.b());
    }

    @Override // defpackage.aoer
    public final anpj f() {
        Object obj = this.y.get();
        obj.getClass();
        return (anpj) obj;
    }

    @Override // defpackage.aoer
    public final anpj g() {
        Optional optional = (Optional) this.z.get();
        final fdap fdapVar = new fdap() { // from class: aodq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((aofy) obj).a();
            }
        };
        Object objOrElse = optional.map(new Function() { // from class: aodr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new anpk(false));
        objOrElse.getClass();
        return (anpj) objOrElse;
    }

    @Override // defpackage.aoer
    public final SelfIdentityId h() {
        awxn awxnVar = this.a;
        String string = awxnVar.b().toString();
        string.getClass();
        Object objOrElse = this.h.orElse(aofa.a(string, awxnVar.b()));
        objOrElse.getClass();
        return (SelfIdentityId) objOrElse;
    }

    public final int hashCode() {
        return this.B.b().hashCode();
    }

    @Override // defpackage.aoer
    public final aoft i() {
        Object obj = this.A.get();
        obj.getClass();
        return (aoft) obj;
    }

    @Override // defpackage.aoer
    public final aoip j() {
        return ((aoiq) this.q.b()).b(this.a);
    }

    @Override // defpackage.aoer
    public final awxn k() {
        return this.B;
    }

    @Override // defpackage.aoer
    public final eiju l() {
        return auvw.c(this.p, fcyi.a, fdjz.a, new aodv(this, null));
    }

    @Override // defpackage.aoer
    public final eiju m(boolean z, boolean z2) {
        return auvw.c(this.o, fcyi.a, fdjz.a, new aodt(this, z, z2, null));
    }

    @Override // defpackage.aoer
    public final eiju n(ajna ajnaVar) {
        ajnaVar.getClass();
        return auvw.c(this.o, fcyi.a, fdjz.a, new aodu(ajnaVar, this, null));
    }

    @Override // defpackage.aoer
    public final Optional o() {
        Optional optionalF = this.a.f();
        optionalF.getClass();
        return optionalF;
    }

    @Override // defpackage.aoer
    public final String p() {
        Optional optionalF = this.a.f();
        final fdap fdapVar = new fdap() { // from class: aodf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((alqm) obj).G(true).toString();
            }
        };
        Optional map = optionalF.map(new Function() { // from class: aodg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return (String) fdct.b(map);
    }

    @Override // defpackage.aoer
    public final String q() {
        return this.a.h();
    }

    @Override // defpackage.aoer
    public final String r() {
        return this.a.h();
    }

    @Override // defpackage.aoer
    public final String s() {
        return ((aofr) this.i.b()).a;
    }

    @Override // defpackage.aoer
    public final String t() {
        Optional optionalF = this.a.f();
        final fdap fdapVar = new fdap() { // from class: aodd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return String.valueOf(((alqm) obj).m(true));
            }
        };
        Optional map = optionalF.map(new Function() { // from class: aode
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return (String) fdct.b(map);
    }

    public final String toString() {
        return "SelfIdentity{id:" + h() + ", subIds: " + C() + "}";
    }

    @Override // defpackage.aoer
    public final boolean u() {
        Integer numB;
        if (((aquo) this.u.b()).a() && (numB = B()) != null) {
            return !((ewtm) this.v.b()).b.contains(Integer.valueOf(((crny) this.c.b()).h(numB.intValue()).c()));
        }
        return false;
    }

    @Override // defpackage.aoer
    public final boolean v() {
        Integer numB;
        if (this.x.a()) {
            return true;
        }
        if (this.w.a() && (numB = B()) != null) {
            return ((ewtm) this.t.b()).b.contains(Integer.valueOf(((crny) this.c.b()).h(numB.intValue()).c()));
        }
        return false;
    }

    @Override // defpackage.aoer
    public final boolean w() {
        return B() != null;
    }

    @Override // defpackage.aoer
    public final boolean x() {
        return ((crny) this.c.b()).s(this.a);
    }

    @Override // defpackage.aoer
    public final boolean y() {
        Optional optionalL = ((crny) this.c.b()).l(this.a);
        final fdap fdapVar = new fdap() { // from class: aocy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((crof) obj).B());
            }
        };
        Object objOrElse = optionalL.map(new Function() { // from class: aocz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false);
        objOrElse.getClass();
        return ((Boolean) objOrElse).booleanValue();
    }

    @Override // defpackage.aoer
    public final boolean z(aoer aoerVar) {
        if (fdbq.f(aoerVar.k().b(), this.B.b())) {
            return true;
        }
        if (!fdbq.f(D(aoerVar).c(), D(this).c())) {
            return false;
        }
        ekrw ekrwVarJ = g.j();
        ekrwVarJ.X(eksq.a, "BugleSelfIdentity");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/MyIdentityBasedSelfIdentity", "isSameSelfIdentity", 181, "MyIdentityBasedSelfIdentity.kt")).q("Different MyIdentities with the same address");
        return true;
    }
}
