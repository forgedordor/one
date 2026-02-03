package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwct implements cwcp {
    public final cphv a;
    public final fcsu b;
    public final aref c;
    public final fcsu d;
    private final fdjx e;
    private final fdpl f;
    private final fdpl g;
    private final fcsu h;
    private final fcsu i;
    private final cwdc j;

    public cwct(fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, cphv cphvVar, fcsu fcsuVar, fcsu fcsuVar2, cwdc cwdcVar, fcsu fcsuVar3, aref arefVar, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cwdcVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.e = fdjxVar;
        this.f = fdplVar;
        this.g = fdplVar2;
        this.a = cphvVar;
        this.b = fcsuVar;
        this.h = fcsuVar2;
        this.j = cwdcVar;
        this.i = fcsuVar3;
        this.c = arefVar;
        this.d = fcsuVar4;
    }

    @Override // defpackage.cwcp
    public final fdvc a() {
        fduf fdufVar = ((cwfa) this.i.b()).c;
        cwcs cwcsVar = new cwcs(this, null);
        fdjx fdjxVar = this.e;
        return fdtg.b(avac.h(this.f, this.g, this.j.b, fdufVar, fdjxVar, cwcsVar), fdjxVar, fdur.a(0L, 3), null);
    }

    public final dkri b(final ekgb ekgbVar, final Recipient recipient, boolean z) {
        List listB;
        Object next;
        if (recipient != null) {
            if (z) {
                Iterator<E> it = ekgbVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (fdbq.f(((ResolvedRecipient) next).g(), recipient.g())) {
                        break;
                    }
                }
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) next;
                listB = fcva.b(resolvedRecipient != null ? resolvedRecipient.G() : null);
            } else {
                listB = fcva.b(recipient.G());
            }
        } else if (ekgbVar.size() == 1) {
            listB = fcva.b(((ResolvedRecipient) ekgbVar.get(0)).G());
        } else {
            fcsu fcsuVar = this.h;
            List listW = cpbr.w(((axjf) fcsuVar.b()).c(cpbl.b, ekgbVar));
            listW.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(listW, 10));
            Iterator it2 = listW.iterator();
            while (it2.hasNext()) {
                arrayList.add(Uri.parse((String) it2.next()));
            }
            List listW2 = cpbr.w(((axjf) fcsuVar.b()).c(cpbl.a, ekgbVar));
            listW2.getClass();
            ArrayList arrayList2 = new ArrayList(fcva.p(listW2, 10));
            Iterator it3 = listW2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Uri.parse((String) it3.next()));
            }
            Iterator it4 = arrayList.iterator();
            Iterator it5 = arrayList2.iterator();
            ArrayList arrayList3 = new ArrayList(Math.min(fcva.p(arrayList, 10), fcva.p(arrayList2, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                arrayList3.add(new anvw((Uri) it4.next(), (Uri) it5.next(), chpq.PROFILE_UNSPECIFIED_SOURCE));
            }
            listB = arrayList3;
        }
        List<anvw> listAe = fcva.ae(listB);
        ArrayList arrayList4 = new ArrayList(fcva.p(listAe, 10));
        for (anvw anvwVar : listAe) {
            Uri uri = anvwVar.a;
            if (uri == null) {
                return null;
            }
            Uri uriO = cpbr.o(uri);
            if (uriO == null) {
                uriO = uri.buildUpon().appendQueryParameter("sz", cpbl.b.c).build();
            }
            Uri uri2 = uriO;
            Uri uri3 = anvwVar.b;
            uri2.getClass();
            arrayList4.add(new dkpf(uri2, false, this.a.a(((cpch) this.b.b()).g()), 0, uri3, 8));
        }
        return new dkrj(arrayList4, 2, 0.01f, new fdae() { // from class: cwcr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.fdae
            public final Object invoke() {
                Recipient recipient2 = recipient;
                ResolvedRecipient resolvedRecipient2 = null;
                if (recipient2 != null) {
                    Iterator<E> it6 = ekgbVar.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Object next2 = it6.next();
                        if (fdbq.f(((ResolvedRecipient) next2).g(), recipient2.g())) {
                            resolvedRecipient2 = next2;
                            break;
                        }
                    }
                    resolvedRecipient2 = resolvedRecipient2;
                }
                this.a.c(resolvedRecipient2);
                return fctx.a;
            }
        }, 3);
    }

    public final void c(ResolvedRecipient resolvedRecipient) {
        cwfa cwfaVar = (cwfa) this.i.b();
        cwfaVar.b.f(resolvedRecipient);
        cwfaVar.a.f(cwhe.c);
        cwfaVar.c.f(false);
    }
}
