package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atfh extends fcyz implements fdat {
    final /* synthetic */ atfx a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfh(fcxy fcxyVar, atfx atfxVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = atfxVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((baxe) this.a.d.b()).U(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atfh atfhVar = new atfh(fcxyVar, this.a, this.b);
        atfhVar.c = obj;
        return atfhVar;
    }
}
