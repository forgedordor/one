package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlf {
    public final egej a;
    private final axky b;

    public axlf(axky axkyVar, egej egejVar) {
        this.b = axkyVar;
        this.a = egejVar;
    }

    public final eiju a() {
        eiju eijuVarA = this.b.a();
        ejvr ejvrVar = new ejvr() { // from class: axlb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(Objects.nonNull((efwo) obj));
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarA.h(ejvrVar, eoqgVar).e(axlg.class, new ejvr() { // from class: axlc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return false;
            }
        }, eoqgVar);
    }

    public final eiju b(final int i) {
        eiju eijuVarA = this.b.a();
        ejvr ejvrVar = new ejvr() { // from class: axkz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i2 = i;
                efwo efwoVar = (efwo) obj;
                if (efwoVar == null || efwoVar.a() != i2) {
                    throw new axkg(a.g(i2, "Requested Account not linked: "));
                }
                return efwoVar;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarA.h(ejvrVar, eoqgVar).e(axlg.class, new ejvr() { // from class: axla
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new axkg("No account linked", (axlg) obj);
            }
        }, eoqgVar);
    }
}
