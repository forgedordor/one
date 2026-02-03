package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpu extends dcqe {
    final /* synthetic */ Map a;
    final /* synthetic */ dcpy b;
    final /* synthetic */ csrg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcpu(dcpy dcpyVar, String str, Map map, csrg csrgVar) {
        super(str, null);
        this.a = map;
        this.c = csrgVar;
        this.b = dcpyVar;
    }

    @Override // defpackage.dcqe
    protected final void d(dcpo dcpoVar) {
        dcpy dcpyVar = this.b;
        Handler handler = dcpyVar.c;
        handler.removeCallbacksAndMessages(this);
        final dcpx dcpxVar = new dcpx(dcpyVar.a, dcpoVar, handler, this.a, this.e, this.g, dcpyVar.b, this.c);
        final long jA = dcpxVar.e.a();
        Runnable runnable = new Runnable() { // from class: dcpw
            @Override // java.lang.Runnable
            public final void run() {
                String str = "getResults snapshot timeout: " + jA + " ms";
                dcpx dcpxVar2 = dcpxVar;
                dcqd dcqdVar = new dcqd(dcpxVar2.a, dcpxVar2.f, str, dcpxVar2.g);
                String strA = dcqdVar.a(new HashMap());
                dcqdVar.close();
                dcpxVar.a(strA);
            }
        };
        long jUptimeMillis = jA + SystemClock.uptimeMillis();
        Handler handler2 = dcpxVar.c;
        handler2.postAtTime(runnable, dcpxVar, jUptimeMillis);
        Map map = dcpxVar.d;
        dcpo dcpoVar2 = dcpxVar.b;
        String strA = dcpoVar2.a(map);
        dcpoVar2.close();
        handler2.removeCallbacksAndMessages(dcpxVar);
        dcpxVar.a(strA);
    }
}
