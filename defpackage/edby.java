package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edby extends edcd {
    public lxo a;
    public edgv ag;
    public edgp ah;
    public dswb ai;
    public dsvx aj;
    public dsvh ak;
    public edgr al;
    public OpenSearchView am;
    public edcx an;
    public ChipGroup ao;
    public RecyclerView ap;
    public FullscreenErrorView aq;
    public edcb ar;
    public View as;
    public ekfw at;
    public ecyn au;
    private ejwi aw;
    private edco ax;
    public lxo b;
    public edcc c;
    public eduu d;
    public fcsu e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.photo_picker_art_search_fragment, viewGroup, false);
        this.aj.b(viewInflate, this.ai.a(133695));
        ldn ldnVar = new ldn() { // from class: edbw
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
    public final void a(String str) {
        ekgb ekgbVarG = this.at.g();
        if (this.aw.g()) {
            eurn eurnVar = (eurn) euro.a.createBuilder();
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            euroVar.c = 27;
            euroVar.b |= 1;
            ejxm ejxmVar = (ejxm) this.aw.c();
            ejxmVar.g();
            long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
            eurnVar.copyOnWrite();
            euro euroVar2 = (euro) eurnVar.instance;
            euroVar2.b |= 2;
            euroVar2.d = jA;
            int i = ((ekoe) ekgbVarG).c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                eure eureVar = (eure) ekgbVarG.get(i2);
                i2++;
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
            edgv edgvVar = this.ag;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            eurjVar.a(ekgbVarG);
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar4 = (euro) eurnVar.build();
            euroVar4.getClass();
            eurkVar.d = euroVar4;
            eurkVar.b |= 1;
            edgvVar.c((eurk) eurjVar.build());
            this.aw = ejud.a;
        }
        this.ax.a(str);
        ecyn ecynVar = this.au;
        ecynVar.b((ea) ecynVar.b.b(), "ArtSearchFragment");
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ejxm ejxmVar = (ejxm) this.e.b();
        ejxmVar.e();
        ejxmVar.f();
        this.aw = ejwi.j(ejxmVar);
        edgv edgvVar = this.ag;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 27;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        this.al = this.ah.b(20);
        int i = ekgb.d;
        this.at = new ekfw();
        this.as = this.Q.findViewById(R.id.photo_picker_interests_container);
        this.ao = (ChipGroup) this.Q.findViewById(R.id.photo_picker_interest_chip_group);
        FullscreenErrorView fullscreenErrorView = (FullscreenErrorView) this.Q.findViewById(R.id.photo_picker_error_view);
        this.aq = fullscreenErrorView;
        fullscreenErrorView.b(new View.OnClickListener() { // from class: edbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edcx edcxVar = this.a.an;
                if (edcxVar.e == 2) {
                    edcxVar.c(edcxVar.d);
                } else {
                    edcxVar.b();
                }
            }
        });
        this.an = (edcx) this.a.a(edcx.class);
        this.ax = (edco) this.b.a(edco.class);
        this.ap = (RecyclerView) this.Q.findViewById(R.id.photo_picker_search_suggestions);
        z();
        this.ap.ao(new LinearLayoutManager());
        edcc edccVar = this.c;
        edbu edbuVar = new edbu(this);
        dswb dswbVar = (dswb) edccVar.a.b();
        dswbVar.getClass();
        dsvx dsvxVar = (dsvx) edccVar.b.b();
        dsvxVar.getClass();
        dsvh dsvhVar = (dsvh) edccVar.c.b();
        dsvhVar.getClass();
        edcb edcbVar = new edcb(edbuVar, dswbVar, dsvxVar, dsvhVar);
        this.ar = edcbVar;
        this.ap.al(edcbVar);
        this.am.k.addTextChangedListener(new edbx(this));
        this.am.k.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: edbq
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                    return false;
                }
                edby edbyVar = this.a;
                if (edbyVar.am.c().toString().isEmpty()) {
                    return false;
                }
                edbyVar.a(edbyVar.am.c().toString());
                return true;
            }
        });
        this.am.g.t(new View.OnClickListener() { // from class: edbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.l();
            }
        });
        this.aj.b(this.ao, this.ai.a(133693));
        this.an.a.f(Q(), new lvz() { // from class: edbt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edcs edcsVar = (edcs) obj;
                int iE = edcsVar.e() - 1;
                final edby edbyVar = this.a;
                if (iE == 0) {
                    ekgb ekgbVarC = edcsVar.c();
                    edbyVar.ao.removeAllViews();
                    int size = ekgbVarC.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ediv edivVar = (ediv) ekgbVarC.get(i2);
                        final Chip chip = new Chip(edbyVar.z());
                        chip.setText(edivVar.b());
                        chip.setOnClickListener(new View.OnClickListener() { // from class: edbv
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                edby edbyVar2 = edbyVar;
                                dsvh dsvhVar2 = edbyVar2.ak;
                                dsvg dsvgVarE = dsvg.e();
                                Chip chip2 = chip;
                                dsvhVar2.a(dsvgVarE, chip2);
                                edbyVar2.a(chip2.getText().toString());
                            }
                        });
                        chip.h = true;
                        chip.i(chip.i);
                        edbyVar.ao.addView(chip);
                        edbyVar.aj.b(chip, edbyVar.ai.a(133694));
                    }
                    edbyVar.ao.setVisibility(0);
                    edbyVar.as.setVisibility(0);
                    edbyVar.aq.setVisibility(8);
                    edbyVar.ap.setVisibility(8);
                } else if (iE != 1) {
                    edbyVar.ao.setVisibility(8);
                    edbyVar.as.setVisibility(8);
                    edbyVar.ap.setVisibility(8);
                    edbyVar.aq.setVisibility(0);
                    edbyVar.am.d();
                    if (fbgv.u()) {
                        edbyVar.aq.c((edhe) edcsVar.a().e(edhe.NON_RETRYABLE));
                    } else {
                        edbyVar.aq.d();
                    }
                } else {
                    edcb edcbVar2 = edbyVar.ar;
                    ekgb ekgbVarD = edcsVar.d();
                    String string = edbyVar.am.k.getText().toString();
                    edcbVar2.a = ekgbVarD;
                    edcbVar2.e = string;
                    edcbVar2.p();
                    edbyVar.ao.setVisibility(8);
                    edbyVar.as.setVisibility(8);
                    edbyVar.aq.setVisibility(8);
                    edbyVar.ap.setVisibility(0);
                }
                edbyVar.at.h(edbyVar.al.a());
                edbyVar.at.j(edcsVar.b());
            }
        });
        if (bundle == null) {
            this.an.b();
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        OpenSearchView openSearchView = (OpenSearchView) this.Q.findViewById(R.id.photo_picker_search_results_view);
        this.am = openSearchView;
        openSearchView.j(true);
        this.am.f();
    }

    @Override // defpackage.edcd, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.av) {
            return;
        }
        eygl.a(this);
    }
}
