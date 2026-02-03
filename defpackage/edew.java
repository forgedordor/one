package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edew extends edfc {
    public final View.OnClickListener a;
    private final boolean h;
    private final dsvx i;

    public edew(eddy eddyVar, dswb dswbVar, dsvx dsvxVar, dsvh dsvhVar, edfa edfaVar, ejwi ejwiVar, View.OnClickListener onClickListener, boolean z) {
        super(eddyVar, dswbVar, dsvhVar, edfaVar, ejwiVar);
        this.a = onClickListener;
        this.h = z;
        this.i = dsvxVar;
    }

    @Override // defpackage.edfc, defpackage.vo
    public final int a() {
        return this.d.size() + (this.h ? 1 : 0);
    }

    @Override // defpackage.edfc, defpackage.vo
    public final int dF(int i) {
        return i == this.d.size() ? 2 : 1;
    }

    @Override // defpackage.edfc, defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        int iMax = Math.max((int) (viewGroup.getContext().getResources().getDisplayMetrics().widthPixels / kyy.a(viewGroup.getContext().getResources(), R.dimen.photo_picker_me_photos_single_screen_columns)), (int) viewGroup.getResources().getDimension(R.dimen.photo_picker_random_art_image_minimum_width));
        if (i == 1) {
            SquareImageView squareImageView = (SquareImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_grid_item, viewGroup, false).findViewById(R.id.photo_picker_grid_image);
            squareImageView.setLayoutParams(new au(iMax, iMax));
            this.i.b(squareImageView, this.e.a(89756));
            return new edfb(squareImageView);
        }
        final View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false);
        viewInflate.setLayoutParams(new au(iMax, iMax));
        viewInflate.setPadding(0, 0, 0, 0);
        MaterialTextView materialTextView = (MaterialTextView) viewInflate.findViewById(R.id.photo_picker_button_text);
        materialTextView.setText(viewGroup.getContext().getString(R.string.op3_more));
        materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ku.a(viewGroup.getContext(), R.drawable.quantum_gm_ic_photo_library_vd_theme_24), (Drawable) null, (Drawable) null);
        this.i.b(viewInflate, this.e.a(90596));
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: edeu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edew edewVar = this.a;
                edewVar.f.a(dsvg.e(), viewInflate);
                edewVar.a.onClick(view);
            }
        });
        return new edev(viewInflate);
    }
}
