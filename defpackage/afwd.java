package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class afwd extends fdbb implements fdau {
    public afwd(Object obj) {
        super(3, obj, afwu.class, "transformPersonal", "transformPersonal(Lcom/google/android/apps/messaging/multishare/suggestion/PersonalSearchResults;Lcom/google/android/apps/messaging/multishare/chip/ChipsState;)Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;", 4);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final afvp afvpVar = (afvp) obj;
        final afmy afmyVar = (afmy) obj2;
        final afwu afwuVar = (afwu) this.b;
        ArrayList arrayList = new ArrayList();
        String str = afvpVar.a;
        if (((cmvy) afwuVar.d.b()).k(str)) {
            final alqm alqmVarN = ((alrj) afwuVar.c.b()).n(str);
            if (!afmyVar.f(alqmVarN)) {
                arrayList.add(new afvo("phone_number", new fdae() { // from class: afvz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        String strN;
                        final afwu afwuVar2 = afwuVar;
                        Context context = afwuVar2.b;
                        Uri uriM = cpbr.m(context);
                        fcsu fcsuVar = afwuVar2.l;
                        boolean zA = ((aqiu) fcsuVar.b()).a();
                        final alqm alqmVar = alqmVarN;
                        if (zA) {
                            String strN2 = alqmVar.n();
                            strN2.getClass();
                            strN = cssf.b(strN2, false);
                        } else {
                            strN = alqmVar.n();
                            strN.getClass();
                        }
                        String str2 = strN;
                        String strB = ((aqiu) fcsuVar.b()).a() ? cssf.b(String.valueOf(alqmVar.m(true)), false) : String.valueOf(alqmVar.p(true));
                        afmy afmyVar2 = afmyVar;
                        uriM.getClass();
                        dkrk dkrkVar = new dkrk(new dkpf(uriM, null, null, 0, null, 30), null, 0, 0, 0.0f, null, 62);
                        String str3 = context.getString(R.string.multi_share_phone_number_suggestion_prefix) + " " + str2;
                        strB.getClass();
                        return new afvc("phone_number", new djys(dkrkVar, str3, strB, afmyVar2.f(alqmVar), new fdae() { // from class: afvy
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                alqm alqmVar2 = alqmVar;
                                ChipData chipData = new ChipData(new ChipId.Identity(alqmVar2), udo.a(alqmVar2), null, null, false, 28, null);
                                afwu afwuVar3 = afwuVar2;
                                afwuVar3.f.c(chipData);
                                afwuVar3.e.c();
                                return fctx.a;
                            }
                        }, new djyo(afwuVar2.k.a())));
                    }
                }));
            }
        }
        for (ajpq ajpqVar : afvpVar.b) {
            String strF = ajpqVar.f();
            arrayList.add(afwuVar.b(ajpqVar, "personal_contact_".concat(strF), afmyVar, afvpVar.c));
        }
        return new afvt(str, arrayList, new fdae() { // from class: afvx
            @Override // defpackage.fdae
            public final Object invoke() {
                dzub dzubVar = afvpVar.d;
                if (dzubVar != null) {
                    ((dzuc) afwuVar.g.b()).f(dzubVar, afxy.a, null, dzua.SUCCESS);
                }
                return fctx.a;
            }
        }, new afvs(afwuVar.k.a()));
    }
}
