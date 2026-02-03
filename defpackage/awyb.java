package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyb implements bati {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityAddressDeduper");
    private final awzf b;
    private final awzo c;
    private final awvj d;
    private final fdjx e;
    private final fdjx f;
    private final bvdj g;

    public awyb(awzf awzfVar, awzo awzoVar, awvj awvjVar, fdjx fdjxVar, fdjx fdjxVar2) {
        awzfVar.getClass();
        awzoVar.getClass();
        awvjVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.b = awzfVar;
        this.c = awzoVar;
        this.d = awvjVar;
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.g = bvdj.MY_IDENTITY_ADDRESS_DEDUPER;
    }

    @Override // defpackage.bati
    public final long a() {
        return 1L;
    }

    @Override // defpackage.bati
    public final bvdj b() {
        return this.g;
    }

    @Override // defpackage.bati
    public final eiju c() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new awxv(this, null));
    }

    @Override // defpackage.bati
    public final eiju d(long j) {
        return auvw.c(this.f, fcyi.a, fdjz.a, new awxw(this, j, null));
    }

    @Override // defpackage.bati
    public final eiju e(Optional optional) {
        optional.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new awya(this, optional, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0120, code lost:
    
        if (r11.j(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyb.f(fcxy):java.lang.Object");
    }
}
