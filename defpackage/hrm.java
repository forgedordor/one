package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrm<T> extends iax implements hzy<T> {
    public final hrn a;
    private hrl b;

    public hrm(Object obj, hrn hrnVar) {
        this.a = hrnVar;
        hzg hzgVarB = hzt.b();
        hrl hrlVar = new hrl(hzgVarB.v(), obj);
        if (!(hzgVarB instanceof hyz)) {
            hrlVar.h = new hrl(1L, obj);
        }
        this.b = hrlVar;
    }

    @Override // defpackage.hox, defpackage.hsf
    public final Object a() {
        return ((hrl) hzt.j(this.b, this)).a;
    }

    @Override // defpackage.hox
    public final void b(Object obj) {
        hzg hzgVarB;
        hrl hrlVar = (hrl) hzt.e(this.b);
        if (this.a.a(hrlVar.a, obj)) {
            return;
        }
        hrl hrlVar2 = this.b;
        synchronized (hzt.c) {
            hzgVarB = hzt.b();
            ((hrl) hzt.i(hrlVar2, this, hzgVarB, hrlVar)).a = obj;
        }
        hzt.t(hzgVarB, this);
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.b;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.getClass();
        this.b = (hrl) iayVar;
    }

    @Override // defpackage.hzy
    public final hrn f() {
        return this.a;
    }

    @Override // defpackage.iax, defpackage.iaw
    public final iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        if (this.a.a(((hrl) iayVar2).a, ((hrl) iayVar3).a)) {
            return iayVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((hrl) hzt.e(this.b)).a + ")@" + hashCode();
    }
}
