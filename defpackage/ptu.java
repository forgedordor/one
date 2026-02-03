package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.WindowMetrics;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.ActivityStackAttributes;
import androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams;
import androidx.window.extensions.embedding.ParentContainerInfo;
import androidx.window.extensions.embedding.WindowAttributes;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptu {
    public final ActivityEmbeddingComponent a;
    public final psk b;
    public final ReentrantLock c;
    public final Map d;
    public final ArrayMap e;
    public final ArrayMap f;

    public ptu(ActivityEmbeddingComponent activityEmbeddingComponent, psk pskVar) {
        activityEmbeddingComponent.getClass();
        this.a = activityEmbeddingComponent;
        this.b = pskVar;
        this.c = new ReentrantLock();
        this.d = new ArrayMap();
        this.e = new ArrayMap();
        this.f = new ArrayMap();
        new ArrayMap();
        new prh().a(8);
        activityEmbeddingComponent.setActivityStackAttributesCalculator(new Function() { // from class: ptr
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                int iMin;
                int iMin2;
                prj prjVarA;
                ActivityStackAttributesCalculatorParams activityStackAttributesCalculatorParamsM720m = prn$$ExternalSyntheticApiModelOutline0.m720m(obj);
                ptu ptuVar = this.a;
                ReentrantLock reentrantLock = ptuVar.c;
                reentrantLock.lock();
                try {
                    ParentContainerInfo parentContainerInfo = activityStackAttributesCalculatorParamsM720m.getParentContainerInfo();
                    parentContainerInfo.getClass();
                    pyq pyqVarA = pyp.a();
                    Configuration configuration = parentContainerInfo.getConfiguration();
                    configuration.getClass();
                    WindowMetrics windowMetrics = parentContainerInfo.getWindowMetrics();
                    windowMetrics.getClass();
                    float fB = pyqVarA.b(configuration, windowMetrics);
                    pxf pxfVar = pxg.a;
                    WindowMetrics windowMetrics2 = parentContainerInfo.getWindowMetrics();
                    windowMetrics2.getClass();
                    pxd pxdVarA = pxfVar.a(windowMetrics2, fB);
                    String activityStackTag = activityStackAttributesCalculatorParamsM720m.getActivityStackTag();
                    activityStackTag.getClass();
                    Bundle launchOptions = activityStackAttributesCalculatorParamsM720m.getLaunchOptions();
                    launchOptions.getClass();
                    Bundle bundle = launchOptions.getBundle("androidx.window.embedding.EmbeddingBounds");
                    pta ptaVar = bundle == null ? null : new pta(new psu(bundle.getInt("androidx.window.embedding.EmbeddingBounds.alignment")), prv.a(bundle, "androidx.window.embedding.EmbeddingBounds.width"), prv.a(bundle, "androidx.window.embedding.EmbeddingBounds.height"));
                    ptp ptpVar = ptaVar == null ? null : new ptp(ptaVar);
                    WindowMetrics windowMetrics3 = activityStackAttributesCalculatorParamsM720m.getParentContainerInfo().getWindowMetrics();
                    windowMetrics3.getClass();
                    pxfVar.a(windowMetrics3, fB);
                    activityStackAttributesCalculatorParamsM720m.getParentContainerInfo().getConfiguration().getClass();
                    WindowLayoutInfo windowLayoutInfo = parentContainerInfo.getWindowLayoutInfo();
                    windowLayoutInfo.getClass();
                    pxq.a(pxdVarA, windowLayoutInfo);
                    ptp ptpVar2 = (ptp) ptuVar.d.get(activityStackTag);
                    if (ptpVar2 != null) {
                        ptpVar = ptpVar2;
                    } else if (ptpVar == null) {
                        throw new IllegalArgumentException("Can't retrieve overlay attributes from launch options");
                    }
                    reentrantLock.lock();
                    reentrantLock.unlock();
                    ptuVar.e.put(activityStackTag, ptpVar);
                    Bundle launchOptions2 = activityStackAttributesCalculatorParamsM720m.getLaunchOptions();
                    launchOptions2.getClass();
                    pta ptaVar2 = ptpVar.a;
                    psu psuVar = ptaVar2.b;
                    launchOptions2.putInt("androidx.window.embedding.ActivityStackAlignment", psuVar.e);
                    ActivityStackAttributes.Builder builder = new ActivityStackAttributes.Builder();
                    psk pskVar2 = ptuVar.b;
                    Configuration configuration2 = parentContainerInfo.getConfiguration();
                    configuration2.getClass();
                    pyq pyqVarA2 = pyp.a();
                    Configuration configuration3 = parentContainerInfo.getConfiguration();
                    configuration3.getClass();
                    WindowMetrics windowMetrics4 = parentContainerInfo.getWindowMetrics();
                    windowMetrics4.getClass();
                    float fB2 = pyqVarA2.b(configuration3, windowMetrics4);
                    WindowMetrics windowMetrics5 = parentContainerInfo.getWindowMetrics();
                    windowMetrics5.getClass();
                    pxd pxdVarA2 = pxfVar.a(windowMetrics5, fB2);
                    prj prjVar = new prj(pxdVarA2.a());
                    WindowLayoutInfo windowLayoutInfo2 = parentContainerInfo.getWindowLayoutInfo();
                    windowLayoutInfo2.getClass();
                    ptv ptvVar = new ptv(prjVar, pxq.a(pxdVarA2, windowLayoutInfo2), configuration2, fB2);
                    prj prjVar2 = ptvVar.a;
                    pxc pxcVar = ptvVar.b;
                    psz pszVar = psz.b;
                    psz psyVar = ptaVar2.c;
                    int i = 2;
                    if (fdbq.f(psyVar, pszVar) && fdbq.f(ptaVar2.d, pszVar)) {
                        prjVarA = prj.a;
                    } else {
                        if (ptaVar2.b(pxcVar)) {
                            psyVar = new psy(0.5f);
                        }
                        pta ptaVar3 = new pta(psuVar, psyVar, ptaVar2.a(pxcVar) ? new psy(0.5f) : ptaVar2.d);
                        int iB = prjVar2.b();
                        Object psyVar2 = ptaVar3.b(pxcVar) ? new psy(0.5f) : ptaVar3.c;
                        if (psyVar2 instanceof psy) {
                            iMin = ((psy) psyVar2).a(iB);
                        } else if (psyVar2 instanceof psx) {
                            iMin = Math.min(iB, ((psx) psyVar2).a);
                        } else {
                            if (!fdbq.f(psyVar2, psz.c)) {
                                psz pszVar2 = ptaVar3.c;
                                Objects.toString(pszVar2);
                                throw new IllegalArgumentException("Unhandled width dimension=".concat(pszVar2.toString()));
                            }
                            pwl pwlVarC = pta.c(pxcVar);
                            pwlVarC.getClass();
                            Rect rectA = pwlVarC.a();
                            psu psuVar2 = ptaVar3.b;
                            if (fdbq.f(psuVar2, psu.a)) {
                                iMin = rectA.left - prjVar2.b;
                            } else {
                                if (!fdbq.f(psuVar2, psu.c)) {
                                    throw new IllegalStateException(a.t(pxcVar, prjVar2, ptaVar3, "Unhandled condition to get height in pixel! embeddingBounds=", " taskBounds=", " windowLayoutInfo="));
                                }
                                iMin = prjVar2.d - rectA.right;
                            }
                        }
                        int iA = prjVar2.a();
                        Object psyVar3 = ptaVar3.a(pxcVar) ? new psy(0.5f) : ptaVar3.d;
                        if (psyVar3 instanceof psy) {
                            iMin2 = ((psy) psyVar3).a(iA);
                        } else if (psyVar3 instanceof psx) {
                            iMin2 = Math.min(iA, ((psx) psyVar3).a);
                        } else {
                            if (!fdbq.f(psyVar3, psz.c)) {
                                psz pszVar3 = ptaVar3.c;
                                Objects.toString(pszVar3);
                                throw new IllegalArgumentException("Unhandled width dimension=".concat(pszVar3.toString()));
                            }
                            pwl pwlVarC2 = pta.c(pxcVar);
                            pwlVarC2.getClass();
                            Rect rectA2 = pwlVarC2.a();
                            psu psuVar3 = ptaVar3.b;
                            if (fdbq.f(psuVar3, psu.b)) {
                                iMin2 = rectA2.top - prjVar2.c;
                            } else {
                                if (!fdbq.f(psuVar3, psu.d)) {
                                    throw new IllegalStateException(a.t(pxcVar, prjVar2, ptaVar3, "Unhandled condition to get height in pixel! embeddingBounds=", " taskBounds=", " windowLayoutInfo="));
                                }
                                iMin2 = prjVar2.e - rectA2.bottom;
                            }
                        }
                        int iB2 = prjVar2.b();
                        int iA2 = prjVar2.a();
                        if (iMin == iB2 && iMin2 == iA2) {
                            prjVarA = prj.a;
                        } else {
                            prj prjVar3 = new prj(0, 0, iMin, iMin2);
                            if (fdbq.f(psuVar, psu.b)) {
                                prjVarA = psv.a(prjVar3, (iB2 - iMin) / 2, 0);
                            } else if (fdbq.f(psuVar, psu.a)) {
                                prjVarA = psv.a(prjVar3, 0, (iA2 - iMin2) / 2);
                            } else if (fdbq.f(psuVar, psu.d)) {
                                prjVarA = psv.a(prjVar3, (iB2 - iMin) / 2, iA2 - iMin2);
                            } else {
                                if (!fdbq.f(psuVar, psu.c)) {
                                    Objects.toString(psuVar);
                                    throw new IllegalArgumentException("Unknown alignment: ".concat(psuVar.toString()));
                                }
                                prjVarA = psv.a(prjVar3, iB2 - iMin, (iA2 - iMin2) / 2);
                            }
                        }
                    }
                    ActivityStackAttributes.Builder relativeBounds = builder.setRelativeBounds(prjVarA.c());
                    new prh().a(5);
                    if (true == fdbq.f(null, pti.a)) {
                        i = 1;
                    }
                    ActivityStackAttributes activityStackAttributesBuild = relativeBounds.setWindowAttributes(new WindowAttributes(i)).build();
                    activityStackAttributesBuild.getClass();
                    return activityStackAttributesBuild;
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        activityEmbeddingComponent.registerActivityStackCallback(new Executor() { // from class: ptt
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new ptq(new fdap() { // from class: pts
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                ptu ptuVar = this.a;
                ReentrantLock reentrantLock = ptuVar.c;
                reentrantLock.lock();
                try {
                    ArrayMap arrayMap = ptuVar.f;
                    Set<String> setKeySet = arrayMap.keySet();
                    setKeySet.getClass();
                    arrayMap.clear();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (prn$$ExternalSyntheticApiModelOutline0.m719m(obj2).getTag() != null) {
                            arrayList.add(obj2);
                        }
                    }
                    List listAo = fcva.ao(arrayList);
                    ArrayList arrayList2 = new ArrayList(fcva.p(listAo, 10));
                    Iterator it = listAo.iterator();
                    while (it.hasNext()) {
                        ActivityStack activityStackM719m = prn$$ExternalSyntheticApiModelOutline0.m719m(it.next());
                        String tag = activityStackM719m.getTag();
                        tag.getClass();
                        arrayList2.add(new fcti(tag, activityStackM719m));
                    }
                    fcwa.n(arrayMap, arrayList2);
                    if (!setKeySet.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        Set setKeySet2 = arrayMap.keySet();
                        setKeySet2.getClass();
                        for (String str : setKeySet) {
                            if (!setKeySet2.contains(str) && ptuVar.a.getActivityStackToken(str) == null) {
                                arrayList3.add(str);
                            }
                        }
                        Iterator it2 = arrayList3.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            next.getClass();
                            String str2 = (String) next;
                            ptuVar.d.remove(str2);
                            ptuVar.e.remove(str2);
                        }
                    }
                    reentrantLock.unlock();
                    return fctx.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }));
    }
}
