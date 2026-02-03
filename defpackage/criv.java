package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class criv extends fcyz implements fdat {
    final /* synthetic */ ezaj a;
    final /* synthetic */ criz b;
    final /* synthetic */ String c;
    final /* synthetic */ ConversationIdType d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public criv(fcxy fcxyVar, ezaj ezajVar, criz crizVar, String str, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = ezajVar;
        this.b = crizVar;
        this.c = str;
        this.d = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((criv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#updateSmartSuggestionConsumptionState");
        try {
            String[] strArr = brnk.a;
            brnc brncVar = new brnc();
            brncVar.ap("updateSmartSuggestionConsumptionStateFuture");
            brncVar.am();
            ezaj ezajVar = this.a;
            int iIntValue = brnk.c().intValue();
            int iIntValue2 = brnk.c().intValue();
            if (iIntValue2 < 53080) {
                dqru.x("consumption_state", iIntValue2);
            }
            if (iIntValue >= 53080) {
                if (ezajVar == null) {
                    brncVar.a.putNull("consumption_state");
                } else {
                    brncVar.a.put("consumption_state", Integer.valueOf(ezajVar.a()));
                }
            }
            String str = this.c;
            brncVar.c(new crix(str));
            if (brncVar.b().e() > 0 && ((Boolean) ((cczi) cwtn.a.get()).e()).booleanValue()) {
                criz crizVar = this.b;
                Optional optionalD = crizVar.d(str);
                final criw criwVar = new criw(crizVar, this.d);
                optionalD.ifPresent(new Consumer() { // from class: criu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final /* synthetic */ void z(Object obj2) {
                        criwVar.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        criv crivVar = new criv(fcxyVar, this.a, this.b, this.c, this.d);
        crivVar.e = obj;
        return crivVar;
    }
}
