package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.RemoteException;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.ims.filetransfer.http.PendingTransferInfo;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfer implements dfes, dgin {
    static final dfny a = dfod.a(170131477);
    public final Context b;
    public final dewo c;
    public final dfdv d;
    public final dfhn e;
    public final HashMap f;
    public final dhhv g;
    final dfhz h;
    public final dguc i;
    private final dgxb j;
    private final FileTransferEngine k;
    private final dgfu l;
    private final dffx m;
    private final ThreadPoolExecutor n;
    private final ThreadPoolExecutor o;
    private final dhgy p;
    private InstantMessageConfiguration q;

    public dfer(Context context, InstantMessageConfiguration instantMessageConfiguration, dewo dewoVar, dfia dfiaVar, FileTransferEngine fileTransferEngine, dgxb dgxbVar, dfdv dfdvVar, dgfu dgfuVar, dffx dffxVar, dfhn dfhnVar, dguc dgucVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.n = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.o = threadPoolExecutor2;
        this.f = new HashMap();
        this.g = new dhhv();
        dfep dfepVar = new dfep(this);
        this.h = dfepVar;
        this.b = context;
        this.c = dewoVar;
        this.q = instantMessageConfiguration;
        this.k = fileTransferEngine;
        this.j = dgxbVar;
        this.d = dfdvVar;
        this.l = dgfuVar;
        this.m = dffxVar;
        this.e = dfhnVar;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.p = new dhgy(context, "httpft_pending");
        this.i = dgucVar;
        dfiaVar.w("application/vnd.gsma.rcs-ft-http+xml", dfepVar);
    }

    private final void A(long j, PendingTransferInfo pendingTransferInfo) {
        this.p.i(Long.toString(j), pendingTransferInfo);
    }

    private final FileDownloadResult w(String str, FileInformation fileInformation, PendingIntent pendingIntent) {
        Runnable runnableA;
        dfew dfewVar = new dfew(this.b, this, this.e, fileInformation, pendingIntent, str);
        Optional optionalG = fileInformation.g();
        if (optionalG.isEmpty() || efis.FILE.equals(optionalG.get())) {
            dhja.c("Downloading file. Size: %d", Integer.valueOf(fileInformation.a()));
            runnableA = this.m.a(-1L, str, this.q, dfewVar, fileInformation.i(), fileInformation.h(), fileInformation.a());
        } else {
            dhja.c("Downloading thumbnail. Size: %d", Integer.valueOf(fileInformation.a()));
            runnableA = this.m.d(-1L, str, this.q, dfewVar, fileInformation.i(), fileInformation.a());
        }
        this.n.execute(runnableA);
        this.f.put(str, runnableA);
        dhch dhchVar = new dhch();
        dhchVar.b(str);
        return dhchVar.a();
    }

    private final FileTransferServiceResult x(long j, PendingTransferInfo pendingTransferInfo, dffd dffdVar) {
        if (pendingTransferInfo.mType != PendingTransferInfo.Type.UPLOAD) {
            throw new IllegalArgumentException("Attempting to resume upload with a pending download: ".concat(pendingTransferInfo.toString()));
        }
        String string = Long.toString(j);
        HashMap map = this.f;
        if (((dfig) map.get(string)) != null) {
            dhja.c("Upload already in progress for session ID %d, ignoring", Long.valueOf(j));
            return new FileTransferServiceResult(j, null, 0, "HTTP FT already uploading");
        }
        if (!this.c.i()) {
            return new FileTransferServiceResult(j, pendingTransferInfo.mRemoteParty, 4, "Not registered to RCS");
        }
        String str = pendingTransferInfo.mTransactionId;
        String str2 = pendingTransferInfo.mFileId;
        String str3 = pendingTransferInfo.mRemoteParty;
        FileTransferInfo fileTransferInfo = pendingTransferInfo.mFileTransferInfo;
        dffx dffxVar = this.m;
        InstantMessageConfiguration instantMessageConfiguration = this.q;
        deyb deybVarD = dffxVar.c.d(true, str2);
        dfgb dfgbVarA = dffxVar.b.a(j, str2, str, fileTransferInfo, instantMessageConfiguration, dffdVar, true, deybVarD, dffxVar.c().a(instantMessageConfiguration, deybVarD), dffxVar.d.b());
        map.put(string, dfgbVarA);
        this.n.execute(dfgbVarA);
        return new FileTransferServiceResult(j, str3, 0, "HTTP FT resume pending", str2);
    }

    private final FileTransferServiceResult y(String str, String str2, long j, FileTransferInfo fileTransferInfo, fcsu fcsuVar, long j2) {
        if (!this.c.i()) {
            return new FileTransferServiceResult(j, null, 4, "Not registered to RCS");
        }
        dfif dfifVar = (dfif) fcsuVar.b();
        if (fileTransferInfo.f == -1) {
            fileTransferInfo.f = dfhq.a(fileTransferInfo.a(), this.b.getContentResolver());
        }
        String string = UUID.randomUUID().toString();
        z(j, str, -1L, string, str2, fileTransferInfo);
        dhja.c("sending file [%s], session ID = %d, file ID = %s, TID = %s", fileTransferInfo, Long.valueOf(j), str2, string);
        dfgb dfgbVarB = this.m.b(j, str2, string, fileTransferInfo, this.q, dfifVar);
        this.n.execute(dfgbVarB);
        this.f.put(Long.toString(j), dfgbVarB);
        return new FileTransferServiceResult(j, j2, null, 0, "HTTP FT Pending", str2);
    }

    private final void z(long j, String str, long j2, String str2, String str3, FileTransferInfo fileTransferInfo) {
        A(j, new PendingTransferInfo(str, j2, str2, str3, fileTransferInfo));
    }

    @Override // defpackage.dfes
    public final PendingTransferInfo a(String str) {
        Serializable serializable;
        dhgy dhgyVar = this.p;
        synchronized (dhgyVar) {
            dhgyVar.d();
            serializable = (Serializable) dhgyVar.d.get(str);
            if (serializable == null) {
                serializable = null;
            }
        }
        return (PendingTransferInfo) serializable;
    }

    public final PendingTransferInfo b(String str) {
        dhgy dhgyVar = this.p;
        PendingTransferInfo pendingTransferInfoA = a(str);
        dhgyVar.f(str);
        return pendingTransferInfoA;
    }

    @Override // defpackage.dfid
    public final FileDownloadResult c(FileDownloadRequest fileDownloadRequest) {
        return w(UUID.randomUUID().toString(), fileDownloadRequest.b(), fileDownloadRequest.a());
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult d(long j) {
        Long lValueOf = Long.valueOf(j);
        dhja.c("Accept file for session ID %d", lValueOf);
        HashMap map = this.f;
        String string = Long.toString(j);
        dfig dfigVar = (dfig) map.get(string);
        if (dfigVar != null) {
            if (dfigVar instanceof dfgb) {
                return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
            }
            dhja.c("Download already in progress for session ID %s, ignoring", lValueOf);
            return new FileTransferServiceResult(j, null, 0, "HTTP FT already downloading");
        }
        PendingTransferInfo pendingTransferInfoA = a(string);
        if (pendingTransferInfoA == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (pendingTransferInfoA.mType == PendingTransferInfo.Type.UPLOAD) {
            return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = pendingTransferInfoA.mPushMessage;
        FileInfo fileInfo = httpFileTransferPushMessage.mFileInfo;
        if (q((int) fileInfo.mSize)) {
            dhja.c("Not enough space available. Rejecting", new Object[0]);
            h(j);
            return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 4, "Not enough space on the device.");
        }
        if (fileInfo.c()) {
            dhja.c("File transfer has expired.", new Object[0]);
            h(j);
            return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 3, "HTTP file transfer has expired.");
        }
        dffo dffoVarA = this.m.a(j, httpFileTransferPushMessage.mFileId, this.q, new dfex(this, this.b, this.e, httpFileTransferPushMessage, j), fileInfo.mUrl, Optional.ofNullable(fileInfo.mFileName), (int) fileInfo.mSize);
        this.n.execute(dffoVarA);
        map.put(string, dffoVarA);
        return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 0, "HTTP FT downloading");
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult e(long j) {
        HashMap map = this.f;
        if (!map.containsKey(Long.toString(j))) {
            String string = Long.toString(j);
            this.g.a(string);
            PendingTransferInfo pendingTransferInfoB = b(string);
            return pendingTransferInfoB == null ? new FileTransferServiceResult(j, null, 9, "Session not found") : new FileTransferServiceResult(j, pendingTransferInfoB.mRemoteParty, 0, "File transfer deleted");
        }
        Long lValueOf = Long.valueOf(j);
        dhja.c("Terminating ongoing file transfer due to deletion request, file transfer session ID = %d", lValueOf);
        dhja.c("Cancelling file transfer, session ID: %d", lValueOf);
        String string2 = Long.toString(j);
        dfig dfigVar = (dfig) map.remove(string2);
        if (dfigVar == null) {
            return h(j);
        }
        b(string2);
        dfigVar.a();
        return new FileTransferServiceResult(j, null, 0, "HTTP FT terminating");
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult f(long j) {
        dhja.c("Pausing file transfer for session ID %d", Long.valueOf(j));
        dfig dfigVar = (dfig) this.f.remove(Long.toString(j));
        if (dfigVar == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        dfigVar.a();
        return new FileTransferServiceResult(j, null, 0, "Pausing HTTP FT");
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult g(String str, String str2, String str3, long j, boolean z, byte[] bArr) throws XmlPullParserException {
        HttpFileTransferPushMessage httpFileTransferPushMessageA;
        int i;
        long j2;
        dfer dferVar = this;
        int i2 = 0;
        dhja.c("Received incoming HTTP file transfer push message!", new Object[0]);
        try {
            httpFileTransferPushMessageA = HttpFileTransferPushMessage.a(bArr);
        } catch (IOException e) {
            e = e;
        } catch (IllegalStateException e2) {
            e = e2;
        }
        try {
            dhja.c("%s", httpFileTransferPushMessageA.toString());
            httpFileTransferPushMessageA.mSender = str2;
            httpFileTransferPushMessageA.mRemoteInstance = str3;
            httpFileTransferPushMessageA.mFileId = str;
            dfhe dfheVar = new dfhe();
            dfheVar.j(str2);
            dfheVar.i(str);
            dfheVar.f(httpFileTransferPushMessageA.mFileInfo.mSize);
            dfheVar.c(httpFileTransferPushMessageA.mFileInfo.mContentType);
            dfheVar.h(httpFileTransferPushMessageA.mFileInfo.mUrl);
            dfheVar.b(j);
            if (str3 != null) {
                try {
                    dfheVar.a = Optional.of(str3);
                } catch (IOException e3) {
                    e = e3;
                    dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                    return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                } catch (IllegalStateException e4) {
                    e = e4;
                    dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                    return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                }
            }
            Date date = httpFileTransferPushMessageA.mFileInfo.mValidity;
            if (date != null) {
                dfheVar.m(date.getTime());
            }
            String str4 = httpFileTransferPushMessageA.mFileInfo.mFileName;
            if (str4 != null) {
                dfheVar.e(str4);
            }
            Context context = dferVar.b;
            if (!dfcq.a(context, str2)) {
                long jRegisterSession = dferVar.k.registerSession((dfid) dferVar);
                dhja.k("Broadcasting incoming File Transfer message - sessionId:%d remoteUserId:%s associatedSessionId:%d messageId:%s", Long.valueOf(jRegisterSession), dhiz.USER_ID.c(str2), Long.valueOf(j), str);
                dferVar.A(jRegisterSession, new PendingTransferInfo(httpFileTransferPushMessageA));
                FileInfo fileInfo = httpFileTransferPushMessageA.mFileInfo;
                long j3 = dferVar.q.mMaxSizeFileTransfer;
                if (j3 != 0 && fileInfo.mSize > j3) {
                    dhja.c("File exceeds max allowed size.", new Object[0]);
                    i = 10;
                } else if (dferVar.q((int) fileInfo.mSize)) {
                    dhja.c("Not enough space on the device.", new Object[0]);
                    i = 6;
                } else if (fileInfo.c()) {
                    dhja.c("File has expired.", new Object[0]);
                    i = 3;
                } else {
                    i = 0;
                }
                dfheVar.g(jRegisterSession);
                dfhn dfhnVar = dferVar.e;
                Bundle bundleA = dfhnVar.a(dfheVar.a());
                bundleA.putBoolean(RcsIntents.EXTRA_IS_BOT, z);
                if (i != 0) {
                    dferVar.h(jRegisterSession);
                    bundleA.putInt(RcsIntents.EXTRA_INFO, i);
                }
                GroupInfo groupInfoG = dferVar.c.g(j);
                if (groupInfoG != null && !groupInfoG.b()) {
                    bundleA.putParcelable(RcsIntents.EXTRA_GROUP_INFO, groupInfoG);
                }
                evqs evqsVar = httpFileTransferPushMessageA.mEncryptedData;
                if (evqsVar != null) {
                    bundleA.putByteArray(RcsIntents.EXTRA_FILE_TRANSFER_ENCRYPTED_DATA, evqsVar.I());
                }
                dhjm.c(context, RcsIntents.ACTION_INCOMING_FILE_TRANSFER, bundleA, dhjl.HTTP_FILE_TRANSFER_PROVIDER);
                if (httpFileTransferPushMessageA.b()) {
                    FileInfo fileInfo2 = httpFileTransferPushMessageA.mThumbnailInfo;
                    long j4 = fileInfo2.mSize;
                    Integer num = (Integer) dfaq.E().k().a();
                    try {
                        if (j4 > num.intValue()) {
                            dhja.q("Incoming thumbnail is too big, discarding it. Size = %d bytes, max allowed = %d bytes.", Long.valueOf(j4), num);
                        } else if (fileInfo2.c()) {
                            dhja.c("Thumbnail has expired", new Object[0]);
                        } else {
                            dferVar = this;
                            dffc dffcVar = new dffc(dferVar, jRegisterSession, j, httpFileTransferPushMessageA, context, dfhnVar, str);
                            j2 = jRegisterSession;
                            try {
                                dffx dffxVar = dferVar.m;
                                InstantMessageConfiguration instantMessageConfiguration = dferVar.q;
                                FileInfo fileInfo3 = httpFileTransferPushMessageA.mThumbnailInfo;
                                dferVar.o.execute(dffxVar.d(j2, str, instantMessageConfiguration, dffcVar, fileInfo3.mUrl, (int) fileInfo3.mSize));
                            } catch (IOException e5) {
                                e = e5;
                                i2 = 0;
                                dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                                return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                            } catch (IllegalStateException e6) {
                                e = e6;
                                i2 = 0;
                                dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                                return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                            }
                        }
                        j2 = jRegisterSession;
                    } catch (IOException e7) {
                        e = e7;
                        i2 = 0;
                        dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                        return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                    } catch (IllegalStateException e8) {
                        e = e8;
                        i2 = 0;
                        dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                        return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                    }
                } else {
                    j2 = jRegisterSession;
                }
                return new FileTransferServiceResult(j2, str2, 0, null);
            }
            try {
                try {
                    dhja.c("Contact %s is blocked. Ignore FT.", dhiz.USER_ID.c(str2));
                    Bundle bundleA2 = dferVar.e.a(dfheVar.a());
                    bundleA2.putBoolean(RcsIntents.EXTRA_IS_BLOCKED_USER, true);
                    bundleA2.putBoolean(RcsIntents.EXTRA_IS_BOT, z);
                    dhjm.c(context, RcsIntents.ACTION_INCOMING_FILE_TRANSFER, bundleA2, dhjl.HTTP_FILE_TRANSFER_PROVIDER);
                } catch (IOException e9) {
                    e = e9;
                    dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                    return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                } catch (IllegalStateException e10) {
                    e = e10;
                    dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                    return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                }
                try {
                    return new FileTransferServiceResult(-1L, str2, 1, "Contact blocked, ignored FT.", str);
                } catch (IOException | IllegalStateException e11) {
                    e = e11;
                    dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
                    return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
                }
            } catch (IOException e12) {
                e = e12;
            } catch (IllegalStateException e13) {
                e = e13;
            }
        } catch (IOException e14) {
            e = e14;
            i2 = 0;
            dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
            return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
        } catch (IllegalStateException e15) {
            e = e15;
            i2 = 0;
            dhja.i(e, "Unable to parse HTTP FT push message", new Object[i2]);
            return new FileTransferServiceResult(-1L, str2, 1, e.getMessage(), str);
        }
    }

    public final FileTransferServiceResult h(long j) {
        dhja.c("Reject file for session ID %d", Long.valueOf(j));
        PendingTransferInfo pendingTransferInfoA = a(Long.toString(j));
        if (pendingTransferInfoA == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (pendingTransferInfoA.mType == PendingTransferInfo.Type.UPLOAD) {
            return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = pendingTransferInfoA.mPushMessage;
        this.d.c(new FileTransferEvent(20013, j, 4L, httpFileTransferPushMessage.mFileId), dhjl.HTTP_FILE_TRANSFER_PROVIDER);
        return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 0, "HTTP FT rejected");
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult i(long j) throws RemoteException {
        dffb dffbVarE;
        Long lValueOf = Long.valueOf(j);
        dhja.c("Resuming file for session ID %d", lValueOf);
        dewo dewoVar = this.c;
        if (!dewoVar.i()) {
            dhja.k("Resuming file for session ID %d failed since devices is not registered to RCS", lValueOf);
            return new FileTransferServiceResult(j, null, 4, "Not registered to RCS");
        }
        String string = Long.toString(j);
        this.g.a(string);
        PendingTransferInfo pendingTransferInfoA = a(string);
        if (pendingTransferInfoA == null) {
            dhja.k("File transfer for session ID %d not found", lValueOf);
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (pendingTransferInfoA.mType == PendingTransferInfo.Type.DOWNLOAD) {
            return d(j);
        }
        if (pendingTransferInfoA.uploadPushMessageData == null) {
            String str = pendingTransferInfoA.mTransactionId;
            String str2 = pendingTransferInfoA.mFileId;
            String str3 = pendingTransferInfoA.mRemoteParty;
            if (pendingTransferInfoA.a()) {
                dhja.c("Resuming file upload to group, group session ID = %d, file transfer session ID = %s, file ID = %s, TID = %s", Long.valueOf(pendingTransferInfoA.mGroupSessionId), lValueOf, str2, str);
                dffbVarE = dffb.d(this, this.b, dewoVar, j, pendingTransferInfoA.mGroupSessionId, this.e, this.d, str2);
            } else {
                dhja.c("Resuming file upload, session ID = %d file ID = %s, TID = %s", lValueOf, str2, str);
                dffbVarE = dffb.e(this, this.b, dewoVar, j, dewoVar.a(str3), str3, this.e, this.d, str2, s(str3));
            }
            return x(j, pendingTransferInfoA, dffbVarE);
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = pendingTransferInfoA.mPushMessage;
        if (httpFileTransferPushMessage == null || httpFileTransferPushMessage.mFileInfo.c()) {
            String string2 = Long.toString(j);
            this.f.remove(string2);
            b(string2);
            return new FileTransferServiceResult(j, null, 9, "File transfer XML has expired");
        }
        String str4 = pendingTransferInfoA.mRemoteParty;
        long j2 = pendingTransferInfoA.mGroupSessionId;
        String str5 = pendingTransferInfoA.mFileId;
        byte[] bArr = pendingTransferInfoA.uploadPushMessageData;
        boolean zA = pendingTransferInfoA.a();
        dfeq dfeqVar = new dfeq(this, j, str5);
        dfdv dfdvVar = this.d;
        int iSubscribe = dfdvVar.a.subscribe(5, dfeqVar);
        dfeqVar.a = iSubscribe;
        ChatSessionServiceResult chatSessionServiceResultD = zA ? dewoVar.d(j2, str5, "application/vnd.gsma.rcs-ft-http+xml", bArr) : dewoVar.e(str4, bArr, "application/vnd.gsma.rcs-ft-http+xml", str5);
        if (chatSessionServiceResultD.getCode() != 0) {
            dfdvVar.d(iSubscribe);
        }
        ChatSessionServiceResult chatSessionServiceResult = chatSessionServiceResultD;
        return new FileTransferServiceResult(j, str4, chatSessionServiceResult.getCode(), chatSessionServiceResult.getDescription());
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult j(long j) {
        dfer dferVar;
        dffd dffdVar;
        Long lValueOf = Long.valueOf(j);
        dhja.c("Resuming upload for session ID %d", lValueOf);
        dhhv dhhvVar = this.g;
        String string = Long.toString(j);
        dhhvVar.a(string);
        PendingTransferInfo pendingTransferInfoA = a(string);
        if (pendingTransferInfoA == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (pendingTransferInfoA.mType == PendingTransferInfo.Type.DOWNLOAD) {
            return new FileTransferServiceResult(j, null, 12, "Attempted to resume upload of an incoming file");
        }
        String str = pendingTransferInfoA.mTransactionId;
        String str2 = pendingTransferInfoA.mFileId;
        if (pendingTransferInfoA.a()) {
            dhja.c("Resuming file upload to group, group session ID = %d, file transfer session ID = %d, file ID = %s, TID = %s", Long.valueOf(pendingTransferInfoA.mGroupSessionId), lValueOf, str2, str);
            Context context = this.b;
            dfhn dfhnVar = this.e;
            dfny dfnyVar = dfez.c;
            dfet dfetVar = new dfet();
            dfetVar.b(true);
            dfetVar.c(false);
            dferVar = this;
            dffdVar = new dffd(context, dfhnVar, dfetVar.d(), dferVar, j, str2);
        } else {
            dferVar = this;
            dhja.c("Resuming file upload, session ID = %d, file ID = %s, TID = %s", lValueOf, str2, str);
            Context context2 = dferVar.b;
            dfhn dfhnVar2 = dferVar.e;
            dfny dfnyVar2 = dfez.c;
            dfet dfetVar2 = new dfet();
            dfetVar2.b(true);
            dfetVar2.c(s(pendingTransferInfoA.mRemoteParty));
            dffdVar = new dffd(context2, dfhnVar2, dfetVar2.d(), dferVar, j, str2);
        }
        return x(j, pendingTransferInfoA, dffdVar);
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult k(final String str, final String str2, final long j, FileTransferInfo fileTransferInfo) {
        final long jA = this.c.a(str);
        return y(str, str2, j, fileTransferInfo, new fcsu() { // from class: dfeo
            @Override // defpackage.fcsu
            public final Object b() {
                dfer dferVar = this.a;
                dewo dewoVar = dferVar.c;
                long j2 = j;
                long j3 = jA;
                dfdv dfdvVar = dferVar.d;
                String str3 = str2;
                Context context = dferVar.b;
                String str4 = str;
                return dffb.e(dferVar, context, dewoVar, j2, j3, str4, dferVar.e, dfdvVar, str3, dferVar.s(str4));
            }
        }, jA);
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult l(final String str, final String str2, final long j, FileTransferInfo fileTransferInfo) {
        return y("", str2, j, fileTransferInfo, new fcsu() { // from class: dfem
            @Override // defpackage.fcsu
            public final Object b() {
                dfny dfnyVar = dfez.c;
                dfet dfetVar = new dfet();
                dfetVar.b(true);
                dfer dferVar = this.a;
                dfetVar.c(dferVar.s(str));
                dfez dfezVarD = dfetVar.d();
                long j2 = j;
                return new dffd(dferVar.b, dferVar.e, dfezVarD, dferVar, j2, str2);
            }
        }, -1L);
    }

    @Override // defpackage.dfid
    public final PauseDownloadResult m(PauseDownloadRequest pauseDownloadRequest) {
        HashMap map = this.f;
        String strA = pauseDownloadRequest.a();
        dfig dfigVar = (dfig) map.remove(strA);
        if (dfigVar == null) {
            dhja.q("Unable to pause download. No active download runnable. Download ID: %s", strA);
            dhcn dhcnVar = new dhcn();
            dhcnVar.b(FileTransferResult.b);
            return dhcnVar.a();
        }
        dhja.c("Pausing file download for download ID: %s", strA);
        dfigVar.a();
        dhcn dhcnVar2 = new dhcn();
        dhcnVar2.b(FileTransferResult.a);
        return dhcnVar2.a();
    }

    @Override // defpackage.dfid
    public final ResumeDownloadResult n(ResumeDownloadRequest resumeDownloadRequest) {
        HashMap map = this.f;
        String strC = resumeDownloadRequest.c();
        dfig dfigVar = (dfig) map.get(strC);
        if (dfigVar == null) {
            dhja.c("Resuming file download for download ID: %s", strC);
            w(strC, resumeDownloadRequest.b(), resumeDownloadRequest.a());
            dhcr dhcrVar = new dhcr();
            dhcrVar.b(FileTransferResult.a);
            return dhcrVar.a();
        }
        if (dfigVar.j) {
            dhja.q("Attempting to resume a file download but there is still an ongoing download runnable that will be cancelled in the near future.", new Object[0]);
        }
        dhja.c("File download is already in progress. No need to resume. Download ID: %s", strC);
        dhcr dhcrVar2 = new dhcr();
        dhcrVar2.b(FileTransferResult.a);
        return dhcrVar2.a();
    }

    @Override // defpackage.dfes
    public final void o(String str) {
        this.f.remove(str);
        b(str);
    }

    public final void p(dgyx dgyxVar, String str, long j, boolean z) throws XmlPullParserException {
        dhja.c("Received incoming HTTP file transfer push message!", new Object[0]);
        byte[] bArr = dgyxVar.f;
        try {
            dhja.c("%s", HttpFileTransferPushMessage.a(bArr).toString());
            String str2 = dgyxVar.e;
            String strB = !Objects.isNull(dgyxVar) ? dgyxVar.k : null;
            if (Objects.isNull(strB)) {
                strB = dhil.b();
                dhja.q("message.getId() was not available, generating new file id=%s", strB);
            }
            g(strB, str, str2, j, z, bArr);
        } catch (IOException e) {
            dhja.i(e, "Unable to parse HTTP FT push message", new Object[0]);
        }
    }

    @Override // defpackage.dfid
    public final boolean q(int i) {
        dgfu dgfuVar = this.l;
        long j = i;
        StatFs statFs = new StatFs(dgfuVar.b.q() ? Environment.getExternalStorageDirectory().getPath() : dgfuVar.e());
        return j > statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    @Override // defpackage.dfid
    public final boolean r(dhdc dhdcVar) {
        return !TextUtils.isEmpty(this.q.mFtHttpContentServerUri) && dhdcVar == dhdc.FILE_TRANSFER;
    }

    public final boolean s(String str) {
        ImsCapabilities imsCapabilitiesC = this.j.c(str);
        return imsCapabilitiesC != null && imsCapabilitiesC.A();
    }

    @Override // defpackage.dfid
    public final long[] t() {
        return dhic.b((Collection) Collection.EL.stream(this.f.keySet()).map(new Function() { // from class: dfen
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(Long.parseLong((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
    }

    @Override // defpackage.dgin
    public final void u(dgiq dgiqVar) {
        this.q = dgiqVar.o();
    }

    @Override // defpackage.dfid
    public final FileTransferServiceResult[] v(long j, String str, FileTransferInfo fileTransferInfo) {
        dewo dewoVar = this.c;
        if (!dewoVar.i()) {
            return dfhq.i(4, "Not registered to RCS");
        }
        if (((Boolean) a.a()).booleanValue() && j <= 0) {
            dhja.c("Failed to send a file since the group id (%d) is invalid", Long.valueOf(j));
            return dfhq.i(9, "Invalid groupChatSessionId");
        }
        if (fileTransferInfo.f == -1) {
            fileTransferInfo.f = dfhq.a(fileTransferInfo.a(), this.b.getContentResolver());
        }
        String string = UUID.randomUUID().toString();
        long jRegisterSession = this.k.registerSession((dfid) this);
        z(jRegisterSession, " ", j, string, str, fileTransferInfo);
        dhja.c("Sending file to group, group session ID = %d, file transfer session ID = %d, file ID = %s, TID = %s", Long.valueOf(j), Long.valueOf(jRegisterSession), str, string);
        dfgb dfgbVarB = this.m.b(jRegisterSession, str, string, fileTransferInfo, this.q, dffb.d(this, this.b, dewoVar, jRegisterSession, j, this.e, this.d, str));
        this.n.execute(dfgbVarB);
        this.f.put(Long.toString(jRegisterSession), dfgbVarB);
        return new FileTransferServiceResult[]{new FileTransferServiceResult(jRegisterSession, " ", 0, "HTTP FT Pending", str)};
    }
}
