package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byfe implements byfc {
    private final Optional a;

    public byfe(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.byfc
    public final eiju a(bppd bppdVar) {
        ejwl.a(d(bppdVar));
        Optional optional = this.a;
        if (!optional.isEmpty()) {
        }
        return eijx.e(true);
    }

    @Override // defpackage.byfc
    public final boolean d(bppd bppdVar) {
        return (bppdVar.o() & 8) != 0 && bppdVar.m() == 1;
    }
}
