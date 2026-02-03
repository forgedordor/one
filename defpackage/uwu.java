package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwu extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ uwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwu(uwy uwyVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = uwyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        uwu uwuVar = new uwu(this.c, (fcxy) obj3);
        uwuVar.a = zBooleanValue;
        uwuVar.b = (uwq) obj2;
        return uwuVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (z) {
            uwy uwyVar = this.c;
            if (!(uwyVar.b instanceof PenpalBotConversationId)) {
                int iOrdinal = ((uwq) obj2).ordinal();
                if (iOrdinal == 0) {
                    if (((Boolean) crbf.bm.e()).booleanValue() && !((aqab) uwyVar.a.b()).a()) {
                        return ekgb.r(new uws());
                    }
                    int i = ekgb.d;
                    return ekoe.a;
                }
                if (iOrdinal != 2) {
                    int i2 = ekgb.d;
                    return ekoe.a;
                }
                if (((Boolean) crbf.bl.e()).booleanValue()) {
                    return ekgb.r(new uwt());
                }
                int i3 = ekgb.d;
                return ekoe.a;
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }
}
