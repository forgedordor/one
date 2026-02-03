package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyai extends dyal {
    private final String a;
    private final ddfo b;
    private final String c;
    private final String d;
    private final String e;

    public dyai(String str, ddfo ddfoVar, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null accountId");
        }
        this.a = str;
        if (ddfoVar == null) {
            throw new NullPointerException("Null criticalAlertData");
        }
        this.b = ddfoVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.dyal
    public final ddfo a() {
        return this.b;
    }

    @Override // defpackage.dyal
    public final String b() {
        return this.a;
    }

    @Override // defpackage.dyal
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dyal
    public final String d() {
        return this.d;
    }

    @Override // defpackage.dyal
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyal) {
            dyal dyalVar = (dyal) obj;
            if (this.a.equals(dyalVar.b()) && this.b.equals(dyalVar.a()) && this.c.equals(dyalVar.c()) && this.d.equals(dyalVar.d()) && this.e.equals(dyalVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "ValidCriticalAlertData{accountId=" + this.a + ", criticalAlertData=" + this.b.toString() + ", rfn=" + this.c + ", rfnc=" + this.d + ", securityEventId=" + this.e + "}";
    }
}
