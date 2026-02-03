package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpfo extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpfu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpfo(cpfu cpfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cpfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpfo) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
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
                fdosVar.b(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: cpfm
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        fdosVar.b(Boolean.valueOf(z));
                    }
                };
                accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                fdae fdaeVar = new fdae() { // from class: cpfn
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cpfuVar.a.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
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
        cpfo cpfoVar = new cpfo(this.b, fcxyVar);
        cpfoVar.c = obj;
        return cpfoVar;
    }
}
