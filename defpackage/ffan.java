package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffan extends fezu {
    final /* synthetic */ ffao d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffan(ffao ffaoVar, String str) {
        super(str);
        this.d = ffaoVar;
    }

    @Override // defpackage.fezu
    public final long a() throws IOException {
        long j;
        long jNanoTime = System.nanoTime();
        ffao ffaoVar = this.d;
        Iterator it = ffaoVar.d.iterator();
        it.getClass();
        long j2 = Long.MIN_VALUE;
        ffam ffamVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ffam ffamVar2 = (ffam) it.next();
            ffamVar2.getClass();
            synchronized (ffamVar2) {
                byte[] bArr = fezr.a;
                List list = ffamVar2.l;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            feyq feyqVar = ffamVar2.a.a.i;
                            StringBuilder sb = new StringBuilder();
                            j = jNanoTime;
                            sb.append("A connection to ");
                            sb.append(feyqVar);
                            sb.append(" was leaked. Did you forget to close a response body?");
                            ffdi.b.h(sb.toString(), ((ffah) reference).a);
                            list.remove(i3);
                            ffamVar2.l();
                            if (list.isEmpty()) {
                                ffamVar2.m = j - ffaoVar.a;
                                break;
                            }
                            jNanoTime = j;
                        }
                    } else {
                        j = jNanoTime;
                        if (list.size() > 0) {
                            i2++;
                        }
                    }
                }
                i++;
                long j3 = j - ffamVar2.m;
                if (j3 > j2) {
                    j2 = j3;
                }
                if (j3 > j2) {
                    ffamVar = ffamVar2;
                }
            }
            jNanoTime = j;
        }
        long j4 = jNanoTime;
        if (j2 < ffaoVar.a && i <= 5) {
            if (i > 0) {
                return ffaoVar.a - j2;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return ffaoVar.a;
        }
        ffamVar.getClass();
        synchronized (ffamVar) {
            if (!ffamVar.l.isEmpty()) {
                return 0L;
            }
            if (ffamVar.m + j2 != j4) {
                return 0L;
            }
            ffamVar.l();
            ffaoVar.d.remove(ffamVar);
            fezr.s(ffamVar.a());
            if (!ffaoVar.d.isEmpty()) {
                return 0L;
            }
            ffaoVar.b.a();
            return 0L;
        }
    }
}
