package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljj {
    public final long a;
    public final List b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    public dljj(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.a = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.b = fcva.g(new ije(j), new ije(j2), new ije(j3), new ije(j4), new ije(j5), new ije(j6), new ije(j7));
        fctd.a(new fdae() { // from class: dlji
            @Override // defpackage.fdae
            public final Object invoke() {
                List list = this.a.b;
                float[] fArr = new float[3];
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Color.colorToHSV(ijg.b(((ije) it.next()).i), fArr);
                    arrayList.add(Float.valueOf(fArr[0]));
                }
                return fcva.aB(arrayList);
            }
        });
    }

    public final long a(String str) {
        List list = this.b;
        int iHashCode = str.hashCode();
        int size = list.size();
        int i = iHashCode % size;
        return ((ije) list.get(i + (size & (((i ^ size) & ((-i) | i)) >> 31)))).i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljj)) {
            return false;
        }
        dljj dljjVar = (dljj) obj;
        long j = this.c;
        long j2 = dljjVar.c;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.d, dljjVar.d) && fcts.a(this.e, dljjVar.e) && fcts.a(this.a, dljjVar.a) && fcts.a(this.f, dljjVar.f) && fcts.a(this.g, dljjVar.g) && fcts.a(this.h, dljjVar.h);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.c);
        long j2 = this.h;
        long j3 = this.g;
        long j4 = this.f;
        long j5 = this.a;
        return (((((((((((iA * 31) + fctr.a(this.d)) * 31) + fctr.a(this.e)) * 31) + fctr.a(j5)) * 31) + fctr.a(j4)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }

    public final String toString() {
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        long j4 = this.a;
        long j5 = this.e;
        long j6 = this.d;
        return "AbcMonogramColors(red=" + ije.g(this.c) + ", yellow=" + ije.g(j6) + ", purple=" + ije.g(j5) + ", orange=" + ije.g(j4) + ", green=" + ije.g(j3) + ", pink=" + ije.g(j2) + ", cyan=" + ije.g(j) + ")";
    }
}
