package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aald extends fcyz implements fdap {
    int a;
    final /* synthetic */ ConversationViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aald(ConversationViewModel conversationViewModel, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = conversationViewModel;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dpnt dpntVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ConversationViewModel conversationViewModel = this.b;
        this.a = 1;
        zww zwwVar = conversationViewModel.b;
        zwwVar.c.a();
        aahl aahlVar = zwwVar.x;
        aajl aajlVar = aahlVar.d;
        aafi aafiVar = aajlVar.a;
        fduf fdufVarA = fdvf.a(null);
        aafiVar.e();
        aahn aahnVar = new aahn(fdufVarA, ((aajy) aahlVar.a).b, aajlVar.b, ((aaih) aahlVar.b).b, ((aahh) aahlVar.c).h, new aahk(aahlVar), new aahm(null));
        ycl yclVar = zwwVar.a;
        eieu eieuVarH = eiiy.h("PagedMessageListUiAdapterImpl#createUiData");
        try {
            fdpl fdplVar = ((yek) yclVar).K;
            fdvc fdvcVarB = fdtg.b(((yek) yclVar).e.a(), ((yek) yclVar).l, fdur.a(0L, 3), null);
            fduj fdujVarD = ((yek) yclVar).h.d();
            ygv ygvVar = ((yek) yclVar).c;
            boolean zBooleanValue = ((yhw) ygvVar).d.a() ? ((yhw) ygvVar).c instanceof PenpalBotConversationId : ((Boolean) ((yhw) ygvVar).n.c()).booleanValue();
            int i2 = (zBooleanValue && ((Boolean) ((cczi) crbf.at.get()).e()).booleanValue()) ? 2 : 1;
            ekrw ekrwVarE = yhw.a.e();
            ekrwVarE.X(eksq.a, "FooterUiAdapterImpl");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl", "createUiData", 308, "MessageListFooterUiAdapterImpl.kt")).I("#createUiData: isPenpalConversation=%s, flag=%s, rowCount=%s", Boolean.valueOf(zBooleanValue), ((cczi) crbf.at.get()).e(), Integer.valueOf(i2));
            fdvc fdvcVar = ((yhw) ygvVar).j;
            fdvc fdvcVar2 = ((yhw) ygvVar).l;
            fdvc fdvcVar3 = ((yhw) ygvVar).m;
            Optional optional = ((yhw) ygvVar).i;
            boolean zA = ((yhw) ygvVar).h.a();
            Object objE = ((cczi) crbf.bK.get()).e();
            objE.getClass();
            yhz yhzVar = new yhz(fdvcVar, fdvcVar2, fdvcVar3, optional, i2, new yhy(zA, ((Boolean) objE).booleanValue()));
            yik yikVar = ((yek) yclVar).S;
            fdvc fdvcVarB2 = fdtg.b(new fdua(yikVar.c, yikVar.d, new yij(yikVar, null)), yikVar.a, fdur.a, null);
            fdvc fdvcVarA = ((yek) yclVar).d.a();
            fdvc fdvcVar4 = ((yek) yclVar).M;
            yil yilVar = ((yek) yclVar).O;
            ygn ygnVar = ((yek) yclVar).P;
            Object objB = ((yek) yclVar).y.b();
            objB.getClass();
            ains ainsVar = (ains) objB;
            fdvc fdvcVar5 = ((yek) yclVar).C.b;
            fdpl fdplVar2 = ((yek) yclVar).N;
            ych ychVar = ((yek) yclVar).r;
            final yek yekVar = (yek) yclVar;
            yen yenVar = new yen(fdplVar, fdvcVarB, fdujVarD, yhzVar, fdvcVarB2, fdvcVarA, fdvcVar4, yilVar, ygnVar, ainsVar, fdvcVar5, fdplVar2, new ycv(ychVar), new ycw(ychVar), ((yek) yclVar).R.a, new ycx(yclVar), new ycy(yclVar), new ycz(yclVar), new yda(yclVar), new ydb(yclVar), ((ygs) ((yek) yclVar).z.b()).a(), new yem(true, ((yek) yclVar).E.a(), 2), new fdae() { // from class: ycp
                @Override // defpackage.fdae
                public final Object invoke() {
                    yekVar.g.b();
                    return fctx.a;
                }
            });
            fczl.a(eieuVarH, null);
            vrq vrqVar = zwwVar.q;
            arfw arfwVar = vrqVar.c;
            fdvc fdvcVarA2 = vrqVar.a.a();
            vrr vrrVar = new vrr(((eoth) ((arfx) arfwVar).a.b()).a("bugle.animate_showing_and_hiding_hugo"));
            xnw xnwVar = (xnw) vrqVar.b;
            vrs vrsVar = new vrs(fdvcVarA2, vrqVar.d, xnwVar.e, xnwVar.f, vrrVar);
            ahay ahayVar = zwwVar.b;
            aaft aaftVar = zwwVar.r;
            yil yilVar2 = zwwVar.s;
            Optional optional2 = zwwVar.d;
            fdvc fdvcVarF = ahayVar.f();
            xut xutVar = (xut) fdct.b(optional2);
            xup xupVar = xutVar != null ? new xup(xutVar.a) : null;
            xux xuxVar = zwwVar.t;
            fduf fdufVar = yilVar2.e;
            zwp zwpVar = new zwp(zwwVar);
            zwq zwqVar = new zwq(zwwVar);
            zwr zwrVar = new zwr(zwwVar);
            zuc zucVar = zwwVar.w;
            final fdap fdapVar = new fdap() { // from class: zua
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return ((cwec) obj2).a(new cwdf(3));
                }
            };
            Object objOrElse = zucVar.a.map(new Function() { // from class: zub
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(fdvf.a(null));
            objOrElse.getClass();
            aidr aidrVar = zwwVar.k;
            Optional optional3 = zwwVar.g;
            fdvc fdvcVar6 = (fdvc) objOrElse;
            boolean zA2 = aidrVar.a();
            zyh zyhVar = (zyh) fdct.b(optional3);
            fcsu fcsuVar = zwwVar.h;
            if (!zwwVar.l.a() && !zwwVar.m.a()) {
                fcsuVar = null;
            }
            fdpl fdplVarA = (fcsuVar == null || (dpntVar = (dpnt) fcsuVar.b()) == null) ? null : dpntVar.a();
            aagg aaggVar = zwwVar.n;
            asif asifVar = zwwVar.i;
            aqkl aqklVar = zwwVar.j;
            fdvc fdvcVarA3 = aaggVar.a();
            boolean zA3 = asifVar.a();
            boolean zA4 = ((eoth) ((aqjt) aqklVar).a.b()).a("bugle.move_snackbar_above_compose_row");
            Object objE2 = ((cczi) crbf.bJ.get()).e();
            objE2.getClass();
            zxa zxaVar = new zxa(aahnVar, yenVar, vrsVar, fdvcVarF, aaftVar.a, yilVar2.d, xupVar, fdufVar, xuxVar.a, zwpVar, zwqVar, zwrVar, zA2, fdvcVar6, zyhVar, fdplVarA, fdvcVarA3, new zwz(zA3, zA4, ((Boolean) objE2).booleanValue(), zwwVar.o.a() && zwwVar.p.a()));
            return zxaVar != fcylVar ? zxaVar : fcylVar;
        } finally {
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aald(this.b, (fcxy) obj).b(fctx.a);
    }
}
