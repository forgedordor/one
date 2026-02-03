package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenz implements cenw {
    private static final cqce a = cqce.g("BugleCms", "ContentUploaderImpl");
    private final eyde b;
    private final Context c;
    private final cqmz d;

    public cenz(eyde eydeVar, Context context, cqmz cqmzVar) {
        new ArrayMap();
        this.b = eydeVar;
        this.c = context;
        this.d = cqmzVar;
    }

    @Override // defpackage.cenw
    public final void a() {
        a.i().q("ContentUploaderUploadCaching is disabled");
    }

    @Override // defpackage.cenw
    public final ListenableFuture b(String str, String str2, final Uri uri) throws IOException {
        int i = SettableFuture.a;
        String string = new Uri.Builder().scheme("https").authority(cenu.a()).appendPath("upload").appendPath("v1").appendPath("files").appendQueryParameter("header.box_profile.application_id", "ANDROID_MESSAGES").appendQueryParameter("file.file_id", str2).build().toString();
        try {
            eyda eydaVar = new eyda();
            eydaVar.a = 5L;
            eydb eydbVar = new eydb(eydaVar);
            cqmz cqmzVar = this.d;
            final eycl eyclVar = new eycl(cqmzVar.f(uri), cqmzVar.a(uri), 1048576);
            eyce eyceVar = new eyce();
            eyceVar.e("X-Goog-Upload-Header-Content-Length", Long.toString(eyclVar.e()));
            String type = this.c.getContentResolver().getType(uri);
            if (!TextUtils.isEmpty(type)) {
                eyceVar.e("X-Goog-Upload-Header-Content-Type", ejuf.c(type));
            }
            eyceVar.d("Authorization", a.v(str, "Bearer "));
            eoqt eoqtVarT = eoqt.t(this.b.b(string, eyceVar, eyclVar, null, eydbVar).b());
            ejvr ejvrVar = new ejvr() { // from class: cenx
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eycy eycyVar = (eycy) obj;
                    this.a.c(eyclVar, uri);
                    return eycyVar;
                }
            };
            eoqg eoqgVar = eoqg.a;
            return eooh.g(eooq.f(eoqtVarT, ejvrVar, eoqgVar), ExecutionException.class, new eooz() { // from class: ceny
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) throws ExecutionException {
                    ExecutionException executionException = (ExecutionException) obj;
                    this.a.c(eyclVar, uri);
                    throw executionException;
                }
            }, eoqgVar);
        } catch (FileNotFoundException e) {
            return eork.h(e);
        }
    }

    public final void c(eycb eycbVar, Uri uri) {
        try {
            eycbVar.close();
        } catch (IOException e) {
            a.o("failed to close stream after uploaded the content", e);
        }
        if (uri != null) {
            axiz.i(this.c, uri);
        }
    }
}
