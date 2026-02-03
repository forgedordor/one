package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vpm extends fcyz implements fdat {
    final /* synthetic */ vpp a;
    final /* synthetic */ anub b;
    final /* synthetic */ vpe c;
    final /* synthetic */ ConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpm(vpp vppVar, anub anubVar, vpe vpeVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vppVar;
        this.b = anubVar;
        this.c = vpeVar;
        this.d = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vpm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        vpp vppVar = this.a;
        afzc afzcVar = (afzc) vppVar.h.b();
        anub anubVar = this.b;
        long j = anubVar.c;
        String str = anubVar.d;
        str.getClass();
        vpe vpeVar = this.c;
        afzcVar.h(new agcb(j, str, vpeVar.d));
        final eocq eocqVar = vpeVar.c;
        final cszj cszjVar = vppVar.f;
        final ConversationId conversationId = this.d;
        cszjVar.a(new Supplier() { // from class: cszg
            @Override // java.util.function.Supplier
            public final Object get() {
                eoco eocoVar = (eoco) eocr.a.createBuilder();
                eocoVar.copyOnWrite();
                eocr eocrVar = (eocr) eocoVar.instance;
                eocrVar.d = eocp.a(4);
                eocrVar.b |= 2;
                eocoVar.a(eocqVar);
                long jA = cszjVar.a.a(conversationId);
                eocoVar.copyOnWrite();
                eocr eocrVar2 = (eocr) eocoVar.instance;
                eocrVar2.b |= 1;
                eocrVar2.c = jA;
                return (eocr) eocoVar.build();
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vpm(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
