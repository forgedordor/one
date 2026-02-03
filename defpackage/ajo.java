package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajo {
    public long a;
    public int b;
    public Map c;
    private String d;
    private String e;
    private String f;
    private long g;
    private List h;

    /* JADX WARN: Multi-variable type inference failed */
    public ajo(ajp ajpVar) {
        this.d = ajpVar.a;
        this.e = ajpVar.b;
        this.f = ajpVar.c;
        this.a = ajpVar.d;
        this.g = ajpVar.e;
        this.b = ajpVar.f;
        Map map = ajpVar.i;
        this.c = new csq(((cvw) map).d);
        for (aka akaVar : map.values()) {
            this.c.put(akaVar.a, akaVar);
        }
        this.h = ajpVar.h;
    }

    public final ajp a() {
        long jCurrentTimeMillis = this.a;
        if (jCurrentTimeMillis == -1) {
            jCurrentTimeMillis = System.currentTimeMillis();
            this.a = jCurrentTimeMillis;
        }
        return new ajp(this.d, this.e, this.f, jCurrentTimeMillis, this.g, this.b, new ArrayList(this.c.values()), this.h);
    }

    public final void b(String str, aka akaVar) {
        akaVar.getClass();
        this.c.put(str, akaVar);
    }

    public final void c(List list) {
        if (list == null) {
            this.h = null;
        } else {
            this.h = new ArrayList(list);
        }
    }

    public final void d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        this.g = j;
    }

    public ajo(String str, String str2, String str3) {
        str.getClass();
        this.d = str;
        str2.getClass();
        this.e = str2;
        str3.getClass();
        this.f = str3;
        this.a = -1L;
        this.g = 0L;
        this.b = 0;
        this.c = new csq();
    }
}
