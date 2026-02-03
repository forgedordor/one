package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edej extends vo {
    public ekgb a;
    public final dsvh d;
    public final edem e;
    private final eddy f;
    private final dswb g;

    public edej(eddy eddyVar, dswb dswbVar, dsvh dsvhVar, edem edemVar) {
        int i = ekgb.d;
        this.a = ekoe.a;
        this.f = eddyVar;
        this.g = dswbVar;
        this.d = dsvhVar;
        this.e = edemVar;
    }

    static final boolean l(int i) {
        return i == 0;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size() + 1;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return l(i) ? 0 : 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return i == 0 ? new edei(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_clusters_header_view, viewGroup, false)) : new edeh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_cluster_image, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        if (dF(i) == 1) {
            final edeh edehVar = (edeh) wvVar;
            int i2 = i - 1;
            final etub etubVar = (etub) this.a.get(i2);
            eddy eddyVar = this.f;
            etwu etwuVar = etubVar.d;
            if (etwuVar == null) {
                etwuVar = etwu.a;
            }
            Uri uriA = eddx.a(etwuVar);
            edea edeaVar = new edea();
            edeaVar.a();
            int i3 = edeh.v;
            SquareImageView squareImageView = edehVar.s;
            eddyVar.g(uriA, edeaVar, squareImageView);
            boolean z = ((etubVar.b & 4) == 0 && etubVar.e.isEmpty()) ? false : true;
            edehVar.t.setText(z ? etubVar.e : "");
            int i4 = true != z ? 1 : 2;
            int[] iArr = ley.a;
            squareImageView.setImportantForAccessibility(i4);
            edehVar.u.setVisibility(true == z ? 0 : 4);
            dsuy dsuyVarA = this.g.b.a(89735);
            dsuyVarA.f(dszq.a(etubVar.c.hashCode()));
            dsuyVarA.f(dsvo.a(i2));
            dsuyVarA.c(squareImageView);
            squareImageView.setOnClickListener(new View.OnClickListener() { // from class: edeg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dsvg dsvgVarE = dsvg.e();
                    int i5 = edeh.v;
                    edej edejVar = this.a;
                    edejVar.d.a(dsvgVarE, edehVar.s);
                    edejVar.e.a.b(etubVar);
                }
            });
        }
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        if (wvVar instanceof edeh) {
            dswb dswbVar = this.g;
            int i = edeh.v;
            dswbVar.b.c(((edeh) wvVar).s);
        }
    }
}
