package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.filetransfer.http.PendingTransferInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import java.io.IOException;
import java.util.Date;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dffd extends dffa {
    static final dfny c = dfod.a(183016660);
    protected final long d;
    protected final String e;
    private final dfhn f;
    private final dfez g;

    public dffd(Context context, dfhn dfhnVar, dfez dfezVar, dfes dfesVar, long j, String str) {
        super(context, dfesVar);
        this.f = dfhnVar;
        this.g = dfezVar;
        this.d = j;
        this.e = str;
    }

    private final void d() {
        if (((dfeu) this.g).a && ((Boolean) c.a()).booleanValue()) {
            this.b.o(Long.toString(this.d));
        }
    }

    @Override // defpackage.dffa
    protected final String a() {
        return Long.toString(this.d);
    }

    @Override // defpackage.dfif
    public void b(byte[] bArr, Uri uri) throws XmlPullParserException {
        HttpFileTransferPushMessage httpFileTransferPushMessageA;
        try {
            httpFileTransferPushMessageA = HttpFileTransferPushMessage.a(bArr);
            httpFileTransferPushMessageA.mFileId = this.e;
        } catch (IOException e) {
            dhja.i(e, "Error parsing HTTP file transfer for session ID %d, file ID %s", Long.valueOf(this.d), this.e);
            httpFileTransferPushMessageA = null;
        }
        if (httpFileTransferPushMessageA != null) {
            dfes dfesVar = this.b;
            long j = this.d;
            PendingTransferInfo pendingTransferInfoA = dfesVar.a(Long.toString(j));
            if (pendingTransferInfoA == null) {
                dhja.g("Pending file transfer info not found after uploading file.", new Object[0]);
                d();
                return;
            }
            pendingTransferInfoA.mPushMessage = httpFileTransferPushMessageA;
            pendingTransferInfoA.uploadPushMessageData = bArr;
            dfhe dfheVar = new dfhe();
            dfheVar.i(httpFileTransferPushMessageA.mFileId);
            dfheVar.f(httpFileTransferPushMessageA.mFileInfo.mSize);
            dfheVar.c(httpFileTransferPushMessageA.mFileInfo.mContentType);
            dfheVar.h(httpFileTransferPushMessageA.mFileInfo.mUrl);
            dfheVar.g(j);
            dfheVar.c = Optional.of(bArr);
            Date date = httpFileTransferPushMessageA.mFileInfo.mValidity;
            if (date != null) {
                dfheVar.m(date.getTime());
            }
            if (((dfeu) this.g).b) {
                String str = httpFileTransferPushMessageA.mFileInfo.mBrandedUrl;
                if (!ejwk.c(str)) {
                    dfheVar.b = Optional.of(str);
                }
            }
            dhjm.c(this.a, RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE, this.f.a(dfheVar.a()), dhjl.UPLOAD_LISTENER);
        }
        d();
    }
}
