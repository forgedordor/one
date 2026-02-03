package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxok extends fcyz implements fdat {
    final /* synthetic */ bxoq a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ContentType c;
    final /* synthetic */ long d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxok(fcxy fcxyVar, bxoq bxoqVar, Uri uri, ContentType contentType, long j) {
        super(2, fcxyVar);
        this.a = bxoqVar;
        this.b = uri;
        this.c = contentType;
        this.d = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxok) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bxoq bxoqVar = this.a;
        cqsu cqsuVar = bxoqVar.b;
        Uri uri = this.b;
        ContentType contentType = this.c;
        String string = contentType.toString();
        Rect rectG = cqsuVar.g(uri, contentType.toString());
        int iWidth = rectG.width();
        int iHeight = rectG.height();
        try {
            boolean z = le.z(string);
            long j = this.d;
            coua couaVar = bxoqVar.a;
            int i = (int) j;
            return z ? couaVar.c(uri, i, iWidth, iHeight) : couaVar.b(uri, string, i, iWidth, iHeight);
        } catch (IOException e) {
            ((eksl) ((eksl) ((eksl) coua.a.i()).g(e)).h("com/google/android/apps/messaging/shared/transfer/preview/FilePreviewCreator", "getImagePreview", '^', "FilePreviewCreator.java")).q("Cannot get a file transfer preview.");
            return null;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxok bxokVar = new bxok(fcxyVar, this.a, this.b, this.c, this.d);
        bxokVar.e = obj;
        return bxokVar;
    }
}
