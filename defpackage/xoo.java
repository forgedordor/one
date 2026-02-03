package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xoo extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ xoy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoo(String str, String str2, xoy xoyVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.c = str;
        this.d = str2;
        this.e = xoyVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        xoo xooVar = new xoo(this.c, this.d, this.e, (fcxy) obj4);
        xooVar.a = (ResolvedRecipient) obj;
        xooVar.b = zBooleanValue;
        return xooVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final ?? r11 = this.a;
        if (!this.b) {
            return null;
        }
        String str = this.c;
        String str2 = this.d;
        final xoy xoyVar = this.e;
        return new dlls("RbmToolstoneId", str, djrr.bF, fcva.b(new diin(dijs.h, str.length() - str2.length(), str.length(), str, new fdap() { // from class: xom
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ResolvedRecipient resolvedRecipient = r11;
                xoy xoyVar2 = xoyVar;
                xoyVar2.n.a(new tlk(resolvedRecipient, xoyVar2.g, 4, 9));
                auvw.k(xoyVar2.e, null, null, new xos(xoyVar2, null), 3);
                return true;
            }
        })), new xon(xoyVar));
    }
}
