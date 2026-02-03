package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duum extends duur {
    public final Uri a;
    public final String b;
    public final dtzl c;
    public final ejwi d;
    public final int e;
    public final ekgb f;
    public final evqe g;
    private final int h;
    private final String i;
    private final ejwi j;
    private final ejwi k;
    private final boolean l;

    public duum(Uri uri, String str, dtzl dtzlVar, ejwi ejwiVar, int i, ekgb ekgbVar, int i2, String str2, ejwi ejwiVar2, ejwi ejwiVar3, boolean z, evqe evqeVar) {
        this.a = uri;
        this.b = str;
        this.c = dtzlVar;
        this.d = ejwiVar;
        this.e = i;
        this.f = ekgbVar;
        this.h = i2;
        this.i = str2;
        this.j = ejwiVar2;
        this.k = ejwiVar3;
        this.l = z;
        this.g = evqeVar;
    }

    @Override // defpackage.duur
    public final int a() {
        return this.h;
    }

    @Override // defpackage.duur
    public final int b() {
        return this.e;
    }

    @Override // defpackage.duur
    public final Uri c() {
        return this.a;
    }

    @Override // defpackage.duur
    public final dtzl d() {
        return this.c;
    }

    @Override // defpackage.duur
    public final ejwi e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duur) {
            duur duurVar = (duur) obj;
            if (this.a.equals(duurVar.c()) && this.b.equals(duurVar.k()) && this.c.equals(duurVar.d()) && this.d.equals(duurVar.e()) && this.e == duurVar.b() && ekjz.h(this.f, duurVar.h()) && this.h == duurVar.a() && this.i.equals(duurVar.j()) && this.j.equals(duurVar.g()) && this.k.equals(duurVar.f()) && this.l == duurVar.l() && this.g.equals(duurVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.duur
    public final ejwi f() {
        return this.k;
    }

    @Override // defpackage.duur
    public final ejwi g() {
        return this.j;
    }

    @Override // defpackage.duur
    public final ekgb h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.duur
    public final evqe i() {
        return this.g;
    }

    @Override // defpackage.duur
    public final String j() {
        return this.i;
    }

    @Override // defpackage.duur
    public final String k() {
        return this.b;
    }

    @Override // defpackage.duur
    public final boolean l() {
        return this.l;
    }

    public final String toString() {
        return "DownloadRequest{destinationFileUri=" + this.a.toString() + ", urlToDownload=" + this.b + ", downloadConstraints=" + this.c.toString() + ", listenerOptional=" + String.valueOf(this.d) + ", trafficTag=" + this.e + ", extraHttpHeaders=" + this.f.toString() + ", fileSizeBytes=" + this.h + ", notificationContentTitle=" + this.i + ", notificationContentTextOptional=Optional.absent(), notificationContentIntentOptional=Optional.absent(), showDownloadedNotification=" + this.l + ", customDownloaderMetadata=" + this.g.toString() + "}";
    }
}
