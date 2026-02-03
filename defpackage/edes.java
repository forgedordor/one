package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edes {
    public final edej a;
    public final RecyclerView b;
    public final LinearProgressIndicator c;
    public final edgv d;
    public final edgp e;
    public ekgb f;
    public int g;
    public final edgs h;
    public boolean i;
    public final View.OnClickListener j;

    public edes(edek edekVar, eduu eduuVar, edgv edgvVar, edgp edgpVar, edgt edgtVar, lvj lvjVar, RecyclerView recyclerView, final LinearProgressIndicator linearProgressIndicator, final edmy edmyVar) {
        int i = ekgb.d;
        this.f = ekoe.a;
        this.i = true;
        this.d = edgvVar;
        this.e = edgpVar;
        edgs edgsVarA = edgtVar.a(20);
        this.h = edgsVarA;
        edgvVar.e(edgsVarA.b());
        this.b = recyclerView;
        this.c = linearProgressIndicator;
        ((edot) edmyVar).a.f(lvjVar, new lvz() { // from class: edel
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edll edllVar = (edll) obj;
                boolean zIsEmpty = edllVar.b().isEmpty();
                final edes edesVar = this.a;
                if (!zIsEmpty) {
                    ekgb ekgbVarB = edllVar.b();
                    int size = edesVar.f.size() + 1;
                    int size2 = ekgbVarB.size() - edesVar.f.size();
                    edej edejVar = edesVar.a;
                    edejVar.a = ekgbVarB;
                    edejVar.w(size, size2);
                    edesVar.f = edllVar.b();
                    edesVar.c.setVisibility(4);
                    if (edesVar.i) {
                        edesVar.i = false;
                        final edgr edgrVarB = edesVar.e.b(9);
                        edgrVarB.b();
                        edesVar.b.post(new Runnable() { // from class: edep
                            @Override // java.lang.Runnable
                            public final void run() {
                                edes edesVar2 = edesVar;
                                edgs edgsVar = edesVar2.h;
                                edgsVar.c(edgrVarB.a());
                                edesVar2.d.c(edgsVar.a());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (edllVar.a().g()) {
                    edesVar.c.setVisibility(4);
                    int iOrdinal = ((edhe) edllVar.a().c()).ordinal();
                    if (iOrdinal == 0) {
                        final Snackbar snackbarP = Snackbar.p(edesVar.b, R.string.op3_something_went_wrong, -2);
                        snackbarP.v(R.string.op3_dismiss, new View.OnClickListener() { // from class: edeo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                snackbarP.e();
                            }
                        });
                        snackbarP.i();
                    } else if (iOrdinal == 1) {
                        Snackbar snackbarP2 = Snackbar.p(edesVar.b, R.string.op3_something_went_wrong, -2);
                        snackbarP2.v(R.string.op3_retry, edesVar.j);
                        snackbarP2.i();
                    } else {
                        if (iOrdinal != 2) {
                            return;
                        }
                        Snackbar snackbarP3 = Snackbar.p(edesVar.b, R.string.op3_check_your_connection, -2);
                        snackbarP3.v(R.string.op3_retry, edesVar.j);
                        snackbarP3.i();
                    }
                }
            }
        });
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns));
        gridLayoutManager.g = new edeq(gridLayoutManager);
        recyclerView.ao(gridLayoutManager);
        edem edemVar = new edem(eduuVar);
        eddy eddyVar = (eddy) edekVar.a.b();
        eddyVar.getClass();
        dswb dswbVar = (dswb) edekVar.b.b();
        dswbVar.getClass();
        dsvh dsvhVar = (dsvh) edekVar.c.b();
        dsvhVar.getClass();
        edej edejVar = new edej(eddyVar, dswbVar, dsvhVar, edemVar);
        this.a = edejVar;
        recyclerView.al(edejVar);
        edmyVar.a(1000);
        this.g = 1000;
        recyclerView.y(new eder(this, edmyVar));
        this.j = new View.OnClickListener() { // from class: eden
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                linearProgressIndicator.setVisibility(0);
                ((edot) edmyVar).b.c();
            }
        };
    }
}
