package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqh extends ecqj {
    private String a;
    private String b;
    private ecqu c;

    @Override // defpackage.ecqj
    public final ecqk a() {
        String str;
        ecqu ecquVar;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null && (ecquVar = this.c) != null) {
            return new ecqi(str2, str, ecquVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sessionId");
        }
        if (this.b == null) {
            sb.append(" triggerId");
        }
        if (this.c == null) {
            sb.append(" surveyStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ecqj
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.a = str;
    }

    @Override // defpackage.ecqj
    public final void c(ecqu ecquVar) {
        if (ecquVar == null) {
            throw new NullPointerException("Null surveyStyle");
        }
        this.c = ecquVar;
    }

    @Override // defpackage.ecqj
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null triggerId");
        }
        this.b = str;
    }
}
