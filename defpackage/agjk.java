package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjk extends fcyz implements fdat {
    int a;
    final /* synthetic */ agjl b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cgra e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjk(fcxy fcxyVar, agjl agjlVar, ConversationId conversationId, boolean z, cgra cgraVar) {
        super(2, fcxyVar);
        this.b = agjlVar;
        this.c = conversationId;
        this.d = z;
        this.e = cgraVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agjk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        UnsupportedOperationException e;
        boolean zBooleanValue;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                eiju eijuVarT = ((ajln) this.b.b.b()).t(this.c, this.d ? cgrc.d : cgrc.e, this.e);
                eijuVarT.getClass();
                this.a = 1;
                obj = fdxs.c(eijuVarT, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            obj.getClass();
            zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                ((aghz) this.b.e.b()).e(agia.a(this.e), this.d);
            } catch (UnsupportedOperationException e2) {
                e = e2;
                ((eksl) ((eksl) agjl.a.i()).g(e)).q("Failed to snooze conversation, exception thrown");
                return Boolean.valueOf(zBooleanValue);
            }
        } catch (UnsupportedOperationException e3) {
            e = e3;
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agjk agjkVar = new agjk(fcxyVar, this.b, this.c, this.d, this.e);
        agjkVar.f = obj;
        return agjkVar;
    }
}
