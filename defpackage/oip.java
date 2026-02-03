package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oip implements lvj, lxq, luv, pjb {
    public ojx a;
    public final Bundle b;
    public lvb c;
    public final String d;
    public final Bundle e;
    public final oml f;
    public final oje g;
    private final omn h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oip(oip oipVar, Bundle bundle) {
        this(oipVar.h, oipVar.a, bundle, oipVar.c, oipVar.g, oipVar.d, oipVar.e);
        oipVar.getClass();
        oml omlVar = this.f;
        lvb lvbVar = oipVar.c;
        lvbVar.getClass();
        omlVar.b = lvbVar;
        omlVar.b(oipVar.b());
    }

    @Override // defpackage.lvj
    public final lvc P() {
        return this.f.f;
    }

    @Override // defpackage.luv
    public final lxk R() {
        return this.f.h;
    }

    @Override // defpackage.lxq
    public final lxp S() {
        oml omlVar = this.f;
        if (!omlVar.e) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (omlVar.f.c == lvb.a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        oje ojeVar = omlVar.j;
        if (ojeVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = omlVar.c;
        Map map = ojeVar.a;
        lxp lxpVar = (lxp) map.get(str);
        if (lxpVar != null) {
            return lxpVar;
        }
        lxp lxpVar2 = new lxp();
        map.put(str, lxpVar2);
        return lxpVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    @Override // defpackage.luv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lyp T() {
        /*
            r5 = this;
            lys r0 = new lys
            r1 = 0
            r0.<init>(r1)
            oml r2 = r5.f
            lyo r3 = defpackage.lwu.a
            oip r4 = r2.a
            r0.b(r3, r4)
            lyo r3 = defpackage.lwu.b
            r0.b(r3, r4)
            android.os.Bundle r2 = r2.a()
            if (r2 == 0) goto L1f
            lyo r3 = defpackage.lwu.c
            r0.b(r3, r2)
        L1f:
            omn r2 = r5.h
            if (r2 == 0) goto L30
            android.content.Context r2 = r2.a
            android.content.Context r2 = r2.getApplicationContext()
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L30
            android.app.Application r2 = (android.app.Application) r2
            goto L31
        L30:
            r2 = r1
        L31:
            r3 = 1
            boolean r4 = r2 instanceof android.app.Application
            if (r3 == r4) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            if (r1 == 0) goto L3f
            lyo r2 = defpackage.lxh.b
            r0.b(r2, r1)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oip.T():lyp");
    }

    @Override // defpackage.pjb
    public final pix U() {
        return this.f.d.a;
    }

    public final Bundle a() {
        return this.f.a();
    }

    public final lvb b() {
        return this.f.g;
    }

    public final void c(lvb lvbVar) {
        lvbVar.getClass();
        this.f.b(lvbVar);
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof oip)) {
            oip oipVar = (oip) obj;
            if (fdbq.f(this.d, oipVar.d) && fdbq.f(this.a, oipVar.a) && fdbq.f(P(), oipVar.P()) && fdbq.f(U(), oipVar.U())) {
                Bundle bundle = this.b;
                if (fdbq.f(bundle, oipVar.b)) {
                    return true;
                }
                if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                    return false;
                }
                if (setKeySet.isEmpty()) {
                    return true;
                }
                for (String str : setKeySet) {
                    Object obj2 = bundle.get(str);
                    Bundle bundle2 = oipVar.b;
                    if (!fdbq.f(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        Bundle bundle = this.b;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + P().hashCode()) * 31) + U().hashCode();
    }

    public final String toString() {
        return this.f.toString();
    }

    public oip(omn omnVar, ojx ojxVar, Bundle bundle, lvb lvbVar, oje ojeVar, String str, Bundle bundle2) {
        this.h = omnVar;
        this.a = ojxVar;
        this.b = bundle;
        this.c = lvbVar;
        this.g = ojeVar;
        this.d = str;
        this.e = bundle2;
        this.f = new oml(this);
        fctd.a(new fdae() { // from class: oin
            @Override // defpackage.fdae
            public final Object invoke() {
                oml omlVar = this.a.f;
                if (!omlVar.e) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (omlVar.f.c == lvb.a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                lxo lxoVarB = lxi.b(omlVar.a, (lxk) omlVar.i.a(), 4);
                int i = fdcj.a;
                return ((omk) lxoVarB.b(new fdbi(omk.class))).a;
            }
        });
    }
}
