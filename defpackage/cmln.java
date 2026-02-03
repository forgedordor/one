package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmln extends fcyz implements fdat {
    final /* synthetic */ cmlo a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmln(cmlo cmloVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmloVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmln) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            Context context = this.a.b;
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) AsyncTelephonySimStateReceiver.class), this.b, 1);
        } catch (Exception e) {
            ((ekrd) ((ekrd) cmlo.a.i()).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/TelephonySimStateReceiverProviderImpl$overrideAsyncTelephonySimStateReceiverState$1", "invokeSuspend", 33, "TelephonySimStateReceiverProviderImpl.kt")).q("Failed to override manifest entry for AsyncTelephonySimStateReceiver.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmln(this.a, this.b, fcxyVar);
    }
}
