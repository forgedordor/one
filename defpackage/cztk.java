package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cztk implements DialogInterface.OnShowListener {
    final /* synthetic */ czte a;

    public cztk(czte czteVar) {
        this.a = czteVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
        Dialog dialog = (Dialog) dialogInterface;
        View viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(viewFindViewById.getContext().getDrawable(R.drawable.bottomsheet_background));
        }
        czte czteVar = this.a;
        if (czteVar.o()) {
            dialog.findViewById(R.id.scroll_view).setMinimumHeight(Resources.getSystem().getDisplayMetrics().heightPixels);
        }
        BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(viewFindViewById);
        bottomSheetBehaviorV.E(3);
        bottomSheetBehaviorV.w = false;
        czteVar.d.p(false);
    }
}
