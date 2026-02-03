package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crmn extends crmw {
    private final String a;
    private final boolean b;
    private final boolean c;

    public crmn(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.crmw
    public final String a() {
        return this.a;
    }

    @Override // defpackage.crmw
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.crmw
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crmw) {
            crmw crmwVar = (crmw) obj;
            if (this.a.equals(crmwVar.a()) && this.b == crmwVar.c() && this.c == crmwVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "PhoneNumberFormatResult{formatToNormalizedResult=" + this.a + ", isRbmOrE164=" + this.b + ", isPossibleE164Number=" + this.c + "}";
    }
}
