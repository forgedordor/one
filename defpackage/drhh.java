package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhh extends dn implements drhf {
    private final drhg ag = new drhg(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        drhg drhgVar = this.ag;
        Object obj = drhgVar.a;
        dn dnVar = (dn) obj;
        drhgVar.c = super.G();
        drhgVar.d = new drih(drhgVar.c);
        Bundle bundle2 = ((ea) obj).m;
        String string = bundle2.getString("SiteId");
        int i = bundle2.getInt("RequestCode", -1);
        drhgVar.f = (etdh) drhy.a(etdh.a, bundle2.getByteArray("Survey"));
        drhgVar.g = (erxe) drhy.a(erxe.a, bundle2.getByteArray("SurveyPayload"));
        drhgVar.e = (drhq) bundle2.getParcelable("AnswerBeacon");
        drhgVar.i = bundle2.getBoolean("BottomSheet");
        drhgVar.j = bundle2.getBoolean("IsRatingBanner");
        int i2 = bundle2.getInt("hatsDisplayLogo", 0);
        if (dnVar.c) {
            dnVar.d.requestWindowFeature(1);
        }
        drhgVar.e.c("sv");
        new drhs(drhgVar.f.h, drht.a(drhgVar.c)).a(drhgVar.e);
        drhw.c().a().b();
        drhgVar.b = layoutInflater.inflate(R.layout.hats_prompt_banner, viewGroup, false);
        drij.b((ImageView) drhgVar.b.findViewById(R.id.hats_lib_prompt_banner_logo), i2);
        View view = drhgVar.b;
        drhgVar.h = new drgv((CardView) view, dnVar.d, drhgVar.d, drhgVar.i);
        if (drhgVar.j) {
            drhg.e(view, ((erwu) drhgVar.g.b.get(0)).c);
            View view2 = drhgVar.b;
            View viewFindViewById = view2.findViewById(R.id.prompt_banner_header);
            Resources resources = drhgVar.c.getResources();
            viewFindViewById.setPadding(0, 0, resources.getDimensionPixelSize(R.dimen.hats_lib_close_button_size) - resources.getDimensionPixelSize(R.dimen.hats_lib_prompt_banner_right_padding), 0);
            ((ImageButton) view2.findViewById(R.id.hats_lib_close_button)).setOnClickListener(new drhd(drhgVar));
            drij.c(view2.findViewById(R.id.hats_lib_close_button_layout), view2.findViewById(R.id.hats_lib_close_button), R.dimen.hats_lib_close_button_top_right_padding, R.dimen.hats_lib_close_button_top_right_padding);
            drhgVar.k = new dria();
            drhgVar.k.c();
            drhgVar.e.e(0);
            RatingView ratingView = (RatingView) view2.findViewById(R.id.hats_lib_prompt_rating_view);
            ratingView.setVisibility(0);
            erwu erwuVar = (erwu) drhgVar.g.b.get(0);
            erwy erwyVar = erwuVar.f;
            if (erwyVar == null) {
                erwyVar = erwy.a;
            }
            ratingView.b(erwyVar, erwuVar.g);
            ratingView.a = new drhe(drhgVar, string, i, i2);
        } else {
            drhg.e(view, drhgVar.f.e);
            View view3 = drhgVar.b;
            view3.findViewById(R.id.hats_lib_prompt_buttons).setVisibility(0);
            view3.findViewById(R.id.hats_lib_close_button_layout).setVisibility(8);
            Button button = (Button) view3.findViewById(R.id.hats_lib_prompt_no_thanks_button);
            Button button2 = (Button) view3.findViewById(R.id.hats_lib_prompt_take_survey_button);
            drhgVar.c(button);
            drhgVar.c(button2);
            view3.findViewById(R.id.hats_lib_prompt_no_thanks_wrapper).setOnTouchListener(new drgz(button));
            view3.findViewById(R.id.hats_lib_prompt_take_survey_wrapper).setOnTouchListener(new drha(button2));
            button2.setOnClickListener(new drhb(drhgVar, string, i, i2));
            button.setOnClickListener(new drhc(drhgVar));
        }
        return drhgVar.b;
    }

    @Override // defpackage.drhf
    public final /* bridge */ /* synthetic */ Activity a() {
        return super.G();
    }

    @Override // defpackage.ea
    public final void ai() {
        if (!this.ag.m) {
            drhw.c().a().a();
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        this.ag.n = false;
    }

    @Override // defpackage.ea
    public final void ao() throws Resources.NotFoundException {
        this.ag.a();
        super.ao();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void l() throws Resources.NotFoundException {
        super.l();
        this.ag.a();
    }
}
