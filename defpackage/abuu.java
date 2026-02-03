package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abuu extends fcyz implements fdau {
    int a;
    final /* synthetic */ abvc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abuu(abvc abvcVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = abvcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        abuu abuuVar = new abuu(this.b, (fcxy) obj3);
        abuuVar.c = (abus) obj;
        return abuuVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj3 = this.c;
            abvc abvcVar = this.b;
            abus abusVar = (abus) obj3;
            MessageIdType messageIdTypeB = bary.b(abusVar.b);
            String str = abusVar.c;
            str.getClass();
            this.a = 1;
            Object objA = fdin.a(eicg.a(abvcVar.b), new abuy(null, abvcVar, messageIdTypeB, str), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return cbcw.i();
    }
}
