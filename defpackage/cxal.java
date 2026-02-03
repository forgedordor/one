package defpackage;

import android.widget.Toast;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cxal implements egps<Void, Void> {
    final /* synthetic */ DebugGServiceKeysFragment a;

    public cxal(DebugGServiceKeysFragment debugGServiceKeysFragment) {
        this.a = debugGServiceKeysFragment;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Toast.makeText(this.a.e.getContext(), "Wrote flags to /d/d/c.g.a.a.m/cache/autorampflags.txt", 1).show();
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        Toast.makeText(this.a.e.getContext(), "Error writing flags to file", 1).show();
        ekrw ekrwVarJ = DebugGServiceKeysFragment.a.j();
        ekrwVarJ.X(eksq.a, "BugleDiagnostics");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$2", "onFailure", '_', "DebugGServiceKeysFragment.java")).q("Error writing flags to file");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
