package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aurw {
    public final /* synthetic */ aurx a;

    public aurw(aurx aurxVar) {
        this.a = aurxVar;
    }

    public static final feds d(auml aumlVar) {
        int iOrdinal = aumlVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? feds.NOT_ENABLED : feds.IN_INITIAL_SYNC : feds.ENABLED;
    }

    @Deprecated
    public static final boolean e(aumq aumqVar) {
        return aumqVar.e || aumqVar.q;
    }

    public static final boolean f(auml aumlVar) {
        return (aumlVar.equals(auml.UNSPECIFIED_STATUS) || aumlVar.equals(auml.DISABLED)) ? false : true;
    }

    public static final boolean g(aumq aumqVar) {
        auml aumlVarB = auml.b(aumqVar.l);
        if (aumlVarB == null) {
            aumlVarB = auml.UNSPECIFIED_STATUS;
        }
        if (f(aumlVarB)) {
            return true;
        }
        auml aumlVarB2 = auml.b(aumqVar.r);
        if (aumlVarB2 == null) {
            aumlVarB2 = auml.UNSPECIFIED_STATUS;
        }
        return f(aumlVarB2);
    }

    public final eiju a() {
        return this.a.k().h(new ejvr() { // from class: auru
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(aurw.g((aumq) obj));
            }
        }, eoqg.a);
    }

    @Deprecated
    public final eiju b() {
        return this.a.k().h(new ejvr() { // from class: aurt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(aurw.e((aumq) obj));
            }
        }, eoqg.a);
    }

    @Deprecated
    public final void c(auml aumlVar) {
        this.a.k.set(d(aumlVar));
    }
}
