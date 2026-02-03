package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.ku;
import defpackage.lco;
import defpackage.qa;
import defpackage.qc;
import defpackage.qi;
import defpackage.xw;
import defpackage.xx;
import defpackage.xy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShareActionProvider extends lco {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    public final Context mContext;
    private int mMaxShownActivityCount;
    private qa mOnChooseActivityListener;
    private final xy mOnMenuItemClickListener;
    public xw mOnShareTargetSelectedListener;
    public String mShareHistoryFileName;

    public ShareActionProvider(Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new xy(this);
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new xx(this);
        }
        qc qcVarE = qc.e(this.mContext, this.mShareHistoryFileName);
        qa qaVar = this.mOnChooseActivityListener;
        synchronized (qcVarE.b) {
            qcVarE.j = qaVar;
        }
    }

    @Override // defpackage.lco
    public boolean hasSubMenu() {
        return true;
    }

    @Override // defpackage.lco
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            qc qcVarE = qc.e(this.mContext, this.mShareHistoryFileName);
            qi qiVar = activityChooserView.a;
            ActivityChooserView activityChooserView2 = qiVar.d;
            qc qcVar = activityChooserView2.a.a;
            if (qcVar != null && activityChooserView2.isShown()) {
                qcVar.unregisterObserver(activityChooserView2.i);
            }
            qiVar.a = qcVarE;
            if (activityChooserView2.isShown()) {
                qcVarE.registerObserver(activityChooserView2.i);
            }
            qiVar.notifyDataSetChanged();
            if (activityChooserView.c()) {
                activityChooserView.d();
                activityChooserView.e();
            }
        }
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        Drawable drawableA = ku.a(this.mContext, typedValue.resourceId);
        ImageView imageView = activityChooserView.e;
        imageView.setImageDrawable(drawableA);
        activityChooserView.h = this;
        activityChooserView.l = R.string.abc_shareactionprovider_share_with_application;
        imageView.setContentDescription(activityChooserView.getContext().getString(R.string.abc_shareactionprovider_share_with));
        return activityChooserView;
    }

    @Override // defpackage.lco
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        qc qcVarE = qc.e(this.mContext, this.mShareHistoryFileName);
        PackageManager packageManager = this.mContext.getPackageManager();
        int iA = qcVarE.a();
        int iMin = Math.min(iA, this.mMaxShownActivityCount);
        for (int i = 0; i < iMin; i++) {
            ResolveInfo resolveInfoC = qcVarE.c(i);
            subMenu.add(0, i, i, resolveInfoC.loadLabel(packageManager)).setIcon(resolveInfoC.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
        }
        if (iMin < iA) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.mContext.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < iA; i2++) {
                ResolveInfo resolveInfoC2 = qcVarE.c(i2);
                subMenuAddSubMenu.add(0, i2, i2, resolveInfoC2.loadLabel(packageManager)).setIcon(resolveInfoC2.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
        }
    }

    public void setOnShareTargetSelectedListener(xw xwVar) {
        this.mOnShareTargetSelectedListener = xwVar;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        qc qcVarE = qc.e(this.mContext, this.mShareHistoryFileName);
        synchronized (qcVarE.b) {
            if (qcVarE.g == intent) {
                return;
            }
            qcVarE.g = intent;
            qcVarE.i = true;
            qcVarE.f();
        }
    }

    public void updateIntent(Intent intent) {
        intent.addFlags(134742016);
    }
}
