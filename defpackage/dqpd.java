package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import android.text.TextUtils;
import defpackage.dqpd;
import defpackage.dqpo;
import defpackage.dqqj;
import defpackage.dqwl;
import defpackage.dqws;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqpd<C extends dqqj<C, Q, B, D, R>, Q extends dqwl<C, Q, B, D, R>, B extends dqws<C, Q, B, D, R>, D extends dqpd<C, Q, B, D, R>, R extends dqpo<R>> {
    public BitSet cL;
    public Map cM;
    protected dqqe cN;
    public final Map cO = new HashMap();
    public final Map cP = new HashMap();
    public boolean cQ;

    /* compiled from: PG */
    public interface a {
        axgm ix();
    }

    protected static final boolean aI(dqqf dqqfVar, int i) {
        return dqqfVar.dj(i);
    }

    protected static final String aJ(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(i);
            sb.append(";");
        }
        return sb.toString();
    }

    protected static final String aK(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        for (long j : jArr) {
            sb.append(j);
            sb.append(";");
        }
        return sb.toString();
    }

    protected static final String aL(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(";");
        }
        return sb.toString();
    }

    protected static final String aM(String[] strArr) {
        return TextUtils.join(";", strArr);
    }

    protected static final String aN(boolean[] zArr) {
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            sb.append(z);
            sb.append(";");
        }
        return sb.toString();
    }

    private final dqpd fX(String str, Class cls) {
        Map map = this.cP;
        if (((dqth) map.get(str)) != null) {
            ekgb ekgbVar = (ekgb) this.cO.get(str);
            if (ekgbVar.size() > 1) {
                return (dqpd) cls.cast(ekgbVar.get(1));
            }
            ejwl.l(cls.cast(ekgbVar.get(0)) != null);
            return null;
        }
        throw new IllegalArgumentException("invalid join tag: " + str + ", valid joins=" + Arrays.toString(map.keySet().toArray()));
    }

    public abstract String a();

    public final void aA(int i, String str) {
        BitSet bitSet;
        if (((Boolean) ((dqoj) dqru.c).a.get()).booleanValue() && (bitSet = this.cL) != null && !bitSet.get(i)) {
            throw new IllegalStateException(defpackage.a.a(str, "sql column ", " is not part of the projection or was not initialized in the builder"));
        }
    }

    protected final void aB(Parcel parcel) {
        dqqe dqqeVar = new dqqe(ekgb.n(Arrays.asList(parcel.createStringArray())), new HashMap());
        this.cN = dqqeVar;
        parcel.readMap(dqqeVar.b, null);
        fD(parcel);
        int i = parcel.readInt();
        if (i == -1) {
            this.cL = null;
            return;
        }
        this.cL = new BitSet();
        for (int i2 = 0; i2 < i; i2++) {
            this.cL.set(parcel.readInt());
        }
    }

    protected final void aC() {
        if (this.cL != null) {
            return;
        }
        this.cL = new BitSet();
    }

    public final void aD(BitSet bitSet) {
        this.cL = bitSet != null ? (BitSet) bitSet.clone() : null;
    }

    protected final boolean aE(dqqe dqqeVar) {
        dqqe dqqeVar2 = this.cN;
        int size = dqqeVar2 == null ? 0 : dqqeVar2.a.size();
        if (size != (dqqeVar == null ? 0 : dqqeVar.a.size())) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        return this.cN.equals(dqqeVar);
    }

    public final boolean aF(String str) {
        return this.cP.containsKey(str);
    }

    public final boolean aG(String str) {
        dqqe dqqeVar = this.cN;
        return dqqeVar != null && dqqeVar.b.containsKey(str);
    }

    public final dqpd[] aH(String str, dqpd[] dqpdVarArr) {
        Map map = this.cP;
        if (map.containsKey(str)) {
            ekgb ekgbVar = (ekgb) this.cO.get(str);
            if (ekgbVar.size() > 0) {
                dqpdVarArr = (dqpd[]) Array.newInstance(dqpdVarArr.getClass().getComponentType(), ekgbVar.size() - 1);
            }
            System.arraycopy(ekgbVar.toArray(), 1, dqpdVarArr, 0, ekgbVar.size() - 1);
            return dqpdVarArr;
        }
        throw new IllegalArgumentException("invalid join tag: " + str + ", valid joins=" + Arrays.toString(map.keySet().toArray()));
    }

    public final dqpd aw(String str, Class cls) {
        if (!this.cQ) {
            return fX(str, cls);
        }
        throw new IllegalArgumentException("invalid join tag (found aggregating query): " + str + "; join " + String.valueOf(this.cP.get(str)));
    }

    public final dqpd ax(String str, Class cls) {
        dqth dqthVar = (dqth) this.cP.get(str);
        if (dqthVar == null || !dqthVar.f) {
            return fX(str, cls);
        }
        throw new IllegalArgumentException(defpackage.a.G(str, dqthVar, "invalid join tag (found multi row join): ", "; join "));
    }

    public final Object ay(String str) {
        Map map = this.cM;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final String az(String str) {
        Integer num = (Integer) this.cN.b.get(str);
        if (num == null) {
            throw new IllegalArgumentException("unknown as expression: ".concat(String.valueOf(str)));
        }
        int iIntValue = num.intValue();
        if (iIntValue >= this.cN.a() || iIntValue < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (String) this.cN.a.get(iIntValue);
    }

    public abstract void b(ContentValues contentValues);

    protected abstract void c(dqqj dqqjVar);

    public void fN(int i) {
        BitSet bitSet = this.cL;
        if (bitSet != null) {
            bitSet.set(i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        dqqe dqqeVar = this.cN;
        if (dqqeVar == null) {
            parcel.writeStringArray(new String[0]);
            parcel.writeMap(new HashMap());
        } else {
            parcel.writeStringArray((String[]) dqqeVar.a.toArray(new String[0]));
            parcel.writeMap(this.cN.b);
        }
        fE(parcel);
        BitSet bitSet = this.cL;
        if (bitSet == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bitSet.cardinality());
        int iNextSetBit = this.cL.nextSetBit(0);
        while (iNextSetBit != -1) {
            parcel.writeInt(iNextSetBit);
            iNextSetBit = this.cL.nextSetBit(iNextSetBit + 1);
        }
    }

    protected void fD(Parcel parcel) {
    }

    protected void fE(Parcel parcel) {
    }
}
