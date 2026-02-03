package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfex extends dffa {
    private final dfhn c;
    private final HttpFileTransferPushMessage d;
    private final long e;

    public dfex(dfes dfesVar, Context context, dfhn dfhnVar, HttpFileTransferPushMessage httpFileTransferPushMessage, long j) {
        super(context, dfesVar);
        this.c = dfhnVar;
        this.d = httpFileTransferPushMessage;
        this.e = j;
    }

    @Override // defpackage.dffa
    protected final String a() {
        return Long.toString(this.e);
    }

    @Override // defpackage.dfif
    public final void b(byte[] bArr, Uri uri) {
        long j = this.e;
        String string = Long.toString(j);
        dhja.c("HTTP file transfer download successful for pending transfer key %s", string);
        dfhe dfheVar = new dfhe();
        HttpFileTransferPushMessage httpFileTransferPushMessage = this.d;
        dfheVar.i(httpFileTransferPushMessage.mFileId);
        dfheVar.g(j);
        dfheVar.j(httpFileTransferPushMessage.mSender);
        dfheVar.f(httpFileTransferPushMessage.mFileInfo.mSize);
        dfheVar.c(httpFileTransferPushMessage.mFileInfo.mContentType);
        dfheVar.h(httpFileTransferPushMessage.mFileInfo.mUrl);
        dfheVar.d(uri);
        String str = httpFileTransferPushMessage.mFileInfo.mFileName;
        if (str != null) {
            dfheVar.e(str);
        }
        dhjm.c(this.a, RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED, this.c.a(dfheVar.a()), dhjl.FILE_DOWNLOAD_LISTENER);
        this.b.o(string);
    }
}
