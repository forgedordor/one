package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunz {
    public final ejxr a;

    public eunz(final Context context, final String str, final String str2, final Executor executor, final int i) {
        Log.i("BrellaInAppTraining", String.format("Initializing Brella training with population name: %s, session name: %s", str, str2));
        this.a = ejxx.a(new ejxr() { // from class: eunp
            @Override // defpackage.ejxr
            public final Object get() {
                ddje ddjeVar = new ddje();
                ddjeVar.d(str2);
                ddjeVar.b(str);
                ddjeVar.c(i);
                defn defnVarC = ddlc.c(context, executor, ddjeVar.a());
                defnVarC.t(new defe() { // from class: eunx
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        if (Log.isLoggable("BrellaInAppTraining", 4)) {
                            Log.i("BrellaInAppTraining", "Error initializing Brella in-app training.");
                        }
                    }
                });
                return defnVarC;
            }
        });
    }
}
