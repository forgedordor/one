package defpackage;

import android.content.Context;
import com.google.research.xeno.effect.AssetDownloader;
import com.google.research.xeno.effect.RemoteAssetManager;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjg extends fcyz implements fdat {
    final /* synthetic */ dqjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjg(dqjo dqjoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dqjoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String str;
        AssetDownloader assetDownloader;
        ekgb ekgbVar;
        RemoteAssetManager remoteAssetManager;
        fctl.b(obj);
        exja exjaVar = new exja();
        exjaVar.a(-1L);
        int i = ekgb.d;
        ekgb ekgbVar2 = ekoe.a;
        if (ekgbVar2 == null) {
            throw new NullPointerException("Null oldRemoteAssetCachePaths");
        }
        dqjo dqjoVar = this.a;
        exjaVar.d = ekgbVar2;
        Context context = dqjoVar.a;
        File file = new File(context.getFilesDir(), "asset_cache");
        file.mkdir();
        if (!file.isDirectory()) {
            file.toString();
            throw new IOException("Unable to create asset cache directory: ".concat(file.toString()));
        }
        dqiy dqiyVar = dqjoVar.c;
        String path = file.getPath();
        path.getClass();
        exjaVar.a = path;
        exjaVar.a(dqiyVar.b.getSeconds());
        exjaVar.c = new exki();
        if (exjaVar.e != 1 || (str = exjaVar.a) == null || (assetDownloader = exjaVar.c) == null || (ekgbVar = exjaVar.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (exjaVar.a == null) {
                sb.append(" remoteAssetCacheBasePath");
            }
            if (exjaVar.e == 0) {
                sb.append(" remoteAssetCacheTtlDurationSeconds");
            }
            if (exjaVar.c == null) {
                sb.append(" assetDownloader");
            }
            if (exjaVar.d == null) {
                sb.append(" oldRemoteAssetCachePaths");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        exjb exjbVar = new exjb(str, exjaVar.b, assetDownloader, ekgbVar);
        Map map = RemoteAssetManager.a;
        synchronized (RemoteAssetManager.class) {
            String str2 = exjbVar.a;
            Map map2 = RemoteAssetManager.a;
            remoteAssetManager = (RemoteAssetManager) map2.get(str2);
            if (remoteAssetManager == null) {
                remoteAssetManager = new RemoteAssetManager(context, exjbVar);
                if (remoteAssetManager.c != null) {
                    map2.put(str2, remoteAssetManager);
                }
            }
        }
        return new dqjf(remoteAssetManager);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqjg(this.a, fcxyVar);
    }
}
