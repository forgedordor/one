package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjh {
    public final dzjj a;

    public dzjh(Context context, dzjj dzjjVar) {
        this.a = dzjjVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(dzjjVar.a);
        application.registerComponentCallbacks(dzjjVar.a);
    }

    public final void a(dzjg dzjgVar) {
        dzjgVar.getClass();
        dzji dzjiVar = this.a.a;
        int i = dzji.c;
        dzjiVar.a.add(dzjgVar);
    }

    public final void b(dzjg dzjgVar) {
        dzji dzjiVar = this.a.a;
        int i = dzji.c;
        dzjiVar.a.remove(dzjgVar);
    }
}
