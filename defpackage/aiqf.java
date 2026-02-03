package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aiqf extends aivg {
    public aiqf(fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
    }

    static emrl d(int i, int i2, int i3, boolean z, Integer num, int i4) {
        emrl emrlVar = (emrl) emrt.a.createBuilder();
        emrlVar.copyOnWrite();
        emrt emrtVar = (emrt) emrlVar.instance;
        emrtVar.c = i - 1;
        emrtVar.b |= 1;
        emrlVar.copyOnWrite();
        emrt emrtVar2 = (emrt) emrlVar.instance;
        emrtVar2.d = i2 - 1;
        emrtVar2.b |= 2;
        emrlVar.copyOnWrite();
        emrt emrtVar3 = (emrt) emrlVar.instance;
        emrtVar3.e = i3 - 1;
        emrtVar3.b |= 4;
        emrlVar.copyOnWrite();
        emrt emrtVar4 = (emrt) emrlVar.instance;
        emrtVar4.b |= 8;
        emrtVar4.f = z;
        emrlVar.copyOnWrite();
        emrt emrtVar5 = (emrt) emrlVar.instance;
        emrtVar5.i = i4 - 1;
        emrtVar5.b |= 64;
        if (num != null) {
            int iIntValue = num.intValue();
            emrlVar.copyOnWrite();
            emrt emrtVar6 = (emrt) emrlVar.instance;
            emrtVar6.b |= 16;
            emrtVar6.g = iIntValue;
        }
        return emrlVar;
    }

    protected abstract evuh b(emrt emrtVar);

    protected final emrt c(emrl emrlVar) {
        final emrt emrtVar = (emrt) emrlVar.build();
        k(new Supplier() { // from class: aiqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.b(emrtVar);
            }
        });
        return emrtVar;
    }

    @Deprecated
    public final emrt e(String str, int i, boolean z, boolean z2, Long l, int i2) {
        boolean zM = le.m(str);
        int i3 = true != z ? 3 : 2;
        if (zM) {
            return c(d(2, i3, i, z2, null, i2));
        }
        cqaz.k(le.z(str));
        cqaz.l(l);
        cqaz.k(l.longValue() > 0);
        return c(d(3, i3, i, z2, Integer.valueOf((int) (l.longValue() / 1000)), i2));
    }
}
