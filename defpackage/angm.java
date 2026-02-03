package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class angm implements angr, angs {
    private final Context a;
    private final andw b;
    private final ekgp c;
    private final cklv d;
    private final ekgb e;

    public angm(Context context, andw andwVar, ekgp ekgpVar, cklv cklvVar, ckmb ckmbVar) {
        anhj anhuVar;
        fhaz fhazVar;
        angn angnVar;
        String strY;
        Uri uriB;
        String strX;
        String string;
        this.a = context;
        this.b = andwVar;
        this.c = ekgpVar;
        this.d = cklvVar;
        evtg<ckme> evtgVar = cklvVar.b;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        for (ckme ckmeVar : evtgVar) {
            ckmb ckmbVar2 = ckmeVar.c;
            ckml ckmlVarB = ckml.b((ckmbVar2 == null ? ckmb.a : ckmbVar2).e);
            if ((ckmlVarB == null ? ckml.UNRECOGNIZED : ckmlVarB).ordinal() != 13) {
                ckmb ckmbVar3 = ckmeVar.c;
                String str = (ckmbVar3 == null ? ckmb.a : ckmbVar3).d;
                str.getClass();
                anhuVar = new angl(str);
            } else if (((Boolean) crbf.aj.e()).booleanValue()) {
                ckmb ckmbVar4 = ckmeVar.c;
                ckmbVar4 = ckmbVar4 == null ? ckmb.a : ckmbVar4;
                String str2 = (ckmbVar4.b == 101 ? (dnwn) ckmbVar4.c : dnwn.a).c;
                str2.getClass();
                ckmb ckmbVar5 = ckmeVar.c;
                ckmbVar5 = ckmbVar5 == null ? ckmb.a : ckmbVar5;
                dokx dokxVar = (ckmbVar5.b == 101 ? (dnwn) ckmbVar5.c : dnwn.a).g;
                dltt dlttVar = (dokxVar == null ? dokx.a : dokxVar).f;
                String str3 = (dlttVar == null ? dltt.a : dlttVar).f;
                str3.getClass();
                anhuVar = new anhv(str2, str3);
            } else {
                ckmb ckmbVar6 = ckmeVar.c;
                ckmbVar6 = ckmbVar6 == null ? ckmb.a : ckmbVar6;
                dnwn dnwnVar = ckmbVar6.b == 101 ? (dnwn) ckmbVar6.c : dnwn.a;
                dnwnVar.getClass();
                anhuVar = new anhu(dnwr.i(dnwnVar));
            }
            int size = ckmeVar.d.size();
            ckmb ckmbVar7 = ckmeVar.c;
            boolean zF = fdbq.f(ckmbVar7 == null ? ckmb.a : ckmbVar7, ckmbVar);
            evtg<ckmi> evtgVar2 = ckmeVar.d;
            evtgVar2.getClass();
            ArrayList arrayList2 = new ArrayList(fcva.p(evtgVar2, 10));
            for (ckmi ckmiVar : evtgVar2) {
                fhaz fhazVar2 = ckmiVar.e;
                fhazVar2 = fhazVar2 == null ? fhaz.a : fhazVar2;
                fhaz fhazVar3 = fhaz.a;
                String strA = null;
                strA = null;
                strA = null;
                if (fdbq.f(fhazVar2, fhazVar3)) {
                    fhazVar = null;
                } else {
                    fhaz fhazVar4 = ckmiVar.e;
                    fhazVar = fhazVar4 == null ? fhazVar3 : fhazVar4;
                }
                ckly cklyVar = ckmiVar.c;
                if ((cklyVar == null ? ckly.a : cklyVar).c) {
                    ekgp ekgpVar2 = this.c;
                    ckly cklyVar2 = ckmiVar.c;
                    aoer aoerVar = (aoer) ekgpVar2.get((cklyVar2 == null ? ckly.a : cklyVar2).b);
                    if (aoerVar == null) {
                        Iterator it = this.c.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                aoerVar = null;
                                break;
                            }
                            aoer aoerVar2 = (aoer) ((Map.Entry) it.next()).getValue();
                            if (aoerVar2 != null) {
                                aoerVar = aoerVar2;
                                break;
                            }
                        }
                        if (aoerVar == null) {
                            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
                        }
                    }
                    aoer aoerVar3 = aoerVar;
                    if (eotp.a("bugle.show_sim_name_for_self_reaction", "bugle")) {
                        string = aoerVar3.q();
                    } else {
                        string = this.a.getString(R.string.you_name);
                        string.getClass();
                    }
                    String str4 = string;
                    Uri uriC = aoerVar3.c();
                    boolean z = ckmiVar.d;
                    String str5 = ckmiVar.f;
                    str5 = str5.length() == 0 ? null : str5;
                    angnVar = new angn(str4, uriC, z, aoerVar3, fhazVar, null, str5 != null ? basd.a(str5) : null, 32);
                } else {
                    andw andwVar2 = this.b;
                    ckly cklyVar3 = ckmiVar.c;
                    ResolvedRecipient resolvedRecipientC = andwVar2.c((cklyVar3 == null ? ckly.a : cklyVar3).b);
                    String str6 = (resolvedRecipientC == null || (strX = resolvedRecipientC.x(true)) == null) ? "" : strX;
                    Uri uri = (resolvedRecipientC == null || (uriB = resolvedRecipientC.b()) == null) ? Uri.EMPTY : uriB;
                    uri.getClass();
                    boolean z2 = ckmiVar.d;
                    if (eotp.a("bugle.enable_profile_name_in_reactions", "bugle") && resolvedRecipientC != null && (strY = resolvedRecipientC.y()) != null) {
                        strA = chsk.a(strY);
                    }
                    angnVar = new angn(str6, uri, z2, null, fhazVar, strA, null, 72);
                }
                arrayList2.add(angnVar);
            }
            arrayList.add(new ango(anhuVar, size, zF, ekfv.a(arrayList2)));
        }
        this.e = ekfv.a(arrayList);
    }

    @Override // defpackage.angr
    public final /* synthetic */ anhj a() {
        return angq.a(this);
    }

    @Override // defpackage.angr
    public final /* synthetic */ anhj b(aoer aoerVar) {
        return angq.b(this, aoerVar);
    }

    @Override // defpackage.angr
    public final /* synthetic */ anho c(aoer aoerVar) {
        return angq.c(this, aoerVar);
    }

    @Override // defpackage.angr
    public final ekgb d() {
        return this.e;
    }

    @Override // defpackage.angs
    public final Instant e() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.d.c);
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }
}
