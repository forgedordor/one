package defpackage;

import j$.util.function.Consumer$CC;
import java.nio.ByteBuffer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class euzl {
    protected static final euzs h(euza euzaVar) {
        final euzt euztVar = (euzt) euzu.a.createBuilder();
        euztVar.getClass();
        euyr euyrVar = (euyr) euzaVar;
        euyrVar.a.ifPresent(new Consumer() { // from class: euzh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                euzt euztVar2 = euztVar;
                String str = (String) obj;
                euztVar2.copyOnWrite();
                euzu euzuVar = (euzu) euztVar2.instance;
                euzu euzuVar2 = euzu.a;
                str.getClass();
                euzuVar.b |= 2;
                euzuVar.d = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        euyrVar.b.ifPresent(new Consumer() { // from class: euzi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                euzv euzvVar = (euzv) euzw.a.createBuilder();
                int iIntValue = ((Integer) obj).intValue();
                euzvVar.copyOnWrite();
                euzw euzwVar = (euzw) euzvVar.instance;
                euzwVar.b |= 1;
                euzwVar.c = iIntValue;
                euzw euzwVar2 = (euzw) euzvVar.build();
                euzt euztVar2 = euztVar;
                euztVar2.copyOnWrite();
                euzu euzuVar = (euzu) euztVar2.instance;
                euzu euzuVar2 = euzu.a;
                euzwVar2.getClass();
                euzuVar.e = euzwVar2;
                euzuVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        euyrVar.c.ifPresent(new Consumer() { // from class: euzj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.rewind();
                evqs evqsVarW = evqs.w(byteBuffer);
                euzt euztVar2 = euztVar;
                euztVar2.copyOnWrite();
                euzu euzuVar = (euzu) euztVar2.instance;
                euzu euzuVar2 = euzu.a;
                euzuVar.b |= 1;
                euzuVar.c = evqsVarW;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final euzp euzpVar = (euzp) euzq.a.createBuilder();
        erxq erxqVar = erxq.a;
        euzpVar.copyOnWrite();
        euzq euzqVar = (euzq) euzpVar.instance;
        erxqVar.getClass();
        euzqVar.c = erxqVar;
        euzqVar.b = 4;
        euyrVar.d.ifPresent(new Consumer() { // from class: euzk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                euyy euyyVar = (euyy) ((euyz) obj);
                euzp euzpVar2 = euzpVar;
                erxq erxqVar2 = erxq.a;
                euzpVar2.copyOnWrite();
                euzq euzqVar2 = (euzq) euzpVar2.instance;
                euzq euzqVar3 = euzq.a;
                erxqVar2.getClass();
                euzqVar2.c = erxqVar2;
                euzqVar2.b = 4;
                if (euyyVar.b()) {
                    euzpVar2.copyOnWrite();
                    euzq euzqVar4 = (euzq) euzpVar2.instance;
                    if (euzqVar4.b == 4) {
                        euzqVar4.b = 0;
                        euzqVar4.c = null;
                    }
                    erxr erxrVar = (erxr) erxs.a.createBuilder();
                    int iA = euyyVar.a();
                    erxrVar.copyOnWrite();
                    erxs erxsVar = (erxs) erxrVar.instance;
                    erxsVar.b |= 1;
                    erxsVar.c = iA;
                    euzpVar2.copyOnWrite();
                    euzq euzqVar5 = (euzq) euzpVar2.instance;
                    erxs erxsVar2 = (erxs) erxrVar.build();
                    erxsVar2.getClass();
                    euzqVar5.c = erxsVar2;
                    euzqVar5.b = 1;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        euzr euzrVar = (euzr) euzs.a.createBuilder();
        euzu euzuVar = (euzu) euztVar.build();
        euzrVar.copyOnWrite();
        euzs euzsVar = (euzs) euzrVar.instance;
        euzuVar.getClass();
        euzsVar.c = euzuVar;
        euzsVar.b |= 1;
        euzq euzqVar2 = (euzq) euzpVar.build();
        euzrVar.copyOnWrite();
        euzs euzsVar2 = (euzs) euzrVar.instance;
        euzqVar2.getClass();
        euzsVar2.e = euzqVar2;
        euzsVar2.b |= 4;
        return (euzs) euzrVar.build();
    }

    public erxu g() {
        throw null;
    }
}
