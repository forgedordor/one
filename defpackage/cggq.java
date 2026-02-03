package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggq extends cgjr {
    public final String a;
    public final Optional b;
    public final int c;
    private final String d;
    private final Uri e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;

    public cggq(String str, String str2, int i, Uri uri, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7) {
        this.a = str;
        this.d = str2;
        this.c = i;
        this.e = uri;
        this.f = optional;
        this.g = optional2;
        this.h = optional3;
        this.i = optional4;
        this.j = optional5;
        this.k = optional6;
        this.b = optional7;
    }

    @Override // defpackage.cgjr
    public final Uri a() {
        return this.e;
    }

    @Override // defpackage.cgjr
    public final Optional b() {
        return this.f;
    }

    @Override // defpackage.cgjr
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.cgjr
    public final Optional d() {
        return this.k;
    }

    @Override // defpackage.cgjr
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgjr) {
            cgjr cgjrVar = (cgjr) obj;
            if (this.a.equals(cgjrVar.i()) && this.d.equals(cgjrVar.j()) && this.c == cgjrVar.k() && this.e.equals(cgjrVar.a()) && this.f.equals(cgjrVar.b()) && this.g.equals(cgjrVar.e()) && this.h.equals(cgjrVar.g()) && this.i.equals(cgjrVar.h()) && this.j.equals(cgjrVar.f()) && this.k.equals(cgjrVar.d()) && this.b.equals(cgjrVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgjr
    public final Optional f() {
        return this.j;
    }

    @Override // defpackage.cgjr
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.cgjr
    public final Optional h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.cgjr
    public final String i() {
        return this.a;
    }

    @Override // defpackage.cgjr
    public final String j() {
        return this.d;
    }

    @Override // defpackage.cgjr
    public final int k() {
        return this.c;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "IMPORTANCE_HIGH" : "IMPORTANCE_DEFAULT" : "IMPORTANCE_LOW" : "IMPORTANCE_MIN" : "IMPORTANCE_NONE";
        String str2 = this.d;
        String str3 = this.a;
        Uri uri = this.e;
        Optional optional = this.f;
        Optional optional2 = this.g;
        Optional optional3 = this.h;
        Optional optional4 = this.i;
        Optional optional5 = this.j;
        Optional optional6 = this.k;
        Optional optional7 = this.b;
        return "NotificationChannelBuilderInfo{channelId=" + str3 + ", channelName=" + str2 + ", importance=" + str + ", soundUri=" + uri.toString() + ", areLightsEnabled=" + String.valueOf(optional) + ", isVibrationEnabled=" + String.valueOf(optional2) + ", shouldShowBadge=" + String.valueOf(optional3) + ", vibrationPattern=" + String.valueOf(optional4) + ", lightColor=" + String.valueOf(optional5) + ", group=" + String.valueOf(optional6) + ", deprecatedIdsToMigrate=" + String.valueOf(optional7) + "}";
    }
}
