package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtf extends amug {
    private final ekgb a;
    private final String b;

    public amtf(ekgb ekgbVar, String str) {
        this.a = ekgbVar;
        this.b = str;
    }

    @Override // defpackage.amvw
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.amug, defpackage.amvw
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amug) {
            amug amugVar = (amug) obj;
            if (ekjz.h(this.a, amugVar.a()) && ((str = this.b) != null ? str.equals(amugVar.c()) : amugVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BugleMultiPartContent{attachments=" + this.a.toString() + ", text=" + this.b + "}";
    }
}
