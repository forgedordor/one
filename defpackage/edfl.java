package defpackage;

import android.net.Uri;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edfl {
    public final edfc a;
    public final RecyclerView b;
    public final LinearProgressIndicator c;
    public final edgv d;
    public final edgp e;
    public ekgb f;
    public int g;
    public final edgs h;
    public boolean i;
    public final View.OnClickListener j;
    public final int k;

    public edfl(edfd edfdVar, edgv edgvVar, edgp edgpVar, edgt edgtVar, lxo lxoVar, final eduu eduuVar, lvj lvjVar, RecyclerView recyclerView, final LinearProgressIndicator linearProgressIndicator, final edna ednaVar, ejwi ejwiVar, int i) {
        int i2 = ekgb.d;
        this.f = ekoe.a;
        this.i = true;
        this.d = edgvVar;
        this.e = edgpVar;
        this.k = i;
        final edmz edmzVar = (edmz) lxoVar.a(edmz.class);
        edgs edgsVarA = edgtVar.a(21);
        this.h = edgsVarA;
        edgvVar.e(edgsVarA.b());
        this.b = recyclerView;
        this.c = linearProgressIndicator;
        ednaVar.a().f(lvjVar, new lvz() { // from class: edfg
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edlw edlwVar = (edlw) obj;
                boolean zIsEmpty = edlwVar.c().isEmpty();
                final edfl edflVar = this.a;
                if (!zIsEmpty) {
                    ekgb ekgbVarC = edlwVar.c();
                    int size = edflVar.f.size();
                    edfc edfcVar = edflVar.a;
                    edfcVar.l(ekgbVarC, size + (edfcVar.F() ? 1 : 0), ekgbVarC.size() - edflVar.f.size());
                    edflVar.f = ekgbVarC;
                    edflVar.c.setVisibility(4);
                    if (edflVar.i) {
                        edflVar.i = false;
                        final edgr edgrVarB = edflVar.e.b(edflVar.k);
                        edgrVarB.b();
                        edflVar.b.post(new Runnable() { // from class: edff
                            @Override // java.lang.Runnable
                            public final void run() {
                                edfl edflVar2 = edflVar;
                                edgs edgsVar = edflVar2.h;
                                edgsVar.c(edgrVarB.a());
                                edflVar2.d.c(edgsVar.a());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (edlwVar.a().g()) {
                    edflVar.c.setVisibility(4);
                    int iOrdinal = ((edhe) edlwVar.a().c()).ordinal();
                    if (iOrdinal == 0) {
                        final Snackbar snackbarP = Snackbar.p(edflVar.b, R.string.op3_something_went_wrong, -2);
                        snackbarP.v(R.string.op3_dismiss, new View.OnClickListener() { // from class: edfe
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                snackbarP.e();
                            }
                        });
                        snackbarP.i();
                    } else if (iOrdinal == 1) {
                        Snackbar snackbarP2 = Snackbar.p(edflVar.b, R.string.op3_something_went_wrong, -2);
                        snackbarP2.v(R.string.op3_retry, edflVar.j);
                        snackbarP2.i();
                    } else {
                        if (iOrdinal != 2) {
                            return;
                        }
                        Snackbar snackbarP3 = Snackbar.p(edflVar.b, R.string.op3_check_your_connection, -2);
                        snackbarP3.v(R.string.op3_retry, edflVar.j);
                        snackbarP3.i();
                    }
                }
            }
        });
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns));
        gridLayoutManager.g = new edfj(this, gridLayoutManager);
        recyclerView.ao(gridLayoutManager);
        edfa edfaVar = new edfa() { // from class: edfh
            @Override // defpackage.edfa
            public final void a(Uri uri) {
                edmzVar.c = 9;
                eduuVar.m(uri);
            }
        };
        eddy eddyVar = (eddy) edfdVar.a.b();
        eddyVar.getClass();
        dswb dswbVar = (dswb) edfdVar.b.b();
        dswbVar.getClass();
        dsvh dsvhVar = (dsvh) edfdVar.c.b();
        dsvhVar.getClass();
        edfc edfcVar = new edfc(eddyVar, dswbVar, dsvhVar, edfaVar, ejwiVar);
        this.a = edfcVar;
        recyclerView.al(edfcVar);
        if (fbgv.i()) {
            recyclerView.v(new edda((int) recyclerView.getResources().getDimension(R.dimen.photo_picker_grid_spacing), recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns), 1, edfcVar.F()));
        }
        ednaVar.b(1000);
        this.g = 1000;
        recyclerView.y(new edfk(this, gridLayoutManager, ednaVar));
        this.j = new View.OnClickListener() { // from class: edfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                linearProgressIndicator.setVisibility(0);
                ednaVar.c();
            }
        };
    }
}
