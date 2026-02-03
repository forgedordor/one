package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecyv extends ecyx {
    public lxo a;
    public edgt ag;
    public edgp ah;
    public eduu ai;
    public edgs aj;
    public RecyclerView ak;
    public LinearProgressIndicator al;
    public ecyz am;
    public int an;
    public View.OnClickListener ao;
    public edde ap;
    public ekgb aq;
    public ecyn ar;
    public eddf b;
    public dsvx c;
    public dswb d;
    public edgv e;

    public ecyv() {
        int i = ekgb.d;
        this.aq = ekoe.a;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.c.b(viewInflate, this.d.a(128093));
        ley.r(viewInflate, this.m.getString("collectionTitleKey"));
        len.k(viewInflate, new ldn() { // from class: ecys
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
        });
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.x(this.m.getString("collectionTitleKey"));
        this.ai.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: ecyp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.ai.l();
            }
        });
        ecyz ecyzVar = (ecyz) this.a.a(ecyz.class);
        this.am = ecyzVar;
        long j = this.m.getLong("collectionIdKey");
        if (!ecyzVar.d.g()) {
            ecyzVar.d = ejwi.j(Long.valueOf(j));
            final lvx lvxVar = ecyzVar.b;
            lvxVar.p(ecyzVar.a.a(j).a(), new lvz() { // from class: ecyy
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    lvxVar.j((edic) obj);
                }
            });
        }
        this.ak = (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid);
        this.al = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        this.am.b.f(Q(), new lvz() { // from class: ecyq
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edic edicVar = (edic) obj;
                boolean zIsEmpty = edicVar.b().isEmpty();
                ecyv ecyvVar = this.a;
                if (!zIsEmpty) {
                    ekgb ekgbVarB = edicVar.b();
                    int size = ekgbVarB.size() - ecyvVar.aq.size();
                    edde eddeVar = ecyvVar.ap;
                    int size2 = ecyvVar.aq.size();
                    eddeVar.f = ekgbVarB;
                    eddeVar.w(size2, size);
                    ecyvVar.aq = ekgbVarB;
                    ecyvVar.al.setVisibility(4);
                    ecyz ecyzVar2 = ecyvVar.am;
                    if (ecyzVar2.c) {
                        ecyzVar2.c = false;
                        edgr edgrVarB = ecyvVar.ah.b(21);
                        edgrVarB.b();
                        edgv edgvVar = ecyvVar.e;
                        edgs edgsVar = ecyvVar.aj;
                        edgsVar.c(edgrVarB.a());
                        edgvVar.c(edgsVar.a());
                        return;
                    }
                    return;
                }
                if (edicVar.a().g()) {
                    ecyvVar.al.setVisibility(4);
                    int iOrdinal = ((edhe) edicVar.a().c()).ordinal();
                    if (iOrdinal == 0) {
                        final Snackbar snackbarP = Snackbar.p(ecyvVar.ak, R.string.op3_something_went_wrong, -2);
                        snackbarP.v(R.string.op3_dismiss, new View.OnClickListener() { // from class: ecyo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                snackbarP.e();
                            }
                        });
                        snackbarP.i();
                    } else if (iOrdinal == 1) {
                        Snackbar snackbarP2 = Snackbar.p(ecyvVar.ak, R.string.op3_something_went_wrong, -2);
                        snackbarP2.v(R.string.op3_retry, ecyvVar.ao);
                        snackbarP2.i();
                    } else {
                        if (iOrdinal != 2) {
                            return;
                        }
                        Snackbar snackbarP3 = Snackbar.p(ecyvVar.ak, R.string.op3_check_your_connection, -2);
                        snackbarP3.v(R.string.op3_retry, ecyvVar.ao);
                        snackbarP3.i();
                    }
                }
            }
        });
        this.ao = new View.OnClickListener() { // from class: ecyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ecyv ecyvVar = this.a;
                ecyvVar.al.setVisibility(0);
                ecyz ecyzVar2 = ecyvVar.am;
                if (ecyzVar2.d.g()) {
                    ecyzVar2.a.a(((Long) ecyzVar2.d.c()).longValue()).c();
                }
            }
        };
        this.ak.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.ak.getResources().getInteger(R.integer.photo_picker_num_columns));
        this.ak.ao(gridLayoutManager);
        eddf eddfVar = this.b;
        eddc eddcVar = new eddc() { // from class: ecyt
            @Override // defpackage.eddc
            public final void a(long j2, String str) {
                this.a.ar.c(j2, str);
            }
        };
        eddy eddyVar = (eddy) eddfVar.a.b();
        eddyVar.getClass();
        dswb dswbVar = (dswb) eddfVar.b.b();
        dswbVar.getClass();
        dsvx dsvxVar = (dsvx) eddfVar.c.b();
        dsvxVar.getClass();
        dsvh dsvhVar = (dsvh) eddfVar.d.b();
        dsvhVar.getClass();
        edmz edmzVar = (edmz) eddfVar.e.b();
        edmzVar.getClass();
        edde eddeVar = new edde(eddyVar, dswbVar, dsvxVar, dsvhVar, edmzVar, eddcVar);
        this.ap = eddeVar;
        this.ak.al(eddeVar);
        this.ak.v(new edda((int) B().getDimension(R.dimen.photo_picker_grid_spacing), B().getInteger(R.integer.photo_picker_num_columns), 1, false));
        edgs edgsVarA = this.ag.a(27);
        this.aj = edgsVarA;
        this.e.e(edgsVarA.b());
        this.am.a(250);
        this.an = 250;
        this.ak.y(new ecyu(this, gridLayoutManager));
    }

    @Override // defpackage.ecyx, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.as) {
            return;
        }
        eygl.a(this);
    }
}
