package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crga extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;
    final /* synthetic */ List c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crga(crgd crgdVar, List list, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crgdVar;
        this.c = list;
        this.d = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crga) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        crgd crgdVar = this.b;
        List list = this.c;
        MessageCoreData messageCoreData = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(crgdVar.c), new crgb(null, crgdVar, list, messageCoreData), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crga(this.b, this.c, this.d, fcxyVar);
    }
}
