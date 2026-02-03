package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhw extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public vhw(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vhw vhwVar = new vhw((fcxy) obj3);
        vhwVar.a = (Recipient) obj;
        vhwVar.b = (cwen) obj2;
        return vhwVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (obj2 == null || obj3 == cwen.a) {
            return null;
        }
        return obj2;
    }
}
