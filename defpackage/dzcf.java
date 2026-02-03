package defpackage;

import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzcf extends Property {
    public dzcf(Class cls) {
        super(cls, "elevationProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((ExpandableDialogView) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        expandableDialogView.g = fFloatValue;
        float f = fFloatValue * expandableDialogView.f;
        eesc eescVar = expandableDialogView.e;
        eescVar.O(f);
        eescVar.P(ColorStateList.valueOf(expandableDialogView.c(f)));
        View view = expandableDialogView.d;
        int[] iArr = ley.a;
        len.j(view, f);
        expandableDialogView.invalidate();
    }
}
