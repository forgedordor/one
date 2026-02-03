package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.RoundedImageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dolz extends donr {
    private final TextView A;
    private final Optional z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dolz(Activity activity, donx donxVar, Optional optional, dngc dngcVar, fdjx fdjxVar, View view, dons donsVar) {
        View viewFindViewById = view.findViewById(R.id.local_media_item);
        viewFindViewById.getClass();
        super(activity, fdjxVar, donxVar, dngcVar, view, (RoundedImageView) viewFindViewById, "VisualLocalMediaViewHolder", "VisualLocalMediaViewHolder#onClick", "VisualLocalMediaViewHolder#onLongClick", donsVar);
        this.z = optional;
        View viewFindViewById2 = view.findViewById(R.id.video_overlay);
        viewFindViewById2.getClass();
        this.A = (TextView) viewFindViewById2;
    }

    @Override // defpackage.donr
    public final /* bridge */ /* synthetic */ rbr C(dohs dohsVar, rbr rbrVar) {
        rtj rtjVarA;
        RoundedImageView roundedImageView = this.v;
        dojv dojvVar = (dojv) dohsVar;
        roundedImageView.b();
        if (dojvVar instanceof doju) {
            TextView textView = this.A;
            textView.setVisibility(0);
            if (((Boolean) fdct.a(this.z, true)).booleanValue()) {
                textView.setText(DateUtils.formatElapsedTime(((doju) dojvVar).g.getSeconds()));
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, roundedImageView.getContext().getDrawable(R.drawable.gs_play_arrow_fill1_vd_24), (Drawable) null);
        } else {
            this.A.setVisibility(8);
        }
        if (this.x.b != ImageView.ScaleType.CENTER_CROP) {
            rtjVarA = rtj.a();
        } else {
            if (rtj.x == null) {
                rtj.x = (rtj) ((rtj) new rtj().E()).x();
            }
            rtjVarA = rtj.x;
        }
        rta rtaVarW = rbrVar.q(rtjVarA).W(new rup(dojvVar.b().a(), dojvVar.c().toEpochMilli()));
        rtaVarW.getClass();
        return (rbr) rtaVarW;
    }

    @Override // defpackage.donr
    public final /* bridge */ /* synthetic */ dohq D(dohs dohsVar) {
        return (dojv) dohsVar;
    }

    @Override // defpackage.donr
    public final void E() {
        super.E();
        this.a.setContentDescription(null);
    }
}
