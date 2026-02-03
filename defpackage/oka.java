package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oka extends ojx implements Iterable<ojx>, fdcn {
    public static final /* synthetic */ int b = 0;
    public final onh a;

    public oka(oky okyVar) {
        super(okyVar);
        this.a = new onh(this);
    }

    @Override // defpackage.ojx
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, oli.d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        onh onhVar = this.a;
        oka okaVar = onhVar.a;
        if (resourceId == okaVar.c()) {
            throw new IllegalArgumentException(a.y(okaVar, resourceId, "Start destination ", " cannot use the same id as the graph "));
        }
        onhVar.c = resourceId;
        onhVar.d = null;
        onhVar.d = ojv.a(new omn(context), resourceId);
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.ojx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof oka) && super.equals(obj)) {
            oka okaVar = (oka) obj;
            if (k().c() == okaVar.k().c() && j() == okaVar.j()) {
                Iterator itA = fdey.b(cwb.a(k())).a();
                while (itA.hasNext()) {
                    ojx ojxVar = (ojx) itA.next();
                    if (!fdbq.f(ojxVar, cvy.a(okaVar.k(), ojxVar.c()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ojx
    public final ojw f(ojt ojtVar) {
        onh onhVar = this.a;
        return onhVar.b(super.f(ojtVar), ojtVar, false, onhVar.a);
    }

    @Override // defpackage.ojx
    public final int hashCode() {
        int iJ = j();
        cvx cvxVarK = k();
        int iC = cvxVarK.c();
        for (int i = 0; i < iC; i++) {
            iJ = (((iJ * 31) + cvxVarK.b(i)) * 31) + ((ojx) cvxVarK.e(i)).hashCode();
        }
        return iJ;
    }

    @Override // java.lang.Iterable
    public final Iterator<ojx> iterator() {
        return new ong(this.a);
    }

    public final int j() {
        return this.a.c;
    }

    public final cvx k() {
        return this.a.b;
    }

    public final ojx l(int i) {
        onh onhVar = this.a;
        return onhVar.a(i, onhVar.a, false, null);
    }

    public final ojx m(int i, ojx ojxVar, boolean z, ojx ojxVar2) {
        return this.a.a(i, ojxVar, z, ojxVar2);
    }

    public final String n() {
        String strG = super.g();
        if (strG == null) {
            strG = String.valueOf(c());
        }
        onh onhVar = this.a;
        strG.getClass();
        return onhVar.a.c() != 0 ? strG : "the root navigation";
    }

    public final void o(ojx ojxVar) {
        int iC = ojxVar.c();
        String strH = ojxVar.h();
        if (iC == 0) {
            if (strH == null) {
                throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            }
            iC = 0;
        }
        onh onhVar = this.a;
        oka okaVar = onhVar.a;
        if (okaVar.h() != null && fdbq.f(strH, okaVar.h())) {
            throw new IllegalArgumentException(a.i(okaVar, ojxVar, "Destination ", " cannot have the same route as graph "));
        }
        if (iC == okaVar.c()) {
            throw new IllegalArgumentException(a.i(okaVar, ojxVar, "Destination ", " cannot have the same id as graph "));
        }
        cvx cvxVar = onhVar.b;
        ojx ojxVar2 = (ojx) cvy.a(cvxVar, iC);
        if (ojxVar2 == ojxVar) {
            return;
        }
        if (ojxVar.e != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (ojxVar2 != null) {
            ojxVar2.e = null;
        }
        ojxVar.e = okaVar;
        cvxVar.f(ojxVar.c(), ojxVar);
    }

    public final ojw p(ojt ojtVar, ojx ojxVar) {
        return this.a.b(super.f(ojtVar), ojtVar, true, ojxVar);
    }

    @Override // defpackage.ojx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        ojx ojxVarL = l(j());
        sb.append(" startDestination=");
        if (ojxVarL == null) {
            onh onhVar = this.a;
            String str = onhVar.d;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x".concat(String.valueOf(Integer.toHexString(onhVar.c))));
            }
        } else {
            sb.append("{");
            sb.append(ojxVarL.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
