package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnm {
    public Map b;
    public Map c;
    public Map d;
    public List e;
    public cvx f;
    public ctz g;
    public List h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public final qoq a = new qoq();
    private final HashSet o = new HashSet();
    public int n = 0;

    public final float a() {
        return (long) ((b() / this.l) * 1000.0f);
    }

    public final float b() {
        return this.k - this.j;
    }

    public final qsw c(String str) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            qsw qswVar = (qsw) this.e.get(i);
            String str2 = qswVar.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return qswVar;
            }
        }
        return null;
    }

    public final qul d(long j) {
        return (qul) this.g.d(j);
    }

    public final void e(String str) {
        qws.a(str);
        this.o.add(str);
    }

    public final void f(int i) {
        this.n += i;
    }

    public final void g() {
        this.m = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(((qul) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
