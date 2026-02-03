package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwy extends ViewGroup {
    public final int a;
    public final List b;
    public final List c;
    public final fxa d;
    public int e;

    public fwy(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new fxa();
        setClipChildren(false);
        fxc fxcVar = new fxc(context);
        addView(fxcVar);
        arrayList.add(fxcVar);
        arrayList2.add(fxcVar);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
