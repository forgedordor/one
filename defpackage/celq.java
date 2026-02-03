package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class celq {
    public static final cqce a = cqce.g("BugleNetwork", "RemoteInstanceDatabaseOperations");
    public final dqsn b;
    public final cogw c;
    public final eygg d;
    public final aqvc e;
    private final eygg f;

    public celq(dqsn dqsnVar, cogw cogwVar, eygg eyggVar, aqvc aqvcVar, eygg eyggVar2) {
        this.b = dqsnVar;
        this.c = cogwVar;
        this.f = eyggVar2;
        this.d = eyggVar;
        this.e = aqvcVar;
    }

    public static btme a(final String str) {
        String[] strArr = btmf.a;
        btme btmeVar = new btme();
        String[] strArr2 = bton.a;
        btok btokVar = new btok(bton.a);
        btokVar.A("RemoteRegistrationsTable#whereUserId");
        btokVar.d(new Function() { // from class: celi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btom btomVar = (btom) obj;
                btomVar.b(str);
                return btomVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btokVar.c(bton.c.b);
        btmeVar.ap(new dqpk("remote_registrations_table.tachyon_registration_id", 3, btokVar.b()));
        return btmeVar;
    }

    public static boolean i(ezpn ezpnVar) {
        return ezpnVar.d.size() > 0 && ezpnVar.d.contains(Integer.valueOf(cefn.ETOUFFEE.h));
    }

    public static boolean j(ezpn ezpnVar) {
        return ezpnVar.d.size() > 0 && ezpnVar.d.contains(Integer.valueOf(cefn.ETOUFFEE_GROUPS.h));
    }

    public final ekgb b(final ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("RemoteInstanceDatabaseOperations#getExistingRegistrations#forMany");
        try {
            bkwz bkwzVarA = bkxc.a();
            bkwzVarA.A("getExistingRegistrations2");
            bkwzVarA.c(new Function() { // from class: celc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bkxb bkxbVar = (bkxb) obj;
                    bkxbVar.c(ekgbVar);
                    return bkxbVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bkwzVarA.b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb c(final String str) {
        eieu eieuVarK = eiiy.k("RemoteInstanceDatabaseOperations#getExistingRegistrations$forOne");
        try {
            bkwz bkwzVarA = bkxc.a();
            bkwzVarA.A("getExistingRegistrations1");
            bkwzVarA.c(new Function() { // from class: celj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bkxb bkxbVar = (bkxb) obj;
                    bkxbVar.b(str);
                    return bkxbVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bkwzVarA.b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb d(final ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("RemoteInstanceDatabaseOperations#getFreshRemoteInstances");
        try {
            final Instant instantMinus = this.c.f().minus(Duration.ofMillis(((Long) ccze.O.e()).longValue()));
            String[] strArr = btnj.a;
            btne btneVar = new btne(btnj.a);
            btneVar.A("+getFreshRemoteInstances");
            btneVar.k(new btnh((btni) new Function() { // from class: celb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btni btniVar = (btni) obj;
                    btniVar.ap(new dqpm("remote_user_id_info_table.remote_user_id", 3, btni.as(ekgbVar), false));
                    btniVar.ap(new dqpj("remote_user_id_info_table.guaranteed_fresh_as_of_timestamp", 7, Long.valueOf(bart.a(instantMinus))));
                    return btniVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new btni())));
            ekgb ekgbVarZ = btneVar.b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(String str, String str2, basa basaVar, Optional optional, Long l, Instant instant) {
        String[] strArr = btmf.a;
        btkq btkqVar = new btkq();
        btkqVar.i(str2);
        btkqVar.c(basaVar.a(cefn.ETOUFFEE));
        btkqVar.d(basaVar.a(cefn.ETOUFFEE_GROUPS));
        btkqVar.h(basaVar);
        btkqVar.g(this.c.f());
        btkqVar.b(instant);
        if (l == null) {
            btkqVar.f(false);
        } else {
            btkqVar.f(true);
            btkqVar.j(l.longValue());
        }
        if (optional.isPresent()) {
            btkqVar.e(((evqs) optional.get()).I());
        }
        btkn btknVarA = btkqVar.a();
        final dqsy dqsyVarB = btmf.b();
        dqru.b(btmf.b(), "remote_registrations_table", btknVarA, new Function() { // from class: btkl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.Q("remote_registrations_table", (dqst) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btkm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String[] strArr2 = bton.a;
        btns btnsVar = new btns();
        btnsVar.b(str);
        btnsVar.c(str2);
        btnp btnpVarA = btnsVar.a();
        final dqsy dqsyVarA = bton.a();
        dqru.b(bton.a(), "remote_user_id_to_registration_id", btnpVarA, new Function() { // from class: btnn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.Q("remote_user_id_to_registration_id", (dqst) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btno
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void f(String str, boolean z) {
        Iterator it = ((Set) this.f.b()).iterator();
        while (it.hasNext()) {
            ((bvuy) it.next()).a(str, z);
        }
    }

    public final void g(btkn btknVar) {
        h(btknVar, false);
    }

    public final void h(final btkn btknVar, boolean z) {
        eieu eieuVarK = eiiy.k("RemoteInstanceDatabaseOperations#setHasEncryption");
        try {
            String[] strArr = btmf.a;
            btmc btmcVar = new btmc();
            btmcVar.ap("setHasEncryption#update");
            btmcVar.d(true);
            if (z) {
                btmcVar.e(true);
            }
            btmcVar.h(new Function() { // from class: celf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btme btmeVar = (btme) obj;
                    btmeVar.b(btknVar.n());
                    return btmeVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btmcVar.b().e();
            String[] strArr2 = bton.a;
            btok btokVar = new btok(bton.a);
            btokVar.A("setHasEncryption");
            btokVar.d(new Function() { // from class: celg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btom btomVar = (btom) obj;
                    btomVar.c(btknVar.n());
                    return btomVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btoa btoaVar = (btoa) btokVar.b().p();
            while (btoaVar.moveToNext()) {
                try {
                    f(btoaVar.c(), true);
                } finally {
                }
            }
            btoaVar.close();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
