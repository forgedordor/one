package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbg {
    public static final icr a(hum humVar) {
        int i;
        if (humVar == null || (i = humVar.b) == 0) {
            return null;
        }
        return (icr) humVar.c(i - 1);
    }

    public static final ivy b(jbf jbfVar) {
        if (!jbfVar.D().C) {
            itw.d("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        jer jerVarE = e(jbfVar, 2);
        if (!jerVarE.u()) {
            itw.d("LayoutCoordinates is not attached.");
        }
        return jerVarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final jcd c(icr icrVar) {
        if ((icrVar.t & 2) == 0) {
            return null;
        }
        if (icrVar instanceof jcd) {
            return (jcd) icrVar;
        }
        if (!(icrVar instanceof jbi)) {
            return null;
        }
        icr icrVar2 = ((jbi) icrVar).E;
        while (icrVar2 != 0) {
            if (icrVar2 instanceof jcd) {
                return (jcd) icrVar2;
            }
            icrVar2 = (!(icrVar2 instanceof jbi) || (icrVar2.t & 2) == 0) ? icrVar2.w : ((jbi) icrVar2).E;
        }
        return null;
    }

    public static final jcr d(jbf jbfVar) {
        jer jerVar = jbfVar.D().y;
        if (jerVar != null) {
            return jerVar.t;
        }
        itw.b("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new fcta();
    }

    public static final jer e(jbf jbfVar, int i) {
        jer jerVar = jbfVar.D().y;
        jerVar.getClass();
        if (jerVar.A() != jbfVar || !jet.h(i)) {
            return jerVar;
        }
        jer jerVar2 = jerVar.w;
        jerVar2.getClass();
        return jerVar2;
    }

    public static final jfh f(jbf jbfVar) {
        jfh jfhVar = d(jbfVar).k;
        if (jfhVar != null) {
            return jfhVar;
        }
        itw.b("This node does not have an owner.");
        throw new fcta();
    }

    public static final kio g(jbf jbfVar) {
        return d(jbfVar).r;
    }

    public static final kji h(jbf jbfVar) {
        return d(jbfVar).s;
    }

    public static final void i(jbf jbfVar) {
        idh idhVar;
        jcr jcrVarD = d(jbfVar);
        if (jcrVarD.p || (idhVar = ((AndroidComposeView) jcv.a(jcrVarD)).x) == null) {
            return;
        }
        idhVar.c.a.b(jcrVarD.c, new idg(idhVar, jcrVarD));
    }

    public static final /* synthetic */ void j(hum humVar, icr icrVar) {
        hum humVarQ = d(icrVar).q();
        int i = humVarQ.b - 1;
        Object[] objArr = humVarQ.a;
        if (i < objArr.length) {
            while (i >= 0) {
                humVar.n(((jcr) objArr[i]).v.f);
                i--;
            }
        }
    }

    public static final iie k(jbf jbfVar) {
        return ((AndroidComposeView) f(jbfVar)).ab;
    }
}
