package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.camera2.Camera2Config$DefaultProvider;
import androidx.camera.core.impl.MetadataHolderService;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azp {
    public static final Object a = new Object();
    public static final SparseArray b = new SparseArray();
    public final bjb c;
    public final Object d;
    public final azr e;
    public final Executor f;
    public final Handler g;
    public final HandlerThread h;
    public biq i;
    public bnm j;
    public brh k;
    public final bcl l;
    public final ListenableFuture m;
    public ListenableFuture n;
    public final Integer o;
    public int p;
    public apm q;

    public azp(final Context context) throws PackageManager.NameNotFoundException {
        ListenableFuture listenableFutureA;
        blx blxVar = new blx();
        this.c = new bjb();
        Object obj = new Object();
        this.d = obj;
        boolean z = true;
        this.p = 1;
        this.n = bqk.b(null);
        Camera2Config$DefaultProvider camera2Config$DefaultProviderF = f(context);
        if (camera2Config$DefaultProviderF == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        azr cameraXConfig = camera2Config$DefaultProviderF.getCameraXConfig();
        this.e = cameraXConfig;
        Object objA = (blt) cameraXConfig.l.n(azr.j, null);
        if (objA != null) {
            Objects.toString(objA);
            bbs.a("CameraX", "QuirkSettings from CameraXConfig: ".concat(objA.toString()));
        } else {
            objA = blxVar.a(context);
            Objects.toString(objA);
            bbs.a("CameraX", "QuirkSettings from app metadata: ".concat(String.valueOf(objA)));
        }
        if (objA == null) {
            objA = blv.a;
            Objects.toString(objA);
            bbs.a("CameraX", "QuirkSettings by default: ".concat(String.valueOf(objA)));
        }
        blv.b.c.e(objA);
        ((Integer) cameraXConfig.l.n(azr.k, -1)).intValue();
        Executor executor = (Executor) cameraXConfig.l.n(azr.d, null);
        Handler handler = (Handler) cameraXConfig.l.n(azr.e, null);
        this.f = executor == null ? new azb() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.h = handlerThread;
            handlerThread.start();
            this.g = laf.a(handlerThread.getLooper());
        } else {
            this.h = null;
            this.g = handler;
        }
        Integer num = (Integer) blz.c(cameraXConfig, azr.f, null);
        this.o = num;
        synchronized (a) {
            if (num != null) {
                lcg.f(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = b;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                d();
            }
        }
        bcl bclVar = (bcl) cameraXConfig.l.n(azr.i, bcl.a);
        bclVar.getClass();
        this.l = bclVar instanceof bmb ? ((bmb) bclVar).b() : new bmz(bclVar);
        synchronized (obj) {
            if (this.p != 1) {
                z = false;
            }
            lcg.d(z, "CameraX.initInternal() should only be called once per instance");
            this.p = 2;
            listenableFutureA = kol.a(new koi() { // from class: azn
                @Override // defpackage.koi
                public final Object a(kog kogVar) {
                    azp azpVar = this.a;
                    azpVar.b(azpVar.f, SystemClock.elapsedRealtime(), 1, context, kogVar);
                    return "CameraX initInternal";
                }
            });
        }
        this.m = listenableFutureA;
    }

    public static void d() {
        SparseArray sparseArray = b;
        if (sparseArray.size() == 0) {
            bbs.a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            bbs.a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            bbs.a = 4;
        } else if (sparseArray.get(5) != null) {
            bbs.a = 5;
        } else if (sparseArray.get(6) != null) {
            bbs.a = 6;
        }
    }

    public static final void e(biv bivVar) {
        if (plm.c()) {
            plm.b("CX:CameraProvider-RetryStatus", bivVar != null ? bivVar.a : -1);
        }
    }

    private static Camera2Config$DefaultProvider f(Context context) throws PackageManager.NameNotFoundException {
        Context contextA = bnw.a(context);
        while (true) {
            if (!(contextA instanceof ContextWrapper)) {
                break;
            }
            if (contextA instanceof Application) {
                break;
            }
            contextA = ((ContextWrapper) contextA).getBaseContext();
        }
        try {
            Context contextA2 = bnw.a(context);
            ServiceInfo serviceInfo = contextA2.getPackageManager().getServiceInfo(new ComponentName(contextA2, (Class<?>) MetadataHolderService.class), 640);
            String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (Camera2Config$DefaultProvider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            bbs.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            bbs.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public final biq a() {
        biq biqVar = this.i;
        if (biqVar != null) {
            return biqVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final void b(final Executor executor, final long j, final int i, final Context context, final kog kogVar) {
        executor.execute(new Runnable() { // from class: azm
            /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0347 A[Catch: all -> 0x02e0, TryCatch #0 {all -> 0x02e0, blocks: (B:3:0x0018, B:5:0x0026, B:7:0x0054, B:9:0x006c, B:11:0x007d, B:13:0x009e, B:14:0x00a8, B:20:0x00ba, B:24:0x00cf, B:25:0x00d0, B:26:0x00d6, B:97:0x02a4, B:41:0x0178, B:43:0x0181, B:45:0x0187, B:47:0x0191, B:85:0x026b, B:86:0x026e, B:48:0x01bd, B:49:0x01c5, B:51:0x01c8, B:53:0x01ce, B:59:0x01e4, B:60:0x0208, B:63:0x0212, B:65:0x0219, B:70:0x022d, B:73:0x0237, B:75:0x023d, B:79:0x0251, B:87:0x0277, B:88:0x0294, B:78:0x024a, B:69:0x0226, B:57:0x01db, B:124:0x02ea, B:128:0x0301, B:130:0x0337, B:131:0x033d, B:132:0x0347, B:133:0x034a, B:137:0x034f, B:139:0x0353, B:140:0x035b, B:142:0x035f, B:143:0x0388, B:145:0x038c, B:146:0x0390, B:151:0x039e, B:98:0x02a5, B:99:0x02b3, B:106:0x02bc, B:107:0x02ca, B:108:0x02cb, B:109:0x02d9, B:135:0x034c, B:136:0x034e), top: B:155:0x0018, inners: #17 }] */
            /* JADX WARN: Removed duplicated region for block: B:134:0x034b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 931
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.azm.run():void");
            }
        });
    }

    public final void c() {
        synchronized (this.d) {
            this.p = 4;
        }
    }
}
