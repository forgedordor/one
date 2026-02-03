package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayr extends fcyz implements fdat {
    int a;
    final /* synthetic */ bays b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bayr(bays baysVar, MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = baysVar;
        this.c = messageCoreData;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bayr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bays baysVar = this.b;
        MessageCoreData messageCoreData = this.c;
        List list = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(baysVar.c), new bayq(null, baysVar, messageCoreData, list), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bayr(this.b, this.c, this.d, fcxyVar);
    }
}
