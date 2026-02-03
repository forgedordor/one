package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvg {
    public final vvw a;
    public final vto b;
    public final Map c;
    public final Map d;

    public vvg(vvw vvwVar, vto vtoVar, Map map, Map map2) {
        vvwVar.getClass();
        this.a = vvwVar;
        this.b = vtoVar;
        this.c = map;
        this.d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvg)) {
            return false;
        }
        vvg vvgVar = (vvg) obj;
        return fdbq.f(this.a, vvgVar.a) && fdbq.f(this.b, vvgVar.b) && fdbq.f(this.c, vvgVar.c) && fdbq.f(this.d, vvgVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vto vtoVar = this.b;
        return ((((iHashCode + (vtoVar == null ? 0 : vtoVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        Set<Map.Entry> setEntrySet = this.c.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            fcti fctiVar = new fcti(((dohr) entry.getKey()).fq(), cqcy.d((Uri) entry.getValue()));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        Set<Map.Entry> setEntrySet2 = this.d.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setEntrySet2, 10)), 16));
        for (Map.Entry entry2 : setEntrySet2) {
            fcti fctiVar2 = new fcti(((dltd) entry2.getKey()).fq(), cqcy.c((CharSequence) entry2.getValue()));
            linkedHashMap2.put(fctiVar2.a, fctiVar2.b);
        }
        return "AnnotatedDraft(draft=" + this.a + ", emojiAnnotations=" + this.b + ", selectedVariations=" + linkedHashMap + ", captions=" + linkedHashMap2 + ")";
    }
}
