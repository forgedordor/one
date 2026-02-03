package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athq extends fcyz implements fdat {
    final /* synthetic */ athv a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public athq(fcxy fcxyVar, athv athvVar, MessageCoreData messageCoreData, boolean z) {
        super(2, fcxyVar);
        this.a = athvVar;
        this.b = messageCoreData;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((athq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessageCoreData messageCoreData = this.b;
        if (!this.c) {
            messageCoreData.ce(messageCoreData.A(), messageCoreData.u(), messageCoreData.o());
        }
        return this.a.a.e(messageCoreData, 2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        athq athqVar = new athq(fcxyVar, this.a, this.b, this.c);
        athqVar.d = obj;
        return athqVar;
    }
}
