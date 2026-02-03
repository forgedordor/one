package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqov extends dqtx {
    public final dqsb a;
    public final dqus b;
    public final dqsy c;
    public final boolean d;
    public final AtomicInteger e;
    public final AtomicLong f;
    public final AtomicLong g;
    public final AtomicBoolean h;
    public final dqwl i;
    public final ejxr j;
    private final ejxr k;
    private final ejxr l;
    private final String m;
    private final ContentValues n;

    public dqov(dqsb dqsbVar, dqus dqusVar, ejxr ejxrVar, dqsy dqsyVar, boolean z, ejxr ejxrVar2, AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicBoolean atomicBoolean, String str, ContentValues contentValues, dqwl dqwlVar, ejxr ejxrVar3) {
        this.a = dqsbVar;
        this.b = dqusVar;
        this.k = ejxrVar;
        this.c = dqsyVar;
        this.d = z;
        this.l = ejxrVar2;
        this.e = atomicInteger;
        this.f = atomicLong;
        this.g = atomicLong2;
        this.h = atomicBoolean;
        this.m = str;
        this.n = contentValues;
        this.i = dqwlVar;
        this.j = ejxrVar3;
    }

    @Override // defpackage.dqtx
    public final ContentValues a() {
        return this.n;
    }

    @Override // defpackage.dqtx
    public final dqsb b() {
        return this.a;
    }

    @Override // defpackage.dqtx
    public final dqsy c() {
        return this.c;
    }

    @Override // defpackage.dqtx
    public final dqus d() {
        return this.b;
    }

    @Override // defpackage.dqtx
    public final dqwl e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        ejxr ejxrVar;
        String str;
        ContentValues contentValues;
        dqwl dqwlVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqtx) {
            dqtx dqtxVar = (dqtx) obj;
            if (this.a.equals(dqtxVar.b()) && this.b.equals(dqtxVar.d()) && ((ejxrVar = this.k) != null ? ejxrVar.equals(dqtxVar.f()) : dqtxVar.f() == null) && this.c.equals(dqtxVar.c()) && this.d == dqtxVar.n() && this.l.equals(dqtxVar.h()) && this.e.equals(dqtxVar.k()) && this.f.equals(dqtxVar.m()) && this.g.equals(dqtxVar.l()) && this.h.equals(dqtxVar.j()) && ((str = this.m) != null ? str.equals(dqtxVar.i()) : dqtxVar.i() == null) && ((contentValues = this.n) != null ? contentValues.equals(dqtxVar.a()) : dqtxVar.a() == null) && ((dqwlVar = this.i) != null ? dqwlVar.equals(dqtxVar.e()) : dqtxVar.e() == null) && this.j.equals(dqtxVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqtx
    public final ejxr f() {
        return this.k;
    }

    @Override // defpackage.dqtx
    public final ejxr g() {
        return this.j;
    }

    @Override // defpackage.dqtx
    public final ejxr h() {
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        ejxr ejxrVar = this.k;
        int iHashCode2 = ((((((((((((((((iHashCode * 1000003) ^ (ejxrVar == null ? 0 : ejxrVar.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str = this.m;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ContentValues contentValues = this.n;
        int iHashCode4 = (iHashCode3 ^ (contentValues == null ? 0 : contentValues.hashCode())) * 1000003;
        dqwl dqwlVar = this.i;
        return ((iHashCode4 ^ (dqwlVar != null ? dqwlVar.hashCode() : 0)) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.dqtx
    public final String i() {
        return this.m;
    }

    @Override // defpackage.dqtx
    public final AtomicBoolean j() {
        return this.h;
    }

    @Override // defpackage.dqtx
    public final AtomicInteger k() {
        return this.e;
    }

    @Override // defpackage.dqtx
    public final AtomicLong l() {
        return this.g;
    }

    @Override // defpackage.dqtx
    public final AtomicLong m() {
        return this.f;
    }

    @Override // defpackage.dqtx
    public final boolean n() {
        return this.d;
    }

    public final String toString() {
        ejxr ejxrVar = this.j;
        dqwl dqwlVar = this.i;
        ContentValues contentValues = this.n;
        AtomicBoolean atomicBoolean = this.h;
        AtomicLong atomicLong = this.g;
        AtomicLong atomicLong2 = this.f;
        AtomicInteger atomicInteger = this.e;
        ejxr ejxrVar2 = this.l;
        dqsy dqsyVar = this.c;
        ejxr ejxrVar3 = this.k;
        dqus dqusVar = this.b;
        return "MetaData{loggingTag=" + this.a.toString() + ", operationCategory=" + dqusVar.toString() + ", canonicalSql=" + String.valueOf(ejxrVar3) + ", database=" + dqsyVar.toString() + ", exemptFromQueryPlanChecking=" + this.d + ", sqlAndArgs=" + ejxrVar2.toString() + ", resultCount=" + atomicInteger.toString() + ", threadTimeMillis=" + atomicLong2.toString() + ", elapsedTimeMillis=" + atomicLong.toString() + ", isInFlight=" + atomicBoolean.toString() + ", tableName=" + this.m + ", contentValuesForUpdate=" + String.valueOf(contentValues) + ", sourceQuery=" + String.valueOf(dqwlVar) + ", isOnInitializationThreadSupplier=" + ejxrVar.toString() + "}";
    }
}
