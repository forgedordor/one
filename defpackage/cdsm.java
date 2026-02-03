package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdsn b;
    final /* synthetic */ String c;
    final /* synthetic */ MessageIdType d;
    final /* synthetic */ String e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdsm(cdsn cdsnVar, String str, MessageIdType messageIdType, int i, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdsnVar;
        this.c = str;
        this.d = messageIdType;
        this.f = i;
        this.e = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdsm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cdsn cdsnVar = this.b;
        String str = this.c;
        MessageIdType messageIdType = this.d;
        int i2 = this.f;
        String str2 = this.e;
        this.a = 1;
        MessageCoreData messageCoreDataW = ((baxe) cdsnVar.a.b()).w(messageIdType);
        Object objI = messageCoreDataW == null ? cbcw.i() : cdsnVar.a(str, messageCoreDataW, i2, str2, this);
        return objI == fcylVar ? fcylVar : objI;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdsm(this.b, this.c, this.d, this.f, this.e, fcxyVar);
    }
}
