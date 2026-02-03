package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class stc extends fcyz implements fdat {
    final /* synthetic */ stf a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stc(stf stfVar, MessageCoreData messageCoreData, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = stfVar;
        this.b = messageCoreData;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((stc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.m(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new stc(this.a, this.b, this.c, fcxyVar);
    }
}
