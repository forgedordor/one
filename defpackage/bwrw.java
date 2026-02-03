package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwrw {
    public static final cqce a = cqce.f("BugleProtoData", bwrw.class);
    public final cmfo b;

    public bwrw(cmgk cmgkVar, String str) {
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.ETOUFFEE_PHONE);
        cmggVarC.g(str);
        cmggVarC.f(bwrq.a);
        cmggVarC.c(new Supplier() { // from class: bwrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bwrv();
            }
        });
        cmggVarC.b(true);
        this.b = cmgkVar.a(cmggVarC.a());
    }

    public final eiju a() {
        return this.b.h().h(new ejvr() { // from class: bwru
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ((bwrq) obj).b;
                bwrp bwrpVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : bwrp.NOT_PROVISIONED_BUT_INITIALIZED : bwrp.NOT_PROVISIONED : bwrp.PROVISIONED : bwrp.UNSET;
                return bwrpVar == null ? bwrp.UNRECOGNIZED : bwrpVar;
            }
        }, eoqg.a);
    }
}
