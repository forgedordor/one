package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doig {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/media/MediaType");
    public final doif b;
    public final String c;
    public final dohy d;
    private final fctc e;

    public doig(doif doifVar, String str, dohy dohyVar) {
        str.getClass();
        this.b = doifVar;
        this.c = str;
        this.d = dohyVar;
        this.e = fctd.a(new fdae() { // from class: dohw
            @Override // defpackage.fdae
            public final Object invoke() {
                StringBuilder sb = new StringBuilder();
                doig doigVar = this.a;
                sb.append(doigVar.b.b() + "/" + doigVar.c);
                dohy dohyVar2 = doigVar.d;
                if (dohyVar2 != null) {
                    Objects.toString(dohyVar2);
                    sb.append(";".concat(dohyVar2.toString()));
                }
                return sb.toString();
            }
        });
    }

    public final String a() {
        return (String) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doig)) {
            return false;
        }
        doig doigVar = (doig) obj;
        return fdbq.f(this.b, doigVar.b) && fdbq.f(this.c, doigVar.c) && fdbq.f(this.d, doigVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        dohy dohyVar = this.d;
        return (iHashCode * 31) + (dohyVar == null ? 0 : dohyVar.hashCode());
    }

    public final String toString() {
        return a();
    }

    public /* synthetic */ doig(doif doifVar, String str) {
        this(doifVar, str, null);
    }
}
