package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsx extends fcyz implements fdat {
    final /* synthetic */ vvv a;
    final /* synthetic */ bpbj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsx(fcxy fcxyVar, vvv vvvVar, bpbj bpbjVar) {
        super(2, fcxyVar);
        this.a = vvvVar;
        this.b = bpbjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wsx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bpbj bpbjVar = this.b;
        bpbjVar.aA(5, "replied_to_message_id");
        String str = bpbjVar.f;
        CoreBugleMessageId coreBugleMessageId = str != null ? new CoreBugleMessageId(bary.b(str), -1L) : null;
        vvk vvkVar = (vvk) this.a;
        vvkVar.e = coreBugleMessageId;
        vvkVar.g = (short) (vvkVar.g | 16);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wsx wsxVar = new wsx(fcxyVar, this.a, this.b);
        wsxVar.c = obj;
        return wsxVar;
    }
}
