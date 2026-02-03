package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyr extends deys implements deyo {
    public static final /* synthetic */ int b = 0;
    private final dexw e;

    public deyr(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
        this.e = dexwVar;
    }

    private final ewor E(ewoa ewoaVar, dggn dggnVar) {
        enpl enplVarB = this.e.b(dggnVar);
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewor eworVar2 = ewor.a;
        enplVarB.getClass();
        eworVar.w = enplVarB;
        eworVar.b |= 524288;
        return (ewor) ewoaVar.build();
    }

    private static ewru F(Throwable th) {
        if (th instanceof dcff) {
            int iA = ((dcff) th).a();
            ewrt ewrtVar = (ewrt) ewru.a.createBuilder();
            ewrtVar.copyOnWrite();
            ewru ewruVar = (ewru) ewrtVar.instance;
            ewruVar.b = 1;
            ewruVar.c = Integer.valueOf(iA);
            return (ewru) ewrtVar.build();
        }
        ewrt ewrtVar2 = (ewrt) ewru.a.createBuilder();
        String name = th.getClass().getName();
        ewrtVar2.copyOnWrite();
        ewru ewruVar2 = (ewru) ewrtVar2.instance;
        name.getClass();
        ewruVar2.b = 2;
        ewruVar2.c = name;
        return (ewru) ewrtVar2.build();
    }

    private final ewor G(ewrp ewrpVar, int i, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.d = i - 1;
        eworVar2.b |= 2;
        enpl enplVarB = this.e.b(dggnVar);
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        enplVarB.getClass();
        eworVar3.w = enplVarB;
        eworVar3.b |= 524288;
        return (ewor) ewoaVar.build();
    }

    @Override // defpackage.deyo
    public final void A(Context context, String str, int i, cjqp cjqpVar, cjxj cjxjVar, ewri ewriVar, boolean z, boolean z2, boolean z3, Throwable th, boolean z4) {
        ewon ewonVar = (ewon) ewoq.a.createBuilder();
        ewonVar.copyOnWrite();
        ewoq ewoqVar = (ewoq) ewonVar.instance;
        ewoqVar.h = 3;
        ewoqVar.b |= 512;
        ewonVar.copyOnWrite();
        ewoq ewoqVar2 = (ewoq) ewonVar.instance;
        ewoqVar2.c = (true != z3 ? 4 : 3) - 1;
        ewoqVar2.b |= 1;
        ewonVar.copyOnWrite();
        ewoq ewoqVar3 = (ewoq) ewonVar.instance;
        ewoqVar3.b |= 2;
        ewoqVar3.d = i;
        int i2 = true != cjqpVar.equals(cjqp.GOOGLE_TOS_CONSENTED) ? 3 : 2;
        ewonVar.copyOnWrite();
        ewoq ewoqVar4 = (ewoq) ewonVar.instance;
        ewoqVar4.e = i2 - 1;
        ewoqVar4.b |= 32;
        ewonVar.copyOnWrite();
        ewoq ewoqVar5 = (ewoq) ewonVar.instance;
        ewoqVar5.g = ewriVar.f;
        ewoqVar5.b |= 256;
        ewonVar.copyOnWrite();
        ewoq ewoqVar6 = (ewoq) ewonVar.instance;
        ewoqVar6.b |= 128;
        ewoqVar6.f = z2;
        ewonVar.copyOnWrite();
        ewoq ewoqVar7 = (ewoq) ewonVar.instance;
        ewoqVar7.b |= 2048;
        ewoqVar7.j = z;
        if (ewriVar.equals(ewri.LEGAL_FYI_SEEN) && cjxjVar.equals(cjxj.LEGAL_FYI_SEEN)) {
            ewonVar.copyOnWrite();
            ewoq ewoqVar8 = (ewoq) ewonVar.instance;
            ewoqVar8.e = 1;
            ewoqVar8.b |= 32;
        }
        if (dfpi.M() && z4) {
            ewonVar.copyOnWrite();
            ewoq ewoqVar9 = (ewoq) ewonVar.instance;
            ewoqVar9.e = 3;
            ewoqVar9.b |= 32;
        }
        if (th != null) {
            ewru ewruVarF = F(th);
            ewonVar.copyOnWrite();
            ewoq ewoqVar10 = (ewoq) ewonVar.instance;
            ewruVarF.getClass();
            ewoqVar10.i = ewruVarF;
            ewoqVar10.b |= 1024;
        }
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoq ewoqVar11 = (ewoq) ewonVar.build();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewoqVar11.getClass();
        eworVar.t = ewoqVar11;
        eworVar.b |= 65536;
        D(context, (ewor) ewoaVar.build(), str);
    }

    @Override // defpackage.deyo
    public final void a(Context context, ewrp ewrpVar, String str, dggn dggnVar, ewrg... ewrgVarArr) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        List listAsList = Arrays.asList(ewrgVarArr);
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        evsx evsxVar = eworVar2.i;
        if (!evsxVar.c()) {
            eworVar2.i = evsn.mutableCopy(evsxVar);
        }
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            eworVar2.i.h(((ewrg) it.next()).m);
        }
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void b(Context context, ewrp ewrpVar, String str, dggn dggnVar) {
        D(context, G(ewrpVar, 11, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void c(Context context, ewrp ewrpVar, String str, dggn dggnVar) {
        D(context, G(ewrpVar, 2, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void d(Context context, ewrp ewrpVar, String str, dggn dggnVar) {
        D(context, G(ewrpVar, 5, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void e(Context context, ewrp ewrpVar, String str, dggn dggnVar) {
        D(context, G(ewrpVar, 6, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void f(Context context, ewrp ewrpVar, int i, String str, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) G(ewrpVar, 7, dggnVar).toBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.b |= 4;
        eworVar.e = i;
        D(context, (ewor) ewoaVar.build(), str);
    }

    @Override // defpackage.deyo
    public final void g(Context context, ewrp ewrpVar, boolean z, String str, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.b |= 1024;
        eworVar2.n = z;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void h(Context context, ewrp ewrpVar, String str, dggn dggnVar) {
        D(context, G(ewrpVar, 3, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void i(Context context, String str, dggn dggnVar, ewoi ewoiVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewoiVar.getClass();
        eworVar.x = ewoiVar;
        eworVar.b |= 2097152;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void j(Context context, ckiu ckiuVar, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewld ewldVar = (ewld) ewlf.a.createBuilder();
        ewldVar.copyOnWrite();
        ewlf ewlfVar = (ewlf) ewldVar.instance;
        ckin ckinVar = (ckin) ckiuVar;
        ewlc ewlcVar = ckinVar.d;
        ewlcVar.getClass();
        ewlfVar.d = ewlcVar;
        ewlfVar.c = 3;
        ewldVar.copyOnWrite();
        ewlf ewlfVar2 = (ewlf) ewldVar.instance;
        ewlfVar2.b |= 2;
        ewlfVar2.f = ckinVar.b;
        ewldVar.copyOnWrite();
        ewlf ewlfVar3 = (ewlf) ewldVar.instance;
        ewlfVar3.e = 2;
        ewlfVar3.b |= 1;
        ewldVar.copyOnWrite();
        ewlf ewlfVar4 = (ewlf) ewldVar.instance;
        ewlfVar4.h = ckinVar.e - 1;
        ewlfVar4.b |= 8;
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewlf ewlfVar5 = (ewlf) ewldVar.build();
        ewlfVar5.getClass();
        eworVar.r = ewlfVar5;
        eworVar.b |= 16384;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.c = ckinVar.a.J;
        eworVar2.b |= 1;
        D(context, E(ewoaVar, dggnVar), ckinVar.c);
    }

    @Override // defpackage.deyo
    public final void k(Context context, ckja ckjaVar, String str, dggn dggnVar) {
        final ewlg ewlgVar = (ewlg) ckjaVar.a().toBuilder();
        ewlgVar.copyOnWrite();
        ((ewlp) ewlgVar.instance).a().clear();
        ewlgVar.copyOnWrite();
        ((ewlp) ewlgVar.instance).b().clear();
        Map.EL.forEach(DesugarCollections.unmodifiableMap(ckjaVar.a().e), new BiConsumer() { // from class: deyq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str2 = (String) obj;
                int i = deyr.b;
                ewlm ewlmVar = (ewlm) ewln.a.createBuilder();
                for (String strSubstring : ((ewln) obj2).b) {
                    if (!dgri.a.contains(str2)) {
                        strSubstring = strSubstring == null ? "null" : strSubstring.isEmpty() ? "empty" : "set";
                    } else if (TextUtils.isEmpty(strSubstring)) {
                        strSubstring = String.valueOf(strSubstring);
                    } else if ("token".equals(str2)) {
                        int i2 = elcz.a;
                        strSubstring = elcx.a.c(strSubstring, StandardCharsets.UTF_8).toString();
                    } else if ("IMSI".equals(str2)) {
                        strSubstring = strSubstring.substring(0, 6);
                    }
                    ewlmVar.a(strSubstring);
                }
                ewlgVar.a(str2, (ewln) ewlmVar.build());
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        ewlp ewlpVar = (ewlp) ewlgVar.build();
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewld ewldVar = (ewld) ewlf.a.createBuilder();
        ewldVar.copyOnWrite();
        ewlf ewlfVar = (ewlf) ewldVar.instance;
        str.getClass();
        ewlfVar.b |= 2;
        ewlfVar.f = str;
        ewldVar.copyOnWrite();
        ewlf ewlfVar2 = (ewlf) ewldVar.instance;
        ewlpVar.getClass();
        ewlfVar2.d = ewlpVar;
        ewlfVar2.c = 1;
        ewldVar.copyOnWrite();
        ewlf ewlfVar3 = (ewlf) ewldVar.instance;
        ewlfVar3.e = 2;
        ewlfVar3.b |= 1;
        int iH = ckjaVar.h();
        ewldVar.copyOnWrite();
        ewlf ewlfVar4 = (ewlf) ewldVar.instance;
        ewlfVar4.h = iH - 1;
        ewlfVar4.b |= 8;
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewlf ewlfVar5 = (ewlf) ewldVar.build();
        ewlfVar5.getClass();
        eworVar.r = ewlfVar5;
        eworVar.b |= 16384;
        ewrp ewrpVarB = ckjaVar.b();
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.c = ewrpVarB.J;
        eworVar2.b |= 1;
        D(context, E(ewoaVar, dggnVar), ckjaVar.f());
    }

    @Override // defpackage.deyo
    public final void l(Context context, ckjd ckjdVar, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewld ewldVar = (ewld) ewlf.a.createBuilder();
        ewldVar.copyOnWrite();
        ewlf ewlfVar = (ewlf) ewldVar.instance;
        ckir ckirVar = (ckir) ckjdVar;
        ewlr ewlrVar = ckirVar.d;
        ewlrVar.getClass();
        ewlfVar.d = ewlrVar;
        ewlfVar.c = 2;
        ewldVar.copyOnWrite();
        ewlf ewlfVar2 = (ewlf) ewldVar.instance;
        ewlfVar2.b |= 2;
        ewlfVar2.f = ckirVar.b;
        ewldVar.copyOnWrite();
        ewlf ewlfVar3 = (ewlf) ewldVar.instance;
        ewlfVar3.e = 2;
        ewlfVar3.b |= 1;
        ewldVar.copyOnWrite();
        ewlf ewlfVar4 = (ewlf) ewldVar.instance;
        ewlfVar4.h = ckirVar.e - 1;
        ewlfVar4.b |= 8;
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewlf ewlfVar5 = (ewlf) ewldVar.build();
        ewlfVar5.getClass();
        eworVar.r = ewlfVar5;
        eworVar.b |= 16384;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.c = ckirVar.a.J;
        eworVar2.b |= 1;
        D(context, E(ewoaVar, dggnVar), ckirVar.c);
    }

    @Override // defpackage.deyo
    public final void m(Context context, ewrp ewrpVar, String str, dggn dggnVar) {
        D(context, G(ewrpVar, 8, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void n(Context context, String str, String str2, String str3, String str4, int i, int i2, dggn dggnVar) {
        ewqi ewqiVar = (ewqi) ewqj.a.createBuilder();
        ewqo ewqoVar = ewqo.a;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar = (ewqj) ewqiVar.instance;
        ewqoVar.getClass();
        ewqjVar.d = ewqoVar;
        ewqjVar.c = 1;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar2 = (ewqj) ewqiVar.instance;
        str2.getClass();
        ewqjVar2.b = 1 | ewqjVar2.b;
        ewqjVar2.e = str2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar3 = (ewqj) ewqiVar.instance;
        str3.getClass();
        ewqjVar3.b |= 2;
        ewqjVar3.f = str3;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar4 = (ewqj) ewqiVar.instance;
        str4.getClass();
        ewqjVar4.b |= 4;
        ewqjVar4.g = str4;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar5 = (ewqj) ewqiVar.instance;
        ewqjVar5.b |= 8;
        ewqjVar5.h = i;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar6 = (ewqj) ewqiVar.instance;
        ewqjVar6.b |= 16;
        ewqjVar6.i = i2;
        ewqj ewqjVar7 = (ewqj) ewqiVar.build();
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewqjVar7.getClass();
        eworVar.v = ewqjVar7;
        eworVar.b |= 262144;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void o(Context context, String str, String str2, String str3, String str4, int i, int i2, dggn dggnVar, Optional optional) {
        optional.isPresent();
        ewqi ewqiVar = (ewqi) ewqj.a.createBuilder();
        ewqp ewqpVar = (ewqp) ewqq.a.createBuilder();
        ewqs ewqsVar = ewqs.a;
        ewqpVar.copyOnWrite();
        ewqq ewqqVar = (ewqq) ewqpVar.instance;
        ewqsVar.getClass();
        ewqqVar.c = ewqsVar;
        ewqqVar.b = 1;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar = (ewqj) ewqiVar.instance;
        ewqq ewqqVar2 = (ewqq) ewqpVar.build();
        ewqqVar2.getClass();
        ewqjVar.d = ewqqVar2;
        ewqjVar.c = 2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar2 = (ewqj) ewqiVar.instance;
        str2.getClass();
        ewqjVar2.b = 1 | ewqjVar2.b;
        ewqjVar2.e = str2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar3 = (ewqj) ewqiVar.instance;
        str3.getClass();
        ewqjVar3.b = 2 | ewqjVar3.b;
        ewqjVar3.f = str3;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar4 = (ewqj) ewqiVar.instance;
        str4.getClass();
        ewqjVar4.b |= 4;
        ewqjVar4.g = str4;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar5 = (ewqj) ewqiVar.instance;
        ewqjVar5.b |= 8;
        ewqjVar5.h = i;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar6 = (ewqj) ewqiVar.instance;
        ewqjVar6.b |= 16;
        ewqjVar6.i = i2;
        Object obj = optional.get();
        ewqiVar.copyOnWrite();
        ewqj ewqjVar7 = (ewqj) ewqiVar.instance;
        ewqjVar7.j = ((epie) obj).a();
        ewqjVar7.b |= 32;
        ewqj ewqjVar8 = (ewqj) ewqiVar.build();
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewqjVar8.getClass();
        eworVar.v = ewqjVar8;
        eworVar.b |= 262144;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void p(Context context, ewrp ewrpVar, int i, int i2, String str, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.h = i - 1;
        eworVar2.b |= 32;
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        eworVar3.b |= 512;
        eworVar3.m = i2;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void q(Context context, ewrp ewrpVar, int i, String str, dggn dggnVar) {
        D(context, G(ewrpVar, i, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void r(Context context, ewrp ewrpVar, String str, String str2, int i, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.l = 7;
        eworVar2.b |= 256;
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        str2.getClass();
        eworVar3.b |= 8192;
        eworVar3.q = str2;
        ewoaVar.copyOnWrite();
        ewor eworVar4 = (ewor) ewoaVar.instance;
        eworVar4.p = i - 1;
        eworVar4.b |= 4096;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void s(Context context, ewrp ewrpVar, int i, String str, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.l = i - 1;
        eworVar2.b |= 256;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void t(Context context, ewrp ewrpVar, int i, String str, String str2, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.j = i - 1;
        eworVar2.b |= 64;
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        str.getClass();
        eworVar3.b |= 128;
        eworVar3.k = str;
        D(context, E(ewoaVar, dggnVar), str2);
    }

    @Override // defpackage.deyo
    public final void u(Context context, Supplier supplier, String str, int i, int i2, String str2) {
        ewok ewokVar = (ewok) ewom.a.createBuilder();
        ewokVar.copyOnWrite();
        ewom ewomVar = (ewom) ewokVar.instance;
        ewomVar.c = i - 1;
        ewomVar.b |= 1;
        ewokVar.copyOnWrite();
        ewom ewomVar2 = (ewom) ewokVar.instance;
        ewomVar2.b |= 2;
        ewomVar2.d = i2;
        ewom ewomVar3 = (ewom) ewokVar.build();
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewrp ewrpVar = (ewrp) supplier.get();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.b |= 8192;
        eworVar2.q = ejwk.b(str);
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        ewomVar3.getClass();
        eworVar3.s = ewomVar3;
        eworVar3.b |= 32768;
        D(context, (ewor) ewoaVar.build(), str2);
    }

    @Override // defpackage.deyo
    public final void v(Context context, String str, String str2, String str3, String str4, int i, boolean z, Optional optional, int i2, int i3, dggn dggnVar, Optional optional2, Optional optional3) {
        final ewqk ewqkVar = (ewqk) ewqm.a.createBuilder();
        ewqkVar.copyOnWrite();
        ewqm ewqmVar = (ewqm) ewqkVar.instance;
        ewqmVar.c = i - 1;
        ewqmVar.b |= 1;
        ewqkVar.copyOnWrite();
        ewqm ewqmVar2 = (ewqm) ewqkVar.instance;
        ewqmVar2.b |= 2;
        ewqmVar2.d = z;
        int iIntValue = ((Integer) optional2.orElse(-1)).intValue();
        ewqkVar.copyOnWrite();
        ewqm ewqmVar3 = (ewqm) ewqkVar.instance;
        ewqmVar3.b |= 8;
        ewqmVar3.f = iIntValue;
        optional.ifPresent(new Consumer() { // from class: deyp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                int iIntValue2 = ((Integer) obj).intValue();
                ewqk ewqkVar2 = ewqkVar;
                ewqkVar2.copyOnWrite();
                ewqm ewqmVar4 = (ewqm) ewqkVar2.instance;
                ewqm ewqmVar5 = ewqm.a;
                ewqmVar4.b |= 4;
                ewqmVar4.e = iIntValue2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional3.isPresent();
        ewqi ewqiVar = (ewqi) ewqj.a.createBuilder();
        ewqp ewqpVar = (ewqp) ewqq.a.createBuilder();
        ewqpVar.copyOnWrite();
        ewqq ewqqVar = (ewqq) ewqpVar.instance;
        ewqm ewqmVar4 = (ewqm) ewqkVar.build();
        ewqmVar4.getClass();
        ewqqVar.c = ewqmVar4;
        ewqqVar.b = 2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar = (ewqj) ewqiVar.instance;
        ewqq ewqqVar2 = (ewqq) ewqpVar.build();
        ewqqVar2.getClass();
        ewqjVar.d = ewqqVar2;
        ewqjVar.c = 2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar2 = (ewqj) ewqiVar.instance;
        str2.getClass();
        ewqjVar2.b |= 1;
        ewqjVar2.e = str2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar3 = (ewqj) ewqiVar.instance;
        str3.getClass();
        ewqjVar3.b |= 2;
        ewqjVar3.f = str3;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar4 = (ewqj) ewqiVar.instance;
        str4.getClass();
        ewqjVar4.b |= 4;
        ewqjVar4.g = str4;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar5 = (ewqj) ewqiVar.instance;
        ewqjVar5.b |= 8;
        ewqjVar5.h = i2;
        ewqiVar.copyOnWrite();
        ewqj ewqjVar6 = (ewqj) ewqiVar.instance;
        ewqjVar6.b |= 16;
        ewqjVar6.i = i3;
        Object obj = optional3.get();
        ewqiVar.copyOnWrite();
        ewqj ewqjVar7 = (ewqj) ewqiVar.instance;
        ewqjVar7.j = ((epie) obj).a();
        ewqjVar7.b |= 32;
        ewqj ewqjVar8 = (ewqj) ewqiVar.build();
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewqjVar8.getClass();
        eworVar.v = ewqjVar8;
        eworVar.b |= 262144;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void w(Context context, ewrp ewrpVar, int i, String str, String str2, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.b |= 8192;
        if (str == null) {
            str = "";
        }
        eworVar2.q = str;
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        eworVar3.p = i - 1;
        eworVar3.b |= 4096;
        ewoaVar.copyOnWrite();
        ewor eworVar4 = (ewor) ewoaVar.instance;
        eworVar4.o = 1;
        eworVar4.b |= 2048;
        D(context, E(ewoaVar, dggnVar), str2);
    }

    @Override // defpackage.deyo
    public final void x(Context context, String str, int i, cjqp cjqpVar, boolean z, boolean z2, Throwable th) {
        ewob ewobVar = (ewob) ewoe.a.createBuilder();
        ewobVar.copyOnWrite();
        ewoe ewoeVar = (ewoe) ewobVar.instance;
        ewoeVar.g = 3;
        ewoeVar.b |= 32;
        ewobVar.copyOnWrite();
        ewoe ewoeVar2 = (ewoe) ewobVar.instance;
        ewoeVar2.c = (true != z2 ? 3 : 2) - 1;
        ewoeVar2.b |= 1;
        ewobVar.copyOnWrite();
        ewoe ewoeVar3 = (ewoe) ewobVar.instance;
        ewoeVar3.b |= 2;
        ewoeVar3.d = i;
        int i2 = true == cjqpVar.equals(cjqp.GOOGLE_TOS_CONSENTED) ? 2 : 3;
        ewobVar.copyOnWrite();
        ewoe ewoeVar4 = (ewoe) ewobVar.instance;
        ewoeVar4.e = i2 - 1;
        ewoeVar4.b |= 4;
        ewobVar.copyOnWrite();
        ewoe ewoeVar5 = (ewoe) ewobVar.instance;
        ewoeVar5.b |= 16;
        ewoeVar5.f = z;
        if (th != null) {
            ewru ewruVarF = F(th);
            ewobVar.copyOnWrite();
            ewoe ewoeVar6 = (ewoe) ewobVar.instance;
            ewruVarF.getClass();
            ewoeVar6.h = ewruVarF;
            ewoeVar6.b |= 64;
        }
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoe ewoeVar7 = (ewoe) ewobVar.build();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        ewoeVar7.getClass();
        eworVar.u = ewoeVar7;
        eworVar.b |= 131072;
        D(context, (ewor) ewoaVar.build(), str);
    }

    @Override // defpackage.deyo
    public final void y(Context context, int i, String str, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.g = i - 1;
        eworVar.b |= 16;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.f = 1;
        eworVar2.b |= 8;
        D(context, E(ewoaVar, dggnVar), str);
    }

    @Override // defpackage.deyo
    public final void z(Context context, ewrp ewrpVar, int i, String str, dggn dggnVar) {
        ewoa ewoaVar = (ewoa) ewor.a.createBuilder();
        ewoaVar.copyOnWrite();
        ewor eworVar = (ewor) ewoaVar.instance;
        eworVar.c = ewrpVar.J;
        eworVar.b |= 1;
        ewoaVar.copyOnWrite();
        ewor eworVar2 = (ewor) ewoaVar.instance;
        eworVar2.l = 1;
        eworVar2.b |= 256;
        ewoaVar.copyOnWrite();
        ewor eworVar3 = (ewor) ewoaVar.instance;
        eworVar3.b |= 4;
        eworVar3.e = i;
        D(context, E(ewoaVar, dggnVar), str);
    }
}
