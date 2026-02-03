package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import defpackage.kt;
import defpackage.lco;
import defpackage.ley;
import defpackage.qc;
import defpackage.qd;
import defpackage.qe;
import defpackage.qf;
import defpackage.qg;
import defpackage.qh;
import defpackage.qi;
import defpackage.qj;
import defpackage.us;
import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ActivityChooserView extends ViewGroup {
    public final qi a;
    public final View b;
    public final Drawable c;
    public final FrameLayout d;
    public final ImageView e;
    public final FrameLayout f;
    public final ImageView g;
    public lco h;
    final DataSetObserver i;
    public boolean j;
    public int k;
    public int l;
    private final qj m;
    private final int n;
    private final ViewTreeObserver.OnGlobalLayoutListener o;
    private us p;
    private boolean q;

    /* compiled from: PG */
    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            yx yxVarK = yx.k(context, attributeSet, a);
            setBackgroundDrawable(yxVarK.h(0));
            yxVarK.o();
        }
    }

    public ActivityChooserView(Context context) {
        super(context, null, 0);
        this.i = new qd(this);
        this.o = new qe(this);
        this.k = 4;
        int[] iArr = kt.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, 0);
        ley.o(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        this.k = typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.google.android.apps.messaging.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        qj qjVar = new qj(this);
        this.m = qjVar;
        View viewFindViewById = findViewById(com.google.android.apps.messaging.R.id.activity_chooser_view_content);
        this.b = viewFindViewById;
        this.c = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.default_activity_button);
        this.f = frameLayout;
        frameLayout.setOnClickListener(qjVar);
        frameLayout.setOnLongClickListener(qjVar);
        this.g = (ImageView) frameLayout.findViewById(com.google.android.apps.messaging.R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(qjVar);
        frameLayout2.setAccessibilityDelegate(new qf());
        frameLayout2.setOnTouchListener(new qg(this, frameLayout2));
        this.d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.google.android.apps.messaging.R.id.image);
        this.e = imageView;
        imageView.setImageDrawable(drawable);
        qi qiVar = new qi(this);
        this.a = qiVar;
        qiVar.registerDataSetObserver(new qh(this));
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.abc_config_prefDialogWidth));
    }

    public final us a() {
        if (this.p == null) {
            us usVar = new us(getContext());
            this.p = usVar;
            usVar.e(this.a);
            us usVar2 = this.p;
            usVar2.l = this;
            usVar2.y();
            us usVar3 = this.p;
            qj qjVar = this.m;
            usVar3.m = qjVar;
            usVar3.t(qjVar);
        }
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void b(int i) {
        qi qiVar = this.a;
        if (qiVar.a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.o);
        ?? r1 = this.f.getVisibility() == 0 ? 1 : 0;
        int iA = qiVar.a();
        if (i == Integer.MAX_VALUE || iA <= i + r1) {
            qiVar.e(false);
            qiVar.c(i);
        } else {
            qiVar.e(true);
            qiVar.c(i - 1);
        }
        us usVarA = a();
        if (usVarA.x()) {
            return;
        }
        if (this.j || r1 == 0) {
            qiVar.d(true, r1);
        } else {
            qiVar.d(false, false);
        }
        int i2 = qiVar.b;
        qiVar.b = Alert.DURATION_SHOW_INDEFINITELY;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = qiVar.getCount();
        int iMax = 0;
        View view = null;
        for (int i3 = 0; i3 < count; i3++) {
            view = qiVar.getView(i3, view, null);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        qiVar.b = i2;
        usVarA.r(Math.min(iMax, this.n));
        usVarA.v();
        lco lcoVar = this.h;
        if (lcoVar != null) {
            lcoVar.subUiVisibilityChanged(true);
        }
        usVarA.e.setContentDescription(getContext().getString(com.google.android.apps.messaging.R.string.abc_activitychooserview_choose_application));
        usVarA.e.setSelector(new ColorDrawable(0));
    }

    public final boolean c() {
        return a().x();
    }

    public final void d() {
        if (c()) {
            a().m();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.o);
            }
        }
    }

    public final void e() {
        if (c() || !this.q) {
            return;
        }
        this.j = false;
        b(this.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc qcVar = this.a.a;
        if (qcVar != null) {
            qcVar.registerObserver(this.i);
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc qcVar = this.a.a;
        if (qcVar != null) {
            qcVar.unregisterObserver(this.i);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.o);
        }
        if (c()) {
            d();
        }
        this.q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
        if (c()) {
            return;
        }
        d();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.b;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
