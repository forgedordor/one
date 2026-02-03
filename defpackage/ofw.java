package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofw extends vo {
    public final String[] a;
    public final float[] d;
    public int e;
    final /* synthetic */ ogh f;

    public ofw(ogh oghVar, String[] strArr, float[] fArr) {
        this.f = oghVar;
        this.a = strArr;
        this.d = fArr;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new oga(LayoutInflater.from(this.f.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, final int i) {
        String[] strArr = this.a;
        oga ogaVar = (oga) wvVar;
        if (i < strArr.length) {
            ogaVar.s.setText(strArr[i]);
        }
        if (i == this.e) {
            ogaVar.a.setSelected(true);
            ogaVar.t.setVisibility(0);
        } else {
            ogaVar.a.setSelected(false);
            ogaVar.t.setVisibility(4);
        }
        ogaVar.a.setOnClickListener(new View.OnClickListener() { // from class: ofv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws CloneNotSupportedException {
                int i2 = i;
                ofw ofwVar = this.a;
                if (i2 != ofwVar.e) {
                    ogh oghVar = ofwVar.f;
                    float f = ofwVar.d[i2];
                    mcg mcgVar = oghVar.F;
                    if (mcgVar != null && mcgVar.m(13)) {
                        mcg mcgVar2 = oghVar.F;
                        mca mcaVarA = mcgVar2.F().a(f);
                        mrn mrnVar = (mrn) mcgVar2;
                        mrnVar.ap();
                        if (!mrnVar.C.p.equals(mcaVarA)) {
                            mta mtaVarF = mrnVar.C.f(mcaVarA);
                            mrnVar.o++;
                            mrnVar.g.e.d(4, mcaVarA).b();
                            mrnVar.an(mtaVarF, 0, false, 5, -9223372036854775807L, -1, false);
                        }
                    }
                }
                ofwVar.f.j.dismiss();
            }
        });
    }
}
