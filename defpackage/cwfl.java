package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwfl extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cwfo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwfl(cwfo cwfoVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = cwfoVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cwfl cwflVar = new cwfl(this.e, (fcxy) obj5);
        cwflVar.a = (ajlk) obj;
        cwflVar.b = (cwhe) obj2;
        cwflVar.c = (ResolvedRecipient) obj3;
        cwflVar.d = (ekgb) obj4;
        return cwflVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        String strD;
        String str;
        chpq chpqVar;
        chpq chpqVar2;
        dkri dkrjVar;
        Uri uriA;
        Uri uriO;
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        cwhe cwheVar = cwhe.a;
        if (obj2 == cwheVar) {
            return null;
        }
        if (r1.c() == ajlj.GROUP && obj3 == null) {
            final cwfo cwfoVar = this.e;
            if (!cwfoVar.k.a() || (uriA = r1.a()) == null || (uriO = cpbr.o(uriA)) == null || !cqmz.v(uriO)) {
                List listW = cpbr.w(((axjf) cwfoVar.i.b()).c(cpbl.b, (ekgb) r4));
                listW.getClass();
                ArrayList arrayList = new ArrayList(fcva.p(listW, 10));
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uri.parse((String) it.next()));
                }
                List<Uri> listAe = fcva.ae(arrayList);
                ArrayList arrayList2 = new ArrayList(fcva.p(listAe, 10));
                for (Uri uri : listAe) {
                    Uri uriO2 = cpbr.o(uri);
                    if (uriO2 == null) {
                        uriO2 = cwfo.b(uri);
                    }
                    Uri uri2 = uriO2;
                    Uri uriN = cpbr.n(uri);
                    Uri uriB = uriN != null ? cwfo.b(uriN) : null;
                    uri2.getClass();
                    arrayList2.add(new dkpf(uri2, false, null, 0, uriB, 12));
                }
                dkrjVar = new dkrj(arrayList2, 3, 0.1f, null, 35);
            } else {
                dkrjVar = new dkrk(new dkpf(uriO, false, null, 0, cpbr.n(uriA), 12), null, 0, 0, 0.0f, null, 62);
            }
            Context context = cwfoVar.a;
            chpq chpqVar3 = chpq.PROFILE_UNSPECIFIED_SOURCE;
            String string = context.getString(R.string.contact_picture_title);
            string.getClass();
            cwhd cwhdVar = new cwhd(dkrjVar, chpqVar3, string, true, null, null);
            String strM = r1.m();
            List listB = fcva.b(cwhdVar);
            String string2 = context.getString(R.string.set_as_chat_picture_button_title);
            string2.getClass();
            String string3 = context.getString(R.string.set_as_chat_picture_button_title);
            string3.getClass();
            cwfb cwfbVar = new cwfb(string2, string3, new fdap() { // from class: cwff
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    ((chpq) obj4).getClass();
                    return fctx.a;
                }
            });
            return new cwfq(strM, listB, cwfbVar, new fdae() { // from class: cwfg
                @Override // defpackage.fdae
                public final Object invoke() {
                    cwfoVar.m.a();
                    return fctx.a;
                }
            }, (cwhe) obj2, new cwfp(false));
        }
        final cwfo cwfoVar2 = this.e;
        final ?? r42 = obj3 == null ? (ResolvedRecipient) fcva.N(r4) : obj3;
        cwfk cwfkVar = cwfoVar2.l;
        chpq chpqVarP = r42.p();
        ekgb ekgbVarU = r42.u();
        obj2.getClass();
        if (cwfkVar.a || obj2 == cwheVar || obj2 == cwhe.d) {
            z = false;
        } else {
            cwhe cwheVar2 = cwhe.c;
            cwfkVar.d = (obj2 == cwheVar2 && obj3 == null) ? 2 : obj2 == cwheVar2 ? 3 : 5;
            ains ainsVar = (ains) cwfkVar.c.h.b();
            int i = cwfkVar.d;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            ainsVar.e("Bugle.PhotoSelector.Open.Count", i2);
            z = true;
        }
        if (cwfkVar.b || obj2 != cwhe.d) {
            z2 = false;
        } else {
            ains ainsVar2 = (ains) cwfkVar.c.h.b();
            int i3 = cwfkVar.d;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            ainsVar2.e("Bugle.PhotoSelector.Back.Count", i4);
            z2 = true;
        }
        if (z) {
            cwfkVar.a = true;
            cwfkVar.b = false;
            if (ekgbVarU.size() == 2 && (chpqVar2 = ((anvw) fcva.N(ekgbVarU)).c) != chpq.PROFILE_UNSPECIFIED_SOURCE && chpqVar2 != chpq.UNRECOGNIZED) {
                ((ains) cwfkVar.c.h.b()).e("Bugle.PhotoSelector.Open.PhotoType.Count", chpqVar2 == chpq.PROFILE_PEOPLE_SHARING_SOURCE ? 2 : 1);
            }
            if (ekgbVarU.size() == 1 && (chpqVar = ((anvw) fcva.N(ekgbVarU)).c) != chpq.PROFILE_UNSPECIFIED_SOURCE && chpqVar != chpq.UNRECOGNIZED) {
                ((ains) cwfkVar.c.h.b()).e("Bugle.PhotoViewer.Open.PhotoType.Count", chpqVar != chpq.PROFILE_PEOPLE_SHARING_SOURCE ? 1 : 2);
            }
        }
        if (z2) {
            cwfkVar.a = false;
            cwfkVar.b = true;
        }
        ekgb ekgbVarU2 = r42.u();
        ArrayList<anvw> arrayList3 = new ArrayList();
        for (Object obj4 : ekgbVarU2) {
            anvw anvwVar = (anvw) obj4;
            if (anvwVar.a != null || anvwVar.b != null) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(fcva.p(arrayList3, 10));
        for (final anvw anvwVar2 : arrayList3) {
            anvwVar2.getClass();
            Uri uri3 = anvwVar2.a;
            if (uri3 == null) {
                uri3 = Uri.EMPTY;
            }
            Uri uriO3 = cpbr.o(uri3);
            if (uriO3 == null) {
                uriO3 = anvwVar2.b;
                uriO3.getClass();
            }
            Uri uri4 = uriO3;
            Uri uri5 = anvwVar2.b;
            uri5.getClass();
            dkrk dkrkVar = new dkrk(new dkpf(uri4, true, null, 0, uri5, 12), null, 0, 1, 0.0f, null, 54);
            chpq chpqVar4 = anvwVar2.c;
            String string4 = chpqVar4 == chpq.PROFILE_PEOPLE_SHARING_SOURCE ? cwfoVar2.a.getString(R.string.google_profile_picture_title) : cwfoVar2.a.getString(R.string.contact_picture_title);
            string4.getClass();
            arrayList4.add(new cwhd(dkrkVar, chpqVar4, string4, chpqVarP == chpqVar4, chpqVar4 == chpq.PROFILE_CONTACT_SOURCE ? cwfoVar2.a.getString(R.string.contact_picture_subtitle) : null, new fdae() { // from class: cwfh
                @Override // defpackage.fdae
                public final Object invoke() {
                    ResolvedRecipient resolvedRecipient = r42;
                    resolvedRecipient.getClass();
                    if (anvwVar2.c == chpq.PROFILE_CONTACT_SOURCE) {
                        cwfo cwfoVar3 = cwfoVar2;
                        cwfoVar3.c.h(new agfu(resolvedRecipient));
                        ((ains) cwfoVar3.l.c.h.b()).c("Bugle.PhotoSelector.Contacts.Open.Count");
                        cwfoVar3.m.a();
                    }
                    return fctx.a;
                }
            }));
        }
        List listAl = fcva.al(arrayList4, new cwfm(chpqVarP));
        r42.getClass();
        if (r42.A() || !r42.k().c()) {
            strD = cwfoVar2.e.d(r42.x(true));
        } else {
            String strY = r42.y();
            if (strY == null) {
                str = null;
                Context context2 = cwfoVar2.a;
                String string5 = context2.getString(R.string.set_as_chat_picture_button_title);
                string5.getClass();
                String string6 = context2.getString(R.string.set_as_chat_picture_button_title);
                string6.getClass();
                cwfb cwfbVar2 = new cwfb(string5, string6, new fdap() { // from class: cwfi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        chpq chpqVar5 = (chpq) obj5;
                        chpqVar5.getClass();
                        cwfo cwfoVar3 = cwfoVar2;
                        auvw.k(cwfoVar3.b, null, null, new cwfn(cwfoVar3, r42, chpqVar5, null), 3);
                        return fctx.a;
                    }
                });
                return new cwfq(str, listAl, cwfbVar2, new fdae() { // from class: cwfj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cwfoVar2.m.a();
                        return fctx.a;
                    }
                }, (cwhe) obj2, new cwfp(false));
            }
            String strA = cssf.a(strY);
            strA.getClass();
            strD = chsk.a(strA);
        }
        str = strD;
        Context context22 = cwfoVar2.a;
        String string52 = context22.getString(R.string.set_as_chat_picture_button_title);
        string52.getClass();
        String string62 = context22.getString(R.string.set_as_chat_picture_button_title);
        string62.getClass();
        cwfb cwfbVar22 = new cwfb(string52, string62, new fdap() { // from class: cwfi
            @Override // defpackage.fdap
            public final Object invoke(Object obj5) {
                chpq chpqVar5 = (chpq) obj5;
                chpqVar5.getClass();
                cwfo cwfoVar3 = cwfoVar2;
                auvw.k(cwfoVar3.b, null, null, new cwfn(cwfoVar3, r42, chpqVar5, null), 3);
                return fctx.a;
            }
        });
        return new cwfq(str, listAl, cwfbVar22, new fdae() { // from class: cwfj
            @Override // defpackage.fdae
            public final Object invoke() {
                cwfoVar2.m.a();
                return fctx.a;
            }
        }, (cwhe) obj2, new cwfp(false));
    }
}
