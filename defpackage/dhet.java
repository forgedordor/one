package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhet {
    private ewkl a = null;

    static Intent a(ewkl ewklVar) {
        Intent intent = new Intent();
        int i = ewklVar.c;
        int iA = ewry.a(i);
        if (iA != 0 && iA == 2) {
            intent.setAction("com.google.android.ims.SIM_LOADED");
            Bundle bundle = new Bundle();
            bundle.putBoolean("SIM_CHANGED", ewklVar.d);
            intent.putExtras(bundle);
            return intent;
        }
        int iA2 = ewry.a(i);
        if (iA2 != 0 && iA2 == 3) {
            intent.setAction("com.google.android.ims.SIM_ABSENT");
        }
        return intent;
    }

    final synchronized Intent b() {
        ewkl ewklVar = this.a;
        if (ewklVar == null) {
            return null;
        }
        return a(ewklVar);
    }

    public final synchronized ewkl c() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized java.lang.String d() {
        /*
            r3 = this;
            monitor-enter(r3)
            ewkl r0 = r3.a     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L21
            int r0 = r0.c     // Catch: java.lang.Throwable -> L25
            int r1 = defpackage.ewry.a(r0)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto Le
            goto L14
        Le:
            r2 = 2
            if (r1 != r2) goto L14
            java.lang.String r0 = "LOADED"
            goto L23
        L14:
            int r0 = defpackage.ewry.a(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1b
            goto L21
        L1b:
            r1 = 3
            if (r0 != r1) goto L21
            java.lang.String r0 = "ABSENT"
            goto L23
        L21:
            java.lang.String r0 = "UNKNOWN"
        L23:
            monitor-exit(r3)
            return r0
        L25:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhet.d():java.lang.String");
    }

    public final synchronized void e(ewkl ewklVar) {
        ewkk ewkkVar = (ewkk) ewkl.a.createBuilder();
        int iA = ewry.a(ewklVar.c);
        int i = 1;
        if (iA == 0) {
            iA = 1;
        }
        ewkkVar.copyOnWrite();
        ewkl ewklVar2 = (ewkl) ewkkVar.instance;
        ewklVar2.c = iA - 1;
        ewklVar2.b |= 1;
        String str = ewklVar.f;
        ewkkVar.copyOnWrite();
        ewkl ewklVar3 = (ewkl) ewkkVar.instance;
        str.getClass();
        ewklVar3.b |= 8;
        ewklVar3.f = str;
        int iA2 = ewrw.a(ewklVar.e);
        if (iA2 != 0) {
            i = iA2;
        }
        ewkkVar.copyOnWrite();
        ewkl ewklVar4 = (ewkl) ewkkVar.instance;
        ewklVar4.e = i - 1;
        ewklVar4.b |= 4;
        this.a = (ewkl) ewkkVar.build();
    }

    public final boolean f() {
        return "LOADED".equals(d());
    }
}
