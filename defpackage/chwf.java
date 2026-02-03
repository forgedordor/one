package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chwf implements chwg {
    final /* synthetic */ chwk a;

    public chwf(chwk chwkVar) {
        this.a = chwkVar;
    }

    @Override // defpackage.chwg
    public final Uri a(Uri uri, Uri uri2, final MessagePartCoreData messagePartCoreData, String str, UUID uuid) {
        final long id = ContentUris.parseId(uri);
        lt ltVar = new lt();
        ltVar.e = uri2;
        String strR = messagePartCoreData.R();
        if (strR != null) {
            ltVar.h(strR.getBytes());
        }
        if (str != null) {
            ltVar.k(str.getBytes());
        }
        ltVar.f("<file_transfer_original>".getBytes());
        chwk chwkVar = this.a;
        final Uri uriB = ((ceae) chwkVar.e.b()).b(ltVar, id, null);
        if (chwkVar.j.a()) {
            ((awlc) chwkVar.k.b()).d(new Consumer() { // from class: chwb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((cmvv) obj).h(uriB);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            chwkVar.h.ifPresent(new Consumer() { // from class: chwc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((cmvv) ((fcsu) obj).b()).h(uriB);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        chwkVar.x();
        auvh.h(eijx.g(new Callable() { // from class: chwd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ceae ceaeVar = (ceae) this.a.a.e.b();
                eieu eieuVarK = eiiy.k("PduPersister.deleteAttachmentIfPresent");
                try {
                    boolean z = cdzz.a(ceaeVar.h, ceae.a(id), "cid=?", new String[]{"<file_transfer_thumbnail>"}) > 0;
                    eieuVarK.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, chwkVar.d).e(Exception.class, new ejvr() { // from class: chwe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ = chwk.a.j();
                ekrwVarJ.X(eksq.a, "BugleTelephony");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                ekrdVar.X(cqnc.b, messagePartCoreData2.B());
                ekrdVar.X(cqnc.v, messagePartCoreData2.W());
                ekrdVar.X(cqnc.s, messagePartCoreData2.A());
                ((ekrd) ((ekrd) ekrdVar.g((Exception) obj)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl$OriginalTelephonyDbHelper", "saveAttachment", 494, "RcsTelephonyAccessImpl.java")).s("Failed to delete existing attachments in Telephony. Telephony Message: %s", id);
                return true;
            }
        }, chwkVar.i));
        return uriB;
    }

    @Override // defpackage.chwg
    public final void b() {
    }
}
