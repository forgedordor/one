package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duaa extends duab {
    public final String a;
    private final int b;

    public duaa(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.duab
    public final String a() {
        return this.a;
    }

    @Override // defpackage.duab
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duab) {
            duab duabVar = (duab) obj;
            if (this.b == duabVar.b() && this.a.equals(duabVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }
}
