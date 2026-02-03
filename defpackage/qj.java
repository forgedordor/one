package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qj implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    final /* synthetic */ ActivityChooserView a;

    public qj(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        int i = 0;
        if (view != activityChooserView.f) {
            ActivityChooserView activityChooserView2 = this.a;
            if (view != activityChooserView2.d) {
                throw new IllegalArgumentException();
            }
            activityChooserView2.j = false;
            activityChooserView2.b(activityChooserView2.k);
            return;
        }
        activityChooserView.d();
        qi qiVar = activityChooserView.a;
        ResolveInfo resolveInfoB = qiVar.b();
        qc qcVar = qiVar.a;
        synchronized (qcVar.b) {
            qcVar.f();
            List list = qcVar.c;
            int size = list.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((px) list.get(i)).a == resolveInfoB) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ActivityChooserView activityChooserView3 = this.a;
        Intent intentB = activityChooserView3.a.a.b(i);
        if (intentB != null) {
            intentB.addFlags(524288);
            activityChooserView3.getContext().startActivity(intentB);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        lco lcoVar = this.a.h;
        if (lcoVar != null) {
            lcoVar.subUiVisibilityChanged(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (((qi) adapterView.getAdapter()).getItemViewType(i) != 0) {
            this.a.b(Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        ActivityChooserView activityChooserView = this.a;
        activityChooserView.d();
        if (!activityChooserView.j) {
            ActivityChooserView activityChooserView2 = this.a;
            qi qiVar = activityChooserView2.a;
            if (!qiVar.c) {
                i++;
            }
            Intent intentB = qiVar.a.b(i);
            if (intentB != null) {
                intentB.addFlags(524288);
                activityChooserView2.getContext().startActivity(intentB);
                return;
            }
            return;
        }
        if (i > 0) {
            qc qcVar = activityChooserView.a.a;
            synchronized (qcVar.b) {
                qcVar.f();
                List list = qcVar.c;
                px pxVar = (px) list.get(i);
                px pxVar2 = (px) list.get(0);
                float f = pxVar2 != null ? (pxVar2.b - pxVar.b) + 5.0f : 1.0f;
                ResolveInfo resolveInfo = pxVar.a;
                qcVar.g(new pz(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        if (view != activityChooserView.f) {
            throw new IllegalArgumentException();
        }
        if (activityChooserView.a.getCount() > 0) {
            activityChooserView.j = true;
            activityChooserView.b(activityChooserView.k);
        }
        return true;
    }
}
