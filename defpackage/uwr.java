package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwr extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ uwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwr(uwy uwyVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = uwyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        uwr uwrVar = new uwr(this.c, (fcxy) obj3);
        uwrVar.a = zBooleanValue;
        uwrVar.b = (uwq) obj2;
        return uwrVar.b(fctx.a);
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
                    if (!((Boolean) crbf.bm.e()).booleanValue() || ((aqab) uwyVar.a.b()).a()) {
                        int i = ekgb.d;
                        return ekoe.a;
                    }
                    ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                    ezghVar.getClass();
                    ezej ezejVar = (ezej) ezel.a.createBuilder();
                    ezejVar.getClass();
                    eyyf.b(3, ezejVar);
                    ezau.b(eyyf.a(ezejVar), ezghVar);
                    ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                    ezgfVar.getClass();
                    ezat.b(ezan.OPEN_MAGIC_COMPOSE, ezgfVar);
                    ezau.c(ezat.a(ezgfVar), ezghVar);
                    return ekgb.r(new SmartSuggestionItemSuggestionData(ezau.a(ezghVar)));
                }
                if (iOrdinal != 2) {
                    int i2 = ekgb.d;
                    return ekoe.a;
                }
                if (!((Boolean) crbf.bl.e()).booleanValue()) {
                    int i3 = ekgb.d;
                    return ekoe.a;
                }
                ezgh ezghVar2 = (ezgh) ezgi.a.createBuilder();
                ezghVar2.getClass();
                ezej ezejVar2 = (ezej) ezel.a.createBuilder();
                ezejVar2.getClass();
                eyyf.b(4, ezejVar2);
                ezau.b(eyyf.a(ezejVar2), ezghVar2);
                ezgf ezgfVar2 = (ezgf) ezgg.b.createBuilder();
                ezgfVar2.getClass();
                ezat.b(ezan.OPEN_MAGIC_COMPOSE, ezgfVar2);
                ezau.c(ezat.a(ezgfVar2), ezghVar2);
                return ekgb.r(new SmartSuggestionItemSuggestionData(ezau.a(ezghVar2)));
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }
}
