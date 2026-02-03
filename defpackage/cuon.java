package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuon implements DialogInterface.OnShowListener {
    final /* synthetic */ cuoo a;

    public cuon(cuoo cuooVar) {
        this.a = cuooVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int dividerHeight;
        cuoo cuooVar = this.a;
        iv ivVar = cuooVar.f;
        if (ivVar == null) {
            return;
        }
        ListView listViewD = ivVar.d();
        ViewGroup.LayoutParams layoutParams = listViewD.getLayoutParams();
        if (layoutParams.height == -1 || layoutParams.height == -2) {
            return;
        }
        ListAdapter adapter = listViewD.getAdapter();
        if (adapter == null) {
            dividerHeight = -2;
        } else {
            int measuredHeight = 0;
            for (int i = 0; i < adapter.getCount(); i++) {
                View view = adapter.getView(i, null, listViewD);
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredHeight += view.getMeasuredHeight();
                }
            }
            dividerHeight = measuredHeight + (listViewD.getDividerHeight() * (adapter.getCount() - 1));
        }
        if (dividerHeight < layoutParams.height) {
            layoutParams.height = -2;
            listViewD.setLayoutParams(layoutParams);
            listViewD.setPadding(0, 0, 0, cuooVar.a.getResources().getDimensionPixelSize(R.dimen.bugle_settings_vertical_padding));
            listViewD.requestLayout();
        }
    }
}
