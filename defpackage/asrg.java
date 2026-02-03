package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrg {
    public final ekgb a;
    public final boolean b;
    private final Optional c;

    public asrg(aubq aubqVar) {
        this.a = ekgb.r(aubqVar);
        this.c = Optional.empty();
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aubq a() {
        /*
            r3 = this;
            boolean r0 = r3.d()
            r1 = 0
            if (r0 != 0) goto L11
            ekgb r0 = r3.a
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            java.lang.String r0 = "Recipients descriptor is not for 1 to 1 chat"
            defpackage.ejwl.m(r2, r0)
            ekgb r0 = r3.a
            java.lang.Object r0 = r0.get(r1)
            aubq r0 = (defpackage.aubq) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asrg.a():aubq");
    }

    public final audu b() {
        Optional optional = this.c;
        ejwl.m(optional.isPresent(), "Recipients descriptor is not for group chat");
        return (audu) optional.get();
    }

    public final ekgb c() {
        ejwl.m(this.c.isPresent(), "Recipients descriptor is not for group chat");
        return this.a;
    }

    public final boolean d() {
        return this.c.isPresent();
    }

    public asrg(audu auduVar, ekgb ekgbVar, boolean z) {
        this.a = ekgbVar;
        this.c = Optional.of(auduVar);
        this.b = z;
    }
}
