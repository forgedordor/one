package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvn {
    public final zvo a;
    public final dnwx b;
    private final fdjx c;
    private final fcsu d;
    private final zuf e;

    public zvn(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, cqdr cqdrVar, zuf zufVar, zvo zvoVar, Optional optional) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        cqdrVar.getClass();
        zufVar.getClass();
        zvoVar.getClass();
        optional.getClass();
        this.c = fdjxVar2;
        this.d = fcsuVar;
        this.e = zufVar;
        this.a = zvoVar;
        this.b = (dnwx) fdct.b(optional);
    }

    public final void a(anhj anhjVar, MessageId messageId, ckmn ckmnVar, ckmc ckmcVar, angn angnVar) {
        anhjVar.getClass();
        messageId.getClass();
        ckmnVar.getClass();
        ckmcVar.getClass();
        fhaz fhazVarA = cqdr.a();
        if (fcwm.d(ckmc.ADD_REACTION, ckmc.REPLACE_REACTION).contains(ckmcVar)) {
            zuf zufVar = this.e;
            fhazVarA.getClass();
            zufVar.a(fhazVarA);
        }
        auvw.k(this.c, null, null, new zvm(ckmcVar, (ajmh) this.d.b(), messageId, anhjVar, ckmnVar, fhazVarA, angnVar, this, null), 3);
    }
}
