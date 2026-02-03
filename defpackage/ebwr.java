package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwr extends vo {
    public final ebxh a;
    private List d = new ArrayList();

    public ebwr(ebxh ebxhVar) {
        this.a = ebxhVar;
        B(true);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new ebwq(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_result_item_view, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        final ebwq ebwqVar = (ebwq) wvVar;
        final etyp etypVar = ((etyy) this.d.get(i)).b;
        if (etypVar == null) {
            etypVar = etyp.a;
        }
        ImageView imageView = ebwqVar.s;
        Resources resources = imageView.getContext().getResources();
        int iA = etyt.a(etypVar.d);
        if (iA == 0) {
            iA = 1;
        }
        if (iA - 2 != 1) {
            throw new IllegalStateException("Loaded sticker type should be Regular.");
        }
        rbv rbvVarE = raw.e(imageView);
        etyb etybVar = etypVar.f;
        if (etybVar == null) {
            etybVar = etyb.a;
        }
        rbvVarE.i(etybVar.c).q(new rtj().H(ebve.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), imageView, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rqi.b()).v(imageView);
        imageView.setContentDescription(etypVar.h);
        ebwqVar.a.setOnClickListener(new View.OnClickListener() { // from class: ebwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebxh ebxhVar = ebwqVar.t.a;
                if (ebxhVar != null) {
                    ebxhVar.D(etypVar);
                }
            }
        });
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        etyp etypVar = ((etyy) this.d.get(i)).b;
        if (etypVar == null) {
            etypVar = etyp.a;
        }
        return etypVar.c.hashCode();
    }

    public final void l(List list) {
        this.d = list;
        p();
    }
}
