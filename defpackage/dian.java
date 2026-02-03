package defpackage;

import android.text.TextUtils;
import j$.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dian {
    public static final ekhx a = ekhx.r(dbjq.STARTUP, dbjq.TELEDOCTOR);
    public final String b;
    public final dbjt c;
    public final ejwi d;
    public final diaj e;
    public boolean f;
    private final ekhx g;
    private final Random h;
    private String i;

    public dian(String str, dbjt dbjtVar, dbkw dbkwVar, diaj diajVar, ekhx ekhxVar) {
        this.f = true;
        ejwl.m(!TextUtils.isEmpty(str), "Given String is empty or null");
        ejwl.m(true, "Sampling rate should not exceed 1.0");
        this.b = str;
        dbjtVar.getClass();
        this.c = dbjtVar;
        this.d = ejwi.i(dbkwVar);
        this.e = diajVar;
        ekhxVar.getClass();
        this.g = ekhxVar;
        this.f = false;
        this.h = new Random();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(diap diapVar) {
        dibr dibrVar;
        long j;
        diao diaoVar = new diao(diapVar);
        diaoVar.g = this;
        diap diapVarA = diaoVar.a();
        if (this.g.contains(diapVarA.a)) {
            String str = this.b;
            int i = 0;
            while (true) {
                if (i >= diapVarA.b().size()) {
                    dibrVar = null;
                    break;
                }
                dibrVar = (dibr) diapVarA.b().get(i);
                if (dibrVar.d.equals(str)) {
                    break;
                }
                i++;
            }
            if (dibrVar == null) {
                j = 0;
            } else {
                dibt dibtVar = dibrVar.e;
                if (dibtVar == null) {
                    dibtVar = dibt.a;
                }
                j = dibtVar.d;
            }
            if (j <= Instant.now().toEpochMilli()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123 A[Catch: all -> 0x01a6, TryCatch #6 {all -> 0x01a6, blocks: (B:41:0x011c, B:43:0x0123, B:45:0x0139), top: B:109:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152 A[PHI: r2
      0x0152: PHI (r2v6 diap) = (r2v5 diap), (r2v8 diap) binds: [B:42:0x0121, B:48:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be A[Catch: all -> 0x01a4, TryCatch #3 {all -> 0x01a4, blocks: (B:58:0x0153, B:63:0x0163, B:82:0x01af, B:87:0x01d1, B:86:0x01be), top: B:105:0x00b1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.diam b(defpackage.diap r19, defpackage.dias r20, defpackage.diaj r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dian.b(diap, dias, diaj):diam");
    }

    protected final diap c(diap diapVar, diaj diajVar, dias diasVar) {
        long millis;
        long epochMilli = Instant.now().toEpochMilli();
        dbjt dbjtVar = diajVar.a;
        int i = diapVar.a(dbjtVar).b;
        if (i == 5) {
            millis = TimeUnit.SECONDS.toMillis(diajVar.b);
        } else {
            millis = 3600000;
        }
        long j = millis + epochMilli;
        dibq dibqVar = (dibq) dibr.a.createBuilder();
        String str = this.b;
        dibqVar.copyOnWrite();
        dibr dibrVar = (dibr) dibqVar.instance;
        str.getClass();
        dibrVar.d = str;
        dibqVar.copyOnWrite();
        ((dibr) dibqVar.instance).c = dbjtVar.a();
        dibs dibsVar = (dibs) dibt.a.createBuilder();
        dibsVar.copyOnWrite();
        dibt dibtVar = (dibt) dibsVar.instance;
        dibtVar.e = dibu.a(i);
        dibtVar.b |= 4;
        dibsVar.copyOnWrite();
        dibt dibtVar2 = (dibt) dibsVar.instance;
        dibtVar2.b |= 1;
        dibtVar2.c = epochMilli;
        dibsVar.copyOnWrite();
        dibt dibtVar3 = (dibt) dibsVar.instance;
        dibtVar3.b |= 2;
        dibtVar3.d = j;
        dibt dibtVar4 = (dibt) dibsVar.build();
        dibqVar.copyOnWrite();
        dibr dibrVar2 = (dibr) dibqVar.instance;
        dibtVar4.getClass();
        dibrVar2.e = dibtVar4;
        dibrVar2.b |= 1;
        final dibr dibrVar3 = (dibr) dibqVar.build();
        try {
            ((eooi) diasVar.a.b(new ejvr() { // from class: diar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dibp dibpVar = (dibp) ((dibv) obj).toBuilder();
                    int i2 = 0;
                    while (true) {
                        dibr dibrVar4 = dibrVar3;
                        if (i2 >= ((dibv) dibpVar.instance).b.size()) {
                            dibpVar.copyOnWrite();
                            dibv dibvVar = (dibv) dibpVar.instance;
                            dibrVar4.getClass();
                            dibvVar.a();
                            dibvVar.b.add(dibrVar4);
                            return (dibv) dibpVar.build();
                        }
                        if (((dibr) ((dibv) dibpVar.instance).b.get(i2)).d.equals(dibrVar4.d)) {
                            dibpVar.copyOnWrite();
                            dibv dibvVar2 = (dibv) dibpVar.instance;
                            dibrVar4.getClass();
                            dibvVar2.a();
                            dibvVar2.b.set(i2, dibrVar4);
                            return (dibv) dibpVar.build();
                        }
                        i2++;
                    }
                }
            }, diasVar.b)).q();
            diao diaoVar = new diao(diapVar);
            int i2 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.j(diaoVar.e);
            ekfwVar.h(dibrVar3);
            diaoVar.e = ekfwVar.g();
            return diaoVar.a();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Update of recent fix data failed", e);
        }
    }
}
