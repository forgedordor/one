package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnw implements xno {
    public final ConversationId a;
    public final fcsu b;
    public final fcsu c;
    public final AtomicBoolean d;
    public final fdvc e;
    public final fdvc f;
    private final fdjx g;
    private final xoh h;
    private final aquo i;
    private final xoz j;
    private final xqj k;
    private final fctc l;
    private final xog m;

    public xnw(fdjx fdjxVar, ConversationId conversationId, xoh xohVar, aquo aquoVar, xoz xozVar, xqj xqjVar, xog xogVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdpl auxqVar;
        fdjxVar.getClass();
        conversationId.getClass();
        aquoVar.getClass();
        fcsuVar.getClass();
        this.g = fdjxVar;
        this.a = conversationId;
        this.h = xohVar;
        this.i = aquoVar;
        this.j = xozVar;
        this.k = xqjVar;
        this.m = xogVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = new AtomicBoolean(false);
        this.l = fctd.a(new fdae() { // from class: xnq
            @Override // defpackage.fdae
            public final Object invoke() {
                return (Optional) this.a.b.b();
            }
        });
        ejxr ejxrVar = crvx.a;
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            auxqVar = new auxq(new fdae() { // from class: xnt
                @Override // defpackage.fdae
                public final Object invoke() {
                    return null;
                }
            });
        } else {
            xoy xoyVar = (xoy) xohVar;
            String string = xoyVar.b.getString(R.string.unwanted_messages_toolstone_link);
            string.getClass();
            String string2 = xoyVar.b.getString(R.string.unwanted_messages_toolstone_text, string);
            string2.getClass();
            auxqVar = fdtg.b(new fdua(fdud.a(xoyVar.k, xoyVar.h, xoyVar.m, new xoo(string2, string, xoyVar, null)), new fdtm(new xok(xoyVar.l), new xoq(xoyVar, null)), new xol(null)), xoyVar.c, fdur.a, null);
        }
        fdpl fdplVarB = fdud.b(auxqVar, ((xph) xozVar).h, ((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() ? ((xqu) xqjVar).j : new auxq(new fdae() { // from class: xnp
            @Override // defpackage.fdae
            public final Object invoke() {
                return null;
            }
        }), aquoVar.a() ? fdtg.b(new xoa(xogVar.f, xogVar), xogVar.b, fdur.a, null) : new auxq(new fdae() { // from class: xns
            @Override // defpackage.fdae
            public final Object invoke() {
                return null;
            }
        }), new xnv(null));
        fdus fdusVar = fdur.a;
        fdvc fdvcVarB = fdtg.b(fdplVarB, fdjxVar, fdusVar, null);
        this.e = fdvcVarB;
        this.f = fdtg.b(new fdua(fdvcVarB, (((Boolean) ((cczi) crbf.by.get()).e()).booleanValue() && a().isPresent()) ? ((xpo) a().get()).a() : new auxq(new fdae() { // from class: xnr
            @Override // defpackage.fdae
            public final Object invoke() {
                return null;
            }
        }), new xnu(this, null)), fdjxVar, fdusVar, null);
    }

    private final Optional a() {
        return (Optional) this.l.a();
    }
}
