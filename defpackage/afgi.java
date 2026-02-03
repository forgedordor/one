package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgi implements cdrx {
    public static final cqce a = cqce.g("Bugle", "TCLibLinkifyText");
    public static final ekgb b = ekgb.w("address", "date", "datetime", "email", "phone", "url");
    public static final ekgb c = ekgb.z("address", "date", "datetime", "email", "phone", "tracking_number", "flight", "unit", "url");
    public static final ekgb d = ekgb.t("flight", "other", "");
    public static final ekgb e = ekgb.s("other", "");
    public final afgd f;
    public final cmwe g;
    public final cden h;
    public final fcsu i;
    private final cugg j;
    private final eosc k;

    public afgi(cugg cuggVar, eosc eoscVar, afgd afgdVar, cmwe cmweVar, cden cdenVar, fcsu fcsuVar) {
        this.j = cuggVar;
        this.k = eoscVar;
        this.f = afgdVar;
        this.g = cmweVar;
        this.h = cdenVar;
        this.i = fcsuVar;
    }

    @Override // defpackage.cdrx
    public final ListenableFuture a(final Spannable spannable, final Context context) {
        return this.j.a().h(new ejvr() { // from class: afgg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final afgi afgiVar = this.a;
                final Spannable spannable2 = spannable;
                final Context context2 = context;
                return (Pair) ((Optional) obj).map(new Function() { // from class: afge
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        TextClassifierLib textClassifierLib = (TextClassifierLib) obj2;
                        cqaz.l(textClassifierLib);
                        Spannable spannable3 = spannable2;
                        if (spannable3.length() >= 10000) {
                            cqbd cqbdVarE = afgi.a.e();
                            cqbdVarE.v("Skip linkify because text has length exceeds the threshold.");
                            cqbdVarE.r();
                            return Pair.create(spannable3, ekoj.a);
                        }
                        ekgb ekgbVar = afgi.b;
                        ekgb ekgbVar2 = afgi.d;
                        if (((Boolean) ((cczi) affw.a.get()).e()).booleanValue()) {
                            ekgbVar = afgi.c;
                            ekgbVar2 = afgi.e;
                        }
                        eulo euloVar = new eulo(spannable3);
                        euke eukeVar = new euke();
                        eukeVar.b = ekgbVar;
                        eukeVar.a = ekgbVar2;
                        euloVar.a = eukeVar.a();
                        eult eultVarB = textClassifierLib.b(euloVar.a());
                        List<eulq> list = eultVarB.d;
                        if (list.isEmpty()) {
                            return Pair.create(spannable3, ekoj.a);
                        }
                        Context context3 = context2;
                        afgi afgiVar2 = afgiVar;
                        spannable3.getClass();
                        textClassifierLib.getClass();
                        if (spannable3.toString().startsWith(eultVarB.c.toString()) && !list.isEmpty()) {
                            for (eulq eulqVar : list) {
                                euls eulsVar = new euls(eulqVar, textClassifierLib);
                                fcsu fcsuVar = afgiVar2.i;
                                cugf cugfVar = new cugf(spannable3, eulsVar, context3, afgiVar2.g, afgiVar2.h, fcsuVar);
                                int i = eulqVar.b;
                                int i2 = eulqVar.c;
                                if (((ClickableSpan[]) spannable3.getSpans(i, i2, ClickableSpan.class)).length <= 0) {
                                    spannable3.setSpan(cugfVar, i, i2, 33);
                                }
                            }
                        }
                        ekgp ekgpVar = (ekgp) DesugarArrays.stream((cugf[]) spannable3.getSpans(0, spannable3.length(), cugf.class)).collect(ekcv.a(Function$CC.identity(), new Function() { // from class: afgh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                cqce cqceVar = afgi.a;
                                return afgj.a(((cugf) obj3).a.a);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        return Pair.create(afgiVar2.f.a(spannable3, ekgpVar), ekgpVar);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: afgf
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cqce cqceVar = afgi.a;
                        return Pair.create(spannable2, ekoj.a);
                    }
                });
            }
        }, this.k);
    }
}
