package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxs {
    public final List a;
    public final fdvc b;
    public final fdap c;

    public daxs(List list, fdvc fdvcVar, fdap fdapVar) {
        this.a = list;
        this.b = fdvcVar;
        this.c = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daxs)) {
            return false;
        }
        daxs daxsVar = (daxs) obj;
        return fdbq.f(this.a, daxsVar.a) && fdbq.f(this.b, daxsVar.b) && fdbq.f(this.c, daxsVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ProfileSharingMenuUiData(preferences=" + this.a + ", showProfileSharingMenu=" + this.b + ", toggleProfileSharingMenu=" + this.c + ")";
    }
}
