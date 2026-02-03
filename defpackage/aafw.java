package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafw {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final fdae e;
    public final fdae f;
    public final int g;

    public aafw(String str, String str2, String str3, boolean z, int i, fdae fdaeVar, fdae fdaeVar2) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        fdaeVar.getClass();
        fdaeVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.g = i;
        this.e = fdaeVar;
        this.f = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafw)) {
            return false;
        }
        aafw aafwVar = (aafw) obj;
        return fdbq.f(this.a, aafwVar.a) && fdbq.f(this.b, aafwVar.b) && fdbq.f(this.c, aafwVar.c) && this.d == aafwVar.d && this.g == aafwVar.g && fdbq.f(this.e, aafwVar.e) && fdbq.f(this.f, aafwVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.g) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarUiData(id=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", actionLabel=");
        sb.append(this.c);
        sb.append(", withDismissAction=");
        sb.append(this.d);
        sb.append(", duration=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? "Indefinite" : "Long" : "Short"));
        sb.append(", onDismissed=");
        sb.append(this.e);
        sb.append(", onActionPerformed=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ aafw(String str, String str2, boolean z, int i, fdae fdaeVar, int i2) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : null, str, (i2 & 4) != 0 ? null : str2, ((i2 & 8) == 0) & z, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? new fdae() { // from class: aafu
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : null, (i2 & 64) != 0 ? new fdae() { // from class: aafv
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar);
    }
}
