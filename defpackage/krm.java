package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krm extends krf {
    public float ao;

    @Deprecated
    protected final HashMap ap;

    @Deprecated
    protected final HashMap aq;

    @Deprecated
    protected final HashMap ar;
    public krh as;
    private HashMap at;
    private HashMap au;

    public krm(krj krjVar, int i) {
        super(krjVar, i);
        this.ao = 0.5f;
        this.ap = new HashMap();
        this.aq = new HashMap();
        this.ar = new HashMap();
        this.as = krh.SPREAD;
    }

    final float A(String str) {
        HashMap map = this.au;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.au.get(str)).floatValue();
    }

    protected final float B(String str) {
        HashMap map = this.ar;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    final float C(String str) {
        HashMap map = this.at;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.at.get(str)).floatValue();
    }

    protected final float D(String str) {
        HashMap map = this.aq;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    protected final float E(String str) {
        HashMap map = this.ap;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return -1.0f;
    }

    public final void F(Object obj, float f, float f2, float f3, float f4, float f5) {
        super.z(obj);
        String string = obj.toString();
        if (!Float.isNaN(f)) {
            this.ap.put(string, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            this.aq.put(string, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.ar.put(string, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            if (this.at == null) {
                this.at = new HashMap();
            }
            this.at.put(string, Float.valueOf(f4));
        }
        if (Float.isNaN(f5)) {
            return;
        }
        if (this.au == null) {
            this.au = new HashMap();
        }
        this.au.put(string, Float.valueOf(f5));
    }
}
