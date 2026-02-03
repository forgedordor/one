package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hri extends iax implements hzy, hox, hsf {
    private hrh a;

    public hri(int i) {
        hzg hzgVarB = hzt.b();
        hrh hrhVar = new hrh(hzgVarB.v(), i);
        if (!(hzgVarB instanceof hyz)) {
            hrhVar.h = new hrh(1L, i);
        }
        this.a = hrhVar;
    }

    @Override // defpackage.hox
    public final /* synthetic */ void b(Object obj) {
        i(((Number) obj).intValue());
    }

    public final int c() {
        return ((hrh) hzt.j(this.a, this)).a;
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.a;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.getClass();
        this.a = (hrh) iayVar;
    }

    @Override // defpackage.hzy
    public final hrn f() {
        return hsi.a;
    }

    @Override // defpackage.iax, defpackage.iaw
    public final iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        if (((hrh) iayVar2).a == ((hrh) iayVar3).a) {
            return iayVar2;
        }
        return null;
    }

    @Override // defpackage.hox, defpackage.hsf
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Integer a() {
        return Integer.valueOf(c());
    }

    public final void i(int i) {
        hzg hzgVarB;
        hrh hrhVar = (hrh) hzt.e(this.a);
        if (hrhVar.a != i) {
            hrh hrhVar2 = this.a;
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                ((hrh) hzt.i(hrhVar2, this, hzgVarB, hrhVar)).a = i;
            }
            hzt.t(hzgVarB, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((hrh) hzt.e(this.a)).a + ")@" + hashCode();
    }
}
