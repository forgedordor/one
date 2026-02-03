package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oft extends ogf {
    final /* synthetic */ ogh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oft(ogh oghVar) {
        super(oghVar);
        this.a = oghVar;
    }

    @Override // defpackage.ogf
    public final void F(String str) {
        this.a.f.l(1, str);
    }

    public final boolean G(mcq mcqVar) {
        for (int i = 0; i < this.d.size(); i++) {
            if (mcqVar.D.containsKey(((ogd) this.d.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ogf
    public final void l(oga ogaVar) {
        ogaVar.s.setText(R.string.exo_track_selection_auto);
        mcg mcgVar = this.a.F;
        mee.f(mcgVar);
        ogaVar.t.setVisibility(true != G(mcgVar.I()) ? 0 : 4);
        ogaVar.a.setOnClickListener(new View.OnClickListener() { // from class: ofs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ogh oghVar = this.a.a;
                mcg mcgVar2 = oghVar.F;
                if (mcgVar2 == null || !mcgVar2.m(29)) {
                    return;
                }
                mcq mcqVarI = oghVar.F.I();
                mcg mcgVar3 = oghVar.F;
                String str = mgb.a;
                nhr nhrVar = new nhr((nhs) mcqVarI);
                nhrVar.c(1);
                nhrVar.e(1, false);
                mcgVar3.T(new nhs(nhrVar));
                oghVar.f.l(1, oghVar.getResources().getString(R.string.exo_track_selection_auto));
                oghVar.j.dismiss();
            }
        });
    }
}
