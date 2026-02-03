package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akdg implements akcz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl");
    public final fcyh b;
    public final fcsu c;
    public final byeq d;
    private final fdjx e;
    private final akds f;
    private final aqny g;
    private final Context h;

    public akdg(fdjx fdjxVar, fcyh fcyhVar, byeq byeqVar, fcsu fcsuVar, akds akdsVar, aqny aqnyVar, Context context) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        byeqVar.getClass();
        fcsuVar.getClass();
        context.getClass();
        this.e = fdjxVar;
        this.b = fcyhVar;
        this.d = byeqVar;
        this.c = fcsuVar;
        this.f = akdsVar;
        this.g = aqnyVar;
        this.h = context;
    }

    public static final ConversationIdType e(Conversation conversation) {
        return ((DefaultConversation) conversation).a.a;
    }

    public static final boolean f(Conversation conversation, akcy akcyVar) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("RichThemeControllerImpl#persistRichThemeInDatabase");
        cidt cidtVarG = g(akcyVar);
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 59820) {
            dqru.x("custom_theme", iIntValue2);
        }
        if (iIntValue >= 59820) {
            boteVar.a.put("custom_theme", cidtVarG.toByteArray());
        }
        return boteVar.f(e(conversation));
    }

    private static final cidt g(akcy akcyVar) {
        cids cidsVar = (cids) cidt.a.createBuilder();
        cidsVar.getClass();
        Integer numB = akcyVar.b();
        if (numB != null) {
            int iIntValue = numB.intValue();
            cidsVar.copyOnWrite();
            cidt cidtVar = (cidt) cidsVar.instance;
            cidtVar.b |= 1;
            cidtVar.c = iIntValue;
        }
        evvp evvpVarB = evxd.b(akcyVar.a());
        cidsVar.copyOnWrite();
        cidt cidtVar2 = (cidt) cidsVar.instance;
        cidtVar2.d = evvpVarB;
        cidtVar2.b |= 2;
        evsn evsnVarBuild = cidsVar.build();
        evsnVarBuild.getClass();
        return (cidt) evsnVarBuild;
    }

    @Override // defpackage.akcz
    public final eiju a(final Conversation conversation, final akcy akcyVar, final Recipient recipient) {
        recipient.getClass();
        eiju eijuVarA = this.d.a("RichThemeControllerImpl#incomingRichThemeUpdate", new ejxr() { // from class: akda
            @Override // defpackage.ejxr
            public final Object get() {
                Conversation conversation2 = conversation;
                cidt cidtVar = (cidt) botm.j(akdg.e(conversation2), new Function() { // from class: akdb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bojh) obj).K();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                akcy akcyVar2 = akcyVar;
                if (cidtVar != null) {
                    evvp evvpVar = cidtVar.d;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    if (evvpVar != null && evxd.d(evvpVar).isAfter(akcyVar2.a())) {
                        ((ekrd) akdg.a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl", "incomingRichThemeUpdate$lambda$0", 91, "RichThemeControllerImpl.kt")).q("Ignoring out of date theme.");
                        return false;
                    }
                }
                akdg akdgVar = this.a;
                Recipient recipient2 = recipient;
                String strD = akdgVar.d(akcyVar2);
                if (!(recipient2 instanceof anug)) {
                    throw new IllegalStateException("Check failed.");
                }
                ekrd ekrdVar = (ekrd) akdg.a.h();
                ekrdVar.X(new ekrz("custom_theme_name", String.class, false, false), strD);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl", "insertParticipantThemeChangeTombstone", 128, "RichThemeControllerImpl.kt")).q("Inserting theme change tombstone.");
                bycx bycxVar = (bycx) akdgVar.c.b();
                ConversationIdType conversationIdTypeE = akdg.e(conversation2);
                ParticipantsTable.BindData bindDataN = ((anug) recipient2).n();
                bindDataN.getClass();
                bycxVar.d(conversationIdTypeE, bindDataN, strD);
                return Boolean.valueOf(akdg.f(conversation2, akcyVar2));
            }
        });
        eijuVarA.getClass();
        return eijuVarA;
    }

    @Override // defpackage.akcz
    public final eiju b(BugleConversation bugleConversation, akcy akcyVar) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new akdd(this, bugleConversation, akcyVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r7, defpackage.akcy r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdg.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, akcy, fcxy):java.lang.Object");
    }

    public final String d(akcy akcyVar) {
        Map map = akdh.a;
        Integer num = (Integer) akdh.a.get(akcyVar.b());
        if (num == null) {
            return null;
        }
        Context context = this.h;
        return context.getResources().getString(num.intValue());
    }
}
