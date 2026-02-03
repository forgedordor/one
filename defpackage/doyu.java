package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public boolean f;

    public doyu(etyu etyuVar, boolean z) {
        etyuVar.getClass();
        String str = etyuVar.b;
        str.getClass();
        etyb etybVar = etyuVar.d;
        String str2 = (etybVar == null ? etyb.a : etybVar).c;
        str2.getClass();
        String str3 = etyuVar.e;
        str3.getClass();
        String str4 = etyuVar.g;
        str4.getClass();
        evtg evtgVar = etyuVar.h;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = evtgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new doyt((etyp) it.next()));
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doyu)) {
            return false;
        }
        doyu doyuVar = (doyu) obj;
        return fdbq.f(this.a, doyuVar.a) && fdbq.f(this.b, doyuVar.b) && fdbq.f(this.c, doyuVar.c) && fdbq.f(this.d, doyuVar.d) && fdbq.f(this.e, doyuVar.e) && this.f == doyuVar.f;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "StickerPack(id=" + this.a + ", icon=" + this.b + ", title=" + this.c + ", artist=" + this.d + ", stickers=" + this.e + ", isFavorite=" + this.f + ")";
    }
}
