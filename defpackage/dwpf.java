package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwpf {
    public static dwpe k() {
        dwmv dwmvVar = new dwmv();
        dwmvVar.h(false);
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        dwmvVar.j(ekgbVar);
        dwmvVar.m(ekgbVar);
        dwmvVar.l(0L);
        return dwmvVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract dwpe c();

    public abstract dwpk d();

    public abstract ejwi e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwpf) {
            dwpf dwpfVar = (dwpf) obj;
            if (d().equals(dwpfVar.d()) && a() == dwpfVar.a() && g().equals(dwpfVar.g()) && i().equals(dwpfVar.i()) && j() == dwpfVar.j() && h().equals(dwpfVar.h()) && b() == dwpfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public abstract ejwi f();

    public abstract ejwi g();

    public abstract ejwi h();

    public final int hashCode() {
        int iHashCode = ((((((d().hashCode() + 527) * 31) + g().hashCode()) * 31) + (true != f().g() ? 1237 : 1231)) * 31) + i().hashCode();
        int i = true != j() ? 1237 : 1231;
        return (((((((iHashCode * 31) + i) * 31) + dwpd.a(a())) * 31) + (h().g() ? h().c().hashCode() : 1237)) * 31) + dwpd.a(b());
    }

    public abstract ejwi i();

    public abstract boolean j();
}
