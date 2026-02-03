package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athr extends fcyz implements fdat {
    final /* synthetic */ Action a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public athr(fcxy fcxyVar, Action action) {
        super(2, fcxyVar);
        this.a = action;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((athr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.s();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        athr athrVar = new athr(fcxyVar, this.a);
        athrVar.b = obj;
        return athrVar;
    }
}
