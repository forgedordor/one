package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpk extends fcyz implements fdat {
    int a;
    final /* synthetic */ Conversation b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpk(fcxy fcxyVar, Conversation conversation) {
        super(2, fcxyVar);
        this.b = conversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.h().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aoer aoerVarH = ((ajlk) obj).h();
        if (aoerVarH != null) {
            return aoerVarH;
        }
        throw new IllegalArgumentException("Failed to retrieve selected conversation identity");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpk bwpkVar = new bwpk(fcxyVar, this.b);
        bwpkVar.c = obj;
        return bwpkVar;
    }
}
