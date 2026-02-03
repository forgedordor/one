package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdh implements DisplayManager.DisplayListener {
    final /* synthetic */ fdae a;

    public cmdh(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        this.a.invoke();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        this.a.invoke();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        this.a.invoke();
    }
}
