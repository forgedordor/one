package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeya implements eexy {
    private final eeyn a;
    private final eexw b;
    private final Context c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public eeya(eeyn eeynVar, eexw eexwVar, Context context) {
        this.a = eeynVar;
        this.b = eexwVar;
        this.c = context;
    }

    @Override // defpackage.eexy
    public final defn a() {
        String packageName = this.c.getPackageName();
        eeyn eeynVar = this.a;
        if (eeynVar.b == null) {
            return eeyn.c();
        }
        eeyn.a.d("requestUpdateInfo(%s)", packageName);
        defr defrVar = new defr();
        eeynVar.b.b(new eeyi(eeynVar, defrVar, packageName, defrVar), defrVar);
        return defrVar.a;
    }

    @Override // defpackage.eexy
    public final defn b(eexu eexuVar, Activity activity, eeyg eeygVar) {
        if (eexuVar.f) {
            return degc.b(new eeyv(-4));
        }
        if (eexuVar.a(eeygVar) == null) {
            return degc.b(new eeyv(-6));
        }
        eexuVar.f = true;
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", eexuVar.a(eeygVar));
        defr defrVar = new defr();
        intent.putExtra("result_receiver", new eexz(this.d, defrVar));
        activity.startActivity(intent);
        return defrVar.a;
    }

    @Override // defpackage.eexy
    public final synchronized void c(adix adixVar) {
        this.b.c(adixVar);
    }

    @Override // defpackage.eexy
    public final synchronized void d(adix adixVar) {
        this.b.d(adixVar);
    }

    @Override // defpackage.eexy
    public final void e() {
        String packageName = this.c.getPackageName();
        eeyn eeynVar = this.a;
        if (eeynVar.b == null) {
            eeyn.c();
            return;
        }
        eeyn.a.d("completeUpdate(%s)", packageName);
        defr defrVar = new defr();
        eeynVar.b.b(new eeyj(eeynVar, defrVar, defrVar, packageName), defrVar);
    }
}
