package defpackage;

import com.google.research.xeno.effect.AssetDownloader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exjb extends exlh {
    public final String a;
    public final long b;
    public final AssetDownloader c;
    public final ekgb d;

    public exjb(String str, long j, AssetDownloader assetDownloader, ekgb ekgbVar) {
        this.a = str;
        this.b = j;
        this.c = assetDownloader;
        this.d = ekgbVar;
    }

    @Override // defpackage.exlh
    public final long a() {
        return this.b;
    }

    @Override // defpackage.exlh
    public final ekgb b() {
        return this.d;
    }

    @Override // defpackage.exlh
    public final AssetDownloader c() {
        return this.c;
    }

    @Override // defpackage.exlh
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exlh) {
            exlh exlhVar = (exlh) obj;
            if (this.a.equals(exlhVar.d()) && this.b == exlhVar.a() && this.c.equals(exlhVar.c()) && ekjz.h(this.d, exlhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.d;
        return "Config{remoteAssetCacheBasePath=" + this.a + ", remoteAssetCacheTtlDurationSeconds=" + this.b + ", assetDownloader=" + this.c.toString() + ", oldRemoteAssetCachePaths=" + ekgbVar.toString() + "}";
    }
}
