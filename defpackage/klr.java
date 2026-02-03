package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klr extends kkt {
    private final hyk A;
    private final int B;
    private final String C;
    private hyl D;
    public final View x;
    public fdap y;
    public fdap z;

    public klr(Context context, hnb hnbVar, View view, iqt iqtVar, hyk hykVar, int i, jfh jfhVar) {
        super(context, hnbVar, iqtVar, view, jfhVar);
        this.x = view;
        this.A = hykVar;
        this.B = i;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.C = strValueOf;
        Object objA = hykVar != null ? hykVar.a(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objA instanceof SparseArray ? (SparseArray) objA : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (hykVar != null) {
            n(hykVar.e(strValueOf, new klo(this)));
        }
        fdap fdapVar = kli.a;
        this.y = fdapVar;
        this.z = fdapVar;
    }

    public final void n(hyl hylVar) {
        hyl hylVar2 = this.D;
        if (hylVar2 != null) {
            hylVar2.a();
        }
        this.D = hylVar;
    }
}
