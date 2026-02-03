package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czjv extends czkx {
    public czjv(CarouselRecyclerView carouselRecyclerView, czfz czfzVar) {
        super(carouselRecyclerView, czfzVar);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(((czkx) this).a.getContext()).inflate(R.layout.mode_item_view, viewGroup, false);
        czjy czjyVar = new czjy(viewInflate);
        viewInflate.addOnAttachStateChangeListener(czjyVar);
        return czjyVar;
    }

    @Override // defpackage.czkx, defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, final int i) {
        czjy czjyVar = (czjy) wvVar;
        View view = czjyVar.a;
        new cvjg(view, new czkw(this, i, view), new View[0]);
        view.post(new Runnable() { // from class: czkt
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        List list = this.d;
        czjw czjwVar = (czjw) (list.size() > i ? list.get(i) : null);
        if (czjwVar == null) {
            czjwVar = new czjw(czgd.PHOTO);
        }
        TextView textView = czjyVar.t;
        czgd czgdVar = czjwVar.a;
        textView.setText(czgdVar.c);
        textView.setContentDescription(czjyVar.a.getResources().getString(czgdVar.d));
        boolean z = i == this.e;
        textView.setTextColor(z ? czjyVar.v : czjyVar.u);
        czjyVar.C(z ? czjyVar.x : czjyVar.y);
        czjyVar.D(true != z ? 0.0f : 1.0f);
    }

    @Override // defpackage.czkx
    public final int l(View view) {
        cqaz.k(view instanceof TextView);
        float[] fArr = new float[1];
        TextView textView = (TextView) view;
        textView.getPaint().breakText(textView.getText().toString(), true, Float.MAX_VALUE, fArr);
        return (int) (fArr[0] + view.getPaddingStart() + view.getPaddingEnd());
    }
}
