package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgwa {
    public static final /* synthetic */ int b = 0;
    private static final dhip c = new dhip("ImsServiceManager");
    private static final dfny d = dfod.a(177222621);
    public final List a;
    private volatile boolean e;
    private final dhip f;

    public dgwa() {
        this.a = ((Boolean) d.a()).booleanValue() ? new CopyOnWriteArrayList() : new ArrayList(12);
        this.e = false;
        this.f = c;
    }

    public final dgvq a(Class cls) {
        for (dgvq dgvqVar : this.a) {
            if (cls.isInstance(dgvqVar)) {
                return (dgvq) cls.cast(dgvqVar);
            }
        }
        return null;
    }

    public final dgvq b(Class cls) throws dhft {
        dgvq dgvqVarA = a(cls);
        if (dgvqVarA != null) {
            return dgvqVarA;
        }
        throw new dhft(1, "Service not available: ".concat(String.valueOf(cls.getName())));
    }

    public final Optional c(final String str) {
        if (str == null) {
            dhja.k("No session can be found for null callId", new Object[0]);
            return Optional.empty();
        }
        Optional optionalFindAny = Collection.EL.stream(this.a).flatMap(new Function() { // from class: dgvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dgvq dgvqVar = (dgvq) obj;
                dgwg dgwgVar = dgvqVar.c;
                int i = dgwa.b;
                return Collection.EL.stream(dgwgVar.b(dgvqVar));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dgvx
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
                int i = dgwa.b;
                return str.equals(((dgwe) obj).l.a);
            }
        }).findAny();
        if (optionalFindAny.isEmpty()) {
            dhja.k("No session can be found for callId: %s", str);
        }
        return optionalFindAny;
    }

    public final Optional d(final String str) {
        return str == null ? Optional.empty() : Collection.EL.stream(this.a).flatMap(new Function() { // from class: dgvu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = dgwa.b;
                return Collection.EL.stream(((dgvq) obj).d.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dgvv
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
                int i = dgwa.b;
                return str.equals(((dgwm) obj).e.a);
            }
        }).findAny();
    }

    public final void e(dgvq dgvqVar) {
        this.a.add(dgvqVar);
    }

    public final synchronized void f() {
        if (this.e) {
            dhja.r(this.f, "Services already started", new Object[0]);
            return;
        }
        this.e = true;
        for (dgvq dgvqVar : this.a) {
            String name = dgvqVar.getClass().getName();
            dhja.d(this.f, "Start IMS service: %s", name);
            try {
                dgvqVar.j();
            } catch (Exception e) {
                dhja.j(e, this.f, "Error while starting service: %s", name);
            }
        }
    }

    public final synchronized void g(dezf dezfVar) {
        if (!this.e) {
            dhja.d(this.f, "Not stopping, services already stopped", new Object[0]);
            return;
        }
        dhip dhipVar = this.f;
        dhja.d(dhipVar, "Stopping all IMS services due to %s", dezfVar);
        try {
            for (dgvq dgvqVar : ekjz.f(this.a)) {
                String name = dgvqVar.getClass().getName();
                if (dezfVar == dezf.NETWORK_CHANGE || dezfVar == dezf.VPN_SETUP || dezfVar == dezf.VPN_TEARDOWN || dezfVar == dezf.ACTIVE_MEDIA_NETWORK_INTERFACE_CHANGE || dezfVar == dezf.CONNECTIVITY_CHANGE) {
                    dgvqVar.n();
                }
                if (dezfVar == dezf.NETWORK_ERROR) {
                    dgvqVar.o();
                }
                dhja.d(dhipVar, "Stopping IMS service: %s", name);
                try {
                    dgvqVar.k(dezfVar);
                } catch (Exception e) {
                    dhja.j(e, this.f, "Error while stopping service: %s", name);
                }
            }
        } finally {
            this.e = false;
        }
    }
}
