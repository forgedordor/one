package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.RoundedImageView;
import defpackage.doav;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobk<T extends doav> extends donr<T> {
    private static final dogm z = new dogm(true, true);

    /* JADX WARN: Illegal instructions before constructor call */
    public dobk(Activity activity, fdjx fdjxVar, donx donxVar, dngc dngcVar, View view, dons donsVar) {
        View viewFindViewById = view.findViewById(R.id.media_item);
        viewFindViewById.getClass();
        super(activity, fdjxVar, donxVar, dngcVar, view, (RoundedImageView) viewFindViewById, "GifStickerViewHolder", "GifStickerViewHolder#onClick", "GifStickerViewHolder#onLongClick", donsVar);
    }

    protected static final doau F(doav doavVar) {
        return (doau) doij.a(doavVar, z);
    }

    @Override // defpackage.donr
    public final /* bridge */ /* synthetic */ rbr C(dohs dohsVar, rbr rbrVar) {
        doav doavVar = (doav) dohsVar;
        if (this.x.a == null) {
            this.v.c(doho.a(F(doavVar)));
        }
        this.v.b();
        this.a.setContentDescription(doavVar.d());
        if (!(doavVar instanceof doyt)) {
            return rbrVar;
        }
        rbr rbrVarA = rbrVar.a(new dobj(this));
        rbrVarA.getClass();
        return rbrVarA;
    }

    @Override // defpackage.donr
    public final /* bridge */ /* synthetic */ dohq D(dohs dohsVar) {
        return F((doav) dohsVar);
    }

    @Override // defpackage.donr
    public final void E() {
        super.E();
        this.a.setContentDescription(null);
    }
}
