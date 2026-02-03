package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edcj extends edck {
    public lxo a;
    public edgp ag;
    public dswb ah;
    public dsvx ai;
    public dsvh aj;
    public ejwi ak;
    public edgr al;
    public ArtImageGridView am;
    public CategoriesSectionView an;
    public ArtImageGridView ao;
    public View ap;
    public View aq;
    public FullscreenErrorView ar;
    public LinearProgressIndicator as;
    public eduu b;
    public edco c;
    public fcsu d;
    public edgv e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.photo_picker_art_search_results_fragment, viewGroup, false);
        this.ai.b(viewInflate, this.ah.a(133697));
        ldn ldnVar = new ldn() { // from class: edci
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                kzc kzcVarF = lgtVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.leftMargin = kzcVarF.b;
                marginLayoutParams.bottomMargin = kzcVarF.e;
                marginLayoutParams.rightMargin = kzcVarF.d;
                marginLayoutParams.topMargin = kzcVarF.c;
                view.setLayoutParams(marginLayoutParams);
                return lgt.a;
            }
        };
        int[] iArr = ley.a;
        len.k(viewInflate, ldnVar);
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ejxm ejxmVar = (ejxm) this.d.b();
        ejxmVar.e();
        ejxmVar.f();
        this.ak = ejwi.j(ejxmVar);
        edgv edgvVar = this.e;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 28;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        this.al = this.ag.b(22);
        this.c = (edco) this.a.a(edco.class);
        this.am = (ArtImageGridView) this.Q.findViewById(R.id.photo_picker_top_results_grid_images);
        this.an = (CategoriesSectionView) this.Q.findViewById(R.id.photo_picker_categories);
        this.ao = (ArtImageGridView) this.Q.findViewById(R.id.photo_picker_more_results_grid_images);
        this.ap = this.Q.findViewById(R.id.photo_picker_search_no_results_container);
        this.aq = this.Q.findViewById(R.id.photo_picker_content_view);
        this.as = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        FullscreenErrorView fullscreenErrorView = (FullscreenErrorView) this.Q.findViewById(R.id.photo_picker_error_view);
        this.ar = fullscreenErrorView;
        fullscreenErrorView.b(new View.OnClickListener() { // from class: edcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edcj edcjVar = this.a;
                edcjVar.as.setVisibility(0);
                edco edcoVar = edcjVar.c;
                edcoVar.a(edcoVar.b);
            }
        });
        this.am.b(R.string.op3_search_top_results, R.drawable.quantum_gm_ic_image_search_vd_theme_24);
        this.am.c();
        this.am.f = true;
        ((MaterialTextView) this.an.findViewById(R.id.photo_picker_categories_section_title)).setText(R.string.op3_search_collections);
        final MaterialToolbar materialToolbar = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_search_results_toolbar);
        materialToolbar.x(this.c.b);
        materialToolbar.s(ku.a(materialToolbar.getContext(), R.drawable.quantum_gm_ic_arrow_back_vd_theme_24));
        this.ai.b(materialToolbar, this.ah.a(133692));
        if (fbgs.a.get().i()) {
            materialToolbar.t(new View.OnClickListener() { // from class: edce
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edcj edcjVar = this.a;
                    edcjVar.aj.a(dsvg.e(), materialToolbar);
                    edcjVar.b.l();
                }
            });
        } else {
            materialToolbar.setOnClickListener(new View.OnClickListener() { // from class: edcf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edcj edcjVar = this.a;
                    edcjVar.aj.a(dsvg.e(), materialToolbar);
                    edcjVar.b.l();
                }
            });
        }
        ((ImageView) this.Q.findViewById(R.id.photo_picker_search_no_results_icon)).setImageDrawable(ku.a(z(), R.drawable.quantum_gm_ic_search_gm_grey500_48));
        this.c.c.f(Q(), new lvz() { // from class: edch
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edcm edcmVar = (edcm) obj;
                edcj edcjVar = this.a;
                if (edcjVar.c.a) {
                    return;
                }
                edcjVar.as.setVisibility(4);
                int i = 0;
                if (edcmVar.a().g()) {
                    edcjVar.ap.setVisibility(8);
                    edcjVar.aq.setVisibility(8);
                    edcjVar.ar.setVisibility(0);
                    if (fbgv.u()) {
                        edcjVar.ar.c((edhe) edcmVar.a().c());
                    } else {
                        edcjVar.ar.d();
                    }
                } else if (edcmVar.e().isEmpty()) {
                    edcjVar.ap.setVisibility(0);
                    edcjVar.aq.setVisibility(8);
                    edcjVar.ar.setVisibility(8);
                } else {
                    edcjVar.ap.setVisibility(8);
                    edcjVar.aq.setVisibility(0);
                    edcjVar.ar.setVisibility(8);
                    edcjVar.am.a(edcmVar.e(), 133696);
                    edcjVar.an.a(ekgb.r(edhr.a("", edcmVar.b())));
                    if (edcmVar.d().isEmpty()) {
                        edcjVar.ao.setVisibility(8);
                    } else {
                        edcjVar.ao.b(R.string.op3_search_more_results, R.drawable.quantum_gm_ic_manage_search_vd_theme_24);
                        edcjVar.ao.c();
                        edcjVar.ao.a(edcmVar.d(), 133710);
                    }
                }
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekfwVar.j(edcmVar.c());
                ekfwVar.h(edcjVar.al.a());
                ekgb ekgbVarG = ekfwVar.g();
                if (edcjVar.ak.g()) {
                    eurn eurnVar = (eurn) euro.a.createBuilder();
                    eurnVar.copyOnWrite();
                    euro euroVar = (euro) eurnVar.instance;
                    euroVar.c = 28;
                    euroVar.b |= 1;
                    ejxm ejxmVar2 = (ejxm) edcjVar.ak.c();
                    ejxmVar2.g();
                    long jA = ejxmVar2.a(TimeUnit.MICROSECONDS);
                    eurnVar.copyOnWrite();
                    euro euroVar2 = (euro) eurnVar.instance;
                    euroVar2.b |= 2;
                    euroVar2.d = jA;
                    ekgb ekgbVarC = edcmVar.c();
                    int i3 = ((ekoe) ekgbVarC).c;
                    while (true) {
                        if (i >= i3) {
                            break;
                        }
                        eure eureVar = (eure) ekgbVarC.get(i);
                        i++;
                        if ((eureVar.b & 2) != 0) {
                            eurc eurcVar = eureVar.f;
                            if (eurcVar == null) {
                                eurcVar = eurc.a;
                            }
                            eurnVar.copyOnWrite();
                            euro euroVar3 = (euro) eurnVar.instance;
                            eurcVar.getClass();
                            euroVar3.e = eurcVar;
                            euroVar3.b |= 4;
                        }
                    }
                    edgv edgvVar2 = edcjVar.e;
                    eurj eurjVar = (eurj) eurk.a.createBuilder();
                    eurjVar.a(ekgbVarG);
                    eurjVar.copyOnWrite();
                    eurk eurkVar = (eurk) eurjVar.instance;
                    euro euroVar4 = (euro) eurnVar.build();
                    euroVar4.getClass();
                    eurkVar.d = euroVar4;
                    eurkVar.b |= 1;
                    edgvVar2.c((eurk) eurjVar.build());
                    edcjVar.ak = ejud.a;
                }
            }
        });
    }

    @Override // defpackage.edck, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.at) {
            return;
        }
        eygl.a(this);
    }
}
