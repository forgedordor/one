package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chwj implements chwg {
    final /* synthetic */ chwk a;

    public chwj(chwk chwkVar) {
        this.a = chwkVar;
    }

    @Override // defpackage.chwg
    public final Uri a(Uri uri, Uri uri2, final MessagePartCoreData messagePartCoreData, String str, UUID uuid) {
        fcsu fcsuVar = this.a.e;
        long id = ContentUris.parseId(uri);
        ceae ceaeVar = (ceae) fcsuVar.b();
        eieu eieuVarK = eiiy.k("PduPersister.isAttachmentNotSavedYet");
        try {
            Cursor cursorC = cdzz.c(ceaeVar.h, ceae.a(id), null, "cid=?", new String[]{"<file_transfer_original>"}, null);
            boolean z = false;
            if (cursorC != null) {
                try {
                    if (cursorC.moveToFirst()) {
                        z = true;
                    }
                } finally {
                }
            }
            if (cursorC != null) {
                cursorC.close();
            }
            eieuVarK.close();
            final Uri uriB = null;
            if (!z) {
                lt ltVar = new lt();
                ltVar.e = uri2;
                String strR = messagePartCoreData.R();
                if (strR != null) {
                    ltVar.h(strR.getBytes());
                }
                if (str != null) {
                    ltVar.k(str.getBytes());
                }
                ltVar.f("<file_transfer_thumbnail>".getBytes());
                chwk chwkVar = this.a;
                uriB = ((ceae) chwkVar.e.b()).b(ltVar, id, null);
                if (chwkVar.j.a()) {
                    ((awlc) chwkVar.k.b()).d(new Consumer() { // from class: chwh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            this.a.a.v(messagePartCoreData);
                            ((cmvv) obj).i(uriB);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return uriB;
                }
                chwkVar.h.ifPresent(new Consumer() { // from class: chwi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cmvv cmvvVar = (cmvv) ((fcsu) obj).b();
                        this.a.a.v(messagePartCoreData);
                        cmvvVar.i(uriB);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            return uriB;
        } finally {
        }
    }

    @Override // defpackage.chwg
    public final void b() {
    }
}
