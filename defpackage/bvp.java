package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvp implements bdq {
    final Set a;
    public final bnm e;
    public final biu f;
    public final Set h;
    public final Map i;
    public final bvg j;
    final Map b = new HashMap();
    public final Map c = new HashMap();
    final Map d = new HashMap();
    public final bhr g = new bvo(this);

    public bvp(biu biuVar, Set set, bnm bnmVar, bvj bvjVar) {
        this.f = biuVar;
        this.e = bnmVar;
        this.a = set;
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            map.put(bdrVar, bdrVar.G(((bgz) biuVar).a, null, bdrVar.f(true, bnmVar)));
        }
        this.i = map;
        HashSet hashSet = new HashSet(map.values());
        this.h = hashSet;
        this.j = new bvg(biuVar, hashSet);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            bdr bdrVar2 = (bdr) it2.next();
            this.d.put(bdrVar2, false);
            this.c.put(bdrVar2, new bvn(biuVar, this, bvjVar));
        }
    }

    static bjz a(bdr bdrVar) {
        List listF = bdrVar instanceof bbf ? bdrVar.q.f() : bdrVar.q.g.e();
        lcg.c(listF.size() <= 1);
        if (listF.size() == 1) {
            return (bjz) listF.get(0);
        }
        return null;
    }

    private final btv b(bdr bdrVar) {
        btv btvVar = (btv) this.b.get(bdrVar);
        btvVar.getClass();
        return btvVar;
    }

    private static void c(btv btvVar, bjz bjzVar, bml bmlVar) {
        btvVar.i();
        try {
            box.b();
            btvVar.f();
            btu btuVar = btvVar.j;
            btuVar.getClass();
            btuVar.i(bjzVar, new btm(btuVar));
        } catch (bjx unused) {
            bmf bmfVar = bmlVar.f;
            if (bmfVar != null) {
                bmfVar.a(bmlVar);
            }
        }
    }

    private final boolean d(bdr bdrVar) {
        Boolean bool = (Boolean) this.d.get(bdrVar);
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // defpackage.bdq
    public final void u(bdr bdrVar) {
        box.b();
        if (d(bdrVar)) {
            return;
        }
        this.d.put(bdrVar, true);
        bjz bjzVarA = a(bdrVar);
        if (bjzVarA != null) {
            c(b(bdrVar), bjzVarA, bdrVar.q);
        }
    }

    @Override // defpackage.bdq
    public final void v(bdr bdrVar) {
        box.b();
        if (d(bdrVar)) {
            this.d.put(bdrVar, false);
            b(bdrVar).h();
        }
    }

    @Override // defpackage.bdq
    public final void w(bdr bdrVar) {
        bjz bjzVarA;
        box.b();
        btv btvVarB = b(bdrVar);
        if (d(bdrVar) && (bjzVarA = a(bdrVar)) != null) {
            c(btvVarB, bjzVarA, bdrVar.q);
        }
    }

    @Override // defpackage.bdq
    public final void x(bdr bdrVar) {
        box.b();
        if (d(bdrVar)) {
            btv btvVarB = b(bdrVar);
            bjz bjzVarA = a(bdrVar);
            if (bjzVarA != null) {
                c(btvVarB, bjzVarA, bdrVar.q);
            } else {
                btvVarB.h();
            }
        }
    }
}
