package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edpn extends edpo {
    public lxo a;
    public ViewGroup ag;
    public ViewAnimator ah;
    public FullscreenErrorView ai;
    private ejwi ak;
    private edgr al;
    public dswb b;
    public edgv c;
    public fcsu d;
    public edgp e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(true != fbgv.i() ? R.layout.photo_picker_google_photos_home_fragment : R.layout.photo_picker_google_photos_home_fragment_art_style, viewGroup, false);
        this.b.b.a(109564).b(viewInflate);
        ldn ldnVar = new ldn() { // from class: edpk
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
    public final void a(edqx edqxVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarB = edqxVar.b();
        int i2 = ((ekoe) ekgbVarB).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ekfwVar.j(((edrb) ekgbVarB.get(i3)).b());
        }
        ekfwVar.h(this.al.a());
        if (this.ak.g()) {
            eurn eurnVar = (eurn) euro.a.createBuilder();
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            euroVar.c = 10;
            euroVar.b |= 1;
            ejxm ejxmVar = (ejxm) this.ak.c();
            ejxmVar.g();
            long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
            eurnVar.copyOnWrite();
            euro euroVar2 = (euro) eurnVar.instance;
            euroVar2.b |= 2;
            euroVar2.d = jA;
            ekgb ekgbVarB2 = edqxVar.b();
            int i4 = ((ekoe) ekgbVarB2).c;
            for (int i5 = 0; i5 < i4; i5++) {
                ekgb ekgbVarB3 = ((edrb) ekgbVarB2.get(i5)).b();
                int size = ekgbVarB3.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        eure eureVar = (eure) ekgbVarB3.get(i6);
                        i6++;
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
                }
            }
            edgv edgvVar = this.c;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            eurjVar.a(ekfwVar.g());
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar4 = (euro) eurnVar.build();
            euroVar4.getClass();
            eurkVar.d = euroVar4;
            eurkVar.b |= 1;
            edgvVar.c((eurk) eurjVar.build());
            this.ak = ejud.a;
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ejxm ejxmVar = (ejxm) this.d.b();
        ejxmVar.e();
        ejxmVar.f();
        this.ak = ejwi.j(ejxmVar);
        edgv edgvVar = this.c;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 10;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        this.al = this.e.b(13);
        ViewAnimator viewAnimator = (ViewAnimator) this.Q.findViewById(R.id.photo_picker_view_animator_container);
        this.ah = viewAnimator;
        this.ai = (FullscreenErrorView) viewAnimator.findViewById(R.id.photo_picker_error_view);
        this.ag = (ViewGroup) this.Q.findViewById(R.id.photo_picker_google_photos_home_sections_container);
        final edqn edqnVar = (edqn) this.a.a(edqn.class);
        if (edqnVar.g == 1) {
            if (!fbgv.n() || !edqnVar.d.e) {
                edqnVar.a.b(100);
            }
            edqnVar.b.a(100);
            edqnVar.c.b(100);
            lvx lvxVar = edqnVar.e;
            edqnVar.g = 2;
            lvxVar.j(edqx.d(2));
        }
        edqnVar.e.f(Q(), new lvz() { // from class: edpl
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v0 */
            /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r9v12 */
            @Override // defpackage.lvz
            public final void a(Object obj) throws Resources.NotFoundException {
                ekgb ekgbVar;
                int i;
                final View.OnClickListener onClickListener;
                char c;
                int i2;
                boolean z;
                ekgb ekgbVar2;
                ekgb ekgbVar3;
                int i3;
                edqx edqxVar = (edqx) obj;
                int iC = edqxVar.c() - 1;
                edpn edpnVar = this.a;
                if (iC == 0) {
                    edpnVar.ah.setVisibility(8);
                    return;
                }
                int i4 = 1;
                if (iC == 1) {
                    edpnVar.b(R.id.photo_picker_loading_view);
                    return;
                }
                int i5 = 4;
                if (iC != 3) {
                    if (iC != 4) {
                        return;
                    }
                    edpnVar.b(R.id.photo_picker_error_view);
                    if (fbgv.u()) {
                        edpnVar.ai.c((edhe) edqxVar.a().e(edhe.NON_RETRYABLE));
                    } else {
                        edpnVar.ai.f();
                    }
                    edpnVar.a(edqxVar);
                    return;
                }
                ekgb ekgbVarB = edqxVar.b();
                int i6 = ((ekoe) ekgbVarB).c;
                ?? r9 = 0;
                int i7 = 0;
                while (i7 < i6) {
                    edrb edrbVar = (edrb) ekgbVarB.get(i7);
                    if (fbgv.k() && edrbVar.a().b() == i4 && !edrbVar.a().d().isEmpty()) {
                        final edqb edqbVar = new edqb(edpnVar.z());
                        boolean zC = edrbVar.c();
                        ekgb ekgbVarD = edrbVar.a().d();
                        RecyclerView recyclerView = (RecyclerView) edqbVar.findViewById(R.id.photo_picker_recycler_grid);
                        int size = ekgbVarD.size();
                        edqbVar.getContext();
                        int i8 = size <= 10 ? i4 : 2;
                        recyclerView.ao(new GridLayoutManager(i8, r9));
                        edex edexVar = edqbVar.e;
                        edfa edfaVar = new edfa() { // from class: edpz
                            @Override // defpackage.edfa
                            public final void a(Uri uri) {
                                edqb edqbVar2 = edqbVar;
                                edqbVar2.d.c = 9;
                                edqbVar2.b.m(uri);
                            }
                        };
                        ejud ejudVar = ejud.a;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: edqa
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                edqbVar.b.d();
                            }
                        };
                        int i9 = i5;
                        eddy eddyVar = (eddy) edexVar.a.b();
                        eddyVar.getClass();
                        dswb dswbVar = (dswb) edexVar.b.b();
                        dswbVar.getClass();
                        dsvx dsvxVar = (dsvx) edexVar.c.b();
                        dsvxVar.getClass();
                        dsvh dsvhVar = (dsvh) edexVar.d.b();
                        dsvhVar.getClass();
                        edew edewVar = new edew(eddyVar, dswbVar, dsvxVar, dsvhVar, edfaVar, ejudVar, onClickListener2, zC);
                        recyclerView.al(edewVar);
                        recyclerView.v(new edda((int) edqbVar.getResources().getDimension(R.dimen.photo_picker_grid_spacing), i8, r9, r9));
                        int i10 = 48;
                        int iMin = Math.min(ekgbVarD.size(), 48);
                        if (iMin != 48) {
                            i10 = iMin;
                        } else if (zC) {
                            i10 = 47;
                        }
                        edewVar.l(ekgbVarD.subList(r9, i10), r9, i10);
                        edpnVar.ag.addView(edqbVar);
                        ekgbVar = ekgbVarB;
                        z = r9;
                        i = i7;
                        i5 = i9;
                        i2 = i4;
                        c = 3;
                    } else {
                        int i11 = i5;
                        final edpv edpvVar = new edpv(edpnVar.z());
                        edpvVar.h = edrbVar;
                        ArrayList<View> arrayList = new ArrayList();
                        int iB = edrbVar.a().b() - 1;
                        ViewGroup viewGroup = null;
                        if (iB == 0) {
                            ekgbVar = ekgbVarB;
                            i = i7;
                            edpvVar.c(R.string.op3_picker_photos_of_you);
                            edpvVar.b(89748);
                            arrayList.addAll(edpvVar.a(edrbVar.a().d()));
                            onClickListener = new View.OnClickListener() { // from class: edpp
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    edpvVar.a.d();
                                }
                            };
                        } else if (iB != i4) {
                            edpvVar.b(89726);
                            edpvVar.c(R.string.op3_picker_more_from_google_photos);
                            arrayList.addAll(edpvVar.a(edrbVar.a().a()));
                            onClickListener = new View.OnClickListener() { // from class: edpr
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    edpvVar.a.e();
                                }
                            };
                            ekgbVar = ekgbVarB;
                            i = i7;
                        } else {
                            edpvVar.b(89732);
                            edpvVar.c(R.string.op3_picker_people_and_pets);
                            ekgb ekgbVarC = edrbVar.a().c();
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = ekgbVarC.size();
                            int i12 = r9;
                            while (i12 < size2) {
                                final etub etubVar = (etub) ekgbVarC.get(i12);
                                int i13 = etubVar.b;
                                if ((i13 & 1) == 0 || (i13 & 2) == 0) {
                                    ekgbVar2 = ekgbVarB;
                                    ekgbVar3 = ekgbVarC;
                                    i3 = i7;
                                } else {
                                    ekgbVar2 = ekgbVarB;
                                    final View viewInflate = edpv.inflate(edpvVar.getContext(), R.layout.photo_picker_cluster_image, viewGroup);
                                    SquareImageView squareImageView = (SquareImageView) viewInflate.findViewById(R.id.photo_picker_cluster_image_view);
                                    MaterialTextView materialTextView = (MaterialTextView) viewInflate.findViewById(R.id.photo_picker_cluster_name);
                                    eddy eddyVar2 = edpvVar.b;
                                    ekgbVar3 = ekgbVarC;
                                    etwu etwuVar = etubVar.d;
                                    if (etwuVar == null) {
                                        etwuVar = etwu.a;
                                    }
                                    Uri uriA = eddx.a(etwuVar);
                                    i3 = i7;
                                    edea edeaVar = new edea();
                                    edeaVar.a();
                                    eddyVar2.g(uriA, edeaVar, squareImageView);
                                    boolean z2 = ((etubVar.b & 4) == 0 && etubVar.e.isEmpty()) ? false : true;
                                    materialTextView.setText(z2 ? etubVar.e : "");
                                    viewInflate.findViewById(R.id.photo_picker_cluster_gradient).setVisibility(true != z2 ? i11 : 0);
                                    int i14 = true != z2 ? 1 : 2;
                                    int[] iArr = ley.a;
                                    squareImageView.setImportantForAccessibility(i14);
                                    edpvVar.c.b.a(89735).b(viewInflate);
                                    viewInflate.setOnClickListener(new View.OnClickListener() { // from class: edps
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            edpv edpvVar2 = edpvVar;
                                            edpvVar2.d.a(dsvg.e(), viewInflate);
                                            edpvVar2.a.b(etubVar);
                                        }
                                    });
                                    arrayList2.add(viewInflate);
                                }
                                i12++;
                                ekgbVarB = ekgbVar2;
                                ekgbVarC = ekgbVar3;
                                i7 = i3;
                                viewGroup = null;
                            }
                            ekgbVar = ekgbVarB;
                            i = i7;
                            arrayList.addAll(arrayList2);
                            onClickListener = new View.OnClickListener() { // from class: edpq
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    edpvVar.a.c();
                                }
                            };
                        }
                        if (edrbVar.c()) {
                            final View viewInflate2 = edpv.inflate(edpvVar.getContext(), R.layout.photo_picker_button, null);
                            viewInflate2.setTag(R.id.photo_picker_more_button_tag, edqz.a(edpvVar.h.a().b()));
                            MaterialTextView materialTextView2 = (MaterialTextView) viewInflate2.findViewById(R.id.photo_picker_button_text);
                            materialTextView2.setText(edpvVar.getContext().getString(R.string.op3_more));
                            materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(edpvVar.getContext(), R.drawable.quantum_gm_ic_photo_library_vd_theme_24), (Drawable) null, (Drawable) null);
                            edpvVar.c.b.a(90596).b(viewInflate2);
                            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: edpt
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    edpvVar.d.a(dsvg.e(), viewInflate2);
                                    onClickListener.onClick(view);
                                }
                            });
                            arrayList.add(viewInflate2);
                        }
                        edqd edqdVar = edpvVar.f;
                        TableLayout tableLayout = edqdVar.a;
                        if (tableLayout.getChildCount() > 0) {
                            tableLayout.removeAllViews();
                        }
                        if (arrayList.iterator().hasNext()) {
                            TableRow tableRow = new TableRow(tableLayout.getContext());
                            int i15 = 0;
                            for (View view : arrayList) {
                                if (i15 > 0 && i15 % edqdVar.b == 0) {
                                    tableLayout.addView(tableRow, new TableRow.LayoutParams());
                                    tableRow = new TableRow(tableLayout.getContext());
                                }
                                tableRow.addView(view, edqd.a());
                                i15++;
                            }
                            tableLayout.addView(tableRow, new TableRow.LayoutParams());
                            while (tableRow.getChildCount() < edqdVar.b) {
                                SquareImageView squareImageView2 = new SquareImageView(tableLayout.getContext());
                                squareImageView2.setVisibility(i11);
                                tableRow.addView(squareImageView2, edqd.a());
                            }
                        }
                        i5 = i11;
                        int dimensionPixelSize = edpnVar.B().getDimensionPixelSize(R.dimen.photo_picker_title_tab_padding);
                        c = 3;
                        i2 = 1;
                        if (edrbVar.a().b() == 3 && i6 == 1) {
                            edpvVar.g.setVisibility(8);
                            dimensionPixelSize = edpnVar.B().getDimensionPixelSize(R.dimen.photo_picker_photo_tab_padding);
                        }
                        z = false;
                        edpnVar.ag.setPadding(0, dimensionPixelSize, 0, 0);
                        edpnVar.ag.addView(edpvVar);
                    }
                    r9 = z;
                    i4 = i2;
                    i7 = i + 1;
                    ekgbVarB = ekgbVar;
                }
                edpnVar.b(R.id.photo_picker_content_view);
                edpnVar.a(edqxVar);
            }
        });
        if (fbgv.u()) {
            this.ai.b(new View.OnClickListener() { // from class: edpm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    edqn edqnVar2 = edqnVar;
                    if (edqnVar2.g != 5) {
                        return;
                    }
                    edqnVar2.f.b();
                    if (!fbgv.n() || !edqnVar2.d.e) {
                        edqnVar2.a.c();
                    }
                    edqnVar2.b.c();
                    edqnVar2.c.c();
                }
            });
        }
    }

    public final void b(int i) {
        this.ah.setVisibility(0);
        ViewAnimator viewAnimator = this.ah;
        this.ah.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }

    @Override // defpackage.edpo, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.aj) {
            return;
        }
        eygl.a(this);
    }
}
