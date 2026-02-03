package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssm extends dssu {
    public final ekgp a;
    private final String b;
    private final int c;

    public dssm(int i, String str, ekgp ekgpVar) {
        this.c = i;
        this.b = str;
        this.a = ekgpVar;
    }

    @Override // defpackage.dssu
    public final ekgp a() {
        return this.a;
    }

    @Override // defpackage.dssu
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dssu
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dssu) {
            dssu dssuVar = (dssu) obj;
            if (this.c == dssuVar.c() && ((str = this.b) != null ? str.equals(dssuVar.b()) : dssuVar.b() == null) && ekmi.m(this.a, dssuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.c ^ 1000003) * 1000003)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("PromoDetails{promoType=");
        switch (this.c) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "BOTTOM_SHEET";
                break;
            case 3:
                str = "DIALOG";
                break;
            case 4:
                str = "FEATURE_HIGHLIGHT";
                break;
            case 5:
                str = "PERMISSION";
                break;
            case 6:
                str = "TOOLTIP";
                break;
            case 7:
                str = "CUSTOM_UI";
                break;
            default:
                str = "IN_APP_REVIEW";
                break;
        }
        sb.append(str);
        sb.append(", elementId=");
        sb.append(this.b);
        sb.append(", actionIntents=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
