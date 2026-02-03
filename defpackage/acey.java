package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acey {
    public final fdvc a;
    public final String b;
    public final fdae c;
    public final fdae d;
    private final boolean e;
    private final fduj f;

    public acey(boolean z, fdvc fdvcVar, String str, fdae fdaeVar, fdae fdaeVar2, fduj fdujVar) {
        fdvcVar.getClass();
        this.e = z;
        this.a = fdvcVar;
        this.b = str;
        this.c = fdaeVar;
        this.d = fdaeVar2;
        this.f = fdujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acey)) {
            return false;
        }
        acey aceyVar = (acey) obj;
        return this.e == aceyVar.e && fdbq.f(this.a, aceyVar.a) && fdbq.f(this.b, aceyVar.b) && fdbq.f(this.c, aceyVar.c) && fdbq.f(this.d, aceyVar.d) && fdbq.f(this.f, aceyVar.f);
    }

    public final int hashCode() {
        int iHashCode = ((true != this.e ? 1237 : 1231) * 31) + this.a.hashCode();
        String str = this.b;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SignOutAccountScreenUiData(isSwitchingAccounts=" + this.e + ", isPositiveButtonEnabled=" + this.a + ", phoneNumber=" + this.b + ", onPositiveClick=" + this.c + ", onNegativeClick=" + this.d + ", snackbarUiDataFlow=" + this.f + ")";
    }
}
