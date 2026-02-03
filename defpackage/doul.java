package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doul implements dpvv {
    final /* synthetic */ doum a;

    public doul(doum doumVar) {
        this.a = doumVar;
    }

    @Override // defpackage.dpvv
    public final void a(int i, float f) {
        if (i == 0) {
            doum doumVar = this.a;
            if (doumVar.d.e() && doumVar.g) {
                doumVar.f();
                return;
            }
            return;
        }
        if (i == 1) {
            doum doumVar2 = this.a;
            dpir dpirVar = doumVar2.a;
            if (dpirVar.f() == dpjd.a) {
                dpirVar.g(doumVar2.c.h, false);
            }
        }
    }

    @Override // defpackage.dpvv
    public final void b(int i) {
        doum doumVar = this.a;
        if (!doumVar.g || ((Boolean) fdct.a(doumVar.b, false)).booleanValue()) {
            return;
        }
        doumVar.b(i, false);
    }
}
