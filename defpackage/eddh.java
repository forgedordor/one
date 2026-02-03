package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddh extends edde {
    public eddh(eddy eddyVar, dswb dswbVar, dsvx dsvxVar, dsvh dsvhVar, edmz edmzVar, eddc eddcVar) {
        super(eddyVar, dswbVar, dsvxVar, dsvhVar, edmzVar, eddcVar);
    }

    @Override // defpackage.edde, defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        SquareImageView squareImageView = (SquareImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_grid_item, viewGroup, false).findViewById(R.id.photo_picker_grid_image);
        int iMax = Math.max((int) (viewGroup.getContext().getResources().getDisplayMetrics().widthPixels / kyy.a(viewGroup.getContext().getResources(), R.dimen.photo_picker_single_screen_columns)), (int) viewGroup.getResources().getDimension(R.dimen.photo_picker_random_art_image_minimum_width));
        squareImageView.setLayoutParams(new au(iMax, iMax));
        return new eddd(squareImageView);
    }
}
