package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czej extends vo {
    private final List a = new ArrayList();
    private final czec d;

    public czej(czec czecVar) {
        this.d = czecVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new czei(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_search_list_item_m2, viewGroup, false));
        }
        if (i == 2) {
            return new czei(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_progress_bar, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new czeg(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_search_results_error_m2, viewGroup, false));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        czei czeiVar = (czei) wvVar;
        final bxeq bxeqVar = (bxeq) this.a.get(i);
        czeiVar.s.setText(bxeqVar.b());
        czeiVar.t.setText(bxeqVar.a());
        View view = czeiVar.a;
        final czec czecVar = this.d;
        view.setOnClickListener(new View.OnClickListener() { // from class: czeh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = czei.u;
                czec czecVar2 = czecVar;
                czeb czebVar = (czeb) czecVar2.d.get();
                if (czebVar != null) {
                    czebVar.D();
                }
                czecVar2.d(bxeqVar);
            }
        });
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return i;
    }
}
