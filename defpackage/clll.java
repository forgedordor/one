package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clll extends fcyz implements fdat {
    int a;
    final /* synthetic */ cllp b;
    final /* synthetic */ alqm c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clll(cllp cllpVar, alqm alqmVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cllpVar;
        this.c = alqmVar;
        this.d = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clll) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cllp cllpVar = this.b;
        alqm alqmVar = this.c;
        MessageCoreData messageCoreData = this.d;
        this.a = 1;
        Object objA = cllpVar.a(alqmVar, messageCoreData, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clll(this.b, this.c, this.d, fcxyVar);
    }
}
