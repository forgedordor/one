package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrk extends iax implements hzy, hox, hsf {
    private hrj a;

    public hrk(long j) {
        hzg hzgVarB = hzt.b();
        hrj hrjVar = new hrj(hzgVarB.v(), j);
        if (!(hzgVarB instanceof hyz)) {
            hrjVar.h = new hrj(1L, j);
        }
        this.a = hrjVar;
    }

    @Override // defpackage.hox, defpackage.hsf
    public final /* bridge */ /* synthetic */ Object a() {
        return Long.valueOf(c());
    }

    @Override // defpackage.hox
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).longValue());
    }

    public final long c() {
        return ((hrj) hzt.j(this.a, this)).a;
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.a;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.getClass();
        this.a = (hrj) iayVar;
    }

    @Override // defpackage.hzy
    public final hrn f() {
        return hsi.a;
    }

    @Override // defpackage.iax, defpackage.iaw
    public final iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        if (((hrj) iayVar2).a == ((hrj) iayVar3).a) {
            return iayVar2;
        }
        return null;
    }

    public final void h(long j) {
        hzg hzgVarB;
        hrj hrjVar = (hrj) hzt.e(this.a);
        if (hrjVar.a != j) {
            hrj hrjVar2 = this.a;
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                ((hrj) hzt.i(hrjVar2, this, hzgVarB, hrjVar)).a = j;
            }
            hzt.t(hzgVarB, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((hrj) hzt.e(this.a)).a + ")@" + hashCode();
    }
}
