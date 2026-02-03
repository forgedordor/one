package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpu extends fdbr implements fdat {
    final /* synthetic */ jpw a;
    final /* synthetic */ fdat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpu(jpw jpwVar, fdat fdatVar) {
        super(2);
        this.a = jpwVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            jpw jpwVar = this.a;
            AndroidComposeView androidComposeView = jpwVar.a;
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = fdcm.d(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = fdcm.d(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(hmlVar.d());
                hmlVar.i();
            }
            boolean zF = hmlVar.F(jpwVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new jpr(jpwVar, null);
                hmlVar.y(objF);
            }
            hob.g(androidComposeView, (fdat) objF, hmlVar);
            boolean zF2 = hmlVar.F(jpwVar);
            Object objF2 = hmlVar.f();
            if (zF2 || objF2 == hmk.a) {
                objF2 = new jps(jpwVar, null);
                hmlVar.y(objF2);
            }
            hob.g(androidComposeView, (fdat) objF2, hmlVar);
            hnj.a(ibp.a.c(set), hxe.d(-280240369, new jpt(jpwVar, this.b), hmlVar), hmlVar, 56);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
