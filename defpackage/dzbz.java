package defpackage;

import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbz extends Property {
    public dzbz(Class cls) {
        super(cls, "scrollOffset");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = ExpandableDialogView.m;
        return Integer.valueOf(((ExpandableDialogView) obj).i);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        int i = ExpandableDialogView.m;
        ((ExpandableDialogView) obj).i(iIntValue);
    }
}
