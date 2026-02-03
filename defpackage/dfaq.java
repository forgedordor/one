package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfaq {
    private static final dhip x = new dhip("RcsFlags");
    private static final Object y = new Object();
    public static volatile dfaq a = null;
    public static volatile dfbo b = null;
    private static volatile Optional z = Optional.empty();
    static final Boolean c = true;
    static final Boolean d = true;
    static final Long e = Long.valueOf(TimeUnit.SECONDS.toMillis(10));
    static final Long f = Long.valueOf(TimeUnit.MINUTES.toMillis(20));
    static final Integer g = 102400;
    static final Integer h = 10240;
    static final Integer i = Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10));
    static final Long j = Long.valueOf(TimeUnit.MINUTES.toSeconds(30));
    static final Long k = 5L;
    static final Integer l = -1;
    static final Integer m = -1;
    static final Boolean n = true;
    static final Boolean o = false;
    static final Boolean p = false;
    static final Boolean q = false;
    static final Boolean r = false;
    static final Boolean s = false;
    static final Boolean t = true;
    static final Boolean u = false;
    public static final long v = TimeUnit.MINUTES.toMillis(15);
    public static final long w = TimeUnit.HOURS.toMillis(24);

    public static dfaq E() {
        if (a == null) {
            H(((dfao) dfds.a(dfao.class)).a());
        }
        if (((Boolean) dfpi.t().a.Q.a()).booleanValue() && (!((Boolean) dfpi.t().a.S.a()).booleanValue() || dhka.f(((dfao) dfds.a(dfao.class)).a()))) {
            if (b == null) {
                dhja.d(x, "Amber enabled, setting mobileConfigurationInstance", new Object[0]);
                b = ((dfao) dfds.a(dfao.class)).b();
            }
            if (((Boolean) dfpi.t().a.P.a()).booleanValue()) {
                dhja.d(x, "logging RcsFlags.get() call stack", new Object[0]);
                Thread.dumpStack();
            }
            if (dfpi.z()) {
                if (b != null) {
                    return b;
                }
                throw new IllegalStateException("RcsFlags is not initialized!");
            }
        }
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Legacy RcsFlags is not initialized!");
    }

    public static void H(Context context) {
        synchronized (y) {
            dhip dhipVar = x;
            dhja.d(dhipVar, "createFlags", new Object[0]);
            dfbs dfbsVar = new dfbs(context);
            z.isPresent();
            StringBuilder sb = new StringBuilder();
            sb.append("<<< RcsFlags::");
            sb.append(String.format("Phenotype (%s)", "com.google.android.ims.library"));
            sb.append(" >>>");
            for (dfap dfapVar : dfbsVar.G()) {
                sb.append(System.lineSeparator());
                sb.append(dfapVar.b());
                sb.append("=");
                sb.append(dfapVar.a());
            }
            dhja.d(dhipVar, "%s", sb.toString());
            a = dfbsVar;
        }
    }

    public static void I(Context context) {
        dhja.d(x, "initialize RcsFlags", new Object[0]);
        new dfan(context).execute(new Void[0]);
    }

    public static void J(Context context) {
        dhja.d(x, "synchronously initialize RcsFlags", new Object[0]);
        H(context);
    }

    public abstract dfap A();

    public abstract dfap B();

    @Deprecated
    public abstract dfap C();

    public abstract dfap D();

    public ewqb F() {
        List list = (List) Collection.EL.stream(G()).map(new Function() { // from class: dfam
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dfap dfapVar = (dfap) obj;
                dfaq dfaqVar = dfaq.a;
                ewpx ewpxVar = (ewpx) ewpy.a.createBuilder();
                String strB = dfapVar.b();
                ewpxVar.copyOnWrite();
                ewpy ewpyVar = (ewpy) ewpxVar.instance;
                strB.getClass();
                ewpyVar.b |= 1;
                ewpyVar.c = strB;
                String string = dfapVar.a().toString();
                ewpxVar.copyOnWrite();
                ewpy ewpyVar2 = (ewpy) ewpxVar.instance;
                string.getClass();
                ewpyVar2.b |= 2;
                ewpyVar2.d = string;
                return (ewpy) ewpxVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        ewpz ewpzVar = (ewpz) ewqb.a.createBuilder();
        ewpzVar.copyOnWrite();
        ewqb ewqbVar = (ewqb) ewpzVar.instance;
        ewqbVar.c = L() - 1;
        ewqbVar.b |= 1;
        ewpzVar.copyOnWrite();
        ewqb ewqbVar2 = (ewqb) ewpzVar.instance;
        evtg evtgVar = ewqbVar2.e;
        if (!evtgVar.c()) {
            ewqbVar2.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(list, ewqbVar2.e);
        int iHashCode = list.hashCode();
        ewpzVar.copyOnWrite();
        ewqb ewqbVar3 = (ewqb) ewpzVar.instance;
        ewqbVar3.b |= 4;
        ewqbVar3.f = iHashCode;
        ewpzVar.copyOnWrite();
        ewqb ewqbVar4 = (ewqb) ewpzVar.instance;
        ewqbVar4.b |= 8;
        ewqbVar4.g = true;
        return (ewqb) ewpzVar.build();
    }

    public final List G() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a());
        arrayList.add(c());
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(h());
        arrayList.add(i());
        arrayList.add(j());
        arrayList.add(k());
        arrayList.add(l());
        arrayList.add(m());
        arrayList.add(n());
        arrayList.add(p());
        arrayList.add(B());
        arrayList.add(q());
        arrayList.add(s());
        arrayList.add(r());
        arrayList.add(t());
        arrayList.add(u());
        arrayList.add(w());
        arrayList.add(z());
        arrayList.add(A());
        arrayList.add(D());
        arrayList.add(C());
        arrayList.add(d());
        arrayList.add(b());
        arrayList.add(x());
        arrayList.add(g());
        arrayList.add(y());
        arrayList.add(v());
        arrayList.add(o());
        return arrayList;
    }

    public abstract boolean K();

    public abstract int L();

    @Deprecated
    public abstract dfap a();

    @Deprecated
    public abstract dfap b();

    public abstract dfap c();

    @Deprecated
    public abstract dfap d();

    public abstract dfap e();

    public abstract dfap f();

    @Deprecated
    public abstract dfap g();

    public abstract dfap h();

    public abstract dfap i();

    @Deprecated
    public abstract dfap j();

    public abstract dfap k();

    public abstract dfap l();

    @Deprecated
    public abstract dfap m();

    @Deprecated
    public abstract dfap n();

    @Deprecated
    public abstract dfap o();

    public abstract dfap p();

    @Deprecated
    public abstract dfap q();

    public abstract dfap r();

    public abstract dfap s();

    public abstract dfap t();

    public abstract dfap u();

    @Deprecated
    public abstract dfap v();

    public abstract dfap w();

    @Deprecated
    public abstract dfap x();

    @Deprecated
    public abstract dfap y();

    public abstract dfap z();
}
