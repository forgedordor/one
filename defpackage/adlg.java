package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlg {
    public final String a;
    public final int b;
    public final dkri c;
    public final List d;
    public final Uri e;
    public final fdpl f;
    public final fdpl g;
    public final fdap h;

    public adlg(String str, int i, dkri dkriVar, List list, Uri uri, fdpl fdplVar, fdpl fdplVar2, fdap fdapVar) {
        this.a = str;
        this.b = i;
        this.c = dkriVar;
        this.d = list;
        this.e = uri;
        this.f = fdplVar;
        this.g = fdplVar2;
        this.h = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adlg)) {
            return false;
        }
        adlg adlgVar = (adlg) obj;
        return fdbq.f(this.a, adlgVar.a) && this.b == adlgVar.b && fdbq.f(this.c, adlgVar.c) && fdbq.f(this.d, adlgVar.d) && fdbq.f(this.e, adlgVar.e) && fdbq.f(this.f, adlgVar.f) && fdbq.f(this.g, adlgVar.g) && fdbq.f(this.h, adlgVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Uri uri = this.e;
        return (((((((iHashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "JoinViaLinkUiData(groupName=" + this.a + ", memberCount=" + this.b + ", avatar=" + this.c + ", shareOptions=" + this.d + ", joinLink=" + this.e + ", toggleEnabled=" + this.f + ", linkIsLoading=" + this.g + ", toggleJoinState=" + this.h + ")";
    }
}
