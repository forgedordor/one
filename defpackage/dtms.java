package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtms extends dtqd {
    public ejwi a;
    public ekgp b;
    private String c;
    private long d;
    private String e;
    private ekgb f;
    private ejwi g;
    private byte h;

    public dtms() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.g = ejudVar;
    }

    @Override // defpackage.dtqd
    public final dtqe a() {
        String str;
        String str2;
        ekgb ekgbVar;
        ekgp ekgpVar;
        if (this.h == 1 && (str = this.c) != null && (str2 = this.e) != null && (ekgbVar = this.f) != null && (ekgpVar = this.b) != null) {
            return new dtmt(str, this.d, str2, this.a, ekgbVar, ekgpVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" groupName");
        }
        if (this.h == 0) {
            sb.append(" buildId");
        }
        if (this.e == null) {
            sb.append(" variantId");
        }
        if (this.f == null) {
            sb.append(" updatedDataFileList");
        }
        if (this.b == null) {
            sb.append(" inlineFileMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtqd
    public final void b(ejwi ejwiVar) {
        if (ejwiVar == null) {
            throw new NullPointerException("Null accountOptional");
        }
        this.g = ejwiVar;
    }

    @Override // defpackage.dtqd
    public final void c(long j) {
        this.d = j;
        this.h = (byte) 1;
    }

    @Override // defpackage.dtqd
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        this.c = str;
    }

    @Override // defpackage.dtqd
    public final void e(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null updatedDataFileList");
        }
        this.f = ekgbVar;
    }

    @Override // defpackage.dtqd
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str;
    }
}
