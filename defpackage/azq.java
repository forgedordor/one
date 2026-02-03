package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azq {
    public final bli a;

    public azq() {
        bli bliVarA = bli.a();
        this.a = bliVarA;
        bjo bjoVar = brm.n;
        Class cls = (Class) bliVarA.n(bjoVar, null);
        if (cls != null && !cls.equals(azp.class)) {
            throw new IllegalArgumentException(a.i(cls, this, "Invalid target class configuration for ", ": "));
        }
        bliVarA.c(bjoVar, azp.class);
        bjo bjoVar2 = brm.m;
        if (bliVarA.n(bjoVar2, null) == null) {
            bliVarA.c(bjoVar2, a.w(azp.class));
        }
    }
}
