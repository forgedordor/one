package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import defpackage.pal;
import defpackage.pas;
import defpackage.pax;
import defpackage.pay;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    static void a(int i, pax paxVar) {
        Process.sendSignal(i, 10);
        paxVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            pay.c(context, new Executor() { // from class: par
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new pas(this), true);
            return;
        }
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                a(Process.myPid(), new pas(this));
                return;
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
            pas pasVar = new pas(this);
            if ("DROP_SHADER_CACHE".equals(string)) {
                if (pal.a(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    pasVar.a(14, null);
                    return;
                } else {
                    pasVar.a(15, null);
                    return;
                }
            }
            if ("SAVE_PROFILE".equals(string)) {
                a(extras.getInt("EXTRA_PID", Process.myPid()), pasVar);
                return;
            } else {
                pasVar.a(16, null);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    Executor executor = new Executor() { // from class: par
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            runnable.run();
                        }
                    };
                    pas pasVar2 = new pas(this);
                    pax paxVar = pay.a;
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    pay.b(executor, pasVar2, 11, null);
                    return;
                }
                return;
            }
            Executor executor2 = new Executor() { // from class: par
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            pas pasVar3 = new pas(this);
            pax paxVar2 = pay.a;
            try {
                pay.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                pay.b(executor2, pasVar3, 10, null);
            } catch (PackageManager.NameNotFoundException e) {
                pay.b(executor2, pasVar3, 7, e);
            }
        }
    }
}
