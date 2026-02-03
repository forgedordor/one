package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzo implements divg {
    public final List a;
    public final int b;
    public final String c;
    public final String d;
    private final fdae e;
    private final boolean f = true;

    public zzo(List list, int i, String str, String str2, fdae fdaeVar) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = fdaeVar;
    }

    @Override // defpackage.divg
    public final /* bridge */ /* synthetic */ divg a(fdae fdaeVar) {
        return new zzo(this.a, this.b, this.c, this.d, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.e;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        if (!fdbq.f(this.a, zzoVar.a) || this.b != zzoVar.b || !fdbq.f(this.c, zzoVar.c) || !fdbq.f(this.d, zzoVar.d) || !fdbq.f(this.e, zzoVar.e)) {
            return false;
        }
        boolean z = zzoVar.f;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (((iHashCode + this.b) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "RadioButtonsListUiData(listItems=" + this.a + ", selectedListItemIndex=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", onDismiss=" + this.e + ", includeScrim=true)";
    }
}
