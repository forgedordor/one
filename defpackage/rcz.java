package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rcz implements fdpm {
    final /* synthetic */ rdb a;

    public rcz(rdb rdbVar) {
        this.a = rdbVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Drawable drawable;
        Object sgaVar;
        rdu rduVar = (rdu) obj;
        if (rduVar instanceof rdy) {
            drawable = (Drawable) ((rdy) rduVar).a;
        } else {
            if (!(rduVar instanceof rdw)) {
                throw new fctg();
            }
            drawable = ((rdw) rduVar).a;
        }
        if (drawable == null) {
            sgaVar = null;
        } else if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            sgaVar = new inx(new iif(bitmap));
        } else if (drawable instanceof ColorDrawable) {
            sgaVar = new iny(ijg.c(((ColorDrawable) drawable).getColor()));
        } else {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.getClass();
            sgaVar = new sga(drawableMutate);
        }
        rdb rdbVar = this.a;
        Object objJ = rdbVar.j();
        if (sgaVar != objJ) {
            hqt hqtVar = objJ instanceof hqt ? (hqt) objJ : null;
            if (hqtVar != null) {
                hqtVar.h();
            }
            hqt hqtVar2 = sgaVar instanceof hqt ? (hqt) sgaVar : null;
            if (hqtVar2 != null) {
                hqtVar2.i();
            }
            rdbVar.d.b(drawable);
            rdbVar.e.b(sgaVar);
        }
        rdbVar.c.b(rduVar.a());
        return fctx.a;
    }
}
