package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjm {
    public final fdjx a;
    public final ConversationId b;
    public final ctxf c;
    public final cudy d;
    public final ctpa e;
    public final eigp f;
    public final ctwi g;
    public final ctuu h;
    public final fcsu i;
    public final apvw j;
    public final ardr k;
    private final fcsu l;

    public ctjm(fdjx fdjxVar, ConversationId conversationId, ctxf ctxfVar, cudy cudyVar, ctpa ctpaVar, eigp eigpVar, ctwi ctwiVar, ctuu ctuuVar, fcsu fcsuVar, fcsu fcsuVar2, apvw apvwVar, ardr ardrVar) {
        fdjxVar.getClass();
        ctxfVar.getClass();
        cudyVar.getClass();
        ctpaVar.getClass();
        eigpVar.getClass();
        ctwiVar.getClass();
        ctuuVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ardrVar.getClass();
        this.a = fdjxVar;
        this.b = conversationId;
        this.c = ctxfVar;
        this.d = cudyVar;
        this.e = ctpaVar;
        this.f = eigpVar;
        this.g = ctwiVar;
        this.h = ctuuVar;
        this.l = fcsuVar;
        this.i = fcsuVar2;
        this.j = apvwVar;
        this.k = ardrVar;
    }

    public final fdae a(final ctrq ctrqVar) {
        return new ctje(this, 200L, new fdae() { // from class: ctjf
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                ctjm ctjmVar = this.a;
                eieh eiehVarA = ctjmVar.f.a("StartChat#doneClicked");
                try {
                    ConversationId conversationId = ctjmVar.b;
                    ctrq ctrqVar2 = ctrqVar;
                    if (conversationId == null || !ctjmVar.d.e().d.c() || (ctrqVar2.e() && !ctrqVar2.g())) {
                        ctjmVar.b(ctrqVar2);
                    } else {
                        if (ctjmVar.j.a()) {
                            ctjmVar.h.a();
                        }
                        auvw.k(ctjmVar.a, null, null, new ctjl(ctjmVar, ctrqVar2, null), 3);
                    }
                    fczl.a(eiehVarA, null);
                    return fctx.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(eiehVarA, th);
                        throw th2;
                    }
                }
            }
        });
    }

    public final void b(ctrq ctrqVar) {
        if (ctrqVar.g()) {
            if (this.j.a()) {
                this.h.a();
            }
            ctrqVar.d();
            return;
        }
        if (ctrqVar.f()) {
            aisq aisqVar = this.h.e;
            if (aisqVar != null) {
                aisqVar.b();
            }
            cudx cudxVarE = this.d.e();
            List list = cudxVarE.a;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChipData) it.next()).a);
            }
            cueh cuehVar = cudxVarE.d;
            if (cuehVar == cueh.c) {
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (arrayList.size() < 2) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (!cuehVar.a()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            if (arrayList.size() == 1) {
                auvw.k(this.a, null, null, new ctjh(this, arrayList, null), 3);
            } else {
                auvw.k(this.a, null, null, new ctji(this, arrayList, ctrqVar, null), 3);
            }
        }
    }

    public final fdae c(final ajou ajouVar, final int i, final cueh cuehVar, final boolean z, final ajpk ajpkVar) {
        return new ctje(this, 100L, new fdae() { // from class: ctjg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #0 {all -> 0x010b, blocks: (B:3:0x000c, B:7:0x001e, B:9:0x0041, B:13:0x004f, B:14:0x005c, B:16:0x0062, B:17:0x006e, B:19:0x0078, B:20:0x007f, B:24:0x0089, B:31:0x00be, B:33:0x00c4, B:34:0x00d0, B:37:0x00d6, B:39:0x00dc, B:40:0x00df, B:41:0x00eb, B:43:0x00f1, B:25:0x008c, B:26:0x0099, B:28:0x009f, B:29:0x00ab, B:30:0x00b6, B:8:0x0030, B:46:0x0103, B:47:0x010a), top: B:54:0x000c }] */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ctjg.invoke():java.lang.Object");
            }
        });
    }

    public final Object e() {
        return ((cuec) this.l.b()).a().c();
    }
}
