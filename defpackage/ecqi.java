package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqi extends ecqk {
    public final String a;
    public final ecqu b;
    private final String c;

    public ecqi(String str, String str2, ecqu ecquVar) {
        this.a = str;
        this.c = str2;
        this.b = ecquVar;
    }

    @Override // defpackage.ecqk
    public final ecqu a() {
        return this.b;
    }

    @Override // defpackage.ecqk
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ecqk
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecqk) {
            ecqk ecqkVar = (ecqk) obj;
            if (this.a.equals(ecqkVar.b()) && this.c.equals(ecqkVar.c()) && this.b.equals(ecqkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SurveyInternalEvent{sessionId=" + this.a + ", triggerId=" + this.c + ", surveyStyle=" + this.b.toString() + "}";
    }
}
