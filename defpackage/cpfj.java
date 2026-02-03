package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpfj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpfu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpfj(cpfu cpfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cpfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpfj) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.c;
            final cpfu cpfuVar = this.b;
            AccessibilityManager accessibilityManager = cpfuVar.a;
            if (accessibilityManager == null) {
                fdosVar.b(false);
            } else {
                fdosVar.b(Boolean.valueOf(accessibilityManager.isEnabled()));
                final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: cpfh
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z) {
                        fdosVar.b(Boolean.valueOf(z));
                    }
                };
                accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
                fdae fdaeVar = new fdae() { // from class: cpfi
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cpfuVar.a.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
                        return fctx.a;
                    }
                };
                this.a = 1;
                if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cpfj cpfjVar = new cpfj(this.b, fcxyVar);
        cpfjVar.c = obj;
        return cpfjVar;
    }
}
