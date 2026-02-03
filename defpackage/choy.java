package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.DesugarCollections;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class choy implements antr {
    public static final String a = new String();
    public final String b;
    private final ResolvedRecipient c;
    private final ProfilesTable.BindData d;
    private final eosc e;
    private final Optional f;
    private final fdjx g;
    private final fcsu h;
    private final Optional i;
    private final chpb j;
    private final chpc k;

    public choy(chpb chpbVar, chpc chpcVar, String str, ResolvedRecipient resolvedRecipient, ProfilesTable.BindData bindData, eosc eoscVar, Optional optional, fdjx fdjxVar, fcsu fcsuVar, Optional optional2) {
        this.j = chpbVar;
        this.k = chpcVar;
        this.b = str;
        this.c = resolvedRecipient;
        this.d = bindData;
        this.e = eoscVar;
        this.f = optional;
        this.g = fdjxVar;
        this.h = fcsuVar;
        this.i = optional2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.antr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choy.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r13 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.antr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r9, defpackage.chnc r10, defpackage.anyy r11, defpackage.evvp r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choy.b(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, chnc, anyy, evvp, fcxy):java.lang.Object");
    }

    @Override // defpackage.antr
    public final boolean c() {
        return this.j.b || this.k.c;
    }

    @Override // defpackage.antr
    public final Object d(SelfIdentityId selfIdentityId, chnc chncVar, anyy anyyVar) {
        ResolvedRecipient resolvedRecipient = this.c;
        int iE = e(selfIdentityId);
        if (resolvedRecipient.D() || resolvedRecipient.z() || resolvedRecipient.H().b() || iE == 3 || (chncVar == chnc.SHARE_TO_CONTACTS_ONLY && !resolvedRecipient.A())) {
            return antw.d;
        }
        if (!anyyVar.j() || !anyyVar.q() || !anyyVar.m()) {
            return antw.c;
        }
        int i = iE - 2;
        return i != 3 ? i != 4 ? antw.b : antw.f : antw.e;
    }

    @Override // defpackage.antr
    public final int e(SelfIdentityId selfIdentityId) {
        chpw chpwVarT;
        chpy chpyVar;
        selfIdentityId.getClass();
        ProfilesTable.BindData bindData = this.d;
        if (bindData != null && (chpwVarT = bindData.t()) != null && (chpyVar = (chpy) DesugarCollections.unmodifiableMap(chpwVarT.b).get(selfIdentityId.b())) != null) {
            int i = chpyVar.c;
            i = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
            if (i == 0) {
                return 1;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof choy)) {
            return false;
        }
        choy choyVar = (choy) obj;
        return fdbq.f(this.j, choyVar.j) && fdbq.f(this.k, choyVar.k) && fdbq.f(this.b, choyVar.b) && fdbq.f(this.c, choyVar.c) && fdbq.f(this.d, choyVar.d) && fdbq.f(this.e, choyVar.e) && fdbq.f(this.f, choyVar.f) && fdbq.f(this.g, choyVar.g) && fdbq.f(this.h, choyVar.h) && fdbq.f(this.i, choyVar.i);
    }

    @Override // defpackage.ants
    public final chpb f() {
        throw null;
    }

    @Override // defpackage.ants
    public final chpc g() {
        throw null;
    }

    public final String h() {
        ProfilesTable.BindData bindData = this.d;
        if (bindData != null) {
            return bindData.A();
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() * 31) + this.k.hashCode();
        String str = this.b;
        int iHashCode2 = ((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        ProfilesTable.BindData bindData = this.d;
        return ((((((((((iHashCode2 + (bindData != null ? bindData.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "DefaultPeopleProfileV2(name=" + this.j + ", photo=" + this.k + ", personId=" + this.b + ", resolvedRecipient=" + this.c + ", profileBindData=" + this.d + ", lightweightExecutor=" + this.e + ", recipientsProfileCache=" + this.f + ", lightweightScope=" + this.g + ", forceRefreshProfileIntervalHours=" + this.h + ", profileEventMetricsLogger=" + this.i + ")";
    }
}
