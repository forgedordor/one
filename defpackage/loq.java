package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class loq implements Runnable {
    final /* synthetic */ loj a;
    final /* synthetic */ lor b;

    public loq(lor lorVar, loj lojVar) {
        this.b = lorVar;
        this.a = lojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA;
        int i;
        lor lorVar = this.b;
        lorVar.d = this.a;
        if (lorVar.d == null) {
            return;
        }
        try {
            try {
                lbc lbcVarC = lbf.c(lorVar.a, lorVar.b);
                if (lbcVarC.a != 0) {
                    throw new RuntimeException("fetchFonts failed (1)");
                }
                lbd[] lbdVarArrA = lbcVarC.a();
                if (lbdVarArrA == null || lbdVarArrA.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                lbd lbdVar = lbdVarArrA[0];
                int i2 = lbdVar.e;
                if (i2 == 2) {
                    synchronized (lorVar.c) {
                    }
                    i2 = 2;
                }
                if (i2 != 0) {
                    throw new RuntimeException(a.e(i2, "fetchFonts result is not OK. (", ")"));
                }
                Context context = lorVar.a;
                Typeface typefaceB = lbf.b(context, new lbd[]{lbdVar});
                ByteBuffer byteBufferE = kzr.e(context, lbdVar.a);
                if (byteBufferE == null) {
                    throw new RuntimeException("Unable to open file.");
                }
                loj lojVar = lorVar.d;
                ByteBuffer byteBufferDuplicate = byteBufferE.duplicate();
                byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
                lot.b(4, byteBufferDuplicate);
                char c = (char) byteBufferDuplicate.getShort();
                if (c > 'd') {
                    throw new IOException("Cannot read metadata.");
                }
                lot.b(6, byteBufferDuplicate);
                int i3 = 0;
                while (true) {
                    if (i3 >= c) {
                        jA = -1;
                        break;
                    }
                    int i4 = byteBufferDuplicate.getInt();
                    lot.b(4, byteBufferDuplicate);
                    jA = lot.a(byteBufferDuplicate);
                    lot.b(4, byteBufferDuplicate);
                    if (i4 == 1835365473) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (jA != -1) {
                    lot.b((int) (jA - byteBufferDuplicate.position()), byteBufferDuplicate);
                    lot.b(12, byteBufferDuplicate);
                    long jA2 = lot.a(byteBufferDuplicate);
                    while (i < jA2) {
                        int i5 = byteBufferDuplicate.getInt();
                        long jA3 = lot.a(byteBufferDuplicate);
                        lot.a(byteBufferDuplicate);
                        i = (i5 == 1164798569 || i5 == 1701669481) ? 0 : i + 1;
                        byteBufferDuplicate.position((int) (jA3 + jA));
                        pli pliVar = new pli();
                        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                        pliVar.e(byteBufferDuplicate.getInt(byteBufferDuplicate.position()) + byteBufferDuplicate.position(), byteBufferDuplicate);
                        lov lovVar = new lov(typefaceB, pliVar);
                        lod lodVar = ((loc) lojVar).a;
                        lodVar.b = lovVar;
                        lov lovVar2 = lodVar.b;
                        lok lokVar = lodVar.c;
                        lodVar.a = new loo(lovVar2, lokVar.j, lokVar.h, lokVar.i);
                        ArrayList arrayList = new ArrayList();
                        lokVar.a.writeLock().lock();
                        try {
                            lokVar.c = 1;
                            Set set = lokVar.b;
                            arrayList.addAll(set);
                            set.clear();
                            lokVar.a.writeLock().unlock();
                            lokVar.d.post(new loh(arrayList, lokVar.c, null));
                            lorVar.b();
                            return;
                        } catch (Throwable th) {
                            lokVar.a.writeLock().unlock();
                            throw th;
                        }
                    }
                }
                throw new IOException("Cannot read metadata.");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        } catch (Throwable th2) {
            lorVar.d.a(th2);
            lorVar.b();
        }
    }
}
