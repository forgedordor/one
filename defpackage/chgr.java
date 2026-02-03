package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgr implements chgo, chgn {
    public final chgn a;
    private final fdjx b;

    public chgr(chgn chgnVar, fdjx fdjxVar) {
        chgnVar.getClass();
        fdjxVar.getClass();
        this.a = chgnVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.chgn
    public final aubt a(Bundle bundle) {
        return this.a.a(bundle);
    }

    @Override // defpackage.chgn
    public final Object b(MessageCoreData messageCoreData, aubq aubqVar, auhk auhkVar, elny elnyVar, audu auduVar, Bundle bundle, fcxy fcxyVar) {
        return this.a.b(messageCoreData, aubqVar, auhkVar, elnyVar, auduVar, bundle, fcxyVar);
    }

    @Override // defpackage.chgn
    public final Object c(auib auibVar, aubq aubqVar, axcm axcmVar, Instant instant, chbs chbsVar, eyga eygaVar, basd basdVar, boolean z, cbqz cbqzVar, aubt aubtVar, auhk auhkVar, elny elnyVar, Bundle bundle, fcxy fcxyVar) {
        return this.a.c(auibVar, aubqVar, axcmVar, instant, chbsVar, eygaVar, basdVar, z, cbqzVar, aubtVar, auhkVar, elnyVar, bundle, fcxyVar);
    }

    @Override // defpackage.chgo
    public final eiju d(MessageCoreData messageCoreData, aubq aubqVar, auhk auhkVar, elny elnyVar, audu auduVar, Bundle bundle) {
        auhkVar.getClass();
        elnyVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new chgq(this, messageCoreData, aubqVar, auhkVar, elnyVar, auduVar, bundle, null));
    }

    @Override // defpackage.chgo
    public final eiju e(auib auibVar, aubq aubqVar, axcm axcmVar, Instant instant, chbs chbsVar, eyga eygaVar, basd basdVar, boolean z, cbqz cbqzVar, aubt aubtVar, auhk auhkVar, elny elnyVar, Bundle bundle) {
        instant.getClass();
        eygaVar.getClass();
        cbqzVar.getClass();
        auhkVar.getClass();
        elnyVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new chgp(this, auibVar, aubqVar, axcmVar, instant, chbsVar, eygaVar, basdVar, z, cbqzVar, aubtVar, auhkVar, elnyVar, bundle, null));
    }
}
