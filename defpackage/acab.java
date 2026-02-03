package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acab extends abzs {
    private final abzu a;
    private final int b;

    public acab(int i, abzu abzuVar) {
        abzuVar.getClass();
        this.b = i;
        this.a = abzuVar;
    }

    @Override // defpackage.abzs
    public final abzu a() {
        return this.a;
    }

    @Override // defpackage.abzs
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acab)) {
            return false;
        }
        acab acabVar = (acab) obj;
        return this.b == acabVar.b && this.a == acabVar.a;
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessfulCapabilityResult(umaCode=");
        String str = this.b != 7 ? "YES_CODE" : "NO_CODE";
        abzu abzuVar = this.a;
        sb.append((Object) str);
        sb.append(", result=");
        sb.append(abzuVar);
        sb.append(")");
        return sb.toString();
    }
}
