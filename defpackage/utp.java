package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utp implements utj {
    public final cith a;
    public final fcsu b;
    private final eosc c;
    private final fcsu d;
    private final fcsu e;

    public utp(cith cithVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = cithVar;
        this.c = eoscVar;
        this.b = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    @Override // defpackage.utj
    public final void a(final ConversationIdType conversationIdType, anue anueVar) {
        cifw cifwVar = (cifw) this.b.b();
        final auib auibVarA = cifwVar.a();
        cifw.v(cifwVar, 18, 0, null, auibVarA, null, null, 0, null, null, 502);
        final citf citfVar = (citf) citg.a.createBuilder();
        citfVar.copyOnWrite();
        citg citgVar = (citg) citfVar.instance;
        citgVar.f = auibVarA;
        citgVar.b |= 2;
        String strA = conversationIdType.a();
        citfVar.copyOnWrite();
        citg citgVar2 = (citg) citfVar.instance;
        strA.getClass();
        citgVar2.c = strA;
        citfVar.copyOnWrite();
        citg citgVar3 = (citg) citfVar.instance;
        String str = anueVar.a;
        str.getClass();
        citgVar3.e = str;
        chtk chtkVar = (chtk) this.d.b();
        eiju eijuVarC = auvw.c(chtkVar.e, fcyi.a, fdjz.a, new chti(chtkVar, conversationIdType, null));
        if (((ardu) this.e.b()).a()) {
            eijuVarC = eijuVarC.e(RuntimeException.class, new ejvr() { // from class: utn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    RuntimeException runtimeException = (RuntimeException) obj;
                    ((cifw) this.a.b.b()).s(auibVarA, 29, cbqz.a);
                    throw runtimeException;
                }
            }, this.c);
        }
        ejvr ejvrVar = new ejvr() { // from class: uto
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                citf citfVar2 = citfVar;
                aubq aubqVar = (aubq) obj;
                citfVar2.copyOnWrite();
                citg citgVar4 = (citg) citfVar2.instance;
                citg citgVar5 = citg.a;
                aubqVar.getClass();
                citgVar4.d = aubqVar;
                citgVar4.b |= 1;
                return (citg) citfVar2.build();
            }
        };
        eosc eoscVar = this.c;
        eijuVarC.h(ejvrVar, eoscVar).i(new eooz() { // from class: utk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                caxr caxrVar = new caxr();
                caxrVar.a = conversationIdType.a();
                return ((cazj) this.a.a.a.b()).b(cbcu.g("remove_members_from_rcs_conversation", (citg) obj, caxrVar.a()));
            }
        }, eoscVar).i(new eooz() { // from class: utl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cazi) obj).a();
            }
        }, eoscVar).h(new ejvr() { // from class: utm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cbcw) obj).e());
            }
        }, eoscVar);
    }
}
