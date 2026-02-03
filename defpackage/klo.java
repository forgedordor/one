package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klo extends fdbr implements fdae {
    final /* synthetic */ klr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klo(klr klrVar) {
        super(0);
        this.a = klrVar;
    }

    @Override // defpackage.fdae
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.x.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
