package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ogf extends vo {
    protected List d = new ArrayList();
    final /* synthetic */ ogh e;

    protected ogf(ogh oghVar) {
        this.e = oghVar;
    }

    protected abstract void F(String str);

    @Override // defpackage.vo
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void g(oga ogaVar, int i) {
        final mcg mcgVar = this.e.F;
        if (mcgVar == null) {
            return;
        }
        if (i == 0) {
            l(ogaVar);
            return;
        }
        final ogd ogdVar = (ogd) this.d.get(i - 1);
        final mcm mcmVar = ogdVar.a.b;
        boolean z = mcgVar.I().D.get(mcmVar) != null && ogdVar.a();
        ogaVar.s.setText(ogdVar.c);
        ogaVar.t.setVisibility(true != z ? 4 : 0);
        ogaVar.a.setOnClickListener(new View.OnClickListener() { // from class: oge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mcg mcgVar2 = mcgVar;
                if (mcgVar2.m(29)) {
                    ogd ogdVar2 = ogdVar;
                    mcm mcmVar2 = mcmVar;
                    ogf ogfVar = this.a;
                    nhr nhrVar = new nhr((nhs) mcgVar2.I());
                    mcn mcnVar = new mcn(mcmVar2, ekgb.r(Integer.valueOf(ogdVar2.b)));
                    nhrVar.c(mcnVar.a());
                    nhrVar.t.put(mcnVar.a, mcnVar);
                    nhrVar.e(ogdVar2.a.a(), false);
                    mcgVar2.T(new nhs(nhrVar));
                    ogfVar.F(ogdVar2.c);
                    ogfVar.e.j.dismiss();
                }
            }
        });
    }

    protected final void I() {
        this.d = Collections.EMPTY_LIST;
    }

    @Override // defpackage.vo
    public final int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new oga(LayoutInflater.from(this.e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    protected abstract void l(oga ogaVar);
}
