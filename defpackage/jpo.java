package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpo extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ Uri d;
    final /* synthetic */ jpp e;
    final /* synthetic */ fdoa f;
    final /* synthetic */ Context g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpo(ContentResolver contentResolver, Uri uri, jpp jppVar, fdoa fdoaVar, Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = jppVar;
        this.f = fdoaVar;
        this.g = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jpo) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:6:0x000f, B:13:0x0035, B:15:0x0041, B:17:0x0049, B:9:0x0019, B:12:0x002f), top: B:27:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:13:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            fdpm r3 = (defpackage.fdpm) r3
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L77
            goto L35
        L13:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            fdpm r3 = (defpackage.fdpm) r3
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L77
            goto L41
        L1d:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.h
            r3 = r7
            fdpm r3 = (defpackage.fdpm) r3
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r1 = r6.d
            r4 = 0
            jpp r5 = r6.e
            r7.registerContentObserver(r1, r4, r5)
            fdoa r7 = r6.f     // Catch: java.lang.Throwable -> L77
            fdoc r1 = r7.r()     // Catch: java.lang.Throwable -> L77
        L35:
            r6.h = r3     // Catch: java.lang.Throwable -> L77
            r6.a = r1     // Catch: java.lang.Throwable -> L77
            r6.b = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L77
            if (r7 == r0) goto L79
        L41:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L77
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L6d
            r1.b()     // Catch: java.lang.Throwable -> L77
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L77
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r4, r5)     // Catch: java.lang.Throwable -> L77
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L77
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L77
            r6.h = r3     // Catch: java.lang.Throwable -> L77
            r6.a = r1     // Catch: java.lang.Throwable -> L77
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r3.fO(r4, r6)     // Catch: java.lang.Throwable -> L77
            if (r7 != r0) goto L35
            goto L79
        L6d:
            android.content.ContentResolver r7 = r6.c
            jpp r0 = r6.e
            r7.unregisterContentObserver(r0)
            fctx r7 = defpackage.fctx.a
            return r7
        L77:
            r7 = move-exception
            goto L7a
        L79:
            return r0
        L7a:
            android.content.ContentResolver r0 = r6.c
            jpp r1 = r6.e
            r0.unregisterContentObserver(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        jpo jpoVar = new jpo(this.c, this.d, this.e, this.f, this.g, fcxyVar);
        jpoVar.h = obj;
        return jpoVar;
    }
}
