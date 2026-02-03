package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsy extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvta b;
    final /* synthetic */ int c;
    final /* synthetic */ fdci d;
    final /* synthetic */ cpkr e;
    final /* synthetic */ elka f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsy(cvta cvtaVar, int i, fdci fdciVar, cpkr cpkrVar, elka elkaVar, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvtaVar;
        this.c = i;
        this.d = fdciVar;
        this.e = cpkrVar;
        this.f = elkaVar;
        this.g = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final cvta cvtaVar = this.b;
            int i2 = this.c;
            Object[] objArr = {this.d.a};
            Context context = cvtaVar.a;
            String string = context.getString(i2, objArr);
            string.getClass();
            final cpkr cpkrVar = this.e;
            final elka elkaVar = this.f;
            final int i3 = this.g;
            aafw aafwVar = new aafw(string, context.getString(R.string.unblock_unspam_snack_bar_undo), false, 0, new fdae() { // from class: cvsw
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvta cvtaVar2 = cvtaVar;
                    auvw.k(cvtaVar2.c, cvtaVar2.b, null, new cvsx(cvtaVar2, cpkrVar, elkaVar, i3, null), 2);
                    return fctx.a;
                }
            }, 57);
            this.a = 1;
            if (cvtaVar.e.a(aafwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvsy(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
