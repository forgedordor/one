package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocv {
    public final mfc a;
    public final odx b;
    public final AtomicInteger c = new AtomicInteger();
    private final mew d;
    private odx e;

    public ocv(mfc mfcVar, mew mewVar, odx odxVar) {
        this.a = mfcVar;
        this.d = mewVar;
        this.b = odxVar;
        this.e = odxVar;
    }

    public final synchronized void a(odx odxVar) {
        AtomicInteger atomicInteger = this.c;
        mee.c(atomicInteger.getAndDecrement() > 0);
        odw odwVar = new odw(this.e);
        String str = odxVar.b;
        odx odxVar2 = this.b;
        if (!Objects.equals(str, odxVar2.b)) {
            odwVar.b(str);
        }
        String str2 = odxVar.c;
        if (!Objects.equals(str2, odxVar2.c)) {
            odwVar.c(str2);
        }
        int i = odxVar.a;
        if (i != odxVar2.a) {
            odwVar.a = i;
        }
        int i2 = odxVar.d;
        if (i2 != odxVar2.d) {
            odwVar.b = i2;
        }
        this.e = odwVar.a();
        if (atomicInteger.get() != 0 || odxVar2.equals(this.e)) {
            return;
        }
        this.d.b(new Runnable() { // from class: ocu
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.f(-1, new mez() { // from class: oct
                    @Override // defpackage.mez
                    public final void a(Object obj) {
                    }
                });
            }
        });
    }
}
