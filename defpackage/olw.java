package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olw extends lxd {
    public WeakReference a;

    @Override // defpackage.lxd
    protected final void fC() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            fdbq.c("completeTransition");
            weakReference = null;
        }
        fdae fdaeVar = (fdae) weakReference.get();
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
    }
}
