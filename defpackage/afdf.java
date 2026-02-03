package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afdf extends afdo {
    private final boolean a;

    public afdf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.afdo
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof afdo) && this.a == ((afdo) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "MessageOrganizationSettingsData{otpAutoDeleteEnabled=" + this.a + "}";
    }
}
