package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vpe {
    public final djrr a;
    public final String b;
    public final eocq c;
    public final fdap d;
    private final int e;

    public vpe(djrr djrrVar, eocq eocqVar, fdap fdapVar) {
        djrrVar.getClass();
        eocqVar.getClass();
        this.e = R.string.whatsapp_video_call;
        this.a = djrrVar;
        this.b = "com.whatsapp";
        this.c = eocqVar;
        this.d = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpe)) {
            return false;
        }
        vpe vpeVar = (vpe) obj;
        int i = vpeVar.e;
        return this.a == vpeVar.a && fdbq.f(this.b, vpeVar.b) && this.c == vpeVar.c && fdbq.f(this.d, vpeVar.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 1670250087) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ThirdPartyVideoCallingService(displayNameResId=2132089017, iconUiData=" + this.a + ", packageName=" + this.b + ", serviceType=" + this.c + ", logDuration=" + this.d + ")";
    }
}
