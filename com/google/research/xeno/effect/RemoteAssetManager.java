package com.google.research.xeno.effect;

import android.content.Context;
import android.util.Log;
import com.google.research.xeno.effect.RemoteAssetManager;
import defpackage.eosw;
import defpackage.exlh;
import defpackage.exli;
import defpackage.exlk;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteAssetManager {
    public static final Map a = new HashMap();
    private static final ExecutorService d;
    public long b;
    public final String c;

    /* compiled from: PG */
    public interface FetchCallback {
        void onCompletion(String str, String str2);
    }

    static {
        eosw eoswVar = new eosw();
        eoswVar.d("xeno-remote-asset-manager-thread-%d");
        d = Executors.newSingleThreadExecutor(eosw.b(eoswVar));
    }

    public RemoteAssetManager(Context context, final exlh exlhVar) {
        File file;
        exlk exlkVar = exlk.a;
        synchronized (exlk.class) {
            if (exlk.a == null) {
                exlk.a = new exlk(context);
            }
            exlk exlkVar2 = exlk.a;
            if (exlkVar2.b == null) {
                exlkVar2.b = exlkVar2.a(context);
            }
        }
        exlk exlkVar3 = exlk.a;
        if (exlkVar3.b == null) {
            file = null;
        } else {
            synchronized (exlk.class) {
                int i = exlkVar3.c + 1;
                exlkVar3.c = i;
                file = new File(exlkVar3.b, String.valueOf(i));
                if (!file.mkdir()) {
                    file = null;
                }
            }
        }
        String path = file != null ? file.getPath() : null;
        this.c = path;
        if (path == null) {
            Log.e("RemoteAssetManager", "Failed to create sandbox");
        } else {
            d.execute(new Runnable() { // from class: exlf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 0;
                    while (true) {
                        exjb exjbVar = (exjb) exlhVar;
                        ekgb ekgbVar = exjbVar.d;
                        if (i2 >= ((ekoe) ekgbVar).c) {
                            RemoteAssetManager remoteAssetManager = this.a;
                            remoteAssetManager.b = RemoteAssetManager.nativeCreateRemoteAssetManager(exjbVar.a, exjbVar.b, exjbVar.c, remoteAssetManager.c);
                            return;
                        } else {
                            exkc.a(new File((String) ekgbVar.get(i2)));
                            i2++;
                        }
                    }
                }
            });
        }
    }

    public static native long nativeCreateRemoteAssetManager(String str, long j, AssetDownloader assetDownloader, String str2);

    public final void a(final exli exliVar) {
        d.execute(new Runnable() { // from class: exle
            @Override // java.lang.Runnable
            public final void run() {
                exliVar.a(this.a.b);
            }
        });
    }
}
