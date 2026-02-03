package defpackage;

import android.util.Base64;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpk {
    public static final cqce a = cqce.g("Bugle", "JsBridgeManager");
    public static final Object b = new Object();
    public static final ejxr c = cdag.w(198333659, "add_root_trace_to_jsbridge_messages");
    public final cqtx d;
    public final eosd e;
    public final abqj f;
    public final fcsu g;
    public final eigp h;
    public final Map i = new EnumMap(abou.class);
    public final Map j = new ConcurrentHashMap();
    public final ekfe k = new ekfe();

    public abpk(cqtx cqtxVar, eosd eosdVar, abqj abqjVar, fcsu fcsuVar, eigp eigpVar) {
        this.d = cqtxVar;
        this.e = eosdVar;
        this.f = abqjVar;
        this.g = fcsuVar;
        this.h = eigpVar;
    }

    public static String a(evpz evpzVar) {
        return Base64.encodeToString(evpzVar.toByteArray(), 0);
    }

    private final void i(abou abouVar) {
        Set setD;
        ekfe ekfeVar = this.k;
        synchronized (ekfeVar) {
            setD = ekfeVar.d(abouVar);
        }
        if (setD == null) {
            return;
        }
        Iterator it = setD.iterator();
        while (it.hasNext()) {
            ((kog) it.next()).b(null);
        }
    }

    public final void b(abou abouVar, abto abtoVar) {
        synchronized (b) {
            abpg abpgVar = (abpg) this.i.get(abouVar);
            if (abpgVar != null) {
                if (!abtoVar.equals(abpgVar.d())) {
                    return;
                }
                try {
                    abpgVar.close();
                } catch (IOException e) {
                    a.o("Failed when closing a JsBridgeChannel", e);
                }
            }
            this.i.remove(abouVar);
        }
    }

    public final void c(abpl abplVar, eppj eppjVar, abpg abpgVar) {
        a.s("Exception when handling JsBridge request", abplVar);
        abdl abdlVar = (abdl) this.g.b();
        eppl epplVar = (eppl) eppjVar.instance;
        String str = epplVar.d;
        int i = eppk.a(epplVar.b).B;
        exmt exmtVar = abplVar.a;
        abdlVar.i(str, i, exmtVar);
        try {
            abqi abqiVarB = abpgVar.b();
            eppjVar.copyOnWrite();
            ((eppl) eppjVar.instance).e = exmtVar.a();
            String str2 = (String) Optional.ofNullable(abplVar.getMessage()).orElse("Unknown Error");
            eppjVar.copyOnWrite();
            eppl epplVar2 = (eppl) eppjVar.instance;
            str2.getClass();
            epplVar2.f = str2;
            abqiVarB.a(a(eppjVar.build()));
        } catch (abpv e) {
            a.s("Could not send reply to Ditto. Channel has closed", e);
        }
    }

    public final void d(abou abouVar) {
        synchronized (b) {
            Map map = this.i;
            abpg abpgVar = (abpg) map.get(abouVar);
            if (abpgVar == null) {
                a.p(String.format("Cannot pause nonexistent channel %s", abouVar.name()));
                return;
            }
            if (abpgVar.g()) {
                return;
            }
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Pausing JsBridge channel");
            cqbdVarC.A("hostType", abouVar);
            cqbdVarC.r();
            ejyb.a(true ^ abpgVar.g());
            map.put(abouVar, new abnp(abpgVar.d(), abpgVar.b(), abpgVar.c(), abpgVar.a(), abpgVar.e(), true, abpgVar.f()));
        }
    }

    public final void e(abou abouVar) {
        i(abouVar);
        i(abou.AGNOSTIC);
    }

    public final void f(abou abouVar) {
        synchronized (b) {
            Map map = this.i;
            abpg abpgVar = (abpg) map.get(abouVar);
            if (abpgVar == null) {
                a.p(String.format("Cannot unpause nonexistent channel %s", abouVar.name()));
                return;
            }
            if (abpgVar.g()) {
                ejyb.a(abpgVar.g());
                map.put(abouVar, new abnp(abpgVar.d(), abpgVar.b(), abpgVar.c(), abpgVar.a(), abpgVar.e(), false, abpgVar.f()));
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Unpausing JsBridge channel");
                cqbdVarC.A("hostType", abouVar);
                cqbdVarC.r();
                e(abouVar);
            }
        }
    }

    public final boolean g() {
        boolean zAnyMatch;
        synchronized (b) {
            zAnyMatch = Collection.EL.stream(this.i.values()).filter(new Predicate() { // from class: abos
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
                    cqce cqceVar = abpk.a;
                    return !((abpg) obj).g();
                }
            }).anyMatch(new Predicate() { // from class: abog
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
                    return ((abpg) obj).h();
                }
            });
        }
        return zAnyMatch;
    }

    public final boolean h(abou abouVar) {
        abpg abpgVar;
        if (abouVar == abou.AGNOSTIC) {
            return g();
        }
        synchronized (b) {
            abpgVar = (abpg) this.i.get(abouVar);
        }
        return (abpgVar == null || !abpgVar.h() || abpgVar.g()) ? false : true;
    }
}
