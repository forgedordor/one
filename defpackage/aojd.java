package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aojd implements aofc {
    public final fdjx a;
    public final axfu b;
    public final aojl c;
    private final anpj d;
    private final anpj e;

    public aojd(fdjx fdjxVar, axfu axfuVar, aojl aojlVar, aofp aofpVar, aojw aojwVar) {
        fdjxVar.getClass();
        axfuVar.getClass();
        aofpVar.getClass();
        aojwVar.getClass();
        this.a = fdjxVar;
        this.b = axfuVar;
        this.c = aojlVar;
        this.d = aofpVar.a();
        this.e = aojwVar.a();
    }

    @Override // defpackage.aofc
    public final anpj a() {
        return new aoiz(this);
    }

    @Override // defpackage.aofc
    public final anpj b() {
        return this.d;
    }

    @Override // defpackage.aofc
    public final anpj c() {
        return this.e;
    }

    @Override // defpackage.aofc
    public final anpj d() {
        return new aoiz(this);
    }

    @Override // defpackage.aofc
    public final eiju e(SelfIdentityId selfIdentityId) throws IOException {
        selfIdentityId.getClass();
        eieu eieuVarH = eiiy.h("DefaultSatelliteSelfIdentityRepository#getSelfIdentityById");
        try {
            eiju eijuVarC = auvw.c(this.a, fcyi.a, fdjz.a, new aojc(this, selfIdentityId, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.aofc
    public final eiju f() {
        eiju eijuVarD = eijx.d(new IllegalStateException("SatelliteSelfIdentity can't start conversations"));
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.aofc
    public final eiju g(SelfIdentityId selfIdentityId, alqm alqmVar) {
        return eijx.e(null);
    }

    @Override // defpackage.aofc
    public final eiju h(Optional optional) {
        eiju eijuVarE = eijx.e(true);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
