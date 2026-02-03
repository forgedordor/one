package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvp extends Service implements lvj {
    private final lxb a = new lxb(this);

    @Override // defpackage.lvj
    public final lvc P() {
        return this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.a(lva.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(lva.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        lxb lxbVar = this.a;
        lxbVar.a(lva.ON_STOP);
        lxbVar.a(lva.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @fcsv
    public final void onStart(Intent intent, int i) {
        this.a.a(lva.ON_START);
        super.onStart(intent, i);
    }
}
