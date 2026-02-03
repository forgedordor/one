package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class douc implements fdpm {
    final /* synthetic */ eeve a;

    public douc(eeve eeveVar) {
        this.a = eeveVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Object next;
        Size size = (Size) obj;
        size.getClass();
        int width = size.getWidth();
        size.getClass();
        int height = size.getHeight();
        eevh eevhVar = this.a.i;
        eevhVar.getClass();
        Iterator itA = new lfd(eevhVar).a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
            if (((View) next) instanceof TextView) {
                break;
            }
        }
        View view = (View) next;
        if (view == null) {
            view = eevhVar;
        }
        Drawable background = eevhVar.getBackground();
        RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        if (rippleDrawable != null) {
            int i = width / 4;
            rippleDrawable.setHotspotBounds(i, fddu.g(view.getTop(), height), width - i, height);
        }
        return fctx.a;
    }
}
