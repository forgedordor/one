package defpackage;

import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzac implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof MdiNotAvailableException) {
            return;
        }
        Log.w("OneGoogle", String.format("Failed to load owner avatar. exception type: %s", th.getClass().getName()));
    }
}
