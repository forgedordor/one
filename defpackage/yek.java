package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yek implements ycl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl");
    public final fcsu A;
    public final efwo B;
    public final cpfu C;
    public final fcsu D;
    public final aqkb E;
    public final fcsu F;
    public final ajmh G;
    public final fduf H;
    public final fduf I;
    public final fdap J;
    public final fdpl K;
    public final dlbr L;
    public final fdvc M;
    public final fdpl N;
    public final yil O;
    public final ygn P;
    public final zqi Q;
    public final admf R;
    public final yik S;
    public final diii T;
    public final zue U;
    private final fcyh V;
    private final fcsu W;
    private final fcsu X;
    private final List Y;
    public final yjk b;
    public final ygv c;
    public final zop d;
    public final zmv e;
    public final zuh f;
    public final zqm g;
    public final zqe h;
    public final zvz i;
    public final yir j;
    public final Conversation k;
    public final fdjx l;
    public final fdjx m;
    public final Context n;
    public final ConversationId o;
    public final Set p;
    public final zpi q;
    public final ych r;
    public final fcsu s;
    public final aprc t;
    public final yjr u;
    public final ycf v;
    public final fcsu w;
    public final afzc x;
    public final fcsu y;
    public final fcsu z;

    /* JADX WARN: Type inference failed for: r3v2, types: [fdpl, java.lang.Object] */
    public yek(yjk yjkVar, ygv ygvVar, zop zopVar, zmv zmvVar, zuh zuhVar, zue zueVar, yil yilVar, zqm zqmVar, zqu zquVar, ygn ygnVar, zqe zqeVar, zqi zqiVar, zvz zvzVar, yir yirVar, aadq aadqVar, Conversation conversation, fdjx fdjxVar, fdjx fdjxVar2, fcyh fcyhVar, fcsu fcsuVar, Context context, ygn ygnVar2, aafi aafiVar, fdpl fdplVar, ynm ynmVar, fdpl fdplVar2, fdpl fdplVar3, ConversationId conversationId, yim yimVar, Set set, zpi zpiVar, ych ychVar, fcsu fcsuVar2, aprc aprcVar, yjr yjrVar, admf admfVar, yik yikVar, ycf ycfVar, fcsu fcsuVar3, afzc afzcVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, efwo efwoVar, cpfu cpfuVar, fcsu fcsuVar7, diii diiiVar, aqkb aqkbVar, fcsu fcsuVar8) {
        zopVar.getClass();
        zuhVar.getClass();
        zueVar.getClass();
        yilVar.getClass();
        zqmVar.getClass();
        zquVar.getClass();
        ygnVar.getClass();
        zqeVar.getClass();
        zqiVar.getClass();
        zvzVar.getClass();
        yirVar.getClass();
        aadqVar.getClass();
        conversation.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        context.getClass();
        ygnVar2.getClass();
        aafiVar.getClass();
        fdplVar.getClass();
        ynmVar.getClass();
        fdplVar2.getClass();
        fdplVar3.getClass();
        conversationId.getClass();
        yimVar.getClass();
        zpiVar.getClass();
        ychVar.getClass();
        fcsuVar2.getClass();
        aprcVar.getClass();
        yjrVar.getClass();
        admfVar.getClass();
        fcsuVar3.getClass();
        afzcVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        efwoVar.getClass();
        cpfuVar.getClass();
        fcsuVar7.getClass();
        diiiVar.getClass();
        fcsuVar8.getClass();
        this.b = yjkVar;
        this.c = ygvVar;
        this.d = zopVar;
        this.e = zmvVar;
        this.f = zuhVar;
        this.U = zueVar;
        this.O = yilVar;
        this.g = zqmVar;
        this.P = ygnVar;
        this.h = zqeVar;
        this.Q = zqiVar;
        this.i = zvzVar;
        this.j = yirVar;
        this.k = conversation;
        this.l = fdjxVar;
        this.m = fdjxVar2;
        this.V = fcyhVar;
        this.W = fcsuVar;
        this.n = context;
        this.o = conversationId;
        this.p = set;
        this.q = zpiVar;
        this.r = ychVar;
        this.s = fcsuVar2;
        this.t = aprcVar;
        this.u = yjrVar;
        this.R = admfVar;
        this.S = yikVar;
        this.v = ycfVar;
        this.w = fcsuVar3;
        this.x = afzcVar;
        this.y = fcsuVar4;
        this.z = fcsuVar5;
        this.A = fcsuVar6;
        this.B = efwoVar;
        this.C = cpfuVar;
        this.D = fcsuVar7;
        this.T = diiiVar;
        this.E = aqkbVar;
        this.F = fcsuVar8;
        ajmh ajmhVarC = conversation.c();
        this.G = ajmhVarC;
        this.H = fdvf.a(null);
        this.I = fdvf.a(false);
        auvw.k(fdjxVar, null, null, new ycr(aafiVar, this, null), 3);
        if (crtr.e()) {
            auvw.k(fdjxVar, fcyhVar, null, new ycs(this, null), 2);
        }
        fcsu fcsuVar9 = new fcsu() { // from class: ycm
            @Override // defpackage.fcsu
            public final Object b() {
                return fdvf.a(Boolean.valueOf(this.a.o instanceof PenpalBotConversationId));
            }
        };
        this.X = fcsuVar9;
        this.J = new fdap() { // from class: ycn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                MessageId messageId = (MessageId) obj;
                messageId.getClass();
                yek yekVar = this.a;
                auvw.k(yekVar.l, null, null, new ydj(yekVar, messageId, null), 3);
                return fctx.a;
            }
        };
        ajma ajmaVarE = ajmhVarC.e();
        ajmaVarE.getClass();
        znp znpVar = (znp) zmvVar;
        List listG = fcva.g(auyt.a(auyk.a(new fdqz(new zno(null), new zni(fdsn.a(new fdtm(new znd(znpVar.a(), ajmaVarE), new znj(null)), new znn(znpVar, ajmaVarE, null)), znpVar)), "MessageListPagingData")), auyt.a(auyk.a(zqmVar.a(), "PagedMessageListUiAdapter::SelectionTracker")), auyt.a(auyk.a(aafiVar.a(), "PagedMessageListUiAdapter::CurrentResult")), auyt.a(auyk.a(aafiVar.b(), "PagedMessageListUiAdapter::SearchResults")), auyt.a(auyk.a(fdqq.a(new ydx(fdplVar)), "PagedMessageListUiAdapter::ConversationProperties")), auyt.a(auyk.a(fdqq.a(new yea(fdplVar3)), "PagedMessageListUiAdapter::SelfIdentitiesCount")), auyt.a(auyk.a(((znp) zmvVar).f, "PagedMessageListUiAdapter::MessageIdWithLastReadMarker")), auyt.a(auyk.a(yimVar.a, "PagedMessageListUiAdapter::LastReadMarkerVisibility")), auyt.a(auyk.b(aadqVar.a(), "PagedMessageListUiAdapter::PinchToZoomInteractionTracker")), auyt.a(auyk.a(fcsuVar9.b(), "PagedMessageListUiAdapter::IsPenpalConversation")), auyt.a(auyk.a(fdqq.a(new yed(((znp) zmvVar).g)), "PagedMessageListUiAdapter::LatestReadMessageTimestamp")), auyt.a(auyk.a(((ygs) fcsuVar5.b()).a(), "PagedMessageListUiAdapter::enableSwipeToShowTimestampsFlow")));
        this.Y = listG;
        long j = fdhi.a;
        Object objB = fcsuVar.b();
        objB.getClass();
        long jG = fdhk.g(((Number) objB).longValue(), fdhl.c);
        fdpl[] fdplVarArr = (fdpl[]) fcva.ao(listG).toArray(new fdpl[0]);
        int length = fdplVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = false;
        }
        int length2 = fdplVarArr.length;
        ArrayList arrayList = new ArrayList(length2);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            arrayList.add(new fdtm(fdplVarArr[i2], new ydm(zArr, i3, null)));
            i2++;
            i3++;
        }
        this.K = new yeg(new ydu(new fdua(new fdqz(new ydr(fdjxVar, jG, fdplVarArr, zArr, null), new ydp((fdpl[]) fcva.ao(arrayList).toArray(new fdpl[0]), this)), ynmVar.b, new ydg(null))));
        dlbr dlbrVar = new dlbr(qxq.b(this.n, R.string.conversation_scroll_to_bottom_button_content_description, "count", 0), a(0, this.n), false, new fdae() { // from class: yco
            @Override // defpackage.fdae
            public final Object invoke() {
                yek yekVar = this.a;
                auvw.k(yekVar.l, null, null, new yde(yekVar, null), 3);
                ((ains) yekVar.F.b()).c("Bugle.App.ScrollToBottom.Clicked.Count");
                return fctx.a;
            }
        }, 8);
        this.L = dlbrVar;
        this.M = fdtg.b(fdqq.a(new fdua(new fdtm(ygnVar2.a(ygp.b), new ydk(this, null)), fdplVar2, new ydl(this, null))), this.l, fdur.a(0L, 3), dlbrVar);
        this.N = fdqq.a(new yej(this.g.a()));
    }

    public static final String a(int i, Context context) {
        if (i != 0) {
            return i != 1 ? context.getString(R.string.unread_messages, Integer.valueOf(i)) : context.getString(R.string.unread_message, Integer.valueOf(i));
        }
        return null;
    }
}
