package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvq {
    public final vvl a;
    public final athh b;
    public final Uri c;
    public final ejxm d;
    public final fdkf e;
    private final boolean f;

    public vvq(vvl vvlVar, athh athhVar, Uri uri, ejxm ejxmVar, fdkf fdkfVar) {
        this.a = vvlVar;
        this.b = athhVar;
        this.c = uri;
        this.d = ejxmVar;
        this.e = fdkfVar;
        this.f = false;
    }

    public static /* synthetic */ vvq a(vvq vvqVar, athh athhVar, Uri uri, ejxm ejxmVar, fdkf fdkfVar, int i) {
        vvl vvlVar = (i & 1) != 0 ? vvqVar.a : null;
        if ((i & 2) != 0) {
            athhVar = vvqVar.b;
        }
        if ((i & 4) != 0) {
            uri = vvqVar.c;
        }
        if ((i & 8) != 0) {
            ejxmVar = vvqVar.d;
        }
        if ((i & 16) != 0) {
            fdkfVar = vvqVar.e;
        }
        fdkf fdkfVar2 = fdkfVar;
        vvlVar.getClass();
        ejxm ejxmVar2 = ejxmVar;
        return new vvq(vvlVar, athhVar, uri, ejxmVar2, fdkfVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvq)) {
            return false;
        }
        vvq vvqVar = (vvq) obj;
        if (!fdbq.f(this.a, vvqVar.a) || !fdbq.f(this.b, vvqVar.b) || !fdbq.f(this.c, vvqVar.c) || !fdbq.f(this.d, vvqVar.d) || !fdbq.f(this.e, vvqVar.e)) {
            return false;
        }
        boolean z = vvqVar.f;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        athh athhVar = this.b;
        int iHashCode2 = (iHashCode + (athhVar == null ? 0 : athhVar.hashCode())) * 31;
        Uri uri = this.c;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        ejxm ejxmVar = this.d;
        int iHashCode4 = (iHashCode3 + (ejxmVar == null ? 0 : ejxmVar.hashCode())) * 31;
        fdkf fdkfVar = this.e;
        return ((iHashCode4 + (fdkfVar != null ? fdkfVar.hashCode() : 0)) * 31) + 1237;
    }

    public final String toString() {
        Uri uri = this.c;
        String strD = uri != null ? cqcy.d(uri) : null;
        athh athhVar = this.b;
        return "Metadata(instanceId=" + this.a + ", processingId=" + athhVar + ", copy=" + strD + ", draftLatencyStopwatch=" + this.d + ", deferredSpatulaVerdict=" + this.e + ", userWarnedAboutSensitiveContent=false)";
    }

    public /* synthetic */ vvq(vvl vvlVar, Uri uri, ejxm ejxmVar, fdkf fdkfVar, int i) {
        this(vvlVar, (athh) null, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? null : ejxmVar, (i & 16) != 0 ? null : fdkfVar);
    }
}
