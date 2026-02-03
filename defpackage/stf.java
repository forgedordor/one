package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stf implements bayk, baxz, baya {
    public static final byte[] a = {-103, 57, 118, 99, -72, -91, -42, -58};
    public static final eksp b = eksp.c("BugleAudio");
    public final Context c;
    public final fdjx d;
    public final aypv e;
    private final dqsn f;
    private final fcsu g;

    public stf(Context context, fdjx fdjxVar, dqsn dqsnVar, aypv aypvVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        dqsnVar.getClass();
        aypvVar.getClass();
        fcsuVar.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.f = dqsnVar;
        this.e = aypvVar;
        this.g = fcsuVar;
    }

    private final void n(MessageCoreData messageCoreData, fdat fdatVar) {
        MessagePartCoreData messagePartCoreDataH;
        Uri uriT;
        if (!j() || (messagePartCoreDataH = messageCoreData.H()) == null || (uriT = messagePartCoreDataH.t()) == null || !messagePartCoreDataH.aY()) {
            return;
        }
        fdatVar.a(messagePartCoreDataH, uriT);
    }

    @Override // defpackage.bayk
    public final Object a(MessageCoreData messageCoreData, fcxy fcxyVar) throws IOException {
        eieu eieuVarH = eiiy.h("AudioMulitplexedMetadataListener::onBeforeInsertion");
        try {
            n(messageCoreData, new fdat() { // from class: stb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                    byte[] bArr = stf.a;
                    messagePartCoreData.getClass();
                    ((Uri) obj2).getClass();
                    messagePartCoreData.aB(Uri.EMPTY);
                    return fctx.a;
                }
            });
            fczl.a(eieuVarH, null);
            return messageCoreData;
        } finally {
        }
    }

    @Override // defpackage.baya
    public final void c(final MessageCoreData messageCoreData) {
        n(messageCoreData, new fdat() { // from class: ssy
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                Uri uri = (Uri) obj2;
                ((MessagePartCoreData) obj).getClass();
                uri.getClass();
                stf stfVar = this.a;
                auvw.k(stfVar.d, null, null, new stc(stfVar, messageCoreData, uri, null), 3);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.bayk
    public final void f(final MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (messageCoreData.cu()) {
            n(messageCoreData, new fdat() { // from class: ssz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                    Uri uri = (Uri) obj2;
                    messagePartCoreData.getClass();
                    uri.getClass();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    stf stfVar = this.a;
                    auvw.k(stfVar.d, null, null, new ste(stfVar, uri, messagePartCoreData, messageCoreData2, null), 3);
                    return fctx.a;
                }
            });
        }
    }

    @Override // defpackage.baxz
    public final void gb(final MessageCoreData messageCoreData) {
        n(messageCoreData, new fdat() { // from class: ssx
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                Uri uri = (Uri) obj2;
                ((MessagePartCoreData) obj).getClass();
                uri.getClass();
                stf stfVar = this.a;
                auvw.k(stfVar.d, null, null, new std(stfVar, messageCoreData, uri, null), 3);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.bayk
    public final boolean j() {
        Object objE = aonl.f.e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    public final void k(String str, boolean z) {
        ((ains) this.g.b()).c(str.concat(true != z ? ".Mms" : ".Rcs"));
    }

    public final void l(final Uri uri, final String str, final MessageIdType messageIdType) {
        this.f.d("AudioMultiplexedMetadataListener#updateContentUriAndStatus", new Runnable() { // from class: sta
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr = stf.a;
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("updateContentUriAndStatus-parts");
                bsjhVar.z(uri);
                bsjhVar.c(str);
                String[] strArr2 = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("updateContentUriAndStatus-messages");
                brduVar.U(4);
                brduVar.e(messageIdType);
            }
        });
    }

    public final void m(MessageCoreData messageCoreData, Uri uri) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(this.c, uri, (Map<String, String>) null);
            if (fdbq.f("audio/mp4", mediaExtractor.getMetrics().getString("android.media.mediaextractor.mime"))) {
                int trackCount = mediaExtractor.getTrackCount();
                int i = 0;
                while (true) {
                    if (i >= trackCount) {
                        break;
                    }
                    if (fdbq.f("application/am-mm-validation", mediaExtractor.getTrackFormat(i).getString("mime"))) {
                        mediaExtractor.selectTrack(i);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
                        byteBufferAllocate.getClass();
                        int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                        if (sampleData > 0) {
                            byte[] bArr = new byte[sampleData];
                            byteBufferAllocate.rewind();
                            byteBufferAllocate.get(bArr);
                            if (Arrays.equals(a, bArr)) {
                                k("Bugle.MultiplexedMetadata.Received.Valid.Count", messageCoreData.cX());
                            } else {
                                k("Bugle.MultiplexedMetadata.Received.Invalid.Count", messageCoreData.cX());
                            }
                        } else {
                            k("Bugle.MultiplexedMetadata.Received.Invalid.Count", messageCoreData.cX());
                        }
                    } else {
                        i++;
                    }
                }
            }
        } finally {
            mediaExtractor.release();
        }
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
