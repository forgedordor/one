package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xco implements fdpm {
    final /* synthetic */ xdz a;

    public xco(xdz xdzVar) {
        this.a = xdzVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        CharSequence wwaVar;
        SpannableStringBuilder spannableStringBuilder;
        vvw vvwVar = (vvw) obj;
        xdz xdzVar = this.a;
        if (xdzVar.i.a()) {
            vvwVar.getClass();
            String str = vvwVar.a;
            wwaVar = null;
            if (str != null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                cilq<cilo> cilqVar = vvwVar.j;
                if (cilqVar != null) {
                    for (cilo ciloVar : cilqVar) {
                        ciloVar.getClass();
                        wve.a(spannableStringBuilder, ciloVar.e, ciloVar.b, ciloVar.c);
                    }
                }
            } else {
                spannableStringBuilder = null;
            }
            if (spannableStringBuilder != null) {
                wwaVar = new wwa(spannableStringBuilder);
            }
        } else {
            wwaVar = vvwVar.a;
        }
        dnih dnihVar = xdzVar.n;
        if (fdbq.f(wwaVar, dnihVar.b(false))) {
            ekrw ekrwVarE = xdz.a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 211, "DraftTextUiAdapterImpl.kt")).t("Skipping draft text field response to draft state %s", cqcy.b(wwaVar));
        } else if (wwaVar == null) {
            ekrw ekrwVarH = xdz.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 217, "DraftTextUiAdapterImpl.kt")).q("Clearing draft text field in response to draft state");
            dnihVar.e();
        } else {
            ekrw ekrwVarE2 = xdz.a.e();
            ekrwVarE2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$1$3", "emit", 223, "DraftTextUiAdapterImpl.kt")).t("Setting draft text field in response to draft state %s", cqcy.b(wwaVar));
            dnihVar.k(wwaVar);
        }
        return fctx.a;
    }
}
