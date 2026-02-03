package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavm extends aawi {
    private final aawh a;
    private final String b;
    private final long c;

    public aavm(aawh aawhVar, String str, long j) {
        this.a = aawhVar;
        if (str == null) {
            throw new NullPointerException("Null timeText");
        }
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.aawi
    public final long a() {
        return this.c;
    }

    @Override // defpackage.aawi
    public final aawh b() {
        return this.a;
    }

    @Override // defpackage.aawi
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aawi) {
            aawi aawiVar = (aawi) obj;
            if (this.a.equals(aawiVar.b()) && this.b.equals(aawiVar.c()) && this.c == aawiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DateTimePickerPresetOptionData{resource=" + this.a.toString() + ", timeText=" + this.b + ", timeInMills=" + this.c + "}";
    }
}
