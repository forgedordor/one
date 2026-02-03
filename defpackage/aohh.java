package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aohh implements aofd {
    public final SelfIdentityId a;
    public final fcsu b;
    private final Optional c;
    private final Optional d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final evvp i;
    private final ProfilesTable.BindData j;
    private final btzd k;
    private final fcsu l;
    private final cogw m;
    private final fdjx n;
    private final int o;

    public aohh(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, int i, SelfIdentityId selfIdentityId, boolean z4, evvp evvpVar, ProfilesTable.BindData bindData, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, fdjx fdjxVar) {
        evvpVar.getClass();
        this.c = optional;
        this.d = optional2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.o = i;
        this.a = selfIdentityId;
        this.h = z4;
        this.i = evvpVar;
        this.j = bindData;
        this.k = null;
        this.l = fcsuVar;
        this.b = fcsuVar2;
        this.m = cogwVar;
        this.n = fdjxVar;
    }

    @Override // defpackage.aofd
    public final evvp a() {
        return this.i;
    }

    @Override // defpackage.aofd
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.aofd
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.aofd
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.aofd
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aohh)) {
            return false;
        }
        aohh aohhVar = (aohh) obj;
        if (!fdbq.f(this.c, aohhVar.c) || !fdbq.f(this.d, aohhVar.d) || this.e != aohhVar.e || this.f != aohhVar.f || this.g != aohhVar.g || this.o != aohhVar.o || !fdbq.f(this.a, aohhVar.a) || this.h != aohhVar.h || !fdbq.f(this.i, aohhVar.i) || !fdbq.f(this.j, aohhVar.j)) {
            return false;
        }
        btzd btzdVar = aohhVar.k;
        return fdbq.f(null, null) && fdbq.f(this.l, aohhVar.l) && fdbq.f(this.b, aohhVar.b) && fdbq.f(this.m, aohhVar.m) && fdbq.f(this.n, aohhVar.n);
    }

    @Override // defpackage.aofd
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.aofd
    public final boolean g() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.aohf
            if (r0 == 0) goto L13
            r0 = r7
            aohf r0 = (defpackage.aohf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aohf r0 = new aohf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L52
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.fctl.b(r7)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r7 = r6.j
            if (r7 != 0) goto L56
            r0.c = r3
            fdjx r7 = r6.n
            fcyi r2 = defpackage.fcyi.a
            fdjz r3 = defpackage.fdjz.a
            fcyh r2 = defpackage.eicg.a(r2)
            aohd r4 = new aohd
            r5 = 0
            r4.<init>(r5, r6)
            fdkf r7 = defpackage.fdin.b(r7, r2, r3, r4)
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L55
        L52:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r7 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable.BindData) r7
            goto L56
        L55:
            return r1
        L56:
            j$.util.Optional r0 = r6.c
            bsrs r7 = r7.s()
            java.lang.Object r0 = defpackage.fdct.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.d(r0)
            j$.util.Optional r0 = r6.d
            java.lang.Object r0 = defpackage.fdct.b(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r7.l(r0)
            boolean r0 = r6.f
            r7.b(r0)
            cogw r0 = r6.m
            j$.time.Duration r0 = r0.d()
            long r0 = r0.toMillis()
            r7.f(r0)
            boolean r0 = r6.h
            r7.g(r0)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r7 = r7.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aohh.h(fcxy):java.lang.Object");
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        SelfIdentityId selfIdentityId = this.a;
        int iA = (((((((((((((iHashCode * 31) + aohb.a(this.e)) * 31) + aohb.a(this.f)) * 31) + aohb.a(this.g)) * 31) + this.o) * 31) + selfIdentityId.hashCode()) * 31) + aohb.a(this.h)) * 31) + this.i.hashCode();
        ProfilesTable.BindData bindData = this.j;
        return (((((((((iA * 31) + (bindData == null ? 0 : bindData.hashCode())) * 961) + this.l.hashCode()) * 31) + this.b.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aohh.i(fcxy):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfPeopleProfileImpl(displayName=");
        sb.append(this.c);
        sb.append(", photo=");
        sb.append(this.d);
        sb.append(", isPhotoAMonogram=");
        sb.append(this.e);
        sb.append(", belongsToSelfGaia=");
        sb.append(this.f);
        sb.append(", hasDiscoverableProfile=");
        sb.append(this.g);
        sb.append(", provenance=");
        sb.append((Object) (this.o != 4 ? "PROFILE_CACHE" : "LOCAL_CACHE"));
        sb.append(", selfIdentityId=");
        sb.append(this.a);
        sb.append(", isProfileShareable=");
        sb.append(this.h);
        sb.append(", lastUpdatedTimestamp=");
        sb.append(this.i);
        sb.append(", profileBindData=");
        sb.append(this.j);
        sb.append(", selfProfileBindData=null, selfProfileRowFactory=");
        sb.append(this.l);
        sb.append(", profileRowFactory=");
        sb.append(this.b);
        sb.append(", clock=");
        sb.append(this.m);
        sb.append(", blockingScope=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
