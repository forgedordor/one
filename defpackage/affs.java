package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affs implements lun {
    public final /* synthetic */ affm a;

    public affs(ea eaVar, dpbr dpbrVar, affk affkVar, final affj affjVar, dpxq dpxqVar, final ViewGroup viewGroup, EditText editText, dwwy dwwyVar, Consumer consumer, Consumer consumer2) throws Resources.NotFoundException {
        final affn affnVar = new affn(consumer);
        final affo affoVar = new affo(consumer2);
        dnip dnipVar = new dnip(editText);
        fdap fdapVar = new fdap() { // from class: afff
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dohq dohqVar = (dohq) obj;
                dohqVar.getClass();
                affnVar.invoke(dohqVar.f());
                return fctx.a;
            }
        };
        fdap fdapVar2 = new fdap() { // from class: affg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dwqd dwqdVar = (dwqd) obj;
                dwqdVar.getClass();
                affoVar.invoke(dwqdVar.a().r());
                return fctx.a;
            }
        };
        dnhx dnhxVar = affjVar.b;
        new dnho();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        affi affiVar = new affi(fdapVar, affjVar, fdapVar2);
        int i = fdcj.a;
        linkedHashMap.put(fdab.a(new fdbi(dohq.class)), affiVar);
        final dnhl dnhlVar = new dnhl(dnipVar, new dnhv(dnhxVar.a, affjVar.a, new dnhw(fcwa.l(linkedHashMap))));
        dwwyVar.j(new dwwx() { // from class: affh
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                ekgbVar.getClass();
                affj affjVar2 = affjVar;
                affjVar2.c = ekgbVar;
                List list = affjVar2.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dwsv dwsvVar = (dwsv) dwsp.a(((dwqd) it.next()).a()).f();
                    if (dwsvVar != null) {
                        arrayList.add(dwsvVar);
                    }
                }
                List listA = affjVar2.a.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listA) {
                    dltd dltdVar = (dltd) obj2;
                    if (dltdVar instanceof dohq) {
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (fdbq.f(((dwsv) it2.next()).g(), ((dohq) dltdVar).f())) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(obj2);
                    }
                }
                dnhl dnhlVar2 = dnhlVar;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    dnhlVar2.b.e((dltd) it3.next());
                }
            }
        });
        fr frVarI = eaVar.I();
        fdae fdaeVar = new fdae() { // from class: affp
            @Override // defpackage.fdae
            public final Object invoke() {
                return dnhlVar;
            }
        };
        final int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.minimum_available_space);
        dpcf dpcfVarA = dpbrVar.a(dpxqVar, frVarI, fdaeVar, new dpux(new fdae() { // from class: affq
            @Override // defpackage.fdae
            public final Object invoke() {
                Object parent = viewGroup.getParent();
                parent.getClass();
                return Integer.valueOf(((View) parent).getHeight() - dimensionPixelSize);
            }
        }, viewGroup, new Consumer() { // from class: affr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                ViewGroup viewGroup2 = viewGroup;
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = num.intValue();
                viewGroup2.setLayoutParams(layoutParams);
                viewGroup2.setVisibility(num.intValue() > 0 ? 0 : 8);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                return Consumer$CC.$default$andThen(this, consumer3);
            }
        }, false, false, false, null, false, false, 65506));
        eg egVar = (eg) affkVar.a.b();
        egVar.getClass();
        ea eaVar2 = (ea) ((eyig) affkVar.b).a;
        this.a = new affm(egVar, eaVar2, (uiy) affkVar.d.b(), dpcfVarA);
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        this.a.f(lvjVar);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        this.a.gG(lvjVar);
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
    }
}
