package defpackage;

import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytx implements zoh {
    private static final fdat b = new fdat() { // from class: ytp
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            return Boolean.valueOf(yji.c(ajltVar, ajltVar2));
        }
    };
    private static final fdat c = new fdat() { // from class: ytq
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            boolean z = false;
            if ((ytw.c(ajltVar.g()) || (ajltVar instanceof ytm)) && ytw.c(ajltVar2.g())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final fdat d = new fdat() { // from class: ytr
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            return Boolean.valueOf(ajltVar.a() == ajltVar2.a());
        }
    };
    private static final fdat e = new fdat() { // from class: yts
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            boolean z = false;
            if (ajltVar.r() == null && ajltVar2.r() == null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final fdat f = new fdat() { // from class: ytt
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            boolean z = false;
            if (ajltVar.e() == null && ajltVar2.e() == null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final fdat g = new fdat() { // from class: ytu
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            boolean z = true;
            if (crtr.e() && (ytw.b(ajltVar.g()) || ytw.b(ajltVar2.g()))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final fdat h = new fdat() { // from class: ytv
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            ajlt ajltVar = (ajlt) obj;
            ajlt ajltVar2 = (ajlt) obj2;
            ajltVar.getClass();
            ajltVar2.getClass();
            boolean z = false;
            if (ytw.a(ajltVar) && ytw.a(ajltVar2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    public final fcsu a;
    private final apwf i;
    private final fdat j;

    public ytx(apwf apwfVar, fcsu fcsuVar) {
        fcsuVar.getClass();
        this.i = apwfVar;
        this.a = fcsuVar;
        this.j = new fdat() { // from class: yto
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                ajlt ajltVar = (ajlt) obj;
                ajlt ajltVar2 = (ajlt) obj2;
                ajltVar.getClass();
                ajltVar2.getClass();
                Duration durationAbs = Duration.between(ajltVar.o(), ajltVar2.o()).abs();
                Object objB = this.a.a.b();
                objB.getClass();
                return Boolean.valueOf(durationAbs.compareTo(Duration.ofSeconds(((Number) objB).longValue())) < 0);
            }
        };
    }

    @Override // defpackage.zoh
    public final /* synthetic */ ajlt a(ajlt ajltVar, ajlt ajltVar2) {
        return new ytm(ajltVar, ajltVar2);
    }

    @Override // defpackage.zoh
    public final boolean b(ajlt ajltVar, ajlt ajltVar2) {
        if (!this.i.a()) {
            return false;
        }
        List listG = fcva.g(b, c, d, this.j, e, f, g, h);
        if (listG.isEmpty()) {
            return true;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((fdat) it.next()).a(ajltVar, ajltVar2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
