package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogc extends ogf {
    final /* synthetic */ ogh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogc(ogh oghVar) {
        super(oghVar);
        this.a = oghVar;
    }

    public final void G(List list) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((ekoe) list).c) {
                break;
            }
            if (((ogd) list.get(i)).a()) {
                z = true;
                break;
            }
            i++;
        }
        ogh oghVar = this.a;
        ImageView imageView = oghVar.s;
        if (imageView != null) {
            imageView.setImageDrawable(z ? oghVar.B : oghVar.C);
            imageView.setContentDescription(z ? oghVar.D : oghVar.E);
        }
        this.d = list;
    }

    @Override // defpackage.ogf
    /* renamed from: H */
    public final void g(oga ogaVar, int i) {
        super.g(ogaVar, i);
        if (i > 0) {
            ogaVar.t.setVisibility(true != ((ogd) this.d.get(i + (-1))).a() ? 4 : 0);
        }
    }

    @Override // defpackage.ogf, defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        g((oga) wvVar, i);
    }

    @Override // defpackage.ogf
    public final void l(oga ogaVar) {
        boolean z;
        ogaVar.s.setText(R.string.exo_track_selection_none);
        int i = 0;
        while (true) {
            if (i >= this.d.size()) {
                z = true;
                break;
            } else {
                if (((ogd) this.d.get(i)).a()) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        ogaVar.t.setVisibility(true != z ? 4 : 0);
        ogaVar.a.setOnClickListener(new View.OnClickListener() { // from class: ogb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ogh oghVar = this.a.a;
                mcg mcgVar = oghVar.F;
                if (mcgVar == null || !mcgVar.m(29)) {
                    return;
                }
                mcq mcqVarI = oghVar.F.I();
                mcg mcgVar2 = oghVar.F;
                nhr nhrVar = new nhr((nhs) mcqVarI);
                nhrVar.c(3);
                nhrVar.r = -3;
                int i2 = ekgb.d;
                nhrVar.p = new ekfw().g();
                nhrVar.q = false;
                mcgVar2.T(new nhs(nhrVar));
                oghVar.j.dismiss();
            }
        });
    }

    @Override // defpackage.ogf
    public final void F(String str) {
    }
}
