package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypr implements dekj {
    final /* synthetic */ cypu a;

    public cypr(cypu cypuVar) {
        this.a = cypuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r4.add(r3);
        ((defpackage.cyqg) r0).a(r3);
     */
    @Override // defpackage.dekj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.deki r7) {
        /*
            r6 = this;
            cypu r0 = r6.a
            eigp r1 = r0.h
            java.lang.String r2 = "receiveDetections"
            r3 = 264(0x108, float:3.7E-43)
            java.lang.String r4 = "QrScanner.receiveDetections"
            java.lang.String r5 = "com/google/android/apps/messaging/ui/ditto/QrScannerFragmentPeer$BarcodeProcessor"
            eieh r1 = r1.c(r4, r5, r2, r3)
            cypc r0 = r0.k     // Catch: java.lang.Throwable -> L3d
            android.util.SparseArray r7 = r7.a     // Catch: java.lang.Throwable -> L3d
            r2 = 0
        L15:
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L3d
            if (r2 >= r3) goto L39
            java.lang.Object r3 = r7.valueAt(r2)     // Catch: java.lang.Throwable -> L3d
            com.google.android.libraries.barhopper.Barcode r3 = (com.google.android.libraries.barhopper.Barcode) r3     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r3.rawValue     // Catch: java.lang.Throwable -> L3d
            r4 = r0
            cyqg r4 = (defpackage.cyqg) r4     // Catch: java.lang.Throwable -> L3d
            java.util.Set r4 = r4.b     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L31
            int r2 = r2 + 1
            goto L15
        L31:
            r4.add(r3)     // Catch: java.lang.Throwable -> L3d
            cyqg r0 = (defpackage.cyqg) r0     // Catch: java.lang.Throwable -> L3d
            r0.a(r3)     // Catch: java.lang.Throwable -> L3d
        L39:
            r1.close()
            return
        L3d:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            r7.addSuppressed(r0)
        L46:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cypr.a(deki):void");
    }
}
