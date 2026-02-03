package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmi {
    private final crny a;
    private final cqjy b;
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final cssf f;
    private final cqjk g;
    private final fcsu h;
    private final cwme i;
    private final alrj j;
    private final eygg k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final bwdo o;

    public cwmi(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cssf cssfVar, crny crnyVar, bwdo bwdoVar, cqjy cqjyVar, cqjk cqjkVar, fcsu fcsuVar4, cwme cwmeVar, alrj alrjVar, eygg eyggVar, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.c = context;
        this.l = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = cssfVar;
        this.a = crnyVar;
        this.o = bwdoVar;
        this.b = cqjyVar;
        this.g = cqjkVar;
        this.h = fcsuVar4;
        this.i = cwmeVar;
        this.j = alrjVar;
        this.k = eyggVar;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
    }

    private final List b(bafo bafoVar, String str, boolean z, SelfIdentityId selfIdentityId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ParticipantsTable.BindData> it = bafoVar.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData next = it.next();
            if (!TextUtils.equals(next.R(), str) && (!bbdl.k(next) || (next.R().equals(aoet.b(selfIdentityId)) && z))) {
                String strP = this.j.q(next).p(true);
                if (!TextUtils.isEmpty(strP)) {
                    arrayList.add(strP);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(cwmd cwmdVar, final baea baeaVar, bafo bafoVar, long j, axcy axcyVar) {
        cmny cmnyVarT;
        List list;
        ecem.b();
        cwmdVar.c("\n\n");
        cwmdVar.c("DEBUG");
        cwmdVar.a('\n');
        cwmdVar.c("Message id: ");
        cwmdVar.c(baeaVar.r().b());
        cwmdVar.a('\n');
        cwmdVar.c("Rcs Message id: ");
        cwmdVar.c(baeaVar.t().b);
        cwmdVar.a('\n');
        cwmdVar.c("Xms Transport: ");
        cwmdVar.c(baeaVar.c.N().toString());
        cwmdVar.a('\n');
        cwmdVar.c("Web id: ");
        cwmdVar.c(baeaVar.I());
        cwmdVar.a('\n');
        cwmdVar.c("Cms id: ");
        cwmdVar.c(baeaVar.c.U());
        cwmdVar.a('\n');
        cwmdVar.c("CMS lifecycle: ");
        cwmdVar.c(baeaVar.c.P().toString());
        for (MessagePartCoreData messagePartCoreData : baeaVar.g) {
            cwmdVar.a('\n');
            cwmdVar.c("CMS Full size blob ID: ");
            cwmdVar.c(messagePartCoreData.P());
            cwmdVar.a('\n');
            cwmdVar.c("CMS Compressed blob ID: ");
            cwmdVar.c(messagePartCoreData.O());
        }
        cwmdVar.a('\n');
        cwmdVar.c("Status: ");
        cwmdVar.c(avbn.a(baeaVar.e()));
        cwmdVar.c(" (");
        cwmdVar.b(baeaVar.e());
        cwmdVar.c(")");
        cwmdVar.a('\n');
        cwmdVar.c("Result code: ");
        cwmdVar.b(baeaVar.c.p());
        cwmdVar.a('\n');
        cwmdVar.c("Error code: ");
        cwmdVar.b(baeaVar.d());
        cwmdVar.a('\n');
        cwmdVar.c("Content type: ");
        cwmdVar.c((String) Collection.EL.stream(baeaVar.g).map(new Function() { // from class: cwmh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String strR = ((MessagePartCoreData) obj).R();
                return strR == null ? "" : strR;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(",")));
        int iC = baeaVar.c();
        cwmdVar.a('\n');
        cwmdVar.c("Status code: ");
        cwmdVar.b(iC);
        String strX = baeaVar.c.X();
        if (!TextUtils.isEmpty(strX)) {
            cwmdVar.a('\n');
            cwmdVar.c("Error: ");
            cwmdVar.c(strX);
        }
        String strF = baeaVar.F();
        cwmdVar.a('\n');
        cwmdVar.c("Telephony uri: ");
        cwmdVar.c(strF);
        ConversationIdType conversationIdTypeQ = baeaVar.q();
        if (conversationIdTypeQ.b()) {
            return;
        }
        cwmdVar.a('\n');
        cwmdVar.c("Conversation id: ");
        cwmdVar.c(conversationIdTypeQ.a());
        cwmdVar.a('\n');
        cwmdVar.c("Conversation participants: [");
        Iterator<ParticipantsTable.BindData> it = bafoVar.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData next = it.next();
            if (!bbdl.k(next)) {
                cwmdVar.a(' ');
                cwmdVar.c(this.j.t(next).p(true));
            }
        }
        cwmdVar.c(" ]");
        cwmdVar.a('\n');
        cwmdVar.c("RCS Session id: ");
        cwmdVar.b(j);
        cwmdVar.a('\n');
        cwmdVar.a('\n');
        cwmdVar.c("RCS MSISDNs: [");
        Stream map = Collection.EL.stream(((cozg) this.l.b()).e()).map(new Function() { // from class: cwmg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aubq) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        cwmdVar.c(cwmf.a(", ", (ekgb) map.collect(ekcv.a)));
        cwmdVar.c("]");
        cwmdVar.a('\n');
        cwmdVar.a('\n');
        cwmdVar.c("RCS Group Id: ");
        cwmdVar.c(ejwk.b(baeaVar.y()));
        cwmdVar.a('\n');
        cwmdVar.a('\n');
        cwmdVar.c("Self participant number: ");
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getSelfParticipantSendDestination");
        bsboVarE.h(new Function() { // from class: badw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.k(ejwk.b(aoet.b(baeaVar.p())));
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzj brzjVar = (brzj) bsboVarE.b().q(ParticipantsTable.c.g);
        try {
            ekgb ekgbVarM = brzjVar.m();
            brzjVar.close();
            cwmdVar.c(((ekoe) ekgbVarM).c != 1 ? "" : (String) ekgbVarM.get(0));
            cwmdVar.a('\n');
            cnqj cnqjVarA = ((bxjh) this.d.b()).a(conversationIdTypeQ);
            cwmdVar.a('\n');
            cwmdVar.c("BCM: ".concat(String.valueOf(String.valueOf(avos.a.e()))));
            cwmdVar.a('\n');
            cwmdVar.c("Conversation telephony thread id: ");
            cwmdVar.c(cnqjVarA.toString());
            if (!baeaVar.ac()) {
                cmnyVarT = null;
            } else {
                if (strF == null || (cmnyVarT = ((cmqj) this.e.b()).t(Uri.parse(strF))) == null) {
                    return;
                }
                long j2 = cmnyVarT.i;
                cwmdVar.a('\n');
                cwmdVar.c("Telephony thread id: ");
                cwmdVar.b(j2);
                String str = cmnyVarT.n;
                cwmdVar.a('\n');
                cwmdVar.c("Content location URL: ");
                cwmdVar.c(str);
            }
            fcsu fcsuVar = this.e;
            String strD = ((cmqj) fcsuVar.b()).D(cnqjVarA);
            if (strD != null) {
                cwmdVar.a('\n');
                cwmdVar.c("Thread recipient ids: ");
                cwmdVar.c(strD);
                cwmdVar.a('\n');
                cwmdVar.c("Group canonical address: ");
                cwmdVar.c(baeaVar.y() != null ? ejwk.b(((csrx) this.m.b()).c(ejwk.b(((cmqj) fcsuVar.b()).z(Long.parseLong(strD))))) : "");
            }
            String strF2 = cmnyVarT != null ? cmnyVarT.a : baeaVar.F();
            if (strF2 != null) {
                cmtz cmtzVarX = ((cmqj) fcsuVar.b()).x(cmmo.a, cnqjVarA, strF2, Integer.valueOf(axcyVar.e()));
                cwmdVar.a('\n');
                cwmdVar.c("Thread recipients: ");
                cwmdVar.c(cmtzVarX.b.toString());
                if (cmnyVarT != null) {
                    String strA = ((cmqj) fcsuVar.b()).A(cmtzVarX, strF2);
                    if (true == TextUtils.isEmpty(strA)) {
                        strA = "ʼUNKNOWN_SENDER!ʼ";
                    }
                    cwmdVar.a('\n');
                    cwmdVar.c("Sender: ");
                    cwmdVar.d(strA);
                }
                cwmdVar.a('\n');
                cwmdVar.c("Logging id: ");
                cwmdVar.b(baeaVar.l());
            }
            if (baeaVar.Z()) {
                fcsu fcsuVar2 = this.n;
                Map mapB = ((baxl) fcsuVar2.b()).b(baeaVar.r());
                if (!mapB.keySet().isEmpty()) {
                    cwmdVar.a('\n');
                    cwmdVar.a('\n');
                    cwmdVar.c("-- Received Message Info --");
                    cwmdVar.a('\n');
                }
                for (bvds bvdsVar : bvds.values()) {
                    if (mapB.containsKey(bvdsVar) && (list = (List) mapB.get(bvdsVar)) != null && !list.isEmpty() && !((String) list.get(0)).isEmpty()) {
                        cwmdVar.c(bvdsVar.name());
                        cwmdVar.c(": ");
                        cwmdVar.c(cwmf.a(",", list));
                        cwmdVar.a('\n');
                    }
                }
                ekgb ekgbVarA = ((baxl) fcsuVar2.b()).a(baeaVar.r());
                if (ekgbVarA.isEmpty()) {
                    return;
                }
                baxj baxjVar = (baxj) ekgbVarA.get(0);
                cwmdVar.c("TRANSPORT_PROTOCOL: ");
                cwmdVar.c(baxjVar.a().name());
                cwmdVar.a('\n');
                String strS = this.a.h(axcyVar.e()).s();
                ekqg ekqgVarListIterator = baxjVar.b().keySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    String str2 = (String) ekqgVarListIterator.next();
                    String str3 = (String) baxjVar.b().get(str2);
                    if (str3 != null && !str3.isEmpty() && !ejuf.e(strS, str3) && !ejuf.e("auto", str3)) {
                        cwmdVar.c(String.valueOf(str2).concat(": "));
                        cwmdVar.c((String) baxjVar.b().get(str2));
                        cwmdVar.a('\n');
                    }
                }
            }
        } catch (Throwable th) {
            try {
                brzjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(android.content.res.Resources r21, defpackage.cwmd r22, defpackage.baea r23, defpackage.bafo r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwmi.d(android.content.res.Resources, cwmd, baea, bafo):void");
    }

    private final void e(Resources resources, axcy axcyVar, cwmd cwmdVar) {
        if (this.a.a() < 2) {
            return;
        }
        cwmdVar.a('\n');
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(R.string.sim_label));
        String strG = axcyVar.g();
        if (TextUtils.isEmpty(strG)) {
            sb.append(resources.getString(R.string.sim_slot_identifier, Integer.valueOf(axcyVar.c())));
        } else {
            sb.append(strG);
        }
        cssf cssfVar = this.f;
        String string = sb.toString();
        lbq lbqVar = lbu.b;
        if (cssfVar.e() && !TextUtils.isEmpty(string)) {
            lbo lboVarA = lbo.a();
            if (string.contains(":")) {
                String[] strArrSplit = string.split(":");
                for (int i = 0; i < strArrSplit.length; i++) {
                    strArrSplit[i] = lboVarA.c(strArrSplit[i], lbqVar);
                }
                string = new ejwc(":").f(strArrSplit);
            } else {
                string = lboVarA.c(string, lbqVar);
            }
        }
        cwmdVar.c(string);
    }

    private final void f(Resources resources, cwmd cwmdVar, int i, long j) {
        if (j != 0) {
            cwmdVar.a('\n');
            cwmdVar.c(resources.getString(i));
            cwmdVar.c(this.g.b(j).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[PHI: r12
      0x00c6: PHI (r12v2 cwmd) = (r12v1 cwmd), (r12v5 cwmd) binds: [B:70:0x021d, B:23:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v19, types: [alqm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.ui.conversation.message.MessageDetails a(defpackage.baea r17, defpackage.bafo r18, defpackage.axcy r19, long r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwmi.a(baea, bafo, axcy, long):com.google.android.apps.messaging.ui.conversation.message.MessageDetails");
    }
}
