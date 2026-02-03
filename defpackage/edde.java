package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edde extends vo {
    public final eddc a;
    public final dsvh d;
    public final edmz e;
    public ekgb f;
    private final eddy g;
    private final rbh h;
    private final dswb i;
    private final dsvx j;

    public edde(eddy eddyVar, dswb dswbVar, dsvx dsvxVar, dsvh dsvhVar, edmz edmzVar, eddc eddcVar) {
        int i = ekgb.d;
        this.f = ekoe.a;
        this.g = eddyVar;
        this.h = rbh.HIGH;
        this.a = eddcVar;
        this.i = dswbVar;
        this.j = dsvxVar;
        this.d = dsvhVar;
        this.e = edmzVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vo
    public wv e(ViewGroup viewGroup, int i) {
        return new eddd((SquareImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_grid_item, viewGroup, false).findViewById(R.id.photo_picker_grid_image));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        final eddd edddVar = (eddd) wvVar;
        final edhp edhpVar = (edhp) this.f.get(i);
        Uri uri = Uri.parse(edhpVar.d());
        edea edeaVar = new edea();
        edeaVar.a();
        int i2 = eddd.t;
        SquareImageView squareImageView = edddVar.s;
        this.g.h(uri, edeaVar, squareImageView, this.h);
        squareImageView.setOnClickListener(new View.OnClickListener() { // from class: eddb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dsvg dsvgVarE = dsvg.e();
                int i3 = eddd.t;
                edde eddeVar = this.a;
                eddeVar.d.a(dsvgVarE, edddVar.s);
                eddeVar.e.c = 15;
                eddc eddcVar = eddeVar.a;
                edhp edhpVar2 = edhpVar;
                eddcVar.a(edhpVar2.a(), edhpVar2.c());
            }
        });
        squareImageView.setContentDescription(edhpVar.b());
        dsuy dsuyVarA = this.i.a(128094);
        dsuyVarA.f(dsvo.a(i));
        this.j.e(squareImageView, dsuyVarA);
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        int i = eddd.t;
        this.j.c(((eddd) wvVar).s);
    }
}
