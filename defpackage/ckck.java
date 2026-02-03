package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckck {
    public final ckbz a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public ckck(ckbz ckbzVar, List list, boolean z, boolean z2) {
        ckbzVar.getClass();
        list.getClass();
        this.a = ckbzVar;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckck)) {
            return false;
        }
        ckck ckckVar = (ckck) obj;
        return this.a == ckckVar.a && fdbq.f(this.b, ckckVar.b) && this.c == ckckVar.c && this.d == ckckVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ckcj.a(this.c)) * 31) + ckcj.a(this.d);
    }

    public final String toString() {
        return "RcsSettingsUiData(rcsGlobalToggleState=" + this.a + ", rcsSettingsSimInfoList=" + this.b + ", rcsDefaultOnConsent=" + this.c + ", showGoogleTos=" + this.d + ")";
    }
}
