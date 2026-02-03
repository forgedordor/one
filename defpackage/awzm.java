package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awzm {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityPhoneDetails");
    public final Optional a;
    public final awvj b;
    private final awyv d;
    private final alrj e;
    private final fdjx f;
    private final arpj g;

    public awzm(awyv awyvVar, Optional optional, alrj alrjVar, awvj awvjVar, fdjx fdjxVar, arpj arpjVar) {
        alrjVar.getClass();
        awvjVar.getClass();
        fdjxVar.getClass();
        this.d = awyvVar;
        this.a = optional;
        this.e = alrjVar;
        this.b = awvjVar;
        this.f = fdjxVar;
        this.g = arpjVar;
        if (awyvVar.a.a() != awxl.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final alqm a() {
        return this.e.c((String) this.d.c().get(), new ejxr() { // from class: awzh
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.empty();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alqm b() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awzm.b():alqm");
    }
}
