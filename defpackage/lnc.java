package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnc implements fcyf {
    private final lnc a;
    private final llo b;

    public lnc(lnc lncVar, llo lloVar) {
        this.a = lncVar;
        this.b = lloVar;
    }

    public final void a(lkb lkbVar) {
        if (this.b == lkbVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        lnc lncVar = this.a;
        if (lncVar != null) {
            lncVar.a(lkbVar);
        }
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return lnb.a;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
