package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eicq extends eibd {
    private final eiez a;

    public eicq(String str, eifn eifnVar, eiez eiezVar, eifi eifiVar) {
        super(str, eifnVar, eifiVar);
        ejwl.a(eiezVar.e);
        this.a = eiezVar;
    }

    @Override // defpackage.eifn
    public eiev j(eiew eiewVar) {
        return eiez.j(eiewVar, k());
    }

    @Override // defpackage.eifn
    public final eiez k() {
        return eiez.e(this.a, n());
    }

    public eicq(String str, UUID uuid, String str2, eiez eiezVar, eifi eifiVar) {
        super(str, uuid, str2, eifiVar);
        ejwl.a(eiezVar.e);
        this.a = eiezVar;
    }
}
