package defpackage;

import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clk {
    public ICarHost a;
    public IAppHost b;

    public final void a() {
        csb.a();
        this.a = null;
        this.b = null;
    }

    public final void b(final String str, final clh clhVar) {
        RemoteUtils.e(str, new crr() { // from class: cli
            /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
            /* JADX WARN: Type inference failed for: r1v3, types: [androidx.car.app.IAppHost, java.lang.Object] */
            @Override // defpackage.crr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    r5 = this;
                    clk r0 = r5.a
                    androidx.car.app.ICarHost r1 = r0.a
                    r2 = 0
                    java.lang.String r3 = "CarApp.Dispatch"
                    if (r1 != 0) goto L10
                    java.lang.String r0 = "Host is not bound when attempting to retrieve host service"
                    android.util.Log.e(r3, r0)
                Le:
                    r0 = r2
                    goto L2a
                L10:
                    androidx.car.app.IAppHost r1 = r0.b     // Catch: defpackage.cll -> L24
                    if (r1 != 0) goto L21
                    java.lang.String r1 = "getHost(App)"
                    clj r4 = new clj     // Catch: defpackage.cll -> L24
                    r4.<init>()     // Catch: defpackage.cll -> L24
                    java.lang.Object r1 = androidx.car.app.utils.RemoteUtils.a(r1, r4)     // Catch: defpackage.cll -> L24
                    r0.b = r1     // Catch: defpackage.cll -> L24
                L21:
                    androidx.car.app.IAppHost r0 = r0.b     // Catch: defpackage.cll -> L24
                    goto L2a
                L24:
                    java.lang.String r0 = "Host threw an exception when attempting to retrieve host service"
                    android.util.Log.e(r3, r0)
                    goto Le
                L2a:
                    if (r0 != 0) goto L38
                    java.lang.String r0 = r2
                    java.lang.String r1 = "Could not retrieve host while dispatching call "
                    java.lang.String r0 = r1.concat(r0)
                    android.util.Log.e(r3, r0)
                    goto L3d
                L38:
                    clh r1 = r3
                    r1.a(r0)
                L3d:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cli.a():java.lang.Object");
            }
        });
    }
}
