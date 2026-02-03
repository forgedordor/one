package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuuq {
    public static final /* synthetic */ int d = 0;
    public final egyt a;
    public final cmfo b;
    final String c;
    private final egzh e;

    static {
        cdag.h(cdag.b, "enable_per_subscription_settings_migration_to_settings_store", true);
    }

    public cuuq(cmgk cmgkVar, egyt egytVar, crny crnyVar, egzh egzhVar, int i) {
        this.a = egytVar;
        this.e = egzhVar;
        int iA = crnyVar.h(i).a();
        cmgg cmggVarC = cmgh.c();
        cmfn cmfnVar = cmfn.PER_SUBSCRIPTION_SETTINGS;
        cmggVarC.d(cmfnVar);
        cmggVarC.g(String.valueOf(iA));
        cmggVarC.f(cuud.a);
        cmggVarC.c(new Supplier() { // from class: cuuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cuup();
            }
        });
        this.b = cmgkVar.a(cmggVarC.a());
        this.c = String.valueOf(String.valueOf(cmfnVar)).concat(String.valueOf(String.valueOf(iA)));
    }

    final cuud a() {
        try {
            return (cuud) this.b.l();
        } catch (evtj e) {
            throw new IllegalStateException("InvalidProtocolBufferException while getting per subscription settings data", e);
        }
    }

    public final eiju b(Optional optional) {
        final String str = (String) optional.map(new Function() { // from class: cuug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cuuq.d;
                return ((alqm) obj).l();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (str == null) {
            eiju eijuVarJ = this.b.j(new ejvr() { // from class: cuuk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cuud cuudVar = (cuud) obj;
                    int i = cuuq.d;
                    cuudVar.getClass();
                    cuuc builder = cuudVar.toBuilder();
                    builder.copyOnWrite();
                    cuud cuudVar2 = (cuud) builder.instance;
                    cuudVar2.b &= -33;
                    cuudVar2.h = cuud.a.h;
                    return builder.build();
                }
            });
            j(eijuVarJ);
            return eijuVarJ;
        }
        eiju eijuVarJ2 = this.b.j(new ejvr() { // from class: cuuh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cuud cuudVar = (cuud) obj;
                int i = cuuq.d;
                cuudVar.getClass();
                cuuc builder = cuudVar.toBuilder();
                builder.copyOnWrite();
                cuud cuudVar2 = (cuud) builder.instance;
                cuudVar2.b |= 32;
                cuudVar2.h = str;
                return builder.build();
            }
        });
        j(eijuVarJ2);
        return eijuVarJ2;
    }

    public final Optional c() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 1) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.c)) : Optional.empty();
    }

    public final Optional d() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 2) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.d)) : Optional.empty();
    }

    public final Optional e() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 64) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.i)) : Optional.empty();
    }

    public final Optional f() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 8) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.f)) : Optional.empty();
    }

    public final Optional g() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 16) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.g)) : Optional.empty();
    }

    public final Optional h() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 32) != 0 ? Optional.of(cuudVarA.h) : Optional.empty();
    }

    public final Optional i() {
        cuud cuudVarA = a();
        return (cuudVarA.b & 4) != 0 ? Optional.of(Boolean.valueOf(cuudVarA.e)) : Optional.empty();
    }

    public final void j(eiju eijuVar) {
        this.e.a(eijuVar, this.c);
    }
}
