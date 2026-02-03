package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaca {
    public final ExperimentTokens a;
    public final String b;

    public eaca(ExperimentTokens experimentTokens, String str) {
        str.getClass();
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaca)) {
            return false;
        }
        eaca eacaVar = (eaca) obj;
        return fdbq.f(this.a, eacaVar.a) && fdbq.f(this.b, eacaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
