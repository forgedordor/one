package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvoq extends fdbb implements fdat {
    public cvoq(Object obj) {
        super(2, obj, cvou.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2LoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) throws Resources.NotFoundException {
        String string;
        String string2;
        String strA;
        cvpk cvpkVar = (cvpk) obj;
        final cvou cvouVar = (cvou) this.b;
        final ResolvedRecipient resolvedRecipient = cvpkVar.a;
        tdo tdoVar = null;
        if (resolvedRecipient != null) {
            if (!cvpkVar.b) {
                return null;
            }
            antq antqVarJ = resolvedRecipient.j();
            if (cvou.c(antqVarJ)) {
                Context context = cvouVar.a;
                SpannableString spannableStringA = cvouVar.g.a(resolvedRecipient.g());
                if (aqbw.a()) {
                    antqVarJ.getClass();
                    String str = ((chos) antqVarJ).g.e;
                    str.getClass();
                    strA = cssf.a(str);
                } else {
                    antqVarJ.getClass();
                    strA = ((chos) antqVarJ).g.e;
                    strA.getClass();
                }
                string = context.getString(R.string.add_contact_banner_title_with_name, spannableStringA, strA);
                string.getClass();
            } else {
                string = cvouVar.a.getString(R.string.add_contact_banner_title_v2, cvouVar.g.a(resolvedRecipient.g()));
                string.getClass();
            }
            String str2 = string;
            if (cvou.c(antqVarJ)) {
                string2 = cvouVar.a.getString(R.string.add_contact_banner_body_profile_disclosure);
                string2.getClass();
            } else {
                string2 = cvouVar.a.getString(R.string.add_contact_banner_body_v2);
                string2.getClass();
            }
            String str3 = string2;
            tdq tdqVar = new tdq(djrr.cX);
            Context context2 = cvouVar.a;
            String string3 = context2.getResources().getString(R.string.add_contact_banner_add_button);
            string3.getClass();
            tdk tdkVar = new tdk(string3, new fdae() { // from class: cvom
                @Override // defpackage.fdae
                public final Object invoke() {
                    ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                    cvou cvouVar2 = cvouVar;
                    auvw.k(cvouVar2.c, null, null, new cvor(resolvedRecipient2, cvouVar2, null), 3);
                    if (!((Boolean) cvow.b.e()).booleanValue()) {
                        if (((Boolean) ((cczi) cvox.a.get()).e()).booleanValue()) {
                            ((cvox) cvouVar2.i.b()).a(4);
                        } else {
                            ((ajhd) cvouVar2.h.b()).ae(4);
                        }
                    }
                    cvouVar2.k.a("add_contact", tdv.b);
                    return fctx.a;
                }
            });
            String string4 = context2.getString(R.string.add_contact_banner_spam_button);
            string4.getClass();
            tdoVar = new tdo("add_contact", str2, str3, tdqVar, tdkVar, new tdk(string4, new fdae() { // from class: cvon
                @Override // defpackage.fdae
                public final Object invoke() {
                    ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                    cvou cvouVar2 = cvouVar;
                    cvouVar2.j.a(new tlk(resolvedRecipient2, cvouVar2.d, 2, 14));
                    return fctx.a;
                }
            }), false, new fdae() { // from class: cvoo
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvou cvouVar2 = cvouVar;
                    auvw.k(cvouVar2.c, cvouVar2.b, null, new cvot(cvouVar2, null), 2);
                    return fctx.a;
                }
            }, new fdae() { // from class: cvop
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvou cvouVar2 = cvouVar;
                    auvw.k(cvouVar2.c, cvouVar2.b, null, new cvos(cvouVar2, null), 2);
                    return fctx.a;
                }
            }, 320);
        }
        return tdoVar;
    }
}
