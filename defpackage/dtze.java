package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtze extends dtzn {
    public final Uri a;
    public final String b;
    public final dtzl c;
    public final int d;
    public final ekgb e;
    private final ejwi f;
    private final evqe g;

    public dtze(Uri uri, String str, dtzl dtzlVar, int i, ekgb ekgbVar, ejwi ejwiVar, evqe evqeVar) {
        this.a = uri;
        this.b = str;
        this.c = dtzlVar;
        this.d = i;
        this.e = ekgbVar;
        this.f = ejwiVar;
        this.g = evqeVar;
    }

    @Override // defpackage.dtzn
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dtzn
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.dtzn
    public final dtzl c() {
        return this.c;
    }

    @Override // defpackage.dtzn
    public final ejwi d() {
        return this.f;
    }

    @Override // defpackage.dtzn
    public final ekgb e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtzn) {
            dtzn dtznVar = (dtzn) obj;
            if (this.a.equals(dtznVar.b()) && this.b.equals(dtznVar.g()) && this.c.equals(dtznVar.c()) && this.d == dtznVar.a() && ekjz.h(this.e, dtznVar.e()) && this.f.equals(dtznVar.d()) && this.g.equals(dtznVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dtzn
    public final evqe f() {
        return this.g;
    }

    @Override // defpackage.dtzn
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        evqe evqeVar = this.g;
        ejwi ejwiVar = this.f;
        ekgb ekgbVar = this.e;
        dtzl dtzlVar = this.c;
        return "DownloadRequest{fileUri=" + this.a.toString() + ", urlToDownload=" + this.b + ", downloadConstraints=" + dtzlVar.toString() + ", trafficTag=" + this.d + ", extraHttpHeaders=" + ekgbVar.toString() + ", inlineDownloadParamsOptional=" + String.valueOf(ejwiVar) + ", customDownloaderMetadata=" + evqeVar.toString() + "}";
    }
}
