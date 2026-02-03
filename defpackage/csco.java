package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csco extends fcyz implements fdat {
    final /* synthetic */ cscs a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csco(fcxy fcxyVar, cscs cscsVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = cscsVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        axcy axcyVarE = ((bbdl) this.a.g.b()).e(this.b.v());
        if (axcyVarE != null) {
            return (alqm) fdct.b(axcyVarE.b());
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csco cscoVar = new csco(fcxyVar, this.a, this.b);
        cscoVar.c = obj;
        return cscoVar;
    }
}
