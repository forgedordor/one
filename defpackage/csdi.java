package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdi extends csdp {
    public String a;
    public String b;
    private csdo c;

    @Override // defpackage.csdp
    public final csdq a() {
        String str;
        String str2;
        csdo csdoVar = this.c;
        if (csdoVar != null && (str = this.a) != null && (str2 = this.b) != null) {
            return new csdj(csdoVar, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" messageSuspiciousnessScore");
        }
        if (this.a == null) {
            sb.append(" countryCode");
        }
        if (this.b == null) {
            sb.append(" locale");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.csdp
    public final void b(csdo csdoVar) {
        if (csdoVar == null) {
            throw new NullPointerException("Null messageSuspiciousnessScore");
        }
        this.c = csdoVar;
    }
}
