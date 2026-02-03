package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvl {
    public static final /* synthetic */ int c = 0;
    private static final ekrg d = ekrg.c("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory");
    private static final List e;
    public final Context a;
    public final fdjx b;

    static {
        fctd.a(dlve.a);
        e = fcva.g(dlvo.b, dlvo.a);
    }

    public dlvl(Context context, fdjx fdjxVar) {
        context.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = fdjxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        ((defpackage.ekrd) r7.h().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 205, "MetadataCursorFactory.kt")).I("%s; cursor obtained at quality %s with projection %s", r12, r4, new defpackage.dlvn(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        return new defpackage.dlvd(r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dlvd b(defpackage.dlvp r11, java.lang.String r12, boolean r13, defpackage.fdap r14) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "repeatQueryWithStrategy"
            java.lang.String r1 = "com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory"
            java.util.List r2 = defpackage.dlvl.e
            java.util.Iterator r2 = r2.iterator()
            java.lang.String r3 = "MetadataCursorFactory.kt"
        Lc:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto Lc6
            java.lang.Object r4 = r2.next()
            dlvo r4 = (defpackage.dlvo) r4
            java.lang.String[] r6 = r11.a(r4)     // Catch: java.lang.Throwable -> L9d
            ekrg r7 = defpackage.dlvl.d     // Catch: java.lang.Throwable -> L9b
            ekrw r8 = r7.g()     // Catch: java.lang.Throwable -> L9b
            r9 = 163(0xa3, float:2.28E-43)
            ekrw r8 = r8.h(r1, r0, r9, r3)     // Catch: java.lang.Throwable -> L9b
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = "%s; trying quality %s with projection %s"
            dlvn r10 = new dlvn     // Catch: java.lang.Throwable -> L9b
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L9b
            r8.I(r9, r12, r4, r10)     // Catch: java.lang.Throwable -> L9b
            dlvn r8 = new dlvn     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r8 = r14.invoke(r8)     // Catch: java.lang.Throwable -> L9b
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Throwable -> L9b
            if (r8 != 0) goto L59
            ekrw r5 = r7.e()
            r7 = 184(0xb8, float:2.58E-43)
            ekrw r5 = r5.h(r1, r0, r7, r3)
            ekrd r5 = (defpackage.ekrd) r5
            dlvn r7 = new dlvn
            r7.<init>(r6)
            java.lang.String r6 = "%s; null cursor for quality %s with projection %s"
            r5.I(r6, r12, r4, r7)
            goto Lc
        L59:
            if (r13 == 0) goto L7f
            boolean r9 = r8.moveToFirst()
            if (r9 == 0) goto L63
            r5 = r8
            goto L66
        L63:
            r8.close()
        L66:
            if (r5 != 0) goto L7f
            ekrw r5 = r7.e()
            r7 = 195(0xc3, float:2.73E-43)
            ekrw r5 = r5.h(r1, r0, r7, r3)
            ekrd r5 = (defpackage.ekrd) r5
            dlvn r7 = new dlvn
            r7.<init>(r6)
            java.lang.String r6 = "%s; moveToFirst failed for cursor for quality %s with projection %s"
            r5.I(r6, r12, r4, r7)
            goto Lc
        L7f:
            ekrw r11 = r7.h()
            r13 = 205(0xcd, float:2.87E-43)
            ekrw r11 = r11.h(r1, r0, r13, r3)
            ekrd r11 = (defpackage.ekrd) r11
            dlvn r13 = new dlvn
            r13.<init>(r6)
            java.lang.String r14 = "%s; cursor obtained at quality %s with projection %s"
            r11.I(r14, r12, r4, r13)
            dlvd r11 = new dlvd
            r11.<init>(r8)
            return r11
        L9b:
            r7 = move-exception
            goto L9f
        L9d:
            r7 = move-exception
            r6 = r5
        L9f:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto Lc5
            ekrg r8 = defpackage.dlvl.d
            ekrw r8 = r8.j()
            ekrd r8 = (defpackage.ekrd) r8
            ekrw r7 = r8.g(r7)
            r8 = 172(0xac, float:2.41E-43)
            ekrw r7 = r7.h(r1, r0, r8, r3)
            ekrd r7 = (defpackage.ekrd) r7
            if (r6 == 0) goto Lbe
            dlvn r5 = new dlvn
            r5.<init>(r6)
        Lbe:
            java.lang.String r6 = "%s; query failed at quality %s with projection %s"
            r7.I(r6, r12, r4, r5)
            goto Lc
        Lc5:
            throw r7
        Lc6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlvl.b(dlvp, java.lang.String, boolean, fdap):dlvd");
    }

    public final Object a(Uri uri, dlvp dlvpVar, fcxy fcxyVar) {
        return fdin.a(this.b.hE(), new dlvk(this, dlvpVar, uri, null), fcxyVar);
    }
}
