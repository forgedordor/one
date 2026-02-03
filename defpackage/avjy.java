package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjy extends fcyz implements fdat {
    int a;
    final /* synthetic */ avjz b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjy(fcxy fcxyVar, avjz avjzVar, int i) {
        super(2, fcxyVar);
        this.b = avjzVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        feav feavVar2;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                feav feavVar3 = avjk.a;
                feavVar = avjk.a;
                this.d = feavVar;
                this.a = 1;
                if (feavVar.b(this) != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                feavVar2 = (feav) this.d;
                try {
                    fctl.b(obj);
                    feavVar2.d();
                    return fctx.a;
                } catch (Throwable th2) {
                    th = th2;
                    feavVar2.d();
                    throw th;
                }
            }
            feav feavVar4 = (feav) this.d;
            fctl.b(obj);
            feavVar = feavVar4;
            avjz avjzVar = this.b;
            int i2 = this.c;
            this.d = feavVar;
            this.a = 2;
            if (avjzVar.c(i2, this) != fcylVar) {
                feavVar2 = feavVar;
                feavVar2.d();
                return fctx.a;
            }
            return fcylVar;
        } catch (Throwable th3) {
            feavVar2 = feavVar;
            th = th3;
            feavVar2.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avjy avjyVar = new avjy(fcxyVar, this.b, this.c);
        avjyVar.d = obj;
        return avjyVar;
    }
}
