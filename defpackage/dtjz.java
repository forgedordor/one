package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjz extends fcyz implements fdat {
    int a;
    final /* synthetic */ Context b;
    final /* synthetic */ kam c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtjz(Context context, kam kamVar, boolean z, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = context;
        this.c = kamVar;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtjz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.f;
        fdlt fdltVar = new fdlt(null);
        dtka dtkaVar = dtka.a;
        final CancellationSignal cancellationSignal = new CancellationSignal();
        fdil.d(fdjxVar, fdltVar, null, new dtjw(null), 2).hK(new fdap() { // from class: dtjv
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                dtka dtkaVar2 = dtka.a;
                if (((Throwable) obj2) instanceof CancellationException) {
                    cancellationSignal.cancel();
                }
                return fctx.a;
            }
        });
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            throw new IllegalStateException("No content resolver");
        }
        kam kamVar = this.c;
        fcyh fcyhVarHE = fdjxVar.hE();
        dtjy dtjyVar = new dtjy(this.d, context, contentResolver, this.e, cancellationSignal, kamVar, fdltVar, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVarHE, dtjyVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dtjz dtjzVar = new dtjz(this.b, this.c, this.d, this.e, fcxyVar);
        dtjzVar.f = obj;
        return dtjzVar;
    }
}
