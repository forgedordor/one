package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deit extends BroadcastReceiver {
    final /* synthetic */ lbz a;

    public deit(lbz lbzVar) {
        this.a = lbzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AtomicInteger atomicInteger = deiu.a;
        TimeSignalResult timeSignalResult = (TimeSignalResult) dclx.a(intent, "om.google.android.gms.time.TIME_SIGNAL_RESULT", TimeSignalResult.CREATOR);
        if (timeSignalResult == null) {
            ((eksl) deht.a.j()).t("Intent received=%s contains unexpectedly null time signal", intent);
            return;
        }
        lbz lbzVar = this.a;
        deht.a.n().D("Intent received=%s containing time signal=%s", intent, timeSignalResult);
        lbzVar.accept(timeSignalResult);
    }
}
