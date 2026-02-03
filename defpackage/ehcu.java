package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehcu extends wx {
    final wx c;
    final /* synthetic */ ehcw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehcu(ehcw ehcwVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = ehcwVar;
        this.c = recyclerView.R;
    }

    private final int l() {
        return Math.max(this.d.a(), -1);
    }

    @Override // defpackage.wx, defpackage.lcl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setItemCount(l());
        accessibilityEvent.setFromIndex(accessibilityEvent.getFromIndex());
        accessibilityEvent.setToIndex(accessibilityEvent.getToIndex());
    }

    @Override // defpackage.wx, defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = lhgVar.a.getCollectionInfo();
        lhe lheVar = collectionInfo != null ? new lhe(collectionInfo) : null;
        lhgVar.u(new lhe(AccessibilityNodeInfo.CollectionInfo.obtain(l(), lheVar == null ? 1 : ((AccessibilityNodeInfo.CollectionInfo) lheVar.a).getColumnCount(), lheVar != null && ((AccessibilityNodeInfo.CollectionInfo) lheVar.a).isHierarchical())));
    }
}
