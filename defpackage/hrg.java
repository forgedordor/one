package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrg extends iax implements hzy, hox, hsf {
    private hrf a;

    public hrg(float f) {
        hzg hzgVarB = hzt.b();
        hrf hrfVar = new hrf(hzgVarB.v(), f);
        if (!(hzgVarB instanceof hyz)) {
            hrfVar.h = new hrf(1L, f);
        }
        this.a = hrfVar;
    }

    @Override // defpackage.hox, defpackage.hsf
    public final /* bridge */ /* synthetic */ Object a() {
        return Float.valueOf(c());
    }

    @Override // defpackage.hox
    public final /* synthetic */ void b(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final float c() {
        return ((hrf) hzt.j(this.a, this)).a;
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.a;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.getClass();
        this.a = (hrf) iayVar;
    }

    @Override // defpackage.hzy
    public final hrn f() {
        return hsi.a;
    }

    @Override // defpackage.iax, defpackage.iaw
    public final iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        if (((hrf) iayVar2).a == ((hrf) iayVar3).a) {
            return iayVar2;
        }
        return null;
    }

    public final void h(float f) {
        hzg hzgVarB;
        hrf hrfVar = (hrf) hzt.e(this.a);
        if (hrfVar.a == f) {
            return;
        }
        hrf hrfVar2 = this.a;
        synchronized (hzt.c) {
            hzgVarB = hzt.b();
            ((hrf) hzt.i(hrfVar2, this, hzgVarB, hrfVar)).a = f;
        }
        hzt.t(hzgVarB, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((hrf) hzt.e(this.a)).a + ")@" + hashCode();
    }
}
