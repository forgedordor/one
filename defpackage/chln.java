package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chln extends fcyz implements fdat {
    int a;
    final /* synthetic */ ResolvedRecipient b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chln(fcxy fcxyVar, ResolvedRecipient resolvedRecipient) {
        super(2, fcxyVar);
        this.b = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chln) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        antr antrVarK = this.b.k();
        this.a = 1;
        Object objA = antrVarK.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chln chlnVar = new chln(fcxyVar, this.b);
        chlnVar.c = obj;
        return chlnVar;
    }
}
