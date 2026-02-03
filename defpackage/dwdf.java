package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdf {
    public final Context a;
    final BroadcastReceiver b;
    public fbnd c;

    public dwdf(Context context) throws NoSuchAlgorithmException, KeyManagementException {
        this.c = null;
        this.a = context;
        dwde dwdeVar = new dwde(this);
        this.b = dwdeVar;
        fbfg fbfgVar = fbfg.a;
        String strB = fbfgVar.get().b();
        int iA = (int) fbfgVar.get().a();
        dvhv.e("StubFactory", a.B(iA, strB, "tachyonHostName = ", " and tachyonPortNumber = "));
        fcox fcoxVar = new fcox(strB, iA);
        dwcr.a(fcoxVar);
        dvhv.a("OkHttpChannelBuilder", "Using API key for authentication.");
        fcoxVar.i(new dvji(context));
        this.c = fcoxVar.a();
        context.registerReceiver(dwdeVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final ListenableFuture a() {
        return eork.i(new dwcn((eyoe) eyoe.h(new eyod(), this.c)));
    }

    public final ListenableFuture b() {
        return eork.i(new dwcn((eyro) eyro.h(new eyrn(), this.c)));
    }

    public final ListenableFuture c() {
        return eork.i(new dwcn((eyvk) eyvk.h(new eyvj(), this.c)));
    }

    public final ListenableFuture d() {
        return eork.i(new dwcn(eyzh.a(this.c)));
    }
}
