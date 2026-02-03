package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afkn extends fcyz implements fdat {
    int a;
    final /* synthetic */ afko b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkn(afko afkoVar, MessageIdType messageIdType, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afkoVar;
        this.c = messageIdType;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        afko afkoVar = this.b;
        MessageIdType messageIdType = this.c;
        List list = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(afkoVar.a), new afkm(null, afkoVar, messageIdType, list), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afkn(this.b, this.c, this.d, fcxyVar);
    }
}
