package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhrn implements dhro {
    private final dhnz a;
    private final Optional b;

    public dhrn(dhnz dhnzVar, Optional optional) {
        dhnzVar.getClass();
        this.a = dhnzVar;
        this.b = optional;
    }

    private static final byte[] b(dhrn dhrnVar, dhvy dhvyVar, evqs evqsVar) {
        return dhrnVar.a.c(evqsVar, dhvyVar.b);
    }

    @Override // defpackage.dhro
    public final Object d(dhvy dhvyVar, fcxy fcxyVar) {
        List<etqv> arrayList;
        ByteBuffer byteBufferPut;
        boolean z = dhvyVar.e;
        if (z) {
            List list = dhvyVar.d;
            arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                etqu etquVar = (etqu) ((etqv) it.next()).toBuilder();
                etquVar.getClass();
                evqs evqsVar = ((etqv) etquVar.instance).b;
                evqsVar.getClass();
                etqw.b(evqs.x(b(this, dhvyVar, evqsVar)), etquVar);
                arrayList.add(etqw.a(etquVar));
            }
        } else {
            arrayList = dhvyVar.d;
        }
        evqs evqsVar2 = dhvyVar.c;
        if (evqsVar2.H()) {
            int i = elcz.a;
            elcv elcvVarF = elcx.a.f();
            elci elciVar = (elci) elcvVarF;
            elciVar.a((byte) 0);
            elciVar.a((byte) 2);
            for (etqv etqvVar : arrayList) {
                etrb etrbVarB = etrb.b(etqvVar.c);
                if (etrbVarB == null) {
                    etrbVarB = etrb.UNRECOGNIZED;
                }
                elcvVarF.h(etrbVarB.a());
                elcvVarF.i(etqvVar.b.d());
                elciVar.b(etqvVar.b.o());
            }
            byte[] bArrE = elcvVarF.r().e();
            bArrE.getClass();
            return bArrE;
        }
        Optional optional = this.b;
        optional.isPresent();
        if (z) {
            byte[] bArrB = b(this, dhvyVar, evqsVar2);
            byteBufferPut = ByteBuffer.allocateDirect(bArrB.length).put(bArrB);
        } else {
            byteBufferPut = ByteBuffer.allocateDirect(evqsVar2.d()).put(evqsVar2.o());
        }
        ByteBuffer byteBuffer = byteBufferPut;
        byteBuffer.getClass();
        optional.get();
        dhzt dhztVar = dhvyVar.a;
        int i2 = dhzr.a;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((etqv) arrayList.get(i3)).c;
        }
        int size2 = arrayList.size();
        byte[][] bArr = new byte[size2][];
        for (int i4 = 0; i4 < size2; i4++) {
            byte[] bArrI = ((etqv) arrayList.get(i4)).b.I();
            bArrI.getClass();
            bArr[i4] = bArrI;
        }
        byte[] bArr2 = new byte[32];
        TartarusKt.hashScarAndProtectionComponentsV2(byteBuffer, dhztVar.a, dhztVar.b, dhztVar.c, dhztVar.d, iArr, bArr, bArr2);
        return bArr2;
    }
}
