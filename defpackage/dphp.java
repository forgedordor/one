package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphp extends fcyz implements fdat {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphp(View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphp) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.c;
            final View view = this.b;
            if (view.isLaidOut()) {
                fdosVar.b(view);
            }
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: dphn
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    fdosVar.b(view);
                }
            };
            view.addOnLayoutChangeListener(onLayoutChangeListener);
            fdae fdaeVar = new fdae() { // from class: dpho
                @Override // defpackage.fdae
                public final Object invoke() {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dphp dphpVar = new dphp(this.b, fcxyVar);
        dphpVar.c = obj;
        return dphpVar;
    }
}
