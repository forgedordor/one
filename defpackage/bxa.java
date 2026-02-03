package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxa {
    private final Map a = new LinkedHashMap();
    private final TreeMap b = new TreeMap(new bnv());
    private final cbg c;
    private final cbg d;

    public bxa(bkf bkfVar, int i) {
        bxo bxoVar = bxo.b;
        Iterator it = new ArrayList(bxo.i).iterator();
        while (true) {
            caz cazVar = null;
            if (!it.hasNext()) {
                break;
            }
            bxo bxoVar2 = (bxo) it.next();
            lcg.d(bxoVar2 instanceof bxn, "Currently only support ConstantQuality");
            bxn bxnVar = (bxn) bxoVar2;
            bkj bkjVarA = bkfVar.a(i != 1 ? bxnVar.a() : bxnVar.b());
            if (bkjVarA != null) {
                Objects.toString(bkjVarA);
                bbs.a("CapabilitiesByQuality", "profiles = ".concat(bkjVarA.toString()));
                if (!bkjVarA.d().isEmpty()) {
                    int iA = bkjVarA.a();
                    int iB = bkjVarA.b();
                    List listC = bkjVarA.c();
                    List listD = bkjVarA.d();
                    lcg.b(true ^ listD.isEmpty(), "Should contain at least one VideoProfile.");
                    cazVar = new caz(iA, iB, DesugarCollections.unmodifiableList(new ArrayList(listC)), DesugarCollections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : (bkg) listC.get(0), (bki) listD.get(0));
                }
                if (cazVar == null) {
                    bbs.f("CapabilitiesByQuality", a.h(bxoVar2, "EncoderProfiles of quality ", " has no video validated profiles."));
                } else {
                    this.b.put(cazVar.a.k(), bxoVar2);
                    this.a.put(bxoVar2, cazVar);
                }
            }
        }
        if (this.a.isEmpty()) {
            bbs.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (cbg) arrayDeque.peekFirst();
            this.d = (cbg) arrayDeque.peekLast();
        }
    }

    public final bxo a(Size size) {
        Object value;
        Size size2 = bsd.a;
        TreeMap treeMap = this.b;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        bxo bxoVar = (bxo) value;
        return bxoVar != null ? bxoVar : bxo.h;
    }

    public final cbg b(bxo bxoVar) {
        boolean zE = bxo.e(bxoVar);
        Objects.toString(bxoVar);
        lcg.b(zE, "Unknown quality: ".concat(String.valueOf(bxoVar)));
        return bxoVar == bxo.g ? this.c : bxoVar == bxo.f ? this.d : (cbg) this.a.get(bxoVar);
    }

    public final List c() {
        return new ArrayList(this.a.keySet());
    }
}
