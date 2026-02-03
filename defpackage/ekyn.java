package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyn {
    public static List a(int i, int i2, ekxa ekxaVar) throws IOException {
        int iA;
        int iA2;
        ArrayList arrayList = new ArrayList(i);
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < i) {
            long jE = ekxaVar.e();
            long j = jE / 6;
            int i4 = (int) (jE % 6);
            if (jE < 0) {
                throw new IOException("Invalid face: " + i4 + ", from faceAndCount: " + jE);
            }
            int i5 = (int) j;
            if (i5 < 0) {
                throw new IOException("Invalid count: " + i5 + ", from faceAndCount: " + jE);
            }
            ekyl ekylVar = new ekyl(i4, i5);
            arrayList2.add(ekylVar);
            i3 += ekylVar.b;
        }
        Iterator it = arrayList2.iterator();
        Iterator itEmptyIterator = !it.hasNext() ? Collections.emptyIterator() : new ekyk(it);
        ekym ekymVar = new ekym();
        ekym ekymVar2 = new ekym();
        for (int i6 = 0; i6 < i; i6++) {
            if (i6 == 0) {
                int i7 = (i2 + 7) >> 3;
                int i8 = i7 + i7;
                byte[] bArr = new byte[i8];
                if (ekxaVar.a.read(bArr) < i8) {
                    throw new IOException("EOF");
                }
                long jReverseBytes = Long.reverseBytes(eonh.b(Arrays.copyOf(bArr, 8)));
                iA = ekymVar.a(ekwy.c(jReverseBytes));
                iA2 = ekymVar2.a(ekwy.b(jReverseBytes));
            } else {
                long jE2 = ekxaVar.e();
                iA = ekymVar.a(ekwy.a(ekwy.c(jE2)));
                iA2 = ekymVar2.a(ekwy.a(ekwy.b(jE2)));
            }
            arrayList.add(ekyj.m(ekzf.i(((Integer) itEmptyIterator.next()).intValue(), ekzf.c(b(iA, i2)), ekzf.c(b(iA2, i2)))));
        }
        int iD = ekxaVar.d();
        if (iD > i) {
            throw new IOException("Number of off-center points is greater than total amount of points.");
        }
        for (int i9 = 0; i9 < iD; i9++) {
            try {
                arrayList.set(ekxaVar.d(), new ekyj(ekxaVar.b(), ekxaVar.b(), ekxaVar.b()));
            } catch (IndexOutOfBoundsException e) {
                throw new IOException("Insufficient or invalid data: ", e);
            }
        }
        return arrayList;
    }

    private static double b(int i, int i2) {
        return (i + 0.5d) / (1 << i2);
    }
}
