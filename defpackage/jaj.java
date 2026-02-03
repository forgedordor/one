package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jaj {
    public final jak a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private jak i;
    public boolean b = true;
    public final Map h = new HashMap();

    public jaj(jak jakVar) {
        this.a = jakVar;
    }

    protected abstract int a(jer jerVar, itz itzVar);

    protected abstract long b(jer jerVar, long j);

    protected abstract Map c(jer jerVar);

    public final void d(itz itzVar, int i, jer jerVar) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(jerVar, jB);
                jerVar = jerVar.x;
                jerVar.getClass();
                if (fdbq.f(jerVar, this.a.i())) {
                    break loop0;
                }
            } while (!c(jerVar).containsKey(itzVar));
            float fA = a(jerVar, itzVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        float fIntBitsToFloat = itzVar instanceof ivg ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32));
        Map map = this.h;
        int iRound = Math.round(fIntBitsToFloat);
        if (map.containsKey(itzVar)) {
            iRound = ((Number) itzVar.a.a(Integer.valueOf(((Number) fcwa.e(map, itzVar)).intValue()), Integer.valueOf(iRound))).intValue();
        }
        map.put(itzVar, Integer.valueOf(iRound));
    }

    public final void e() {
        this.b = true;
        jak jakVar = this.a;
        jak jakVarH = jakVar.h();
        if (jakVarH == null) {
            return;
        }
        if (this.c) {
            jakVarH.m();
        } else if (this.e || this.d) {
            jakVarH.l();
        }
        if (this.f) {
            jakVar.m();
        }
        if (this.g) {
            jakVar.l();
        }
        jakVarH.g().e();
    }

    public final void f() {
        Map map = this.h;
        map.clear();
        jai jaiVar = new jai(this);
        jak jakVar = this.a;
        jakVar.j(jaiVar);
        map.putAll(c(jakVar.i()));
        this.b = false;
    }

    public final void g() {
        jak jakVar;
        jaj jajVarG;
        jaj jajVarG2;
        if (i()) {
            jakVar = this.a;
        } else {
            jak jakVarH = this.a.h();
            if (jakVarH == null) {
                return;
            }
            jakVar = jakVarH.g().i;
            if (jakVar == null || !jakVar.g().i()) {
                jak jakVar2 = this.i;
                if (jakVar2 == null || jakVar2.g().i()) {
                    return;
                }
                jak jakVarH2 = jakVar2.h();
                if (jakVarH2 != null && (jajVarG2 = jakVarH2.g()) != null) {
                    jajVarG2.g();
                }
                jak jakVarH3 = jakVar2.h();
                jakVar = (jakVarH3 == null || (jajVarG = jakVarH3.g()) == null) ? null : jajVarG.i;
            }
        }
        this.i = jakVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        g();
        return this.i != null;
    }
}
