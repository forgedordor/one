package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wearable.internal.IWearableService;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dety extends dcko {
    private final desm A;
    private final desm B;
    private final desm C;
    private final desm D;
    private final desm E;
    private final desm F;
    private final deuo G;
    public final ExecutorService a;
    public final ejxr v;
    private final desm w;
    private final desm x;
    private final desm y;
    private final desm z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dety(final Context context, Looper looper, dcfo dcfoVar, dcfp dcfpVar, dcke dckeVar) {
        super(context, looper, 14, dckeVar, dcfoVar, dcfpVar);
        ddmw ddmwVar = ddmx.a;
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        deuo deuoVarA = deuo.a(context);
        this.w = new desm();
        this.x = new desm();
        this.y = new desm();
        this.z = new desm();
        this.A = new desm();
        this.B = new desm();
        this.C = new desm();
        this.D = new desm();
        this.E = new desm();
        this.F = new desm();
        new desm();
        new desm();
        dclh.m(executorServiceUnconfigurableExecutorService);
        this.a = executorServiceUnconfigurableExecutorService;
        this.G = deuoVarA;
        this.v = ejxx.a(new ejxr() { // from class: detw
            @Override // defpackage.ejxr
            public final Object get() {
                ddlm ddlmVar = ddlk.a;
                File file = new File(ddll.a(context.getFilesDir(), "wearos_assets"));
                ddlm ddlmVar2 = ddlk.a;
                File file2 = new File(ddll.a(file, "streamtmp"));
                file2.mkdirs();
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        file3.delete();
                    }
                }
                return file2;
            }
        });
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void C(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", a.g(i, "onPostInitHandler: statusCode "));
        }
        if (i == 0) {
            this.w.a(iBinder);
            this.x.a(iBinder);
            this.y.a(iBinder);
            this.A.a(iBinder);
            this.B.a(iBinder);
            this.C.a(iBinder);
            this.D.a(iBinder);
            this.E.a(iBinder);
            this.F.a(iBinder);
            this.z.a(iBinder);
            i = 0;
        }
        super.C(i, iBinder, bundle, i2);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 8600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IWearableService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return deob.F;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final void l(dcjw dcjwVar) {
        if (!r()) {
            try {
                Context context = this.c;
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", a.g(i, "The Wear OS app is out of date. Requires API version 8600000 but found "));
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    E(dcjwVar, 6, PendingIntent.getActivity(context, 0, intent, ddmt.a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                E(dcjwVar, 16, null);
                return;
            }
        }
        super.l(dcjwVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final boolean r() {
        return !this.G.b();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String y() {
        return this.G.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
