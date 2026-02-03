package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owh extends mo {
    final /* synthetic */ owg a;
    final /* synthetic */ owg b;
    final /* synthetic */ mr c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public owh(owg owgVar, owg owgVar2, mr mrVar, int i, int i2) {
        this.a = owgVar;
        this.b = owgVar2;
        this.c = mrVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.e;
    }

    @Override // defpackage.mo
    public final int b() {
        return this.d;
    }

    @Override // defpackage.mo
    public final Object c(int i, int i2) {
        owg owgVar = this.b;
        Object objI = this.a.i(i);
        Object objI2 = owgVar.i(i2);
        if (objI == objI2) {
            return true;
        }
        return this.c.a(objI, objI2);
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        owg owgVar = this.b;
        Object objI = this.a.i(i);
        Object objI2 = owgVar.i(i2);
        if (objI == objI2) {
            return true;
        }
        return this.c.b(objI, objI2);
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        owg owgVar = this.b;
        Object objI = this.a.i(i);
        Object objI2 = owgVar.i(i2);
        if (objI == objI2) {
            return true;
        }
        return this.c.c(objI, objI2);
    }
}
