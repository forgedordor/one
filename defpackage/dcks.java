package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcks implements Handler.Callback {
    final /* synthetic */ dckt a;

    public dcks(dckt dcktVar) {
        this.a = dcktVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap map = this.a.d;
            synchronized (map) {
                dckp dckpVar = (dckp) message.obj;
                dckr dckrVar = (dckr) map.get(dckpVar);
                if (dckrVar != null && dckrVar.b()) {
                    if (dckrVar.c) {
                        dckt dcktVar = dckrVar.g;
                        dcktVar.f.removeMessages(1, dckrVar.e);
                        dcktVar.g.b(dcktVar.e, dckrVar);
                        dckrVar.c = false;
                        dckrVar.b = 2;
                    }
                    map.remove(dckpVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap map2 = this.a.d;
        synchronized (map2) {
            dckp dckpVar2 = (dckp) message.obj;
            dckr dckrVar2 = (dckr) map2.get(dckpVar2);
            if (dckrVar2 != null && dckrVar2.b == 3) {
                Log.e("GmsClientSupervisor", a.E(dckpVar2, "Timeout waiting for ServiceConnection callback "), new Exception());
                ComponentName componentName = dckrVar2.f;
                if (componentName == null) {
                    componentName = dckpVar2.c;
                }
                if (componentName == null) {
                    String str = dckpVar2.b;
                    dclh.m(str);
                    componentName = new ComponentName(str, "unknown");
                }
                dckrVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
