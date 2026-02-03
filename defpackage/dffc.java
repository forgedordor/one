package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dffc extends dffa {
    private final long c;
    private final long d;
    private final HttpFileTransferPushMessage e;
    private final int f;
    private final dfhn g;
    private final String h;

    public dffc(dfes dfesVar, long j, long j2, HttpFileTransferPushMessage httpFileTransferPushMessage, Context context, dfhn dfhnVar, String str) {
        super(context, dfesVar);
        this.c = j;
        this.d = j2;
        this.e = httpFileTransferPushMessage;
        this.f = dhia.a("Bugle.RcsEngine.FileTransfer.ThumbnailDownload.Duration");
        this.g = dfhnVar;
        this.h = str;
    }

    @Override // defpackage.dffa
    protected final String a() {
        return Long.toString(this.c);
    }

    @Override // defpackage.dfif
    public final void b(byte[] bArr, Uri uri) {
        long j = this.c;
        Long lValueOf = Long.valueOf(j);
        String str = this.h;
        dhja.c("Thumbnail download completed for session ID %d, file ID %s. Received %d bytes.", lValueOf, str, Integer.valueOf(bArr.length));
        dhia.g(this.f);
        dfhe dfheVar = new dfhe();
        HttpFileTransferPushMessage httpFileTransferPushMessage = this.e;
        dfheVar.j(httpFileTransferPushMessage.mSender);
        dfheVar.i(str);
        dfheVar.f(httpFileTransferPushMessage.mFileInfo.mSize);
        dfheVar.c(httpFileTransferPushMessage.mFileInfo.mContentType);
        dfheVar.h(httpFileTransferPushMessage.mFileInfo.mUrl);
        dfheVar.g(j);
        dfheVar.b(this.d);
        dfheVar.l(bArr);
        String str2 = httpFileTransferPushMessage.mFileInfo.mFileName;
        if (str2 != null) {
            dfheVar.e(str2);
        }
        FileInfo fileInfo = httpFileTransferPushMessage.mThumbnailInfo;
        if (fileInfo != null) {
            dfheVar.k(fileInfo.mContentType);
        }
        try {
            dhjm.c(this.a, RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE, this.g.a(dfheVar.a()), dhjl.THUMBNAIL_DOWNLOAD_LISTENER);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                throw e;
            }
            dhja.i(e, "Failed to notify file transfer preview update: thumbnail is too big.", new Object[0]);
        }
    }

    @Override // defpackage.dffa, defpackage.dfif
    public final void c(dfek dfekVar) {
        super.c(dfekVar);
        dhia.c(this.f);
        dhia.d("Bugle.RcsEngine.FileTransfer.ThumbnailDownload.Failed");
    }
}
