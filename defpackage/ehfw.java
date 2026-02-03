package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfw implements ehdm {
    final /* synthetic */ ehey a;

    public ehfw(ehey eheyVar) {
        this.a = eheyVar;
    }

    @Override // defpackage.ehdm
    public final ehds a(String str, String str2) throws IOException {
        ehgf ehgfVar;
        ehey eheyVar = this.a;
        ehff ehffVar = eheyVar.c;
        Map map = eheyVar.b;
        String strA = ehffVar.a(str);
        Object obj = map.get(strA);
        obj.getClass();
        final ehhv ehhvVar = (ehhv) obj;
        try {
            egpe egpeVar = ehhvVar.v;
            Boolean bool = null;
            if (egpeVar.e()) {
                ehgfVar = (ehgf) eork.q(egpeVar.c());
            } else {
                eieu eieuVarH = eiiy.h("Blocking for: " + ehhvVar.w);
                try {
                    ehgf ehgfVar2 = (ehgf) ehhvVar.m.b(new eooy() { // from class: ehhh
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            return ehhvVar.v.c();
                        }
                    });
                    fczl.a(eieuVarH, null);
                    ehgfVar = ehgfVar2;
                } finally {
                }
            }
            ehgfVar.getClass();
            ehds ehdsVarA = ehgfVar.a(str2, new fdap() { // from class: ehgn
                /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
                /* JADX WARN: Type inference failed for: r4v9, types: [ehea, java.lang.Object] */
                @Override // defpackage.fdap
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.String r0 = "MendelPackageState"
                        ehhr r8 = (defpackage.ehhr) r8
                        r8.getClass()
                        ehhv r1 = r1
                        r2 = 0
                        fdae r3 = r1.u     // Catch: java.lang.Throwable -> L13 defpackage.dqmm -> L20
                        java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L13 defpackage.dqmm -> L20
                        java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L13 defpackage.dqmm -> L20
                        goto L3a
                    L13:
                        r3 = move-exception
                        java.lang.String r4 = r1.l
                        java.lang.String r5 = "Failed to get account name to commit for "
                        java.lang.String r4 = r5.concat(r4)
                        android.util.Log.e(r0, r4, r3)
                        goto L39
                    L20:
                        r3 = move-exception
                        java.lang.String r4 = r1.l
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "Getting account name to commit for "
                        r5.<init>(r6)
                        r5.append(r4)
                        java.lang.String r4 = " would block"
                        r5.append(r4)
                        java.lang.String r4 = r5.toString()
                        android.util.Log.e(r0, r4, r3)
                    L39:
                        r3 = r2
                    L3a:
                        if (r3 == 0) goto L4b
                        evqs r0 = r8.b
                        dzzs r2 = r8.d
                        fcsu r4 = r1.s
                        java.lang.Object r4 = r4.b()
                        com.google.common.util.concurrent.ListenableFuture r0 = r4.a(r3, r0, r2)
                        goto L4f
                    L4b:
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.i(r2)
                    L4f:
                        java.lang.String r2 = "Failed to commit to config"
                        defpackage.ehho.a(r0, r2)
                        ehhs r0 = r1.k
                        java.lang.String r2 = r1.l
                        java.util.Set r0 = r0.a
                        r0.add(r2)
                        diep r0 = r1.c
                        j$.time.Instant r0 = r0.f()
                        long r2 = r0.toEpochMilli()
                        long r4 = r8.c
                        long r2 = r2 - r4
                        long r2 = java.lang.Math.abs(r2)
                        java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
                        r4 = 1
                        long r4 = r8.toMillis(r4)
                        int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r8 <= 0) goto L8b
                        eooy r8 = r1.t
                        eosc r0 = r1.b
                        eooy r8 = defpackage.eiid.c(r8)
                        com.google.common.util.concurrent.ListenableFuture r8 = defpackage.eork.n(r8, r0)
                        java.lang.String r0 = "Failed to fetch after encountering old config"
                        defpackage.ehho.a(r8, r0)
                    L8b:
                        java.lang.String r8 = r1.w
                        r8.getClass()
                        fctx r8 = defpackage.fctx.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ehgn.invoke(java.lang.Object):java.lang.Object");
                }
            });
            ejwi ejwiVar = eheyVar.a;
            if (!ejwiVar.g()) {
                return ehdsVarA;
            }
            Object obj2 = eheyVar.b.get(strA);
            obj2.getClass();
            ehhv ehhvVar2 = (ehhv) obj2;
            dzxt dzxtVar = (dzxt) ejwiVar.c();
            String str3 = ehhvVar2.w;
            fcsu fcsuVar = ehhvVar2.o;
            Uri uriA = dzyc.a(str3);
            final ehds ehdsVarA2 = ((ehdt) fcsuVar.b()).a(str2);
            if (ehdsVarA2 == null) {
                throw new IllegalArgumentException("No known flag " + str2 + ", known flags: " + ((ehdt) fcsuVar.b()).b());
            }
            final String strA2 = dzxtVar.a(uriA, null, null, str2);
            if (strA2 != null) {
                int i = ehdsVarA2.b - 1;
                if (i == 0) {
                    return ehdr.c(Long.parseLong(strA2));
                }
                if (i == 1) {
                    if (deve.c.matcher(strA2).matches()) {
                        bool = true;
                    } else if (deve.d.matcher(strA2).matches()) {
                        bool = false;
                    }
                    return ehdr.a(bool != null ? bool.booleanValue() : ehdsVarA2.e());
                }
                if (i == 2) {
                    return ehdr.b(Double.parseDouble(strA2));
                }
                if (i == 3) {
                    return ehdr.e(strA2);
                }
                if (i == 4) {
                    return new ehds(new fdae() { // from class: eheq
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return evqs.x(Base64.decode(strA2, 3));
                        }
                    }, 5);
                }
                try {
                    fdae fdaeVar = new fdae() { // from class: eher
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            Object objH = ehdsVarA2.c().getParserForType().h(Base64.decode(strA2, 3));
                            objH.getClass();
                            return objH;
                        }
                    };
                    evuh evuhVar = ehdsVarA2.a;
                    evuhVar.getClass();
                    return ehdr.d(fdaeVar, evuhVar);
                } catch (evtj unused) {
                }
            }
            return ehdsVarA2;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
