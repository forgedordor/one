package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.fctx;
import defpackage.fdap;
import defpackage.fdat;
import defpackage.hmk;
import defpackage.hml;
import defpackage.hmw;
import defpackage.hnj;
import defpackage.hno;
import defpackage.hnz;
import defpackage.hob;
import defpackage.hox;
import defpackage.hpl;
import defpackage.hpt;
import defpackage.hpu;
import defpackage.hpx;
import defpackage.hsg;
import defpackage.hsi;
import defpackage.hxe;
import defpackage.hyk;
import defpackage.hym;
import defpackage.hyo;
import defpackage.iqa;
import defpackage.jhd;
import defpackage.jje;
import defpackage.jjf;
import defpackage.jjg;
import defpackage.jjh;
import defpackage.jji;
import defpackage.jjj;
import defpackage.jjk;
import defpackage.jjm;
import defpackage.jjn;
import defpackage.jjo;
import defpackage.jjq;
import defpackage.jjr;
import defpackage.jjt;
import defpackage.jju;
import defpackage.jkp;
import defpackage.jmh;
import defpackage.jmi;
import defpackage.jml;
import defpackage.jmn;
import defpackage.jmo;
import defpackage.jmp;
import defpackage.jns;
import defpackage.jqp;
import defpackage.jqs;
import defpackage.jrk;
import defpackage.lvj;
import defpackage.lyj;
import defpackage.piw;
import defpackage.pix;
import defpackage.pjb;
import defpackage.pjg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final hpt a = new hnz(hsi.a, jje.a);
    public static final hpt b = new hsg(jjf.a);
    public static final hpt c = new hno(jji.a);
    public static final hpt d = new hsg(jjg.a);
    public static final hpt e = new hsg(jjh.a);
    public static final hpt f = new hsg(jjj.a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public static final void a(AndroidComposeView androidComposeView, fdat fdatVar, hml hmlVar, int i) {
        char c2;
        ?? r18;
        jrk jrkVar;
        LinkedHashMap linkedHashMap;
        boolean z;
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-520299287);
        int i3 = i2 == 0 ? (true != hmlVarC.F(androidComposeView) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            Context context = androidComposeView.getContext();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(new Configuration(context.getResources().getConfiguration()), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new jjk(hoxVar);
                hmwVar.af(objS2);
            }
            androidComposeView.v = (fdap) objS2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new jkp(context);
                hmwVar.af(objS3);
            }
            jkp jkpVar = (jkp) objS3;
            jhd jhdVarE = androidComposeView.E();
            if (jhdVarE == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                pjb pjbVar = jhdVarE.b;
                int i4 = jmp.a;
                Object parent = androidComposeView.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                c2 = 4;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = hyk.class.getSimpleName() + ':' + strValueOf;
                pix pixVarU = pjbVar.U();
                Bundle bundleA = pixVarU.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                r18 = 0;
                jmo jmoVar = jmo.a;
                hpt hptVar = hyo.a;
                final hym hymVar = new hym(linkedHashMap, jmoVar);
                try {
                    pixVarU.b(str, new piw() { // from class: jmm
                        @Override // defpackage.piw
                        public final Bundle a() {
                            int i5 = jmp.a;
                            Map mapB = hymVar.b();
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : mapB.entrySet()) {
                                String str3 = (String) entry.getKey();
                                List list = (List) entry.getValue();
                                bundle.putParcelableArrayList(str3, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                            }
                            return bundle;
                        }
                    });
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                objS4 = new jml(hymVar, new jmn(z, pixVarU, str));
                hmwVar.af(objS4);
            } else {
                c2 = 4;
                r18 = 0;
            }
            jml jmlVar = (jml) objS4;
            fctx fctxVar = fctx.a;
            boolean zF = hmlVarC.F(jmlVar);
            Object objS5 = hmwVar.S();
            if (zF || objS5 == hmk.a) {
                objS5 = new jjm(jmlVar);
                hmwVar.af(objS5);
            }
            hob.c(fctxVar, (fdap) objS5, hmlVarC);
            Object objS6 = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS6 == obj2) {
                objS6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new jns() : new jmi(androidComposeView);
                hmwVar.af(objS6);
            }
            iqa iqaVar = (iqa) objS6;
            Configuration configurationC = c(hoxVar);
            Object objS7 = hmwVar.S();
            if (objS7 == obj2) {
                objS7 = new jqp();
                hmwVar.af(objS7);
            }
            jqp jqpVar = (jqp) objS7;
            Object objS8 = hmwVar.S();
            Object obj3 = objS8;
            if (objS8 == obj2) {
                Configuration configuration = new Configuration();
                if (configurationC != null) {
                    configuration.setTo(configurationC);
                }
                hmwVar.af(configuration);
                obj3 = configuration;
            }
            Configuration configuration2 = (Configuration) obj3;
            Object objS9 = hmwVar.S();
            if (objS9 == obj2) {
                objS9 = new jjr(configuration2, jqpVar);
                hmwVar.af(objS9);
            }
            jjr jjrVar = (jjr) objS9;
            boolean zF2 = hmlVarC.F(context);
            Object objS10 = hmwVar.S();
            if (zF2 || objS10 == obj2) {
                objS10 = new jjq(context, jjrVar);
                hmwVar.af(objS10);
            }
            hob.c(jqpVar, (fdap) objS10, hmlVarC);
            Object objS11 = hmwVar.S();
            if (objS11 == obj2) {
                objS11 = new jqs();
                hmwVar.af(objS11);
            }
            jqs jqsVar = (jqs) objS11;
            Object objS12 = hmwVar.S();
            if (objS12 == obj2) {
                objS12 = new jju(jqsVar);
                hmwVar.af(objS12);
            }
            jju jjuVar = (jju) objS12;
            boolean zF3 = hmlVarC.F(context);
            Object objS13 = hmwVar.S();
            if (zF3 || objS13 == obj2) {
                objS13 = new jjt(context, jjuVar);
                hmwVar.af(objS13);
            }
            hob.c(jqsVar, (fdap) objS13, hmlVarC);
            hpt hptVar2 = jmh.q;
            boolean zBooleanValue = ((Boolean) hmlVarC.e(hptVar2)).booleanValue() | ((Build.VERSION.SDK_INT < 31 || (jrkVar = androidComposeView.S) == null) ? r18 : ((Boolean) jrkVar.a.a()).booleanValue());
            hpu[] hpuVarArr = new hpu[10];
            hpuVarArr[r18] = a.c(c(hoxVar));
            hpuVarArr[1] = b.c(context);
            hpuVarArr[2] = lyj.a.c(jhdVarE.a);
            hpuVarArr[3] = pjg.a.c(jhdVarE.b);
            hpuVarArr[c2] = hyo.a.c(jmlVar);
            hpuVarArr[5] = f.c(androidComposeView);
            hpuVarArr[6] = d.c(jqpVar);
            hpuVarArr[7] = e.c(jqsVar);
            hpuVarArr[8] = hptVar2.c(Boolean.valueOf(zBooleanValue));
            hpuVarArr[9] = jmh.h.c(iqaVar);
            hnj.b(hpuVarArr, hxe.d(1059770793, new jjn(androidComposeView, jkpVar, fdatVar), hmlVarC), hmlVarC, 56);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new jjo(androidComposeView, fdatVar, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.a(str, "CompositionLocal ", " not present"));
    }

    private static final Configuration c(hox hoxVar) {
        return (Configuration) hoxVar.a();
    }

    public static final hpt<lvj> getLocalLifecycleOwner() {
        return lyj.a;
    }
}
