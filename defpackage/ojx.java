package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ojx {
    public static final /* synthetic */ int h = 0;
    public final String c;
    public final onf d;
    public oka e;
    public CharSequence f;
    public final cvx g;

    static {
        new LinkedHashMap();
    }

    public ojx(oky okyVar) {
        Map map = ola.a;
        this.c = okz.b(okyVar.getClass());
        this.d = new onf(this);
        this.g = new cvx(null);
    }

    private final List j() {
        return this.d.c;
    }

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, oli.e);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(2);
        onf onfVar = this.d;
        if (string == null) {
            onfVar.a(0);
        } else {
            if (fdgn.H(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String strConcat = "android-app://androidx.navigation/".concat(string);
            final ojs ojsVar = new ojs(strConcat, null, null);
            List listA = oim.a(onfVar.d, new fdap() { // from class: onc
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((String) obj).getClass();
                    return Boolean.valueOf(!ojsVar.a().contains(r2));
                }
            });
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException("Cannot set route \"" + string + "\" for destination " + onfVar.a + ". Following required arguments are missing: " + listA);
            }
            onfVar.g = fctd.a(new fdae() { // from class: ond
                @Override // defpackage.fdae
                public final Object invoke() {
                    return new ojs(strConcat, null, null);
                }
            });
            onfVar.a(strConcat.hashCode());
        }
        onfVar.f = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            onfVar.a(typedArrayObtainAttributes.getResourceId(1, 0));
            onfVar.b = ojv.a(new omn(context), c());
        }
        this.f = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public boolean b() {
        return true;
    }

    public final int c() {
        return this.d.e;
    }

    public final Bundle d(Bundle bundle) {
        onf onfVar = this.d;
        if (bundle == null && onfVar.d.isEmpty()) {
            return null;
        }
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        Map map = onfVar.d;
        for (Map.Entry entry : map.entrySet()) {
            ((oil) entry.getValue()).a((String) entry.getKey(), bundleA);
        }
        if (bundle != null) {
            bundleA.putAll(bundle);
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                oil oilVar = (oil) entry2.getValue();
                str.getClass();
                if (oilVar.b || !pis.g(bundleA, str) || !pis.h(bundleA, str)) {
                    try {
                        oilVar.a.b(bundleA, str);
                    } catch (IllegalStateException unused) {
                    }
                }
                throw new IllegalArgumentException("Wrong argument type for '" + str + "' in argument savedState. " + oilVar.a.e() + " expected.");
            }
        }
        return bundleA;
    }

    public final oik e(int i) {
        cvx cvxVar = this.g;
        oik oikVar = cvxVar.c() == 0 ? null : (oik) cvy.a(cvxVar, i);
        if (oikVar != null) {
            return oikVar;
        }
        oka okaVar = this.e;
        if (okaVar == null) {
            return null;
        }
        return okaVar.e(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[EDGE_INSN: B:31:0x00ae->B:32:0x00af BREAK  A[LOOP:1: B:23:0x007b->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lce
            boolean r2 = r9 instanceof defpackage.ojx
            if (r2 != 0) goto Ld
            goto Lce
        Ld:
            java.util.List r2 = r8.j()
            ojx r9 = (defpackage.ojx) r9
            java.util.List r3 = r9.j()
            boolean r2 = defpackage.fdbq.f(r2, r3)
            cvx r3 = r8.g
            cvx r4 = r9.g
            int r5 = r3.c()
            int r4 = r4.c()
            if (r5 != r4) goto L5c
            r3.getClass()
            cvz r4 = new cvz
            r4.<init>(r3)
            fdev r4 = defpackage.fdey.b(r4)
            java.util.Iterator r4 = r4.a()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = defpackage.cvy.a(r3, r5)
            cvx r7 = r9.g
            java.lang.Object r5 = defpackage.cvy.a(r7, r5)
            boolean r5 = defpackage.fdbq.f(r6, r5)
            if (r5 != 0) goto L39
            goto L5c
        L5a:
            r3 = r0
            goto L5d
        L5c:
            r3 = r1
        L5d:
            java.util.Map r4 = r8.i()
            int r4 = r4.size()
            java.util.Map r5 = r9.i()
            int r5 = r5.size()
            if (r4 != r5) goto Lae
            java.util.Map r4 = r8.i()
            fdev r4 = defpackage.fcwa.q(r4)
            java.util.Iterator r4 = r4.a()
        L7b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.i()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lae
            java.util.Map r6 = r9.i()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.fdbq.f(r6, r5)
            if (r5 != 0) goto L7b
            goto Lae
        Lac:
            r4 = r0
            goto Laf
        Lae:
            r4 = r1
        Laf:
            int r5 = r8.c()
            int r6 = r9.c()
            if (r5 != r6) goto Lce
            java.lang.String r5 = r8.h()
            java.lang.String r9 = r9.h()
            boolean r9 = defpackage.fdbq.f(r5, r9)
            if (r9 == 0) goto Lce
            if (r2 == 0) goto Lce
            if (r3 == 0) goto Lce
            if (r4 == 0) goto Lce
            return r0
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojx.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ojw f(defpackage.ojt r26) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojx.f(ojt):ojw");
    }

    public final String g() {
        return this.d.b;
    }

    public final String h() {
        return this.d.f;
    }

    public int hashCode() {
        int iC = c() * 31;
        String strH = h();
        int iHashCode = iC + (strH != null ? strH.hashCode() : 0);
        for (ojs ojsVar : j()) {
            int i = iHashCode * 31;
            String str = ojsVar.c;
            int iHashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = ojsVar.d;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = ojsVar.e;
            iHashCode = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
        Iterator itA = cwb.a(this.g);
        while (itA.hasNext()) {
            oik oikVar = (oik) itA.next();
            int i2 = ((iHashCode * 31) + oikVar.a) * 31;
            okg okgVar = oikVar.b;
            iHashCode = i2 + (okgVar != null ? okgVar.hashCode() : 0);
            Bundle bundle = oikVar.c;
            if (bundle != null) {
                iHashCode = (iHashCode * 31) + piu.a(bundle);
            }
        }
        for (String str4 : i().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str4.hashCode()) * 31;
            Object obj = i().get(str4);
            iHashCode = iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Map i() {
        return fcwa.l(this.d.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (g() == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(c()));
        } else {
            sb.append(g());
        }
        sb.append(")");
        String strH = h();
        if (strH != null && !fdgn.H(strH)) {
            sb.append(" route=");
            sb.append(h());
        }
        if (this.f != null) {
            sb.append(" label=");
            sb.append(this.f);
        }
        return sb.toString();
    }
}
