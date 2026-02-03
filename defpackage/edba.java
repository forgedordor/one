package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.RandomArtImagesSectionView;
import com.google.android.libraries.user.profile.photopicker.art.home.view.SuggestedCollectionsSectionView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edba extends edbb {
    public lxo a;
    public dswb ag;
    public dsvx ah;
    public dsvh ai;
    public FullscreenErrorView aj;
    public RandomArtImagesSectionView ak;
    public SuggestedCollectionsSectionView al;
    public CategoriesSectionView am;
    public LinearProgressIndicator an;
    public ecyn ao;
    private ejwi aq;
    private edgr ar;
    private ViewAnimator as;
    public edbo b;
    public edgv c;
    public fcsu d;
    public edgp e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.photo_picker_art_home_fragment, viewGroup, false);
        this.ah.b(viewInflate, this.ag.a(124727));
        ldn ldnVar = new ldn() { // from class: edaz
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(edbl edblVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(edblVar.c());
        ekfwVar.h(this.ar.a());
        ekgb ekgbVarG = ekfwVar.g();
        if (this.aq.g()) {
            eurn eurnVar = (eurn) euro.a.createBuilder();
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            euroVar.c = 25;
            euroVar.b |= 1;
            ejxm ejxmVar = (ejxm) this.aq.c();
            ejxmVar.g();
            long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
            eurnVar.copyOnWrite();
            euro euroVar2 = (euro) eurnVar.instance;
            euroVar2.b |= 2;
            euroVar2.d = jA;
            ekgb ekgbVarC = edblVar.c();
            int i2 = ((ekoe) ekgbVarC).c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                eure eureVar = (eure) ekgbVarC.get(i3);
                i3++;
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
            edgv edgvVar = this.c;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            eurjVar.a(ekgbVarG);
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar4 = (euro) eurnVar.build();
            euroVar4.getClass();
            eurkVar.d = euroVar4;
            eurkVar.b |= 1;
            edgvVar.c((eurk) eurjVar.build());
            this.aq = ejud.a;
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        b();
        this.as = (ViewAnimator) this.Q.findViewById(R.id.photo_picker_view_animator_container);
        final View viewFindViewById = this.Q.findViewById(R.id.photo_picker_search_bar);
        this.an = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        this.aj = (FullscreenErrorView) this.as.findViewById(R.id.photo_picker_error_view);
        this.ak = (RandomArtImagesSectionView) this.as.findViewById(R.id.photo_picker_suggested_images);
        this.al = (SuggestedCollectionsSectionView) this.as.findViewById(R.id.photo_picker_suggested_collections);
        this.am = (CategoriesSectionView) this.as.findViewById(R.id.photo_picker_categories);
        final MaterialButton materialButton = (MaterialButton) this.as.findViewById(R.id.photo_picker_art_refresh_button);
        this.ah.b(materialButton, this.ag.a(124720));
        this.ah.b(viewFindViewById, this.ag.a(124797));
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: edav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edba edbaVar = this.a;
                edbaVar.ai.a(dsvg.e(), materialButton);
                edbaVar.b();
                edbaVar.an.setVisibility(0);
                edbaVar.b.a.b();
            }
        });
        edbo edboVar = (edbo) this.a.a(edbo.class);
        this.b = edboVar;
        edboVar.b.f(Q(), new lvz() { // from class: edaw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edba edbaVar = this.a;
                edbl edblVar = (edbl) obj;
                edbaVar.an.setVisibility(8);
                if (edblVar.a().g()) {
                    edbaVar.f(R.id.photo_picker_error_view);
                    if (fbgv.u()) {
                        edbaVar.aj.c((edhe) edblVar.a().c());
                    } else {
                        edbaVar.aj.f();
                    }
                    edbaVar.a(edblVar);
                    return;
                }
                RandomArtImagesSectionView randomArtImagesSectionView = edbaVar.ak;
                ekgb ekgbVarE = edblVar.e();
                eddh eddhVar = randomArtImagesSectionView.e;
                int size = ekgbVarE.size();
                eddhVar.f = ekgbVarE;
                int i = 0;
                eddhVar.u(0, size);
                final SuggestedCollectionsSectionView suggestedCollectionsSectionView = edbaVar.al;
                int i2 = 0;
                while (true) {
                    ViewGroup viewGroup = suggestedCollectionsSectionView.f;
                    if (i >= viewGroup.getChildCount()) {
                        edbaVar.am.a(edblVar.b());
                        edbaVar.f(R.id.photo_picker_content_view);
                        edbaVar.a(edblVar);
                        return;
                    }
                    final View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof FrameLayout) {
                        final edht edhtVar = (edht) edblVar.d().get(i2);
                        ImageView imageView = (ImageView) childAt.findViewById(R.id.photo_picker_collection_image_view);
                        eddy eddyVar = suggestedCollectionsSectionView.b;
                        Uri uri = Uri.parse(edhtVar.d());
                        edea edeaVar = new edea();
                        edeaVar.a();
                        edeaVar.e();
                        eddyVar.f(uri, edeaVar, imageView);
                        ((TextView) childAt.findViewById(R.id.photo_picker_collection_name)).setText(edhtVar.c());
                        childAt.setOnClickListener(new View.OnClickListener() { // from class: edbj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SuggestedCollectionsSectionView suggestedCollectionsSectionView2 = suggestedCollectionsSectionView;
                                suggestedCollectionsSectionView2.e.a(dsvg.e(), childAt);
                                edht edhtVar2 = edhtVar;
                                suggestedCollectionsSectionView2.g.a(edhtVar2.a(), edhtVar2.c());
                            }
                        });
                        i2++;
                    }
                    i++;
                }
            }
        });
        edbo edboVar2 = this.b;
        if (edboVar2.e == 1) {
            edis edisVar = edboVar2.a;
            edisVar.b();
            edisVar.a();
            edboVar2.e = 2;
        }
        if (fbgs.a.get().g()) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: edax
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edba edbaVar = this.a;
                    edbaVar.ai.a(dsvg.e(), viewFindViewById);
                    ecyn ecynVar = edbaVar.ao;
                    ecynVar.b((ea) ecynVar.a.b(), "ArtSearchFragment");
                }
            });
        }
        if (fbgv.u()) {
            this.aj.b(new View.OnClickListener() { // from class: eday
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edbo edboVar3 = this.a.b;
                    edis edisVar2 = edboVar3.a;
                    edisVar2.b();
                    edisVar2.a();
                    edboVar3.e = 2;
                }
            });
        }
    }

    public final void b() {
        ejxm ejxmVar = (ejxm) this.d.b();
        ejxmVar.e();
        ejxmVar.f();
        this.aq = ejwi.j(ejxmVar);
        edgv edgvVar = this.c;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 25;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        this.ar = this.e.b(19);
    }

    public final void f(int i) {
        this.as.setVisibility(0);
        ViewAnimator viewAnimator = this.as;
        this.as.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }

    @Override // defpackage.edbb, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.ap) {
            return;
        }
        eygl.a(this);
    }
}
