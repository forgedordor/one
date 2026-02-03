package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyp implements yyr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2");
    public final zqm b;
    public final zvo c;
    public final zvt d;
    public final ahay e;
    public final zvc f;
    public final fcsu g;
    public final fcsu h;
    public final fdpl i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final fduf l;
    public final AtomicReference m;
    public final fduf n;
    public final boolean o;
    public final yil p;
    private final Context q;
    private final ConversationId r;
    private final fcsu s;

    public yyp(Context context, ConversationId conversationId, yil yilVar, zqm zqmVar, zvo zvoVar, zvt zvtVar, ahay ahayVar, zvc zvcVar, fcsu fcsuVar, fcsu fcsuVar2, fdpl fdplVar, fcsu fcsuVar3) {
        context.getClass();
        conversationId.getClass();
        yilVar.getClass();
        zqmVar.getClass();
        zvoVar.getClass();
        ahayVar.getClass();
        zvcVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        this.q = context;
        this.r = conversationId;
        this.p = yilVar;
        this.b = zqmVar;
        this.c = zvoVar;
        this.d = zvtVar;
        this.e = ahayVar;
        this.f = zvcVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fdplVar;
        this.s = fcsuVar3;
        this.j = new AtomicReference(null);
        this.k = new AtomicReference(null);
        this.l = fdvf.a(false);
        this.m = new AtomicReference(null);
        this.n = fdvf.a(false);
        this.o = conversationId instanceof PenpalBotConversationId;
    }

    public static final boolean f(MessageId messageId, boolean z, boolean z2, dktt dkttVar, boolean z3) {
        String str = true != z3 ? "displayed on select" : "auto revealed";
        if (z) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleReactions");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.c, messageId);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2", "shouldDisplay", 346, "ReactionBarUiAdapterImplV2.kt")).t("Reaction bar not %s because it is in a dismissed state", str);
            return false;
        }
        if (dkttVar != null && !(dkttVar instanceof aaam)) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleReactions");
            ekrd ekrdVar2 = (ekrd) ekrwVarE2;
            ekrdVar2.X(cqnc.c, messageId);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2", "shouldDisplay", 353, "ReactionBarUiAdapterImplV2.kt")).t("Reaction bar not %s because another popup is open", str);
            return false;
        }
        if (z2) {
            return true;
        }
        ekrw ekrwVarE3 = a.e();
        ekrwVarE3.X(eksq.a, "BugleReactions");
        ekrd ekrdVar3 = (ekrd) ekrwVarE3;
        ekrdVar3.X(cqnc.c, messageId);
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2", "shouldDisplay", 360, "ReactionBarUiAdapterImplV2.kt")).t("Reaction bar not %s because reacting to the selected message is not allowed", str);
        return false;
    }

    private final ekgb g(boolean z) {
        ekgb ekgbVar = z ? zuq.b : zuq.a;
        if (!this.q.getResources().getBoolean(R.bool.use_smaller_reactions_bar)) {
            return ekgbVar;
        }
        ekgb ekgbVarSubList = ekgbVar.subList(0, ((ekoe) ekgbVar).c - 1);
        ekgbVarSubList.getClass();
        return ekgbVarSubList;
    }

    @Override // defpackage.yyr
    public final auyl a(yyq yyqVar) {
        int i;
        zqk zqkVar = yyqVar.c;
        if (zqkVar.a && zqkVar.d && zqkVar.b == zqx.b) {
            i = 1;
        } else {
            AtomicReference atomicReference = this.j;
            ajlt ajltVar = yyqVar.a;
            if (fdbq.f(atomicReference, ajltVar.b())) {
                atomicReference.set(null);
            }
            if (!((Boolean) this.s.b()).booleanValue()) {
                i = 0;
            } else if (yyqVar.e && (ajltVar.g() instanceof amvy)) {
                i = 2;
            } else {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleReactions");
                ekrd ekrdVar = (ekrd) ekrwVarE;
                ekrdVar.X(cqnc.c, ajltVar.b());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2", "isAutoRevealEligible", 395, "ReactionBarUiAdapterImplV2.kt")).q("Reaction bar not auto revealed because the message is not a latest incoming photo/video");
                i = 0;
            }
        }
        if (i != 1) {
            AtomicReference atomicReference2 = this.j;
            if (fdbq.f(atomicReference2.get(), yyqVar.a.b())) {
                this.l.f(false);
                atomicReference2.set(null);
            }
        }
        if (i == 0) {
            return null;
        }
        fdpl fdplVarB = this.d.b(yyqVar.a);
        fdui fduiVar = new fdui(new yyo(this, yyqVar, null));
        yyn yynVar = new yyn(null, i, this, yyqVar, fdplVarB);
        int i2 = fdsn.a;
        return auyp.b(new fdwg(yynVar, fduiVar), null);
    }

    public final dkny b(yyq yyqVar, final anho anhoVar, int i, zqy zqyVar, boolean z, angp angpVar, final fdae fdaeVar, fdae fdaeVar2) {
        ejxr ejxrVar = crbf.ak;
        int i2 = 1;
        ekgb ekgbVarG = g(((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() && yji.b(yyqVar.a));
        if (angpVar != null) {
            List listAq = fcva.aq(ekgbVarG);
            listAq.set(5, angpVar);
            ekgbVarG = ekfv.a(listAq);
        }
        Integer num = null;
        if (anhoVar != null) {
            Integer numValueOf = Integer.valueOf(ekgbVarG.indexOf(anhoVar.a));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        final ajlt ajltVar = yyqVar.a;
        ekgb ekgbVarG2 = g(((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() && yji.b(ajltVar));
        if (angpVar != null) {
            List listAq2 = fcva.aq(ekgbVarG2);
            listAq2.set(5, angpVar);
            ekgbVarG2 = ekfv.a(listAq2);
        }
        dkzd dkzdVar = new dkzd(this.d.a(ekgbVarG2, ckmn.REACTION_BAR, ajltVar, anhoVar, num, fdaeVar), num, new fdae() { // from class: yyd
            @Override // defpackage.fdae
            public final Object invoke() {
                yyp yypVar = this.a;
                int i3 = true != yypVar.e() ? 3 : 5;
                yypVar.d.d(ajltVar, anhoVar, i3, fdaeVar);
                return fctx.a;
            }
        }, new dkzc(z && e()), new fdae() { // from class: yye
            @Override // defpackage.fdae
            public final Object invoke() {
                dnwy dnwyVar = dnwy.a;
                final fdae fdaeVar3 = fdaeVar;
                final fdae fdaeVar4 = new fdae() { // from class: yyf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar3.invoke();
                        return fctx.a;
                    }
                };
                dnwyVar.getClass();
                final zvc zvcVar = this.a.f;
                abvd abvdVar = zvcVar.j;
                if (abvdVar != null) {
                    abvdVar.a(dnwyVar);
                }
                final ajlt ajltVar2 = ajltVar;
                zvl.a(zvcVar.d, ajltVar2.q(), null, 4, zvcVar.a.getString(R.string.select_image_for_photomoji), null, new fdap() { // from class: zus
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        ajlt ajltVar3 = ajltVar2;
                        zvc zvcVar2 = zvcVar;
                        MessageId messageIdB = ajltVar3.b();
                        if (zvcVar2.f == null) {
                            throw new IllegalStateException("Create sticker button clicked when sticker store was not present");
                        }
                        Intent intentPutExtra = new Intent("com.google.chat.smartmessaging.penpal.EMOTIFY").putExtra("image_uri", str);
                        intentPutExtra.getClass();
                        cczi ccziVar = crbf.aM;
                        if (((Number) ccziVar.e()).floatValue() > 0.0f) {
                            Object objE = ccziVar.e();
                            objE.getClass();
                            intentPutExtra.putExtra("small_segment_ratio", ((Number) objE).floatValue());
                        }
                        fdae fdaeVar5 = fdaeVar4;
                        intentPutExtra.putExtra("enable_edge_to_edge", true);
                        auvw.k(zvcVar2.b, null, null, new zuz(zvcVar2, messageIdB, new agau("emotify_result", new aeo(), intentPutExtra), fdaeVar5, null), 3);
                        return fctx.a;
                    }
                }, 16);
                return fctx.a;
            }
        });
        dkgv dkgvVar = yyqVar.b;
        int i3 = zqyVar != null ? zqyVar.a : 0;
        int iOrdinal = dkgvVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal != 2) {
                    throw new fctg();
                }
            } else {
                i2 = 3;
            }
        }
        return new dkny(dkzdVar, new dknx(i3, i, i2), fdaeVar2);
    }

    public final void c() {
        this.n.f(true);
    }

    public final void d() {
        this.l.g(false, true);
    }

    public final boolean e() {
        return crbf.e() && !this.o;
    }
}
