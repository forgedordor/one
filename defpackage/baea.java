package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baea implements bajc, bazb {
    private final fcsu A;
    private final byen B;
    private byem C;
    private boolean D;
    private boolean E;
    private final byed F;
    private final bwfx G;
    public bfsb a;
    public bdxm b;
    public MessagesTable.BindData c;
    public ParticipantsTable.BindData d;
    public buzr e;
    public ahqh f;
    public List g;
    public List h;
    public List i;
    public long j;
    public final ParticipantColor k;
    public final cpbn l;
    public final alrj m;
    public Optional n;
    public int o;
    public boolean p;
    public boolean q;
    public cklv r;
    public boolean s;
    public cgvx t;
    public String u;
    public RepliedToDataAdapter v;
    public cmcw w;
    private final bahv x;
    private final baui y;
    private final bvur z;

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar) {
        this.o = 0;
        this.l = cpbnVar;
        this.x = bahvVar;
        this.y = bauiVar;
        this.z = bvurVar;
        this.G = bwfxVar;
        this.m = alrjVar;
        this.A = fcsuVar;
        this.B = byenVar;
        this.C = byenVar.a(bary.a, basd.a);
        this.F = byedVar;
        this.k = new ParticipantColor();
        this.n = Optional.empty();
        String[] strArr = bgvl.a;
        this.a = new bfsd().a();
        String[] strArr2 = MessagesTable.a;
        this.c = new bquv().a();
        String[] strArr3 = ParticipantsTable.a;
        this.d = new brvq().a();
    }

    private final List aA(bgvb bgvbVar) {
        return az((bfsb) bgvbVar.cQ());
    }

    private final List aB(PartsTable.BindData[] bindDataArr) {
        ArrayList arrayList = new ArrayList();
        for (PartsTable.BindData bindData : bindDataArr) {
            arrayList.add(this.x.e(bindData));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahqo] */
    private final void aC(final bdxm bdxmVar) {
        aH();
        this.b = bdxmVar;
        this.c = bdxmVar.cK;
        O();
        this.d = bdxmVar.bk;
        this.e = bdxmVar.bU;
        ahqf ahqoVar = null;
        if (!bdxmVar.co.E().c()) {
            eksp ekspVar = ahqi.a;
            bdxmVar.getClass();
            if (bdxmVar.co.E().c()) {
                ahqoVar = ahqf.a;
            } else {
                MessageIdType messageIdTypeE = bdxmVar.co.E();
                messageIdTypeE.getClass();
                MessagesTable.BindData bindData = bdxmVar.co;
                bindData.getClass();
                ParticipantsTable.BindData bindData2 = bdxmVar.cv;
                bindData2.getClass();
                ahqoVar = new ahqo(messageIdTypeE, bindData, bindData2, fcva.b(bdxmVar.cB), bdxmVar.cH.s() != null ? bdxmVar.cH : null);
            }
        }
        this.f = ahqoVar;
        this.g = ax(bdxmVar);
        Stream map = DesugarArrays.stream(bdxmVar.bs).map(new Function() { // from class: badu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btai btaiVar = (btai) obj;
                return new badz(String.valueOf(btaiVar.k()), btaiVar.n(), btaiVar.m(), btaiVar.q());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        this.h = (List) map.collect(collector);
        this.i = (List) IntStream.CC.range(0, bdxmVar.bF.length).mapToObj(new IntFunction() { // from class: badv
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                bdxm bdxmVar2 = bdxmVar;
                buxp buxpVar = bdxmVar2.by[i2];
                ParticipantsTable.BindData bindData3 = bdxmVar2.bF[i2];
                if (i2 >= 0) {
                    String[] strArr = bdxmVar2.K;
                    if (i2 < strArr.length) {
                        String str = strArr[i2];
                        String[] strArr2 = bdxmVar2.L;
                        if (i2 >= strArr2.length) {
                            throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(bdxmVar2.L.length)));
                        }
                        String str2 = strArr2[i2];
                        String[] strArr3 = bdxmVar2.M;
                        if (i2 >= strArr3.length) {
                            throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(bdxmVar2.M.length)));
                        }
                        baea baeaVar = this.a;
                        return new bajt(buxpVar.k(), str, bindData3.p() == 3, baeaVar.l.e(bajt.d(str2), strArr3[i2], baeaVar.m.n(ejwk.b(bindData3.T())), bajt.e(bindData3)), buxpVar.m());
                    }
                }
                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(bdxmVar2.K.length)));
            }
        }).collect(collector);
        bpvd bpvdVar = bdxmVar.bQ;
        if (bpvdVar.s() != null && bpvdVar.k() > 0) {
            this.n = Optional.of(bdxmVar.bQ);
        }
        bdxmVar.aA(151, "reactions_data");
        this.r = bdxmVar.cc;
        bdxmVar.aA(153, "message_id");
        this.s = !bdxmVar.ce.c();
        if (((Boolean) cgwx.a.e()).booleanValue()) {
            bdxmVar.aA(154, "sharing_state");
            this.t = bdxmVar.cf;
        }
        bdxmVar.aA(179, "caption");
        this.u = bdxmVar.cJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ahqo] */
    private final void aD(bfsb bfsbVar) {
        ParticipantColor participantColor;
        aH();
        ahqf ahqoVar = null;
        this.b = null;
        this.a = bfsbVar;
        this.c = bfsbVar.cH;
        O();
        this.d = bfsbVar.bg;
        this.e = bfsbVar.bR;
        if (!bfsbVar.cE.f().c()) {
            bjqs bjqsVar = bfsbVar.cE;
            eksp ekspVar = ahqi.a;
            bjqsVar.getClass();
            if (bjqsVar.f().c()) {
                throw new IllegalArgumentException("toRepliesQueryResult invoked on MessageRepliesView with empty messageId");
            }
            if (bjqsVar.d.E().c()) {
                ahqoVar = ahqf.a;
            } else {
                MessageIdType messageIdTypeE = bjqsVar.d.E();
                messageIdTypeE.getClass();
                MessagesTable.BindData bindData = bjqsVar.d;
                bindData.getClass();
                ParticipantsTable.BindData bindData2 = bjqsVar.k;
                bindData2.getClass();
                PartsTable.BindData[] bindDataArr = bjqsVar.s;
                bindDataArr.getClass();
                ahqoVar = new ahqo(messageIdTypeE, bindData, bindData2, fcur.M(bindDataArr), bjqsVar.y.s() != null ? bjqsVar.y : null);
            }
        }
        this.f = ahqoVar;
        this.g = az(bfsbVar);
        this.h = new ArrayList();
        bkva bkvaVar = bfsbVar.bo;
        if (bkvaVar.f() != null) {
            for (int i = 0; i < bkvaVar.f().length; i++) {
                List list = this.h;
                long[] jArr = bkvaVar.c;
                if (i >= jArr.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bkvaVar.c.length)));
                }
                String strValueOf = String.valueOf(jArr[i]);
                long[] jArr2 = bkvaVar.d;
                if (i >= jArr2.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bkvaVar.d.length)));
                }
                long j = jArr2[i];
                long[] jArr3 = bkvaVar.e;
                if (i >= jArr3.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bkvaVar.e.length)));
                }
                long j2 = jArr3[i];
                Optional[] optionalArr = bkvaVar.f;
                if (i >= optionalArr.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(bkvaVar.f.length)));
                }
                list.add(new badz(strValueOf, j, j2, optionalArr[i]));
            }
        }
        ?? r16 = 0;
        this.i = new ArrayList();
        busr busrVar = bfsbVar.bC;
        if (busrVar.f() != null) {
            int length = busrVar.f().length;
            int i2 = 0;
            while (i2 < length) {
                List list2 = this.i;
                long[] jArr4 = busrVar.b;
                if (i2 >= jArr4.length) {
                    Integer numValueOf = Integer.valueOf(i2);
                    Integer numValueOf2 = Integer.valueOf(busrVar.b.length);
                    Object[] objArr = new Object[2];
                    objArr[r16] = numValueOf;
                    objArr[1] = numValueOf2;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr));
                }
                long j3 = jArr4[i2];
                String[] strArr = busrVar.e;
                if (i2 >= strArr.length) {
                    Integer numValueOf3 = Integer.valueOf(i2);
                    Integer numValueOf4 = Integer.valueOf(busrVar.e.length);
                    Object[] objArr2 = new Object[2];
                    objArr2[r16] = numValueOf3;
                    objArr2[1] = numValueOf4;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr2));
                }
                String str = strArr[i2];
                boolean z = this.d.p() == 3 ? true : r16;
                cpbn cpbnVar = this.l;
                String[] strArr2 = busrVar.f;
                if (i2 >= strArr2.length) {
                    Integer numValueOf5 = Integer.valueOf(i2);
                    Integer numValueOf6 = Integer.valueOf(busrVar.f.length);
                    Object[] objArr3 = new Object[2];
                    objArr3[r16] = numValueOf5;
                    objArr3[1] = numValueOf6;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr3));
                }
                Uri uriD = bajt.d(strArr2[i2]);
                String[] strArr3 = busrVar.g;
                if (i2 >= strArr3.length) {
                    Integer numValueOf7 = Integer.valueOf(i2);
                    Integer numValueOf8 = Integer.valueOf(busrVar.g.length);
                    Object[] objArr4 = new Object[2];
                    objArr4[r16] = numValueOf7;
                    objArr4[1] = numValueOf8;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr4));
                }
                String strH = bajt.h(strArr3[i2]);
                alrj alrjVar = this.m;
                String[] strArr4 = busrVar.i;
                if (i2 >= strArr4.length) {
                    Integer numValueOf9 = Integer.valueOf(i2);
                    Integer numValueOf10 = Integer.valueOf(busrVar.i.length);
                    Object[] objArr5 = new Object[2];
                    objArr5[r16] = numValueOf9;
                    objArr5[1] = numValueOf10;
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", objArr5));
                }
                alqm alqmVarN = alrjVar.n(strArr4[i2]);
                busrVar.aA(9, "color_palette_index");
                int i3 = busrVar.j[i2];
                busrVar.aA(10, "color_type");
                int i4 = busrVar.k[i2];
                if (i4 == 1) {
                    participantColor = new ParticipantColor(1, i3, 0);
                } else if (i4 != 2) {
                    int i5 = r16;
                    participantColor = new ParticipantColor(i5, i3, i5);
                } else {
                    busrVar.aA(11, "extended_color");
                    participantColor = new ParticipantColor(2, -1, busrVar.l[i2]);
                }
                Uri uriE = cpbnVar.e(uriD, strH, alqmVarN, participantColor);
                long[] jArr5 = busrVar.c;
                if (i2 >= jArr5.length) {
                    throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i2), Integer.valueOf(busrVar.c.length)));
                }
                list2.add(new bajt(j3, str, z, uriE, jArr5[i2]));
                i2++;
                r16 = 0;
            }
        }
        bpvd bpvdVar = bfsbVar.bN;
        if (bpvdVar.s() != null && bpvdVar.k() > 0) {
            this.n = Optional.of(bfsbVar.bN);
        }
        bfsbVar.aA(149, "reactions_data");
        this.r = bfsbVar.bZ;
        bfsbVar.aA(151, "message_id");
        this.s = !bfsbVar.cb.c();
        if (((Boolean) cgwx.a.e()).booleanValue()) {
            bfsbVar.aA(152, "sharing_state");
            this.t = bfsbVar.cc;
        }
        bfsbVar.aA(180, "caption");
        this.u = bfsbVar.cG;
    }

    private final void aE(bfrj bfrjVar, boolean z) {
        aC((bdxm) bfrjVar.cQ());
        this.c.getClass();
        if (!z) {
            if (bfrjVar.isFirst()) {
                this.D = false;
                this.q = true;
            } else if (bfrjVar.moveToPrevious()) {
                this.D = aJ(bfrjVar, true);
                this.E = aL(bfrjVar);
                this.q = Math.abs(h() - bfrjVar.f()) >= 3600000;
                bfrjVar.moveToNext();
            } else {
                this.D = false;
                this.q = false;
            }
            if (bfrjVar.isLast() || !bfrjVar.moveToNext()) {
                this.p = false;
            } else {
                this.p = aJ(bfrjVar, false);
                bfrjVar.moveToPrevious();
            }
        }
        int i = bfsa.a;
        if (admg.a()) {
            ejwl.b(bfrjVar.dk("label_subquery_expression"), "ConversationMessagesQueries#getLabel: Conversation Labels enabled, but query did not include label expression");
            try {
                SuperSortLabel.a(Integer.parseInt(bfrjVar.de("label_subquery_expression")));
            } catch (NumberFormatException unused) {
                SuperSortLabel superSortLabel = SuperSortLabel.UNKNOWN;
            }
        } else {
            SuperSortLabel superSortLabel2 = SuperSortLabel.UNKNOWN;
        }
        if (admg.a() && admg.b()) {
            ejwl.b(bfrjVar.dk("intent_subquery_expression"), "ConversationMessagesQueries#getIntent: Conversation Labels enabled, but query did not include intent expression");
            bfrjVar.de("intent_subquery_expression");
        }
        this.s = !bfrjVar.i().c();
    }

    private final void aF(bgvb bgvbVar, boolean z) {
        aD((bfsb) bgvbVar.cQ());
        if (!z) {
            if (bgvbVar.isFirst()) {
                this.D = false;
                this.q = true;
            } else if (bgvbVar.moveToPrevious()) {
                this.D = aK(bgvbVar, true);
                this.E = aM(bgvbVar);
                this.q = Math.abs(h() - bgvbVar.g()) >= 3600000;
                bgvbVar.moveToNext();
            } else {
                this.D = false;
                this.q = false;
            }
            if (bgvbVar.isLast() || !bgvbVar.moveToNext()) {
                this.p = false;
            } else {
                this.p = aK(bgvbVar, false);
                bgvbVar.moveToPrevious();
            }
        }
        int i = bfsa.a;
        if (admg.a()) {
            ejwl.b(bgvbVar.dk("label_subquery_expression"), "ConversationMessagesQueries#getLabel: Conversation Labels enabled, but query did not include label expression");
            try {
                SuperSortLabel.a(Integer.parseInt(bgvbVar.de("label_subquery_expression")));
            } catch (NumberFormatException unused) {
                SuperSortLabel superSortLabel = SuperSortLabel.UNKNOWN;
            }
        } else {
            SuperSortLabel superSortLabel2 = SuperSortLabel.UNKNOWN;
        }
        if (admg.a() && admg.b()) {
            ejwl.b(bgvbVar.dk("intent_subquery_expression"), "ConversationMessagesQueries#getIntent: Conversation Labels enabled, but query did not include intent expression");
            bgvbVar.de("intent_subquery_expression");
        }
        this.s = !bgvbVar.l().c();
    }

    private static void aG(VmtTable.BindData[] bindDataArr, List list) {
        ekgp ekgpVar = (ekgp) DesugarArrays.stream(bindDataArr).collect(ekcv.a(new Function() { // from class: badx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((VmtTable.BindData) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (ekgpVar.containsKey(messagePartCoreData.W())) {
                messagePartCoreData.aK((VmtTable.BindData) ekgpVar.get(messagePartCoreData.W()));
            }
        }
    }

    private final void aH() {
        this.j = 0L;
        this.D = false;
        this.p = false;
        this.q = false;
        this.n = Optional.empty();
        this.r = null;
        this.v = null;
        String[] strArr = MessagesTable.a;
        this.c = new bquv().a();
        String[] strArr2 = ParticipantsTable.a;
        this.d = new brvq().a();
    }

    private final boolean aI(baea baeaVar, boolean z) {
        if (TextUtils.equals(this.c.aa(), baeaVar.c.aa()) && Z() == baeaVar.Z() && !aq() && !byed.g(baeaVar.e()) && Math.abs(h() - baeaVar.h()) <= 60000 && TextUtils.equals(aoet.b(p()), aoet.b(baeaVar.p())) && !W() && !baeaVar.W() && u() == baeaVar.u()) {
            return (z && baha.a(baeaVar)) ? false : true;
        }
        return false;
    }

    private final boolean aJ(bfrj bfrjVar, boolean z) {
        if (!TextUtils.equals(this.c.aa(), bfrjVar.m())) {
            return false;
        }
        int iD = bfrjVar.d();
        if (Z() != (iD >= 100) || aq() || byed.g(iD) || Math.abs(h() - bfrjVar.e()) > 60000) {
            return false;
        }
        if (TextUtils.equals(aoet.b(p()), bfrjVar.l()) && !W()) {
            int iC = bfrjVar.c();
            if (!aO(bfrjVar) || !ai(iC) || !MessagePartData.by(ay(bfrjVar))) {
                int iC2 = bfrjVar.c();
                if (!(aO(bfrjVar) && ai(iC2) && MessagePartData.bz(ay(bfrjVar))) && u() == bfrjVar.j()) {
                    return !(z && aL(bfrjVar)) && bfrjVar.h().c();
                }
                return false;
            }
        }
        return false;
    }

    private final boolean aK(bgvb bgvbVar, boolean z) {
        if (!TextUtils.equals(this.c.aa(), bgvbVar.r())) {
            return false;
        }
        int iE = bgvbVar.e();
        if (Z() != (iE >= 100) || aq() || byed.g(iE) || Math.abs(h() - bgvbVar.f()) > 60000) {
            return false;
        }
        if (TextUtils.equals(aoet.b(p()), bgvbVar.q()) && !W()) {
            int iC = bgvbVar.c();
            if (!ab(bgvbVar) || !ai(iC) || !MessagePartData.by(aA(bgvbVar))) {
                int iC2 = bgvbVar.c();
                if (!(ab(bgvbVar) && ai(iC2) && MessagePartData.bz(aA(bgvbVar))) && u() == bgvbVar.m()) {
                    return !(z && aM(bgvbVar)) && bgvbVar.k().c();
                }
                return false;
            }
        }
        return false;
    }

    private static boolean aL(bfrj bfrjVar) {
        return aN(bfrjVar.k()) || bfrjVar.i().a > 0;
    }

    private static boolean aM(bgvb bgvbVar) {
        return aN(bgvbVar.n()) || bgvbVar.l().a > 0;
    }

    private static boolean aN(cklv cklvVar) {
        return (cklvVar == null || cklvVar.b.isEmpty()) ? false : true;
    }

    private static boolean aO(bfrj bfrjVar) {
        return aa(bfrjVar.d());
    }

    public static boolean aa(int i) {
        return i >= 100 && i <= 117;
    }

    public static boolean ab(bgvb bgvbVar) {
        return aa(bgvbVar.e());
    }

    public static boolean ai(int i) {
        return i == 3;
    }

    private final String aw(Context context) {
        StringBuilder sb = null;
        String string = null;
        boolean z = false;
        String strS = null;
        for (MessagePartCoreData messagePartCoreData : this.g) {
            if (messagePartCoreData.aV()) {
                if (z) {
                    if (sb == null) {
                        sb = new StringBuilder();
                        if (!TextUtils.isEmpty(strS)) {
                            sb.append(strS);
                        }
                        string = W() ? context.getResources().getString(R.string.notification_dash_separator) : " ";
                    }
                    String strS2 = messagePartCoreData.S();
                    if (!TextUtils.isEmpty(strS2)) {
                        if (!TextUtils.isEmpty(string) && sb.length() > 0) {
                            sb.append(string);
                        }
                        sb.append(strS2);
                    }
                } else {
                    strS = messagePartCoreData.S();
                    z = true;
                }
            }
        }
        return sb == null ? strS : sb.toString();
    }

    private final List ax(bdxm bdxmVar) {
        if (!((Boolean) ((cczi) stu.a.get()).e()).booleanValue()) {
            return aB(bdxmVar.aR);
        }
        List listAB = aB(bdxmVar.aR);
        aG(bdxmVar.cl, listAB);
        return listAB;
    }

    private final List ay(bfrj bfrjVar) {
        return ax((bdxm) bfrjVar.cQ());
    }

    private final List az(bfsb bfsbVar) {
        if (!((Boolean) ((cczi) stu.a.get()).e()).booleanValue()) {
            return aB(bfsbVar.aN);
        }
        List listAB = aB(bfsbVar.aN);
        aG(bfsbVar.ci, listAB);
        return listAB;
    }

    public final String A(boolean z) {
        String strC = C();
        if (!z || TextUtils.isEmpty(strC)) {
            String strB = B();
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            if (z || TextUtils.isEmpty(strC)) {
                bdxm bdxmVar = this.b;
                String strG = bdxmVar != null ? bdxmVar.g() : this.a.g();
                if (TextUtils.isEmpty(strG)) {
                    return z();
                }
                return String.valueOf(as()) + " " + chsk.a(strG);
            }
        }
        return strC;
    }

    public final String B() {
        return this.d.P();
    }

    public final String C() {
        return this.d.Q();
    }

    @Override // defpackage.bajc
    public final String D() {
        return this.d.T();
    }

    public final String E() {
        return this.c.ab();
    }

    public final String F() {
        Uri uriC = this.c.C();
        if (uriC == null) {
            return null;
        }
        return uriC.toString();
    }

    public final String G(Context context) {
        if (this.i != null && aq()) {
            return this.F.c(this.i, e(), false, this.c.Z(), this.c.aa(), A(false), byed.f(e()) ? aw(context) : null, context);
        }
        String strAw = aw(context);
        return (this.z.k() && MessageData.ck(e())) ? context.getResources().getString(this.G.a()) : strAw;
    }

    public final String H() {
        buzr buzrVar = this.e;
        buzrVar.aA(2, "name");
        return buzrVar.c;
    }

    public final String I() {
        return this.c.ac();
    }

    public final List J() {
        return K(null);
    }

    public final List K(Predicate predicate) {
        List<MessagePartCoreData> list = this.g;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MessagePartCoreData messagePartCoreData : list) {
            if (messagePartCoreData.aX() && (predicate == null || predicate.test(messagePartCoreData))) {
                arrayList.add(messagePartCoreData);
            }
        }
        return arrayList;
    }

    public final List L() {
        ArrayList arrayList = new ArrayList(this.h.size());
        for (badz badzVar : this.h) {
            if (badzVar.d.isPresent()) {
                arrayList.add(badzVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.bazb
    public final List M() {
        return this.g;
    }

    public final List N() {
        ArrayList arrayList = new ArrayList(this.h.size());
        for (badz badzVar : this.h) {
            if (badzVar.c != 0) {
                arrayList.add(badzVar);
            }
        }
        return arrayList;
    }

    public final void O() {
        this.C = this.B.a(this.c.E(), this.c.I());
    }

    public final boolean P() {
        int iE = e();
        bdxm bdxmVar = this.b;
        return bdxmVar != null ? bdxmVar.f() == 0 && !this.b.j() && this.y.a(this.b.cK.m(), iE, this.b.cK.z(), this.b.k()) : this.a.f() == 0 && !this.a.j() && this.y.a(this.c.m(), e(), this.c.z(), this.a.k());
    }

    public final boolean Q() {
        bdxm bdxmVar = this.b;
        return bdxmVar != null ? bdxmVar.f() == 0 && !this.b.j() && this.y.b(this.c.m(), e(), this.c.z()) : this.a.f() == 0 && !this.a.j() && this.y.b(this.c.m(), e(), this.c.z());
    }

    public final boolean R() {
        if (!ah() || a() != 0) {
            return false;
        }
        bdxm bdxmVar = this.b;
        return !(bdxmVar != null ? bdxmVar.j() : this.a.j());
    }

    public final boolean S() {
        return MessageData.cm(this.g);
    }

    public final boolean T() {
        if (!ad()) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                if (((MessagePartCoreData) it.next()).aV()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean U() {
        return baui.h(e());
    }

    public final boolean V() {
        return baui.i(e());
    }

    public final boolean W() {
        if (aa(e()) && ai(this.c.m())) {
            List list = this.g;
            list.getClass();
            if (MessagePartData.by(list)) {
                return true;
            }
        }
        return aj();
    }

    public final boolean X() {
        return this.c.o() == 2;
    }

    public final boolean Y() {
        return this.c.ag();
    }

    public final boolean Z() {
        if (this.c == null) {
            return false;
        }
        return aa(e());
    }

    public final int a() {
        bdxm bdxmVar = this.b;
        return bdxmVar != null ? bdxmVar.f() : this.a.f();
    }

    public final boolean ac() {
        return baui.q(this.c.m());
    }

    public final boolean ad() {
        return this.c.m() == 2;
    }

    public final boolean ae(baea baeaVar) {
        int iCompare = Long.compare(h(), baeaVar.h());
        if (iCompare == 0) {
            iCompare = Long.compare(r().a, baeaVar.r().a);
        }
        return iCompare > 0;
    }

    public final boolean af() {
        int iE;
        return this.c != null && (iE = e()) > 0 && iE <= 25;
    }

    public final boolean ag() {
        if (U()) {
            return true;
        }
        for (MessagePartCoreData messagePartCoreData : this.g) {
            if (messagePartCoreData.aX() && (messagePartCoreData.x() != null || messagePartCoreData.t() != null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean ah() {
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        return ai(bindData.m());
    }

    public final boolean aj() {
        if (!aa(e()) || !ai(this.c.m())) {
            return false;
        }
        List list = this.g;
        list.getClass();
        return MessagePartData.bz(list);
    }

    public final boolean ak() {
        return e() == 16;
    }

    public final boolean al() {
        return baui.n(e());
    }

    public final boolean am() {
        return baui.p(e());
    }

    public final boolean an() {
        List list = this.g;
        if (list == null || list.size() != 1) {
            return false;
        }
        return ((MessagePartCoreData) this.g.get(0)).bj();
    }

    public final boolean ao() {
        List list = this.g;
        if (list == null || list.size() != 1) {
            return false;
        }
        return ((MessagePartCoreData) this.g.get(0)).bx();
    }

    public final boolean ap() {
        return baui.u(this.c.m());
    }

    public final boolean aq() {
        return byed.g(this.c.s());
    }

    public final boolean ar() {
        return this.c.r() == 130;
    }

    public final alqj as() {
        return this.m.o(this.d).F();
    }

    public final void at() {
        this.q = true;
    }

    public final void au(baea baeaVar) {
        this.p = aI(baeaVar, false);
    }

    public final void av(baea baeaVar) {
        this.E = baha.a(baeaVar);
        this.D = aI(baeaVar, true);
        this.q = Math.abs(h() - baeaVar.h()) >= 3600000;
        ((Boolean) this.A.b()).booleanValue();
    }

    @Override // defpackage.bajc
    public final int b() {
        return this.c.m();
    }

    public final int c() {
        return this.c.n();
    }

    public final int d() {
        return this.c.q();
    }

    public final int e() {
        byem byemVar = this.C;
        byemVar.getClass();
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        int iS = bindData.s();
        Integer num = byemVar.a.k() ? (Integer) byemVar.b.get() : !byemVar.d.c() ? (Integer) byemVar.c.get() : null;
        return (num != null && (num.intValue() == 1 || num.intValue() == 2) && (num.intValue() > iS || iS == 4 || iS == 5 || iS == 6 || iS == 7)) ? num.intValue() : iS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r4.b.equals(r2) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof defpackage.baea
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            baea r4 = (defpackage.baea) r4
            bfsb r0 = r3.a
            if (r0 == 0) goto L20
            bfsb r2 = defpackage.bady.a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            bfsb r0 = r4.a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L39
        L20:
            bdxm r0 = r3.b
            if (r0 == 0) goto L42
            bdxm r2 = r4.b
            if (r2 == 0) goto L42
            bdxm r2 = defpackage.bady.b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L42
            bdxm r0 = r4.b
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L39
            goto L42
        L39:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r0 = r3.c
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r4 = r4.c
            boolean r4 = r0.equals(r4)
            return r4
        L42:
            bdxm r0 = r3.b
            if (r0 == 0) goto L50
            bdxm r4 = r4.b
            if (r4 == 0) goto L4f
            boolean r4 = r0.equals(r4)
            return r4
        L4f:
            return r1
        L50:
            bfsb r0 = r3.a
            bfsb r4 = r4.a
            boolean r4 = r0.equals(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baea.equals(java.lang.Object):boolean");
    }

    public final long f() {
        return this.c.u();
    }

    public final long g() {
        return this.c.v();
    }

    public final long h() {
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        return bindData.w();
    }

    public final int hashCode() {
        bdxm bdxmVar = this.b;
        return bdxmVar != null ? bdxmVar.hashCode() : this.a.hashCode();
    }

    public final long i() {
        return this.c.z();
    }

    public final long j() {
        return this.c.A();
    }

    public final long k() {
        List list = this.g;
        long jP = 0;
        if (list == null) {
            return 0L;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jP += ((MessagePartCoreData) it.next()).p();
        }
        return jP;
    }

    public final long l() {
        return this.c.B();
    }

    public final Uri m() {
        boolean z;
        boolean zA;
        ParticipantsTable.BindData bindData = this.d;
        if (bindData != null) {
            bindData.G();
        }
        cpbn cpbnVar = this.l;
        Uri uriX = this.d.x();
        String strC = C();
        alqm alqmVarO = o();
        ParticipantColor participantColor = this.k;
        cczv cczvVar = alvx.a;
        if (!((Boolean) new ejxr() { // from class: aluw
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(eotp.a("bugle.replace_normalized_destination_with_mi_in_convo_msg_data", "bugle"));
            }
        }.get()).booleanValue()) {
            z = false;
            if (Z() && ah() && dhim.c(D())) {
                zA = true;
            }
            return cpbnVar.f(uriX, strC, alqmVarO, participantColor, z, this.d.aa(), this.d.X());
        }
        zA = o().A();
        z = zA;
        return cpbnVar.f(uriX, strC, alqmVarO, participantColor, z, this.d.aa(), this.d.X());
    }

    public final Uri n() {
        long jU = this.d.u();
        String strS = this.d.S();
        if (jU <= -1 || TextUtils.isEmpty(strS)) {
            return null;
        }
        return ContactsContract.Contacts.getLookupUri(jU, strS);
    }

    public final alqm o() {
        return this.m.q(this.d);
    }

    public final SelfIdentityId p() {
        MessagesTable.BindData bindData = this.c;
        bindData.getClass();
        return aofa.c(bindData.Z());
    }

    @Override // defpackage.bajc
    public final ConversationIdType q() {
        return this.c.D();
    }

    public final MessageIdType r() {
        return this.c.E();
    }

    public final basd s() {
        return this.c.H();
    }

    public final basd t() {
        return this.c.I();
    }

    public final String toString() {
        return MessageData.aG(this.c.E(), this.c.m(), this.g);
    }

    public final bvdz u() {
        return this.c.M();
    }

    public final cgrd v() {
        return this.c.O();
    }

    public final String w() {
        return this.c.Y();
    }

    public final String x() {
        return this.c.aa();
    }

    public final String y() {
        bdxm bdxmVar = this.b;
        if (bdxmVar != null) {
            bdxmVar.aA(147, "rcs_group_id");
            return bdxmVar.bY;
        }
        bfsb bfsbVar = this.a;
        bfsbVar.aA(145, "rcs_group_id");
        return bfsbVar.bV;
    }

    @Deprecated
    public final String z() {
        return this.d.O();
    }

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar, eygg eyggVar, bdxm bdxmVar) {
        this(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar, byenVar, byedVar);
        aC(bdxmVar);
    }

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar, eygg eyggVar, bfrj bfrjVar) {
        this(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar, byenVar, byedVar);
        aE(bfrjVar, false);
    }

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar, eygg eyggVar, bfrj bfrjVar, byte[] bArr) {
        this(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar, byenVar, byedVar);
        aE(bfrjVar, true);
    }

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar, eygg eyggVar, bfsb bfsbVar) {
        this(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar, byenVar, byedVar);
        aD(bfsbVar);
    }

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar, eygg eyggVar, bgvb bgvbVar) {
        this(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar, byenVar, byedVar);
        aF(bgvbVar, false);
    }

    public baea(cpbn cpbnVar, bahv bahvVar, baui bauiVar, bvur bvurVar, bwfx bwfxVar, alrj alrjVar, fcsu fcsuVar, byen byenVar, byed byedVar, eygg eyggVar, bgvb bgvbVar, byte[] bArr) {
        this(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar, byenVar, byedVar);
        aF(bgvbVar, true);
    }
}
