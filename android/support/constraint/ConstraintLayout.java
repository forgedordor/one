package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import defpackage.au;
import defpackage.aw;
import defpackage.ax;
import defpackage.bh;
import defpackage.bi;
import defpackage.bj;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    final bi b;
    public aw c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public ConstraintLayout(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new bi();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(null);
    }

    private final bh b(int i) {
        View view;
        if (i == 0 || (view = (View) this.a.get(i)) == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((au) view.getLayoutParams()).Y;
    }

    private final bh c(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((au) view.getLayoutParams()).Y;
    }

    private final void d(AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        bi biVar = this.b;
        biVar.J = this;
        this.a.put(getId(), this);
        this.c = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ax.a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                } else if (index == 17) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                } else if (index == 14) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                } else if (index == 15) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                } else if (index == 113) {
                    this.j = typedArrayObtainStyledAttributes.getInt(113, this.j);
                } else if (index == 34) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    aw awVar = new aw();
                    this.c = awVar;
                    awVar.g(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        biVar.ai = this.j;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof au;
    }

    protected final void gZ() {
        this.b.D();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new au(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new au(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            au auVar = (au) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || auVar.Q || zIsInEditMode) {
                bh bhVar = auVar.Y;
                int iB = bhVar.b();
                int iC = bhVar.c();
                childAt.layout(iB, iC, bhVar.h() + iB, bhVar.d() + iC);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r35, int r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        bh bhVarC = c(view);
        if (z && !(bhVarC instanceof bj)) {
            au auVar = (au) view.getLayoutParams();
            auVar.Y = new bj();
            auVar.Q = true;
            ((bj) auVar.Y).A(auVar.M);
            bh bhVar = auVar.Y;
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(c(view));
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new au(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new bi();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new bi();
        this.e = 0;
        this.f = 0;
        this.g = Alert.DURATION_SHOW_INDEFINITELY;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = true;
        this.j = 2;
        this.c = null;
        d(attributeSet);
    }
}
