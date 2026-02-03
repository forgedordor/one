package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbc extends dsbi {
    public final ethk a;
    private final String c;
    private final long d;
    private final ekgp e;
    private final evhv f;
    private final String g;

    public dsbc(String str, ethk ethkVar, long j, ekgp ekgpVar, evhv evhvVar, String str2) {
        this.c = str;
        this.a = ethkVar;
        this.d = j;
        this.e = ekgpVar;
        this.f = evhvVar;
        this.g = str2;
    }

    @Override // defpackage.dsbi
    public final long a() {
        return this.d;
    }

    @Override // defpackage.dsbi
    public final ekgp b() {
        return this.e;
    }

    @Override // defpackage.dsbi
    public final ethk c() {
        return this.a;
    }

    @Override // defpackage.dsbi
    public final evhv d() {
        return this.f;
    }

    @Override // defpackage.dsbi
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        evhv evhvVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dsbi) {
            dsbi dsbiVar = (dsbi) obj;
            String str2 = this.c;
            if (str2 != null ? str2.equals(dsbiVar.e()) : dsbiVar.e() == null) {
                if (this.a.equals(dsbiVar.c()) && this.d == dsbiVar.a() && this.e.equals(dsbiVar.b()) && ((evhvVar = this.f) != null ? evhvVar.equals(dsbiVar.d()) : dsbiVar.d() == null) && ((str = this.g) != null ? str.equals(dsbiVar.f()) : dsbiVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dsbi
    public final String f() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.a.hashCode();
        long j = this.d;
        int iHashCode2 = (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
        evhv evhvVar = this.f;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (evhvVar == null ? 0 : evhvVar.hashCode())) * 1000003;
        String str2 = this.g;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        evhv evhvVar = this.f;
        ekgp ekgpVar = this.e;
        return "PromoContext{accountName=" + this.c + ", promotion=" + String.valueOf(this.a) + ", triggeringEventTimeMs=" + this.d + ", actionTypeIntentMap=" + String.valueOf(ekgpVar) + ", versionedIdentifier=" + String.valueOf(evhvVar) + ", representativeTargetId=" + this.g + "}";
    }
}
