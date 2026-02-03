package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbi extends abbo {
    public final aazs a;
    public final String b;
    public final int c;

    public abbi(int i, aazs aazsVar, String str) {
        this.c = i;
        this.a = aazsVar;
        if (str == null) {
            throw new NullPointerException("Null comment");
        }
        this.b = str;
    }

    @Override // defpackage.abbo
    public final aazs a() {
        return this.a;
    }

    @Override // defpackage.abbo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.abbo
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        aazs aazsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof abbo) {
            abbo abboVar = (abbo) obj;
            if (this.c == abboVar.c() && ((aazsVar = this.a) != null ? aazsVar.equals(abboVar.a()) : abboVar.a() == null) && this.b.equals(abboVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aazs aazsVar = this.a;
        return (((aazsVar == null ? 0 : aazsVar.hashCode()) ^ ((this.c ^ 1000003) * 1000003)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c != 1 ? "ON_CANCEL_BUTTON_CLICKED" : "ON_REPORT_BUTTON_CLICKED";
        aazs aazsVar = this.a;
        String str2 = this.b;
        return "TakeBugReportRequestData{dialogUserInputType=" + str + ", category=" + String.valueOf(aazsVar) + ", comment=" + str2 + "}";
    }
}
