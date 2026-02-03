package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbje {
    final /* synthetic */ SearchResults a;
    private final dbjf b;
    private final int c;

    public dbje(SearchResults searchResults, int i, dbjf dbjfVar) {
        this.a = searchResults;
        this.b = dbjfVar;
        this.c = i;
    }

    public final String a() {
        String[] strArr;
        SearchResults searchResults = this.a;
        int[] iArr = searchResults.h;
        String str = (iArr == null || (strArr = searchResults.i) == null) ? null : strArr[iArr[this.c]];
        if (str == null) {
            return null;
        }
        return str.substring(str.indexOf(45) + 1);
    }

    public final String b() {
        byte[] bArr;
        dbjf dbjfVar = this.b;
        if (dbjfVar.b == null) {
            SearchResults searchResults = this.a;
            int[] iArr = searchResults.b;
            if (iArr == null || (bArr = searchResults.c) == null) {
                return null;
            }
            dbjfVar.b = new dbjd(iArr, bArr);
        }
        dbjd dbjdVar = dbjfVar.b;
        dbjdVar.a(this.c);
        try {
            return new String(dbjdVar.d, dbjdVar.b, dbjdVar.c[dbjdVar.a], "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer c() {
        /*
            r8 = this;
            com.google.android.gms.appdatasearch.SearchResults r0 = r8.a
            int[] r1 = r0.h
            r2 = 0
            if (r1 != 0) goto L9
        L7:
            r5 = r2
            goto L52
        L9:
            dbjf r3 = r8.b
            java.util.Map[] r3 = r3.c
            java.lang.String r4 = "thing_proto"
            if (r3 == 0) goto L25
            int r5 = r8.c
            r5 = r1[r5]
            r3 = r3[r5]
            if (r3 != 0) goto L1e
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L1e:
            java.lang.Object r5 = r3.get(r4)
            dbjd r5 = (defpackage.dbjd) r5
            goto L27
        L25:
            r3 = r2
            r5 = r3
        L27:
            if (r5 != 0) goto L52
            android.os.Bundle[] r6 = r0.e
            if (r6 == 0) goto L52
            android.os.Bundle[] r0 = r0.f
            if (r0 == 0) goto L52
            int r5 = r8.c
            r7 = r1[r5]
            r6 = r6[r7]
            int[] r6 = r6.getIntArray(r4)
            r1 = r1[r5]
            r0 = r0[r1]
            byte[] r0 = r0.getByteArray(r4)
            if (r6 == 0) goto L7
            if (r0 != 0) goto L48
            goto L7
        L48:
            dbjd r5 = new dbjd
            r5.<init>(r6, r0)
            if (r3 == 0) goto L52
            r3.put(r4, r5)
        L52:
            if (r5 != 0) goto L55
            return r2
        L55:
            int r0 = r8.c
            r5.a(r0)
            int[] r0 = r5.c
            int r1 = r5.b
            int r2 = r5.a
            r0 = r0[r2]
            byte[] r2 = r5.d
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2, r1, r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbje.c():java.nio.ByteBuffer");
    }
}
