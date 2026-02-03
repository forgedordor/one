package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnn extends cvno {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final eygg g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final egzv l;
    public final fcsu m;
    public final fcsu n;
    private final Activity p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final egzv w;
    private ComposeRowState x;
    private final fcsu y;
    private final fcsu z;

    public cvnn(cvnc cvncVar, fcsu fcsuVar, Activity activity, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, eygg eyggVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19) {
        this.p = activity;
        this.q = fcsuVar2;
        this.r = fcsuVar3;
        this.b = fcsuVar4;
        this.c = fcsuVar5;
        this.d = fcsuVar6;
        this.e = fcsuVar7;
        this.f = fcsuVar8;
        this.g = eyggVar;
        this.h = fcsuVar9;
        this.i = fcsuVar10;
        this.s = fcsuVar11;
        this.t = fcsuVar12;
        this.j = fcsuVar13;
        this.k = fcsuVar14;
        this.u = fcsuVar15;
        this.v = fcsuVar16;
        this.l = new cvnl(eyggVar, cvncVar);
        this.w = new cvnm(cvncVar);
        this.y = fcsuVar17;
        this.z = fcsuVar;
        this.n = fcsuVar18;
        this.m = fcsuVar19;
    }

    public final void a() throws IOException {
        ekgb ekgbVarR;
        Activity activity = this.p;
        Intent intent = activity.getIntent();
        String action = intent.getAction();
        if (!"android.intent.action.SENDTO".equals(intent.getAction()) && !"android.intent.action.VIEW".equals(intent.getAction())) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processPhoneMode", 221, "LaunchConversationFragmentPeer.java")).t("Unsupported conversation intent action: %s.", action);
            return;
        }
        if (!((crnp) this.t.b()).d()) {
            ((avmp) this.q.b()).k(activity);
            activity.finish();
            return;
        }
        this.x = avnr.a(((batn) this.r.b()).a(intent), null);
        Optional optionalB = ((cqti) this.s.b()).b(intent);
        cwoo cwooVar = (cwoo) this.m.b();
        Optional optionalA = cwooVar.a(intent);
        intent.getClass();
        Uri data = intent.getData();
        Optional optionalEmpty = data == null ? Optional.empty() : Optional.ofNullable(cwon.a(data).getQueryParameter("bot-name"));
        Optional optionalB2 = cwooVar.b(intent);
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "Bugle");
        Optional optional = optionalEmpty;
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "handleSendOrViewAction", 334, "LaunchConversationFragmentPeer.java")).I("botIdOptional: %s, botNameOptional: %s, shortCode: %s", optionalA.orElse("null"), optionalEmpty.orElse("null"), cqcv.b((CharSequence) optionalB2.orElse("null")));
        boolean z = false;
        if (((apsv) this.y.b()).a() && optionalA.isPresent()) {
            z = true;
        }
        boolean zIsPresent = optionalB2.isPresent();
        if (z || zIsPresent) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "handleSendOrViewAction", 344, "LaunchConversationFragmentPeer.java")).D("Navigate to OpenRbmDeepLinkActivity, SMS deep link: '%s'/'%s'", optionalA.orElse("null"), cqcv.b((CharSequence) optionalB2.orElse("null")));
            eiid.o(activity, new Intent("android.intent.action.VIEW").setClassName((Context) this.z.b(), "com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(intent.getData()));
            activity.finish();
            return;
        }
        if (!optionalB.isPresent() || ((String[]) optionalB.get()).length == 0) {
            b(InvalidConversationId.a, 2);
            return;
        }
        if (optionalA.isEmpty() && optional.isPresent()) {
            ((aspz) this.c.b()).d.c("Bugle.Rbm.ChatbotDirectory.StartConversationFromDeeplinkFailure");
            return;
        }
        if (optionalA.isPresent()) {
            ekgbVarR = ekgb.r(((anty) this.k.b()).h(((alrj) this.j.b()).a((String) optionalA.get())));
        } else {
            Stream map = DesugarArrays.stream((String[]) optionalB.get()).filter(new Predicate() { // from class: cvnf
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return !ejwk.c((String) obj);
                }
            }).map(new Function() { // from class: cvng
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((alrj) this.a.j.b()).n((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: cvnh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((anty) this.a.k.b()).h((alqm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgbVarR = (ekgb) map.collect(ekcv.a);
        }
        ekgb ekgbVar = ekgbVarR;
        final int intExtra = intent.getIntExtra("simSlot", -1);
        Optional optionalFindFirst = Collection.EL.stream(((crny) this.v.b()).m()).filter(new Predicate() { // from class: cvni
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((crof) obj).d() == intExtra;
            }
        }).map(new Function() { // from class: cvnj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((crof) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).findFirst();
        ehac ehacVar = (ehac) this.f.b();
        uoq uoqVar = (uoq) this.u.b();
        cogw cogwVar = (cogw) uoqVar.a.b();
        cogwVar.getClass();
        eosc eoscVar = (eosc) uoqVar.b.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) uoqVar.c.b();
        eoscVar2.getClass();
        ajln ajlnVar = (ajln) uoqVar.d.b();
        ajlnVar.getClass();
        fcsu fcsuVar = uoqVar.e;
        fcsu fcsuVar2 = uoqVar.f;
        ekgbVar.getClass();
        optionalFindFirst.getClass();
        ehacVar.a(new uop(cogwVar, eoscVar, eoscVar2, ajlnVar, fcsuVar, fcsuVar2, ekgbVar, optionalFindFirst), this.w);
    }

    public final void b(ConversationId conversationId, Integer num) {
        avmp avmpVar = (avmp) this.q.b();
        bato batoVar = new bato(this.x);
        Activity activity = this.p;
        avmpVar.C(activity, conversationId, num, batoVar);
        activity.finish();
    }
}
