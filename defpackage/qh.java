package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.support.v7.widget.ActivityChooserView;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qh extends DataSetObserver {
    final /* synthetic */ ActivityChooserView a;

    public qh(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int size;
        super.onChanged();
        ActivityChooserView activityChooserView = this.a;
        qi qiVar = activityChooserView.a;
        if (qiVar.getCount() > 0) {
            activityChooserView.d.setEnabled(true);
        } else {
            activityChooserView.d.setEnabled(false);
        }
        int iA = qiVar.a();
        qc qcVar = qiVar.a;
        synchronized (qcVar.b) {
            qcVar.f();
            size = qcVar.d.size();
        }
        if (iA == 1 || (iA > 1 && size > 0)) {
            FrameLayout frameLayout = activityChooserView.f;
            frameLayout.setVisibility(0);
            ResolveInfo resolveInfoB = activityChooserView.a.b();
            PackageManager packageManager = activityChooserView.getContext().getPackageManager();
            activityChooserView.g.setImageDrawable(resolveInfoB.loadIcon(packageManager));
            if (activityChooserView.l != 0) {
                frameLayout.setContentDescription(activityChooserView.getContext().getString(activityChooserView.l, resolveInfoB.loadLabel(packageManager)));
            }
        } else {
            activityChooserView.f.setVisibility(8);
        }
        if (activityChooserView.f.getVisibility() == 0) {
            activityChooserView.b.setBackgroundDrawable(activityChooserView.c);
        } else {
            activityChooserView.b.setBackgroundDrawable(null);
        }
    }
}
