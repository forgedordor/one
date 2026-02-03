package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dias {
    final ecjh a;
    final Executor b;

    public dias(Context context) {
        ecjl ecjlVarA = dibw.a(context);
        ddmw ddmwVar = ddmx.a;
        ExecutorService executorServiceD = ddmw.d(4);
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f("app_doctor");
        ecfaVar.g("AppDoctor.pb");
        Uri uriA = ecfaVar.a();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uriA);
        ecjiVarH.e(dibv.a);
        this.a = ecjlVarA.a(ecjiVarH.a());
        this.b = executorServiceD;
    }
}
