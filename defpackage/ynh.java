package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynh implements ynd, aalp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/NetworkConnectionImpl");
    public final ConnectivityManager b;
    public final egpm c;
    public final AtomicBoolean d;
    public final yng e;
    private final Context f;
    private final fdjx g;
    private final fdjx h;
    private final fcyh i;
    private final apqq j;

    public ynh(Context context, ConnectivityManager connectivityManager, fdjx fdjxVar, egpm egpmVar, fdjx fdjxVar2, fcyh fcyhVar, apqq apqqVar) {
        context.getClass();
        connectivityManager.getClass();
        fdjxVar.getClass();
        egpmVar.getClass();
        fdjxVar2.getClass();
        fcyhVar.getClass();
        this.f = context;
        this.b = connectivityManager;
        this.g = fdjxVar;
        this.c = egpmVar;
        this.h = fdjxVar2;
        this.i = fcyhVar;
        this.j = apqqVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.d = atomicBoolean;
        this.e = new yng(this);
        if (apqqVar.a()) {
            if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                auvw.k(fdjxVar, fcyhVar, null, new ynf(this, null), 2);
            } else {
                ((ekrd) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/NetworkConnectionImpl", "connectCallback", 68, "NetworkConnectionImpl.kt")).q("Missing ACCESS_NETWORK_STATE permission");
                atomicBoolean.set(false);
            }
        }
    }

    @Override // defpackage.ynd
    public final boolean a() {
        return this.d.get();
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        if (this.j.a()) {
            auvw.k(this.h, null, null, new yne(this, null), 3);
        }
    }
}
