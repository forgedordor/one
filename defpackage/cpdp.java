package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpdp extends fcyz implements fdat {
    final /* synthetic */ cpdr a;
    final /* synthetic */ MessageIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpdp(cpdr cpdrVar, MessageIdType messageIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cpdrVar;
        this.b = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((cpdp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cpdr cpdrVar = this.a;
        if (cpdrVar.b.a()) {
            ((cdys) cpdrVar.a.b()).e(this.b, cdyt.TOOLSTONE_DELETION);
            return null;
        }
        ((cdys) cpdrVar.a.b()).d(this.b);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpdp(this.a, this.b, fcxyVar);
    }
}
