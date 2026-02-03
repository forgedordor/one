package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajoq implements ajoy {
    final ajot a;
    public final ajok b;
    private final eosc c;
    private final ejxr d;
    private final fcsu e;

    public ajoq(final ajof ajofVar, eosc eoscVar, ajot ajotVar, ajok ajokVar, fcsu fcsuVar) {
        this.c = eoscVar;
        this.a = ajotVar;
        this.b = ajokVar;
        this.d = ejxx.a(new ejxr() { // from class: ajon
            @Override // defpackage.ejxr
            public final Object get() {
                eosc eoscVar2 = (eosc) ajofVar.a.b();
                eoscVar2.getClass();
                return new ajoe(eoscVar2, this.a);
            }
        });
        this.e = fcsuVar;
    }

    @Override // defpackage.ajoy
    public final ajox a() {
        return (ajox) this.d.get();
    }

    @Override // defpackage.ajoy
    public final ajoz b() {
        return (ajoz) this.e.b();
    }

    @Override // defpackage.ajoy
    public final eiju c() {
        eieu eieuVarK = eiiy.k("BugleContactRepository#getContactHeaderSections");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajoo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bnfb bnfbVarA = bnfe.a();
                    bnfbVarA.A("getContactHeaderSections");
                    bnfbVarA.s();
                    bnfbVarA.e(new Function() { // from class: ajom
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bndv) obj).n;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bndv bndvVar = bnfe.c;
                    int i = 0;
                    bnfbVarA.n(new dqxl("COUNT(distinct $V)", new Object[]{bndvVar.b}), "count");
                    bnfbVarA.c(new bney(bndvVar.o), new bney(bndvVar.m));
                    bnfbVarA.w(bndvVar.n);
                    bndx bndxVar = (bndx) bnfbVarA.b().p();
                    try {
                        int i2 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        while (bndxVar.moveToNext()) {
                            int i3 = Integer.parseInt(bndxVar.de("count"));
                            ekfwVar.h(new ajov(bndxVar.h(), i, i3));
                            i += i3;
                        }
                        ekgb ekgbVarG = ekfwVar.g();
                        bndxVar.close();
                        return ekgbVarG;
                    } catch (Throwable th) {
                        try {
                            bndxVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.c);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoy
    public final eiju d(final int i, final int i2) {
        eieu eieuVarK = eiiy.k("BugleContactRepository#getContacts");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajop
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final int i3 = i;
                    final int i4 = i2;
                    return this.a.b.a("getContacts", new Function() { // from class: ajoh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bnfd bnfdVar = (bnfd) obj;
                            bnfb bnfbVarA = bnfe.a();
                            bnfbVarA.A("pagingInnerQuery");
                            bnfbVarA.u();
                            bnfbVarA.e(new Function() { // from class: ajog
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((bndv) obj2).b;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bndv bndvVar = bnfe.c;
                            bnfbVarA.c(new bney(bndvVar.o), new bney(bndvVar.m));
                            bnfbVarA.B(i3);
                            bnfbVarA.y(i4);
                            bnfdVar.ap(new dqpk("contacts.contact_id", 3, bnfbVarA.b()));
                            return bnfdVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, this.c);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoy
    public final eiju e() {
        eiju eijuVarB;
        eieu eieuVarK = eiiy.k("BugleContactRepository#getFavoritePhoneContacts");
        try {
            ajot ajotVar = this.a;
            Optional optional = (Optional) ajotVar.c.getAndSet(Optional.empty());
            if (optional.isPresent()) {
                ajot.a.p("returning existing preloaded favorite contacts and skipping the query");
                eijuVarB = ((ajos) optional.get()).a;
            } else {
                eijuVarB = ajotVar.b();
            }
            eieuVarK.b(eijuVarB);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoy
    public final eiju f() {
        eieu eieuVarK = eiiy.k("BugleContactRepository#getTotalContactsCount");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajol
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(cqjh.a());
                }
            }, this.c);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoy
    public final void g() {
        ajot.a.p("cleaning up favorite contacts preloaded state");
        this.a.c.set(Optional.empty());
        ((ajoe) this.d.get()).f();
    }

    @Override // defpackage.ajoy
    public final void h(Boolean bool) {
        g();
        ajoe ajoeVar = (ajoe) this.d.get();
        ajod ajodVar = new ajod();
        ajodVar.a = ((Integer) ctif.d.e()).intValue();
        cqbd cqbdVarC = ajoe.a.c();
        cqbdVarC.I("starting preloading contacts");
        cqbdVarC.y("limit", ajodVar.a);
        cqbdVarC.r();
        ajoy ajoyVar = ajoeVar.b;
        ajodVar.b = ajoeVar.b(ajoyVar.d(0, ajodVar.a), ajoyVar.f(), 0);
        ejwl.l(((Optional) ajoeVar.c.getAndSet(Optional.of(ajodVar))).isEmpty());
        if (bool.booleanValue()) {
            ajot ajotVar = this.a;
            ajos ajosVar = new ajos();
            cqbd cqbdVarC2 = ajot.a.c();
            cqbdVarC2.I("starting preloading favorite contacts");
            cqbdVarC2.r();
            ajosVar.a = ajotVar.b();
            ejwl.l(((Optional) ajotVar.c.getAndSet(Optional.of(ajosVar))).isEmpty());
        }
    }
}
