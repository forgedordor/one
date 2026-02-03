package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfz implements rfg {
    private final Uri a;
    private final rgb b;
    private InputStream c;

    public rfz(Uri uri, rgb rgbVar) {
        this.a = uri;
        this.b = rgbVar;
    }

    public static rfz c(Context context, Uri uri, rga rgaVar) {
        return new rfz(uri, new rgb(raw.b(context).c.a().b(), rgaVar, raw.b(context).d, context.getContentResolver()));
    }

    @Override // defpackage.rfg
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rfg
    public final void e() throws IOException {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00c8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:201), block:B:65:0x00c8 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: FileNotFoundException -> 0x00cf, PHI: r4
      0x0023: PHI (r4v10 android.database.Cursor) = (r4v3 android.database.Cursor), (r4v12 android.database.Cursor) binds: [B:23:0x003d, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:10:0x001b, B:25:0x0040, B:40:0x0080, B:61:0x00bb, B:62:0x00c1, B:58:0x00b7, B:28:0x0048, B:30:0x0053, B:32:0x005d, B:33:0x0061, B:36:0x0069, B:37:0x007c, B:14:0x0023, B:67:0x00cb, B:68:0x00ce, B:41:0x0084, B:50:0x009d, B:52:0x00a3), top: B:84:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[Catch: FileNotFoundException -> 0x00cf, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:10:0x001b, B:25:0x0040, B:40:0x0080, B:61:0x00bb, B:62:0x00c1, B:58:0x00b7, B:28:0x0048, B:30:0x0053, B:32:0x005d, B:33:0x0061, B:36:0x0069, B:37:0x007c, B:14:0x0023, B:67:0x00cb, B:68:0x00ce, B:41:0x0084, B:50:0x009d, B:52:0x00a3), top: B:84:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080 A[Catch: FileNotFoundException -> 0x00cf, TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:10:0x001b, B:25:0x0040, B:40:0x0080, B:61:0x00bb, B:62:0x00c1, B:58:0x00b7, B:28:0x0048, B:30:0x0053, B:32:0x005d, B:33:0x0061, B:36:0x0069, B:37:0x007c, B:14:0x0023, B:67:0x00cb, B:68:0x00ce, B:41:0x0084, B:50:0x009d, B:52:0x00a3), top: B:84:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[Catch: FileNotFoundException -> 0x00cf, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:10:0x001b, B:25:0x0040, B:40:0x0080, B:61:0x00bb, B:62:0x00c1, B:58:0x00b7, B:28:0x0048, B:30:0x0053, B:32:0x005d, B:33:0x0061, B:36:0x0069, B:37:0x007c, B:14:0x0023, B:67:0x00cb, B:68:0x00ce, B:41:0x0084, B:50:0x009d, B:52:0x00a3), top: B:84:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[Catch: FileNotFoundException -> 0x00cf, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:10:0x001b, B:25:0x0040, B:40:0x0080, B:61:0x00bb, B:62:0x00c1, B:58:0x00b7, B:28:0x0048, B:30:0x0053, B:32:0x005d, B:33:0x0061, B:36:0x0069, B:37:0x007c, B:14:0x0023, B:67:0x00cb, B:68:0x00ce, B:41:0x0084, B:50:0x009d, B:52:0x00a3), top: B:84:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [rff] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.NullPointerException, java.lang.Throwable] */
    @Override // defpackage.rfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.rbh r10, defpackage.rff r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfz.g(rbh, rff):void");
    }

    @Override // defpackage.rfg
    public final void d() {
    }
}
