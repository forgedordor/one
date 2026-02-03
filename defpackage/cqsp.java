package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsp {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/image/GifCompressor");
    private final Context b;
    private final aipo c;
    private final ains d;
    private final fcsu e;

    public cqsp(Context context, aipo aipoVar, ains ainsVar, fcsu fcsuVar) {
        this.b = context;
        this.c = aipoVar;
        this.d = ainsVar;
        this.e = fcsuVar;
    }

    public final String a(Uri uri) throws NumberFormatException {
        Context context = this.b;
        if (bxlf.j(uri, context)) {
            return bxlf.h(uri, context).getAbsolutePath();
        }
        if (!cqmz.m(uri)) {
            if (cqmz.o(uri)) {
                return uri.getPath();
            }
            return null;
        }
        File fileH = bxlf.h(bxlf.d("gif", context), context);
        if (cqmz.m(uri)) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    dcnf.c(context.getResources().openRawResource(Integer.parseInt(lastPathSegment)), new FileOutputStream(fileH));
                } else {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleResizing");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 183, "GifCompressor.java")).q("uri.getLastPathSegment() is null");
                }
            } catch (FileNotFoundException e) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "BugleResizing");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(e);
                ekrdVar.X(cqnc.ab, uri);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 188, "GifCompressor.java")).q("Could not open scratch file.");
            } catch (IOException e2) {
                ekrw ekrwVarI2 = a.i();
                ekrwVarI2.X(eksq.a, "BugleResizing");
                ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarI2).g(e2);
                ekrdVar2.X(cqnc.ab, uri);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 193, "GifCompressor.java")).q("Could not copy Bugle app resource to scratch file.");
            } catch (NumberFormatException e3) {
                ekrw ekrwVarI3 = a.i();
                ekrwVarI3.X(eksq.a, "BugleResizing");
                ekrd ekrdVar3 = (ekrd) ((ekrd) ekrwVarI3).g(e3);
                ekrdVar3.X(cqnc.ab, uri);
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 186, "GifCompressor.java")).q("Invalid Bugle app resource id.");
            }
        } else {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "getScratchFileForBugleAppResource", 171, "GifCompressor.java")).t("Expected a Bugle app resource uri, but actual uri = %s", uri);
        }
        return fileH.getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Type inference failed for: r1v0, types: [cqsp] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] b(android.net.Uri r38, int r39, int r40, long r41) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqsp.b(android.net.Uri, int, int, long):byte[]");
    }
}
