package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaeq implements aaef {
    public final Context a;
    public final afzc b;
    public final fdjx c;
    public final aaed d;

    public aaeq(Context context, aaed aaedVar, afzc afzcVar, fdjx fdjxVar) {
        context.getClass();
        afzcVar.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.d = aaedVar;
        this.b = afzcVar;
        this.c = fdjxVar;
    }

    private final List e(String str, String str2) {
        int iO = fdgn.O(str, str2, 0, false, 6);
        return fcva.b(new diin(dijs.h, iO, iO + str2.length(), str2, new fdap() { // from class: aaeh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws IOException {
                Intent intent = new Intent();
                aaeq aaeqVar = this.a;
                Context context = aaeqVar.a;
                Intent intentAddFlags = intent.setClass(context, ProtectionSafetySettingsActivity.class).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                intentAddFlags.getClass();
                eiid.o(context, intentAddFlags);
                return true;
            }
        }));
    }

    private final List f(String str, String str2) {
        int iO = fdgn.O(str, str2, 0, false, 6);
        return fcva.b(new diin(dijs.h, iO, iO + str2.length(), str2, new fdap() { // from class: aaek
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final aaeq aaeqVar = this.a;
                aaeqVar.b.h(new agcy(new amwf() { // from class: aaeg
                    @Override // defpackage.amwf
                    public final /* synthetic */ ekgb a() {
                        int i = ekgb.d;
                        return ekoe.a;
                    }

                    @Override // defpackage.amwf, defpackage.amvr
                    public final /* synthetic */ String b() {
                        return "text/plain";
                    }

                    @Override // defpackage.amwf
                    public final String c() {
                        return aaeqVar.a.getString(R.string.spatula_trust_flow_message_content_v2);
                    }
                }));
                return true;
            }
        }));
    }

    private final void g(List list, final aaee aaeeVar) {
        if (aaeeVar.c) {
            return;
        }
        String string = this.a.getString(R.string.spatula_screen_help_content_blocking);
        string.getClass();
        list.add(new dkeg(string, null, null, null, null, null, new dkdk(djrr.aj), new fdae() { // from class: aaeo
            @Override // defpackage.fdae
            public final Object invoke() {
                aaeeVar.a.invoke();
                aaeq aaeqVar = this;
                auvw.k(aaeqVar.c, null, null, new aaep(aaeqVar, null), 3);
                return fctx.a;
            }
        }, 62));
    }

    @Override // defpackage.aaef
    public final aaet a(fdae fdaeVar, fdae fdaeVar2) {
        Context context = this.a;
        String string = context.getString(R.string.spatula_screen_settings_link);
        string.getClass();
        String string2 = context.getString(R.string.spatula_screen_forwarding_subtitle, string);
        string2.getClass();
        String string3 = context.getString(R.string.spatula_screen_receiving_infolist_text3_trust_flow_link);
        string3.getClass();
        String string4 = context.getString(R.string.spatula_screen_forwarding_infolist_text3, string3);
        string4.getClass();
        djrr djrrVar = djrr.G;
        String string5 = context.getString(R.string.spatula_screen_forwarding_headline);
        string5.getClass();
        List listE = e(string2, string);
        String string6 = context.getString(R.string.spatula_screen_forwarding_intro);
        string6.getClass();
        String string7 = context.getString(R.string.spatula_screen_forwarding_infolist_text1);
        string7.getClass();
        String string8 = context.getString(R.string.spatula_screen_forwarding_infolist_text2);
        string8.getClass();
        List listG = fcva.g(new djzh(string7, djrr.dE, (List) null, false, 28), new djzh(string8, djrr.D, (List) null, false, 28), new djzh(string4, djrr.eR, f(string4, string3), false, 20));
        String string9 = context.getString(R.string.spatula_screen_help_content_sharing);
        string9.getClass();
        return new aaet(djrrVar, string5, string2, listE, string6, listG, fcva.b(new dkeg(string9, null, null, null, null, null, new dkdk(djrr.aj), new fdae() { // from class: aael
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.d();
                return fctx.a;
            }
        }, 62)), fdaeVar, fdaeVar2, null);
    }

    @Override // defpackage.aaef
    public final aaet b(aaee aaeeVar) {
        Context context = this.a;
        String string = context.getString(R.string.spatula_screen_settings_link);
        string.getClass();
        String string2 = context.getString(R.string.spatula_screen_receiving_subtitle, string);
        string2.getClass();
        String string3 = context.getString(R.string.spatula_screen_receiving_infolist_text3_trust_flow_link);
        string3.getClass();
        String string4 = context.getString(R.string.spatula_screen_receiving_infolist_text3, string3);
        string4.getClass();
        djrr djrrVar = djrr.G;
        String string5 = context.getString(R.string.spatula_screen_receiving_headline);
        string5.getClass();
        List listE = e(string2, string);
        String string6 = context.getString(R.string.spatula_screen_intro);
        string6.getClass();
        String string7 = context.getString(R.string.spatula_screen_receiving_infolist_text1);
        string7.getClass();
        String string8 = context.getString(R.string.spatula_screen_receiving_infolist_text2);
        string8.getClass();
        List listG = fcva.g(new djzh(string7, djrr.dE, (List) null, false, 28), new djzh(string8, djrr.D, (List) null, false, 28), new djzh(string4, djrr.eR, f(string4, string3), false, 20));
        fcww fcwwVar = new fcww((byte[]) null);
        String string9 = context.getString(R.string.spatula_screen_help_content_sharing);
        string9.getClass();
        fcwwVar.add(new dkeg(string9, null, null, null, null, null, new dkdk(djrr.aj), new fdae() { // from class: aaei
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.d();
                return fctx.a;
            }
        }, 62));
        g(fcwwVar, aaeeVar);
        List listA = fcva.a(fcwwVar);
        String string10 = context.getString(R.string.spatula_screen_receiving_bottomsheet_title);
        string10.getClass();
        String string11 = context.getString(R.string.spatula_screen_receiving_bottomsheet_body);
        string11.getClass();
        aaer aaerVar = new aaer(string10, string11, new fdae() { // from class: aaej
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
        djrr djrrVar2 = djrr.dc;
        String string12 = context.getString(R.string.spatula_screen_receiving_bottomsheet_continue_button_text);
        string12.getClass();
        String string13 = context.getString(R.string.spatula_screen_receiving_bottomsheet_back_button_text);
        string13.getClass();
        fdae fdaeVar = aaeeVar.b;
        return new aaet(djrrVar, string5, string2, listE, string6, listG, listA, aaeeVar.a, fdaeVar, new aaes(aaerVar, djrrVar2, string12, string13, fdaeVar));
    }

    @Override // defpackage.aaef
    public final aaet c(aaee aaeeVar) {
        Context context = this.a;
        String string = context.getString(R.string.spatula_screen_settings_link);
        string.getClass();
        String string2 = context.getString(R.string.spatula_screen_sending_subtitle, string);
        string2.getClass();
        String string3 = context.getString(R.string.spatula_screen_receiving_infolist_text3_trust_flow_link);
        string3.getClass();
        String string4 = context.getString(R.string.spatula_screen_sending_infolist_text3, string3);
        string4.getClass();
        djrr djrrVar = djrr.G;
        String string5 = context.getString(R.string.spatula_screen_sending_headline);
        string5.getClass();
        List listE = e(string2, string);
        String string6 = context.getString(R.string.spatula_screen_intro);
        string6.getClass();
        String string7 = context.getString(R.string.spatula_screen_sending_infolist_text1);
        string7.getClass();
        String string8 = context.getString(R.string.spatula_screen_sending_infolist_text2);
        string8.getClass();
        List listG = fcva.g(new djzh(string7, djrr.dE, (List) null, false, 28), new djzh(string8, djrr.D, (List) null, false, 28), new djzh(string4, djrr.eR, f(string4, string3), false, 20));
        fcww fcwwVar = new fcww((byte[]) null);
        String string9 = context.getString(R.string.spatula_screen_help_content_sharing);
        string9.getClass();
        fcwwVar.add(new dkeg(string9, null, null, null, null, null, new dkdk(djrr.aj), new fdae() { // from class: aaem
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.d();
                return fctx.a;
            }
        }, 62));
        g(fcwwVar, aaeeVar);
        List listA = fcva.a(fcwwVar);
        String string10 = context.getString(R.string.spatula_screen_sending_bottomsheet_title);
        string10.getClass();
        String string11 = context.getString(R.string.spatula_screen_sending_bottomsheet_body);
        string11.getClass();
        aaer aaerVar = new aaer(string10, string11, new fdae() { // from class: aaen
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
        djrr djrrVar2 = djrr.dA;
        String string12 = context.getString(R.string.spatula_screen_sending_bottomsheet_continue_button_text);
        string12.getClass();
        String string13 = context.getString(R.string.spatula_screen_sending_bottomsheet_back_button_text);
        string13.getClass();
        fdae fdaeVar = aaeeVar.b;
        return new aaet(djrrVar, string5, string2, listE, string6, listG, listA, aaeeVar.a, fdaeVar, new aaes(aaerVar, djrrVar2, string12, string13, fdaeVar));
    }

    public final void d() {
        Uri uri = Uri.parse("https://support.google.com/families?p=gff_help_find");
        uri.getClass();
        this.b.h(new agdi(uri));
    }
}
