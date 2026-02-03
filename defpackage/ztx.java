package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztx implements ztw {
    private final Context a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final Optional f;

    public ztx(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, Optional optional) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        optional.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = optional;
    }

    private final dldf d(String str, String str2) {
        String str3 = this.a.getString(R.string.conversation_suggestion_sticker) + ": " + str;
        Uri uri = Uri.parse(str2);
        uri.getClass();
        return new dldf(str3, uri, new fdae() { // from class: dldd
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dlde
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }

    private final dlfk e(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_launch_calendar_action);
        string.getClass();
        return new dlfk(string, str, djrr.P, null, false, 248);
    }

    private final dlfk f(String str) {
        if (!((dfmi) this.e.b()).a()) {
            return null;
        }
        String string = this.a.getString(R.string.conversation_suggestion_compose_audio_action);
        string.getClass();
        return new dlfk(string, str, djrr.cs, null, false, 248);
    }

    private final dlfk g(String str) {
        if (!((dfmi) this.e.b()).a()) {
            return null;
        }
        String string = this.a.getString(R.string.conversation_suggestion_compose_text_action);
        string.getClass();
        return new dlfk(string, str, djrr.ac, null, false, 248);
    }

    private final dlfk h(String str) {
        if (!((dfmi) this.e.b()).a()) {
            return null;
        }
        String string = this.a.getString(R.string.conversation_suggestion_compose_video_action);
        string.getClass();
        return new dlfk(string, str, djrr.eE, null, false, 248);
    }

    private final dlfk i(String str) {
        String string = this.a.getString(R.string.action_copy_otp, cpga.d(str));
        string.getClass();
        return new dlfk("", string, djrr.aE, null, false, 248);
    }

    private final dlfk j(String str) {
        Object[] objArr = {str};
        Context context = this.a;
        String string = context.getString(R.string.p2p_conversation_suggestion_gif_search_display_text, objArr);
        string.getClass();
        String string2 = context.getString(R.string.p2p_conversation_suggestion_gif_search_action);
        string2.getClass();
        return new dlfk(string2, string, djrr.dx, null, false, 248);
    }

    private final dlfk k(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_share_location_action);
        string.getClass();
        return new dlfk(string, str, djrr.cE, null, false, 248);
    }

    private final dlfk l(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_launch_map_action);
        string.getClass();
        return new dlfk(string, str, djrr.ci, null, false, 248);
    }

    private final dlfk m(boolean z) {
        Optional optional = this.f;
        if (!optional.isPresent()) {
            return null;
        }
        Context context = this.a;
        String string = context.getString(R.string.suggested_text_label);
        string.getClass();
        return z ? new dlfk(string, null, djrr.cS, null, false, 248) : new dlfk(string, null, djrr.cq, null, false, 248);
    }

    private final dlfk n(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_launch_phone_action);
        string.getClass();
        return new dlfk(string, str, djrr.T, null, false, 248);
    }

    private final dlfk o() {
        Context context = this.a;
        String string = context.getString(R.string.conversation_suggestion_create_photomoji);
        string.getClass();
        String string2 = context.getString(R.string.conversation_suggestion_create_photomoji_action);
        string2.getClass();
        return new dlfk(string2, string, djrr.dT, null, false, 248);
    }

    private final dlfk p() throws Resources.NotFoundException {
        String string = this.a.getResources().getString(R.string.p2p_conversation_suggestion_share_recent_image_display_text);
        string.getClass();
        return new dlfk("", string, djrr.bR, null, false, 248);
    }

    private final dlfk q() {
        Context context = this.a;
        String string = context.getString(R.string.conversation_suggestion_record_voice_message_action);
        string.getClass();
        return new dlfk(string, context.getString(R.string.conversation_suggestion_record_voice_message), djrr.aB, null, false, 248);
    }

    private final dlfk r() {
        String string = ((Boolean) czwc.h.e()).booleanValue() ? this.a.getString(R.string.p2p_conversation_suggestion_set_reminder_predefined_text) : this.a.getString(R.string.p2p_conversation_suggestion_set_reminder_text);
        string.getClass();
        String string2 = this.a.getString(R.string.conversation_suggestion_set_reminder_action);
        string2.getClass();
        return new dlfk(string2, string, djrr.k, null, false, 248);
    }

    private final dlfk s(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = this.a.getString(R.string.conversation_suggestion_send_reply);
        string.getClass();
        return new dlfk(string, str, null, null, ((cqmb) this.c.b()).g(str), 236);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dlfk t(java.lang.String r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            r8 = this;
            android.content.Context r0 = r8.a
            r1 = 2132083697(0x7f1503f1, float:1.9807544E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r1 = defpackage.fcva.i(r1)
            int r2 = r9.hashCode()
            switch(r2) {
                case -1039460313: goto L76;
                case -929955525: goto L5f;
                case -901253765: goto L48;
                case -373140790: goto L31;
                case 2374546: goto L1a;
                default: goto L18;
            }
        L18:
            goto L8d
        L1a:
            java.lang.String r2 = "Love"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L8d
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2130903107(0x7f030043, float:1.7413023E38)
            java.lang.String[] r9 = r9.getStringArray(r2)
            r9.getClass()
            goto L90
        L31:
            java.lang.String r2 = "Celebration"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L8d
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2130903043(0x7f030003, float:1.7412893E38)
            java.lang.String[] r9 = r9.getStringArray(r2)
            r9.getClass()
            goto L90
        L48:
            java.lang.String r2 = "HowAreYou"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L8d
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2130903101(0x7f03003d, float:1.741301E38)
            java.lang.String[] r9 = r9.getStringArray(r2)
            r9.getClass()
            goto L90
        L5f:
            java.lang.String r2 = "GoodNight"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L8d
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2130903097(0x7f030039, float:1.7413002E38)
            java.lang.String[] r9 = r9.getStringArray(r2)
            r9.getClass()
            goto L90
        L76:
            java.lang.String r2 = "GoodMorning"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L8d
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2130903096(0x7f030038, float:1.7413E38)
            java.lang.String[] r9 = r9.getStringArray(r2)
            r9.getClass()
            goto L90
        L8d:
            r9 = 0
            java.lang.String[] r9 = new java.lang.String[r9]
        L90:
            defpackage.fcva.z(r1, r9)
            int r9 = r1.size()
            int r10 = r10 % r9
            java.lang.Object r9 = r1.get(r10)
            r9.getClass()
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r9 = 2132083698(0x7f1503f2, float:1.9807546E38)
            java.lang.String r2 = r0.getString(r9)
            r2.getClass()
            dlfk r1 = new dlfk
            djrr r4 = defpackage.djrr.dz
            r6 = 0
            r7 = 248(0xf8, float:3.48E-43)
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztx.t(java.lang.String, int):dlfk");
    }

    private final dlfq u() {
        String string = this.a.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
        string.getClass();
        boolean zBooleanValue = ((Boolean) csym.b.e()).booleanValue();
        int iIntValue = R.drawable.comms_gm_ic_videocam_vd_theme_24;
        if (zBooleanValue) {
            Object objOrElse = ((csyk) this.b.b()).a().orElse(Integer.valueOf(R.drawable.comms_gm_ic_videocam_vd_theme_24));
            objOrElse.getClass();
            iIntValue = ((Number) objOrElse).intValue();
        }
        return new dlfq("", string, new dlfn(iIntValue), new dlel(null), 112);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dlfr v(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztx.v(java.lang.String, java.lang.String, java.lang.String, boolean):dlfr");
    }

    @Override // defpackage.ztw
    public final dlfg a(aldp aldpVar) {
        aldpVar.getClass();
        if (!(aldpVar instanceof SmartSuggestionData)) {
            if (!(aldpVar instanceof RbmSuggestionData)) {
                throw new IllegalArgumentException("Unsupported suggestion type when creating SuggestionUiData: ".concat(String.valueOf(aldpVar.getClass().getSimpleName())));
            }
            RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) aldpVar;
            ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
            switch (conversationSuggestion.getSuggestionType()) {
                case 0:
                    String string = this.a.getString(R.string.conversation_suggestion_send_reply);
                    string.getClass();
                    return new dlfk(string, rbmSuggestionData.a(), null, null, false, 248);
                case 1:
                case 11:
                    return v(rbmSuggestionData.a(), conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI), conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION), conversationSuggestion.getSuggestionType() == 11);
                case 2:
                    return n(rbmSuggestionData.a());
                case 3:
                    return l(rbmSuggestionData.a());
                case 4:
                    String string2 = this.a.getString(R.string.conversation_suggestion_launch_calendar_action);
                    string2.getClass();
                    return new dlfk(string2, rbmSuggestionData.a(), djrr.P, null, false, 248);
                case 5:
                    return k(rbmSuggestionData.a());
                case 6:
                case 7:
                default:
                    return null;
                case 8:
                    return g(rbmSuggestionData.a());
                case 9:
                    return f(rbmSuggestionData.a());
                case 10:
                    return h(rbmSuggestionData.a());
            }
        }
        SmartSuggestionData smartSuggestionData = (SmartSuggestionData) aldpVar;
        switch (smartSuggestionData.l().ordinal()) {
            case 0:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 33:
            case 40:
                return null;
            case 1:
            case 2:
            case 15:
            case 16:
            case 34:
                return s(smartSuggestionData.a());
            case 3:
                return k(this.a.getString(R.string.p2p_conversation_suggestion_share_location_text));
            case 5:
                return j(smartSuggestionData.p());
            case 9:
                return p();
            case 11:
                return r();
            case 12:
                return d(smartSuggestionData.t(), smartSuggestionData.u());
            case 13:
                return u();
            case 22:
                return i(smartSuggestionData.r());
            case 23:
                return e(this.a.getString(R.string.p2p_conversation_suggestion_add_to_calendar_action_text));
            case 31:
                return c(smartSuggestionData);
            case 32:
                String string3 = this.a.getString(R.string.conversation_suggestion_send_reply);
                string3.getClass();
                return new dlfk(string3, smartSuggestionData.a(), djrr.co, new dlej(), false, 240);
            case 35:
                Context context = this.a;
                String string4 = context.getString(R.string.p2p_conversation_suggestion_share_location_penpal_text);
                string4.getClass();
                String string5 = context.getString(R.string.conversation_suggestion_share_location_penpal_action);
                string5.getClass();
                return new dlfk(string5, string4, djrr.cE, null, false, 248);
            case 36:
                return t(smartSuggestionData.s(), smartSuggestionData.h());
            case 37:
                return o();
            case 38:
                ezgi ezgiVarM = smartSuggestionData.m();
                int iA = ezek.a((ezgiVarM.c == 31 ? (ezel) ezgiVarM.d : ezel.a).b);
                return m(iA != 0 && iA == 4);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return q();
            default:
                throw new fctg();
        }
    }

    @Override // defpackage.ztw
    public final dlfg b(alff alffVar) throws Resources.NotFoundException {
        dlfg dlfgVarS;
        if (alffVar instanceof bbeg) {
            return s(((bbeg) alffVar).b);
        }
        if (alffVar instanceof alfb) {
            return i(((alfb) alffVar).d());
        }
        if (alffVar instanceof bbeh) {
            bbeh bbehVar = (bbeh) alffVar;
            return t(bbehVar.a, bbehVar.b);
        }
        if (alffVar instanceof bbea) {
            return j(((bbea) alffVar).a);
        }
        if (alffVar instanceof bbeb) {
            bbeb bbebVar = (bbeb) alffVar;
            return d(bbebVar.a.t(), bbebVar.c());
        }
        if (alffVar instanceof alfe) {
            alfe alfeVar = (alfe) alffVar;
            return v(((bbdw) alfeVar.h()).b, alfeVar.d(), alfeVar.c(), alffVar.a() == alfd.e);
        }
        int iOrdinal = alffVar.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    dlfgVarS = k(alffVar instanceof alez ? ((alez) alffVar).h().c() : this.a.getString(R.string.p2p_conversation_suggestion_share_location_text));
                } else if (iOrdinal == 5) {
                    dlfgVarS = e(alffVar instanceof alez ? ((alez) alffVar).h().c() : this.a.getString(R.string.p2p_conversation_suggestion_add_to_calendar_action_text));
                } else if (iOrdinal != 9) {
                    switch (iOrdinal) {
                        case 12:
                            dlfgVarS = o();
                            break;
                        case 13:
                            dlfgVarS = m(true);
                            break;
                        case 14:
                            dlfgVarS = m(false);
                            break;
                        case 15:
                            dlfgVarS = q();
                            break;
                        case 16:
                            dlfgVarS = p();
                            break;
                        case 17:
                            dlfgVarS = r();
                            break;
                        case 18:
                            if (!(alffVar instanceof alez)) {
                                throw new IllegalArgumentException("Unsupported map suggestion");
                            }
                            dlfgVarS = l(((alez) alffVar).h().c());
                            break;
                        case 19:
                            if (!(alffVar instanceof alez)) {
                                throw new IllegalArgumentException("Unsupported compose txt suggestion");
                            }
                            dlfgVarS = g(((alez) alffVar).h().c());
                            break;
                        case 20:
                            if (!(alffVar instanceof alez)) {
                                throw new IllegalArgumentException("Unsupported compose video suggestion");
                            }
                            dlfgVarS = h(((alez) alffVar).h().c());
                            break;
                        case 21:
                            if (!(alffVar instanceof alez)) {
                                throw new IllegalArgumentException("Unsupported compose audio suggestion");
                            }
                            dlfgVarS = f(((alez) alffVar).h().c());
                            break;
                        default:
                            alfd alfdVarA = alffVar.a();
                            Objects.toString(alfdVarA);
                            throw new IllegalArgumentException("Unsupported suggestion type when creating SuggestionUiData for SuggestionV2: ".concat(String.valueOf(alfdVarA)));
                    }
                } else {
                    dlfgVarS = u();
                }
            } else {
                if (!(alffVar instanceof alez)) {
                    throw new IllegalArgumentException("Unsupported phone suggestion");
                }
                dlfgVarS = n(((alez) alffVar).h().c());
            }
        } else {
            if (!(alffVar instanceof alez)) {
                throw new IllegalArgumentException("Unsupported Reply suggestion");
            }
            dlfgVarS = s(((alez) alffVar).h().c());
        }
        dlfgVarS.getClass();
        return dlfgVarS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ztw
    public final dlfk c(aldp aldpVar) {
        if (aldpVar.l() != ezan.SMARTER_REPLY) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String strA = aldpVar.a();
        if (strA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = this.a.getString(R.string.conversation_suggestion_send_reply);
        string.getClass();
        return new dlfk(string, strA, null, new dlei(true, 1), false, 244);
    }
}
