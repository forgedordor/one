package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmm extends awmn {
    public final awnc a;
    public final awml b;
    public final Set c;
    public final cigb d;
    private final axcm e = null;
    private final String f = null;
    private final Uri g = null;
    private final evqs h = null;
    private final Uri i = null;

    public awmm(awnc awncVar, awml awmlVar, Set set, cigb cigbVar) {
        this.a = awncVar;
        this.b = awmlVar;
        this.c = set;
        this.d = cigbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awmm)) {
            return false;
        }
        awmm awmmVar = (awmm) obj;
        if (!fdbq.f(this.a, awmmVar.a) || !fdbq.f(this.b, awmmVar.b)) {
            return false;
        }
        axcm axcmVar = awmmVar.e;
        if (!fdbq.f(null, null) || !fdbq.f(this.c, awmmVar.c)) {
            return false;
        }
        String str = awmmVar.f;
        if (!fdbq.f(null, null)) {
            return false;
        }
        Uri uri = awmmVar.g;
        if (!fdbq.f(null, null) || !fdbq.f(this.d, awmmVar.d)) {
            return false;
        }
        evqs evqsVar = awmmVar.h;
        if (!fdbq.f(null, null)) {
            return false;
        }
        Uri uri2 = awmmVar.i;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 28629151) + this.d.hashCode()) * 961;
    }

    public final String toString() {
        return "Rcs(groupId=" + this.a + ", conferenceUri=" + this.b + ", myIdentityToken=null, members=" + this.c + ", name=null, iconUrl=null, groupCapabilities=" + this.d + ", routingToken=null, joinLinkUrl=null)";
    }
}
