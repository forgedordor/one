package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnxe extends donr {
    private static final dogm z = new dogm(true, true);

    /* JADX WARN: Illegal instructions before constructor call */
    public dnxe(Activity activity, fdjx fdjxVar, donx donxVar, dngc dngcVar, View view, dons donsVar) {
        View viewFindViewById = view.findViewById(R.id.media_item);
        viewFindViewById.getClass();
        super(activity, fdjxVar, donxVar, dngcVar, view, (RoundedImageView) viewFindViewById, "CustomStickerViewHolder", "CustomStickerViewHolder#onClick", "CustomStickerViewHolder#onLongClick", donsVar);
    }

    @Override // defpackage.donr
    public final /* bridge */ /* synthetic */ rbr C(dohs dohsVar, rbr rbrVar) {
        dnvg dnvgVar = (dnvg) dohsVar;
        if (this.x.a == null) {
            this.v.c(doho.a(dnvgVar));
        }
        this.v.b();
        View view = this.a;
        view.setContentDescription(dnvgVar.f);
        view.setTag("Custom Sticker: ".concat(dnvgVar.a));
        rbr rbrVarA = rbrVar.a(new dnxd(this));
        rbrVarA.getClass();
        return rbrVarA;
    }

    @Override // defpackage.donr
    public final /* bridge */ /* synthetic */ dohq D(dohs dohsVar) {
        return doij.b((dnvg) dohsVar, z);
    }

    @Override // defpackage.donr
    public final void E() {
        super.E();
        this.a.setContentDescription(null);
    }
}
