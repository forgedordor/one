package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebyn extends vo {
    public final boolean a;
    public final ebyu d;
    private final etyu e;

    public ebyn(etyu etyuVar, boolean z, ebyu ebyuVar) {
        this.e = etyuVar;
        this.a = z;
        this.d = ebyuVar;
        B(true);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.e.h.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new ebym(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pack_details_item_view, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        final ebym ebymVar = (ebym) wvVar;
        final etyp etypVar = (etyp) this.e.h.get(i);
        ImageView imageView = ebymVar.s;
        Resources resources = imageView.getContext().getResources();
        rbv rbvVarE = raw.e(imageView);
        etyb etybVar = etypVar.f;
        if (etybVar == null) {
            etybVar = etyb.a;
        }
        rbvVarE.i(etybVar.c).q(new rtj().H(ebve.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), imageView, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rqi.b()).v(imageView);
        imageView.setContentDescription(etypVar.h);
        if (ebymVar.t.a) {
            ebymVar.a.setOnClickListener(new View.OnClickListener() { // from class: ebyl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebyu ebyuVar = ebymVar.t.d;
                    if (ebyuVar != null) {
                        PackDetailsActivity packDetailsActivity = (PackDetailsActivity) ebyuVar;
                        if (packDetailsActivity.getCallingActivity() == null) {
                            return;
                        }
                        packDetailsActivity.setResult(-1, new Intent().putExtra("sticker", etypVar.toByteArray()).putExtra("interaction_source", 9));
                        packDetailsActivity.finish();
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final long gH(int i) {
        return ((etyp) this.e.h.get(i)).c.hashCode();
    }
}
