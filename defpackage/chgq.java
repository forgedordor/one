package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chgq extends fcyz implements fdat {
    int a;
    final /* synthetic */ chgr b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ aubq d;
    final /* synthetic */ auhk e;
    final /* synthetic */ elny f;
    final /* synthetic */ audu g;
    final /* synthetic */ Bundle h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chgq(chgr chgrVar, MessageCoreData messageCoreData, aubq aubqVar, auhk auhkVar, elny elnyVar, audu auduVar, Bundle bundle, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chgrVar;
        this.c = messageCoreData;
        this.d = aubqVar;
        this.e = auhkVar;
        this.f = elnyVar;
        this.g = auduVar;
        this.h = bundle;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chgq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chgr chgrVar = this.b;
        MessageCoreData messageCoreData = this.c;
        aubq aubqVar = this.d;
        auhk auhkVar = this.e;
        elny elnyVar = this.f;
        audu auduVar = this.g;
        Bundle bundle = this.h;
        this.a = 1;
        Object objB = chgrVar.a.b(messageCoreData, aubqVar, auhkVar, elnyVar, auduVar, bundle, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chgq(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
