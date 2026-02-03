package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyaz extends dybc {
    public final ejwi a;
    public final SpannableString b;
    public final ejwi c;

    public dyaz(ejwi ejwiVar, SpannableString spannableString, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = spannableString;
        this.c = ejwiVar2;
    }

    @Override // defpackage.dybc
    public final SpannableString a() {
        return this.b;
    }

    @Override // defpackage.dybc
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dybc
    public final ejwi c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dybc) {
            dybc dybcVar = (dybc) obj;
            if (this.a.equals(dybcVar.c()) && this.b.equals(dybcVar.a()) && this.c.equals(dybcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        SpannableString spannableString = this.b;
        return "DeactivatedAccountsDialogInfo{title=" + this.a.toString() + ", explanation=" + spannableString.toString() + ", actionButtonSpec=" + ejwiVar.toString() + "}";
    }
}
