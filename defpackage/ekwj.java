package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwj extends ekwh {
    public static final Map c;
    private final ekst d;

    static {
        EnumMap enumMap = new EnumMap(ekst.class);
        for (ekst ekstVar : ekst.values()) {
            ekwj[] ekwjVarArr = new ekwj[10];
            for (int i = 0; i < 10; i++) {
                ekwjVarArr[i] = new ekwj(i, ekstVar, eksu.a);
            }
            enumMap.put((EnumMap) ekstVar, (ekst) ekwjVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public ekwj(int i, ekst ekstVar, eksu eksuVar) {
        super(eksuVar, i);
        ekstVar.getClass();
        this.d = ekstVar;
        if (eksuVar.c()) {
            return;
        }
        int i2 = ekstVar.l;
        i2 = eksuVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        eksuVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.ekwh
    public final void a(ekwi ekwiVar, Object obj) {
        ekwiVar.b(obj, this.d, this.b);
    }
}
