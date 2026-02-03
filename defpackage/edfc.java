package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edfc extends vo {
    private final eddy a;
    ekgb d;
    final dswb e;
    final dsvh f;
    public final edfa g;
    private final ejwi h;

    public edfc(eddy eddyVar, dswb dswbVar, dsvh dsvhVar, edfa edfaVar, ejwi ejwiVar) {
        int i = ekgb.d;
        this.d = ekoe.a;
        this.a = eddyVar;
        this.e = dswbVar;
        this.f = dsvhVar;
        this.g = edfaVar;
        this.h = ejwiVar;
    }

    final boolean F() {
        return this.h.g();
    }

    final boolean G(int i) {
        return this.h.g() && i == 0;
    }

    @Override // defpackage.vo
    public int a() {
        return this.d.size() + (this.h.g() ? 1 : 0);
    }

    @Override // defpackage.vo
    public int dF(int i) {
        return G(i) ? 0 : 1;
    }

    @Override // defpackage.vo
    public wv e(ViewGroup viewGroup, int i) {
        SquareImageView squareImageView;
        if (i == 0) {
            return new edez(LayoutInflater.from(viewGroup.getContext()).inflate(true != fbgv.i() ? R.layout.photo_picker_photos_header_view : R.layout.photo_picker_photos_header_view_art_style, viewGroup, false));
        }
        if (fbgv.i()) {
            squareImageView = new SquareImageView(viewGroup.getContext());
            squareImageView.d();
            squareImageView.setPadding(0, 0, 0, 0);
        } else {
            squareImageView = new SquareImageView(viewGroup.getContext());
        }
        return new edfb(squareImageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        if (dF(i) == 0) {
            edez edezVar = (edez) wvVar;
            eddy eddyVar = this.a;
            ejwi ejwiVar = this.h;
            etwu etwuVar = ((etub) ejwiVar.c()).d;
            if (etwuVar == null) {
                etwuVar = etwu.a;
            }
            Uri uriA = eddx.a(etwuVar);
            edea edeaVar = new edea();
            edeaVar.a();
            edeaVar.c();
            int i2 = edez.u;
            eddyVar.f(uriA, edeaVar, edezVar.s);
            if ((((etub) ejwiVar.c()).b & 4) != 0) {
                edezVar.t.setText(((etub) ejwiVar.c()).e);
                return;
            }
            return;
        }
        if (dF(i) == 1) {
            final edfb edfbVar = (edfb) wvVar;
            int i3 = i - (this.h.g() ? 1 : 0);
            etwu etwuVar2 = (etwu) this.d.get(i3);
            int i4 = edfb.t;
            SquareImageView squareImageView = edfbVar.s;
            Context context = squareImageView.getContext();
            evvp evvpVar = etwuVar2.f;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            squareImageView.setContentDescription(context.getString(R.string.op3_picker_accessibility_photo, eddj.a(evvpVar)));
            final Uri uriA2 = eddx.a(etwuVar2);
            eddy eddyVar2 = this.a;
            edea edeaVar2 = new edea();
            edeaVar2.a();
            eddyVar2.g(uriA2, edeaVar2, squareImageView);
            dsuy dsuyVarA = this.e.b.a(89756);
            dsuyVarA.f(dszq.a(etwuVar2.c.hashCode()));
            dsuyVarA.f(dsvo.a(i3));
            dsuyVarA.c(squareImageView);
            squareImageView.setOnClickListener(new View.OnClickListener() { // from class: edey
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dsvg dsvgVarE = dsvg.e();
                    int i5 = edfb.t;
                    edfc edfcVar = this.a;
                    edfcVar.f.a(dsvgVarE, edfbVar.s);
                    edfcVar.g.a(uriA2);
                }
            });
        }
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        if (wvVar instanceof edfb) {
            dswb dswbVar = this.e;
            int i = edfb.t;
            dswbVar.b.c(((edfb) wvVar).s);
        }
    }

    public final void l(ekgb ekgbVar, int i, int i2) {
        this.d = ekgbVar;
        w(i, i2);
    }
}
