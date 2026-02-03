package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyzt {
    private final ea a;

    public cyzt(ea eaVar) {
        this.a = eaVar;
    }

    private static void b() {
        cqca.f("Bugle", "GalleryCameraIntentLauncher: Cannot capture media, no registered activity");
    }

    public final void a(Intent intent) {
        ea eaVar = this.a;
        if (eaVar == null || eaVar.G() == null) {
            b();
            return;
        }
        try {
            eaVar.startActivityForResult(intent, 130);
        } catch (ActivityNotFoundException unused) {
            b();
        }
    }
}
