package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxk {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    public final Map c = new HashMap();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final Map f = new HashMap();
    public Collection g = null;
    public final boolean h = true;
    public final boolean i;

    public dsxk() {
        ekon ekonVar = ekon.a;
        this.i = false;
    }

    private final dsxj d(dsvd dsvdVar) {
        List list = this.d;
        dsxj dsxjVar = new dsxj(list.size(), this.a.size());
        dsvq dsvqVarA = dsxjVar.a(dsvdVar, -1);
        ArrayList arrayList = new ArrayList(1);
        dsxc.a(dsvdVar, arrayList);
        eohx eohxVar = dsvqVarA.d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        dsxjVar.b(new dsxx(1, arrayList, eohxVar.c));
        list.add(dsxjVar);
        this.c.put(dsvqVarA, dsxjVar);
        return dsxjVar;
    }

    public final dsxj a(List list, int i) {
        dsvq dsvqVar = (dsvq) ekis.j(list);
        Map map = this.c;
        dsxj dsxjVar = (dsxj) map.get(dsvqVar);
        if (dsxjVar != null) {
            return dsxjVar;
        }
        List list2 = this.d;
        dsxj dsxjVar2 = new dsxj(list2.size(), i);
        list2.add(dsxjVar2);
        map.put(dsvqVar, dsxjVar2);
        return dsxjVar2;
    }

    public final dsxj b(dsvd dsvdVar) {
        String string;
        int i = dsvdVar.g;
        if (i != -1) {
            if (i != -2) {
                return (dsxj) this.d.get(i);
            }
        } else {
            if (!dsvdVar.e()) {
                StringBuilder sb = new StringBuilder();
                sb.append(dsvdVar);
                sb.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
                dsxa dsxaVar = dsvdVar.f;
                if (dsxaVar instanceof dsvu) {
                    sb.append("\n\tError occurred on CVE with associated View of type: ");
                    sb.append(dsvu.b(dsvdVar).getClass().getSimpleName());
                } else {
                    sb.append("\n\tError occurred on SyntheticNode");
                }
                Object objD = dsxaVar.d();
                if (objD != null) {
                    sb.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (objD != null) {
                        dsvd dsvdVar2 = (dsvd) objD;
                        dsxa dsxaVar2 = dsvdVar2.f;
                        if (dsxaVar2 == null) {
                            sb.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            string = sb.toString();
                            break;
                        }
                        if (dsxaVar2 instanceof dsvu) {
                            sb.append("\n\t\t\tView of type: ");
                            sb.append(dsvu.b(dsvdVar2).getClass().getSimpleName());
                        } else {
                            sb.append("\n\t\t\tSyntheticNode");
                        }
                        objD = dsxaVar2.d();
                    } else {
                        string = sb.toString();
                        break;
                    }
                }
                throw new IllegalStateException(string);
            }
            this.e.add(dsvdVar);
            dsxa dsxaVar3 = dsvdVar.f;
            if (dsxaVar3.p()) {
                return d(dsvdVar);
            }
            Object objD2 = dsxaVar3.d();
            if (objD2 == null) {
                dsvq dsvqVarA = dsvdVar.a();
                evsl evslVarCheckIsLite = evsn.checkIsLite(dtaf.a);
                dsvqVarA.d(evslVarCheckIsLite);
                if (dsvqVarA.r.o(evslVarCheckIsLite.d)) {
                    return d(dsvdVar);
                }
                View viewB = dsvu.b(dsvdVar);
                while (viewB != null) {
                    if (!dsvu.q(viewB)) {
                        Object parent = viewB.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        viewB = (View) parent;
                    } else {
                        Log.e("GIL", a.I(dsvdVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                        break;
                    }
                }
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", a.I(dsvdVar, "Ignoring CVE (", ") outside of AutoLogger scope."));
                }
                dsvdVar.g = -2;
                return null;
            }
            dsvd dsvdVar3 = (dsvd) objD2;
            if (dsvdVar3.g == -1 && dsvdVar3.f()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                dsxc.a(dsvdVar3, arrayList);
                ejwl.l(arrayList.size() > 1);
                dsxj dsxjVarA = a(arrayList, this.a.size());
                dsvq dsvqVarA2 = dsxjVarA.a(dsvdVar, -1);
                arrayList.set(0, dsvqVarA2);
                eohx eohxVar = dsvqVarA2.d;
                if (eohxVar == null) {
                    eohxVar = eohx.a;
                }
                dsxjVarA.b(new dsxx(1, arrayList, eohxVar.c));
                return dsxjVarA;
            }
            dsxj dsxjVarB = b(dsvdVar3);
            if (dsxjVarB != null) {
                eohx eohxVar2 = ((dsvq) dsvdVar3.c.instance).d;
                if (eohxVar2 == null) {
                    eohxVar2 = eohx.a;
                }
                dsxjVarB.a(dsvdVar, eohxVar2.c);
                return dsxjVarB;
            }
        }
        return null;
    }

    public final boolean c(dsvd dsvdVar, int i) {
        if (this.a.contains(dsvdVar)) {
            return false;
        }
        int iB = emmy.b(((dsvq) dsvdVar.c.instance).e);
        if (iB == 0) {
            iB = 1;
        }
        if (iB == i) {
            this.b.remove(dsvdVar);
            return false;
        }
        this.b.add(dsvdVar);
        return true;
    }
}
