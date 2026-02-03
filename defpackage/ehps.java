package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehps extends fcyz implements fdat {
    int a;
    final /* synthetic */ ehpt b;
    final /* synthetic */ fdvc c;
    final /* synthetic */ ehpj d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehps(fcxy fcxyVar, ehpt ehptVar, fdvc fdvcVar, ehpj ehpjVar) {
        super(2, fcxyVar);
        this.b = ehptVar;
        this.c = fdvcVar;
        this.d = ehpjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ehps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ehpt ehptVar = this.b;
            fdvc fdvcVar = this.c;
            ehpj ehpjVar = this.d;
            lvc lvcVarP = ehptVar.a.P();
            lvb lvbVar = lvb.d;
            ehpr ehprVar = new ehpr(fdvcVar, ehpjVar, null);
            this.a = 1;
            if (lvbVar == lvb.b) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            }
            if (((lvn) lvcVarP).c == lvb.a) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start after its input Lifecycle has already been destroyed.");
            }
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalArgumentException("repeatOnLifecycle must be called from the main thread.");
            }
            Object objA = fdjy.a(new ehpd(lvbVar, lvcVarP, ehprVar, null), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ehps ehpsVar = new ehps(fcxyVar, this.b, this.c, this.d);
        ehpsVar.e = obj;
        return ehpsVar;
    }
}
