package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iog {
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final long f;
    private final int g;
    private final boolean h;
    private final ArrayList i;
    private final iof j;
    private boolean k;

    public /* synthetic */ iog(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2 = (i2 & 32) != 0 ? ije.h : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        str = 1 == (i2 & 1) ? "" : str;
        boolean z2 = (i2 & 128) == 0;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2 & z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        iof iofVar = new iof(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = iofVar;
        arrayList.add(iofVar);
    }

    private final iof f() {
        return (iof) this.i.get(r0.size() - 1);
    }

    private final void g() {
        if (this.k) {
            itw.d("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }

    private static final ipq h(iof iofVar) {
        return new ipq(iofVar.a, iofVar.b, iofVar.c, iofVar.d, iofVar.e, iofVar.f, iofVar.g, iofVar.h, iofVar.i, iofVar.j);
    }

    public final ioi a() {
        int i;
        g();
        while (this.i.size() > 1) {
            d();
        }
        String str = this.a;
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        iof iofVar = this.j;
        long j = this.f;
        int i2 = this.g;
        boolean z = this.h;
        ipq ipqVarH = h(iofVar);
        synchronized (ioi.c) {
            i = ioi.b;
            ioi.b = i + 1;
        }
        ioi ioiVar = new ioi(str, f, f2, f3, f4, ipqVarH, j, i2, z, i);
        this.k = true;
        return ioiVar;
    }

    public final void b(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        g();
        this.i.add(new iof(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void c(List list, int i, String str, iiy iiyVar, float f, iiy iiyVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        g();
        f().j.add(new ipw(str, list, i, iiyVar, f, iiyVar2, f2, f3, i2, i3, f4, f5, f6, f7));
    }

    public final void d() {
        g();
        f().j.add(h((iof) this.i.remove(r0.size() - 1)));
    }
}
