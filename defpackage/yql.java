package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.webkit.URLUtil;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yql {
    private static final cczi j = cdag.i(cdag.b, "emotify_badge_scale", 1.3f);
    public final fdjx a;
    public final ajmh b;
    public final fcsu c;
    public final yrg d;
    public final ahax e;
    public final zuf f;
    public final zvo g;
    public final fcsu h;
    public final fcsu i;
    private final Context k;
    private final Map l;

    public yql(Context context, fdjx fdjxVar, ajmh ajmhVar, fcsu fcsuVar, yrg yrgVar, ahax ahaxVar, Map map, zuf zufVar, zvo zvoVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        fdjxVar.getClass();
        ajmhVar.getClass();
        ahaxVar.getClass();
        zufVar.getClass();
        zvoVar.getClass();
        fcsuVar2.getClass();
        this.k = context;
        this.a = fdjxVar;
        this.b = ajmhVar;
        this.c = fcsuVar;
        this.d = yrgVar;
        this.e = ahaxVar;
        this.l = map;
        this.f = zufVar;
        this.g = zvoVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dirx a(final yql yqlVar, final ajlt ajltVar, dirz dirzVar, Float f, int i) throws Resources.NotFoundException {
        dirx dirxVar;
        int i2;
        dirx dirxVar2;
        ArrayList arrayList;
        Float f2;
        Object diqlVar;
        int i3;
        dirx dirxVar3 = null;
        dirz dirzVar2 = (i & 2) != 0 ? new dirz(null) : dirzVar;
        Float f3 = (i & 4) != 0 ? null : f;
        ajltVar.getClass();
        dirzVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        angr angrVarI = ajltVar.i();
        if (angrVarI == null || angrVarI.d().isEmpty()) {
            dirxVar = null;
        } else {
            final Long lQ = ajltVar.q();
            final ekgb ekgbVarD = angrVarI.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ekqh it = ekgbVarD.iterator();
            it.getClass();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                ango angoVar = (ango) it.next();
                int i4 = angoVar.b;
                anhj anhjVar = angoVar.a;
                Integer num = (Integer) linkedHashMap.get(anhjVar);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                linkedHashMap.put(anhjVar, Integer.valueOf(iIntValue + i4));
            }
            List<Map.Entry> listAm = fcva.am(linkedHashMap.entrySet(), 5);
            int size = linkedHashMap.size() - 5;
            char c = '\n';
            ArrayList arrayList3 = new ArrayList(fcva.p(listAm, 10));
            for (Map.Entry entry : listAm) {
                anhj anhjVar2 = (anhj) entry.getKey();
                int iIntValue2 = ((Number) entry.getValue()).intValue();
                if (anhjVar2 instanceof angl) {
                    Map map = yqlVar.l;
                    String str = ((angl) anhjVar2).a;
                    yyb yybVar = (yyb) map.get(str);
                    if (yybVar != null) {
                        dirxVar2 = dirxVar3;
                        String string = yqlVar.k.getString(yybVar.b);
                        string.getClass();
                        String strB = yqlVar.b(string, iIntValue2);
                        arrayList = arrayList3;
                        diqlVar = new diqi(yybVar.a, yybVar.c, iIntValue2, strB, dirzVar2);
                        f2 = f3;
                    } else {
                        dirxVar2 = dirxVar3;
                        arrayList = arrayList3;
                        f2 = f3;
                        diqlVar = new diqk(str, iIntValue2, yqlVar.b(str, iIntValue2), dirzVar2);
                    }
                    i3 = size;
                } else {
                    dirxVar2 = dirxVar3;
                    arrayList = arrayList3;
                    if (!(anhjVar2 instanceof angp)) {
                        throw new fctg();
                    }
                    angp angpVar = (angp) anhjVar2;
                    String strA = angpVar.a();
                    String strB2 = angpVar.b();
                    Float f4 = f3 == null ? (Float) j.e() : f3;
                    f4.getClass();
                    Context context = yqlVar.k;
                    float fFloatValue = f4.floatValue();
                    f2 = f3;
                    String quantityString = context.getResources().getQuantityString(R.plurals.reaction_badges_content_description, iIntValue2, Integer.valueOf(iIntValue2), context.getResources().getString(R.string.emotify_badge_title));
                    quantityString.getClass();
                    dirz dirzVar3 = dirzVar2;
                    i3 = size;
                    diqlVar = new diql(strA, strB2, fFloatValue, iIntValue2, quantityString, dirzVar3);
                    dirzVar2 = dirzVar3;
                }
                arrayList.add(diqlVar);
                size = i3;
                arrayList3 = arrayList;
                dirxVar3 = dirxVar2;
                c = '\n';
                f3 = f2;
            }
            dirxVar = dirxVar3;
            int i5 = size;
            List listAq = fcva.aq(arrayList3);
            if (i5 > 0) {
                int i6 = i5 < 10 ? R.string.truncated_reaction_badges_text_less_than_ten : R.string.truncated_reaction_badges_text_more_than_nine;
                Context context2 = yqlVar.k;
                Integer numValueOf = Integer.valueOf(i5);
                String string2 = context2.getString(i6, numValueOf);
                string2.getClass();
                String string3 = context2.getString(R.string.truncated_reaction_badges_content_description, numValueOf);
                string3.getClass();
                fcva.y(listAq, fcva.b(new diqo(string2, string3, dirzVar2)));
            }
            arrayList2.add(new diqh(listAq, aadl.a, new fdae() { // from class: yqd
                @Override // defpackage.fdae
                public final Object invoke() {
                    djzz djzyVar;
                    String str2;
                    final yql yqlVar2 = this.a;
                    final Long l = lQ;
                    yqlVar2.g.g(2, 4, l);
                    ArrayList<ango> arrayList4 = new ArrayList();
                    for (Object obj : ekgbVarD) {
                        anhj anhjVar3 = ((ango) obj).a;
                        if ((anhjVar3 instanceof angl) || ((anhjVar3 instanceof angp) && crbf.e())) {
                            arrayList4.add(obj);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(fcva.p(arrayList4, 10));
                    for (ango angoVar2 : arrayList4) {
                        ekgb<angn> ekgbVar = angoVar2.d;
                        ArrayList arrayList6 = new ArrayList(fcva.p(ekgbVar, 10));
                        for (angn angnVar : ekgbVar) {
                            dkpf dkpfVarA = ((cphz) yqlVar2.c.b()).a(angnVar.b, true);
                            String strA2 = aqbw.a() ? cssf.a(angnVar.a) : angnVar.a;
                            strA2.getClass();
                            String str3 = null;
                            if (((aqaj) yqlVar2.h.b()).a() && (str2 = angnVar.e) != null) {
                                str3 = str2;
                            }
                            anhj anhjVar4 = angoVar2.a;
                            if (anhjVar4 instanceof angl) {
                                djzyVar = new djzx(((angl) anhjVar4).a);
                            } else {
                                if (!(anhjVar4 instanceof angp)) {
                                    throw new fctg();
                                }
                                String strB3 = ((angp) anhjVar4).b();
                                if (!URLUtil.isValidUrl(strB3)) {
                                    throw new IllegalStateException(a.a(strB3, "Invalid Uri for Emotify:", " "));
                                }
                                djzyVar = new djzy(strB3);
                            }
                            arrayList6.add(new dkao(dkpfVarA, strA2, djzyVar, str3));
                        }
                        arrayList5.add(arrayList6);
                    }
                    yqlVar2.e.a(new aabm(fcva.q(arrayList5), new fdae() { // from class: yqf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            yqlVar2.g.g(3, 4, l);
                            return fctx.a;
                        }
                    }));
                    return fctx.a;
                }
            }, new fdae() { // from class: yqe
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.fdae
                public final Object invoke() {
                    Iterator it2 = ekgbVarD.iterator();
                    while (it2.hasNext()) {
                        ekqh it3 = ((ango) it2.next()).d.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            fhaz fhazVar = ((angn) it3.next()).d;
                            if (fhazVar != null) {
                                zuf zufVar = yqlVar.f;
                                if (fdbq.f(zufVar.c, fhazVar)) {
                                    zufVar.b.g(zuf.a, null, null, dzua.SUCCESS);
                                    zufVar.c = null;
                                }
                            }
                        }
                    }
                    return fctx.a;
                }
            }, 2));
        }
        if (ajltVar.z()) {
            arrayList2.add(new diqh(fcva.b(new diqn(yqlVar.k.getString(R.string.star_badges_content_description), dirzVar2, 1)), aadl.a, new fdae() { // from class: yqi
                @Override // defpackage.fdae
                public final Object invoke() {
                    yql yqlVar2 = this.a;
                    auvw.k(yqlVar2.a, null, null, new yqk(yqlVar2, ajltVar, null), 3);
                    return fctx.a;
                }
            }, null, 18));
        }
        final anms anmsVarA = ajltVar.A();
        if (anmsVarA != null) {
            arrayList2.add(new diqh(fcva.b(new diqj(yqlVar.k.getString(R.string.calendar_badge_content_description), dirzVar2, 1)), aadl.a, new fdae() { // from class: yqh
                @Override // defpackage.fdae
                public final Object invoke() {
                    yql yqlVar2 = this.a;
                    auvw.m(yqlVar2.a, null, new yqj(yqlVar2, anmsVarA, null), 3);
                    return fctx.a;
                }
            }, null, 18));
        }
        if (ajltVar instanceof ajmy) {
            final ajmy ajmyVar = (ajmy) ajltVar;
            i2 = 1;
            arrayList2.add(new diqh(fcva.b(new diqm(yqlVar.k.getString(R.string.scheduled_send_badges_content_description), dirzVar2, 1)), aadl.a, new fdae() { // from class: yqg
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.d.c(ajmyVar);
                    return fctx.a;
                }
            }, null, 18));
        } else {
            i2 = 1;
        }
        return !arrayList2.isEmpty() ? new dirx(arrayList2, ajltVar.h() != null ? ykm.q(ajltVar) ? 2 : 3 : i2) : dirxVar;
    }

    private final String b(String str, int i) throws Resources.NotFoundException {
        String quantityString = this.k.getResources().getQuantityString(R.plurals.reaction_badges_content_description, i, Integer.valueOf(i), str);
        quantityString.getClass();
        return quantityString;
    }
}
