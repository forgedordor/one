package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amwx implements amwr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/content/download/DownloadContentManagerImpl");
    public final fcsu b;
    private final fcsu c;
    private final dqsn d;
    private final fcsu e;
    private final Context f;

    public amwx(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, fcsu fcsuVar3, Context context) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        dqsnVar.getClass();
        fcsuVar3.getClass();
        context.getClass();
        this.c = fcsuVar;
        this.b = fcsuVar2;
        this.d = dqsnVar;
        this.e = fcsuVar3;
        this.f = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.amwr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, android.net.Uri r6, java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.amww
            if (r0 == 0) goto L13
            r0 = r8
            amww r0 = (defpackage.amww) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amww r0 = new amww
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r8)
            fcsu r8 = r4.c
            java.lang.Object r8 = r8.b()
            chvp r8 = (defpackage.chvp) r8
            eiju r5 = r8.l(r5, r6, r7)
            r5.getClass()
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r5, r0)
            if (r8 == r1) goto L56
        L49:
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 == 0) goto L4e
            return r8
        L4e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Failed to save attachment in local storage"
            r5.<init>(r6)
            throw r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amwx.a(java.lang.String, android.net.Uri, java.lang.String, fcxy):java.lang.Object");
    }

    @Override // defpackage.amwr
    public final Object b(final String str, Uri uri, String str2) throws IOException {
        String[] strArr = PartsTable.a;
        final bsjh bsjhVar = new bsjh();
        bsjhVar.ap("createMessagePartUpdateBuilder");
        bsjhVar.z(uri);
        if (le.m(str2)) {
            Rect rectG = ((cqsu) this.e.b()).g(uri, str2);
            bsjhVar.B(rectG.width());
            bsjhVar.p(rectG.height());
        } else if (le.z(str2)) {
            cqwn cqwnVar = new cqwn(this.f);
            Point point = new Point(-1, -1);
            Duration duration = Duration.ZERO;
            duration.getClass();
            Object objB = cqwnVar.b(uri, new ejvr() { // from class: amwu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqwn cqwnVar2 = (cqwn) obj;
                    Point pointB = cqwv.b(cqwnVar2);
                    Duration durationC = cqwv.c(cqwnVar2);
                    durationC.getClass();
                    return new amwv(pointB, durationC);
                }
            }, new amwv(point, duration));
            objB.getClass();
            amwv amwvVar = (amwv) objB;
            Point point2 = amwvVar.a;
            bsjhVar.B(point2.x);
            bsjhVar.p(point2.y);
            bsjhVar.l(amwvVar.b.toMillis());
        } else if (le.f(str2)) {
            bsjhVar.l(cqmz.b(this.f, uri));
        }
        this.d.d("DownloadContentManagerImpl#saveIncomingFileTransferInBugleDb", new Runnable() { // from class: amws
            @Override // java.lang.Runnable
            public final void run() {
                bbae bbaeVar = (bbae) this.a.b.b();
                String str3 = str;
                if (bbaeVar.h(str3, bsjhVar)) {
                    return;
                }
                ekrw ekrwVarJ = amwx.a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/message/content/download/DownloadContentManagerImpl", "saveIncomingFileTransferInBugleDb$lambda$0", 81, "DownloadContentManagerImpl.kt")).t("Failed to save incoming file transfer in BugleDb with partId: %s.", str3);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.amwr
    public final Object c(final String str, Uri uri) {
        String[] strArr = PartsTable.a;
        final bsjh bsjhVar = new bsjh();
        bsjhVar.ap("createMessagePartUpdateBuilder");
        bsjhVar.u(uri);
        this.d.d("DownloadContentManagerImpl#saveIncomingThumbnailTransferInBugleDb", new Runnable() { // from class: amwt
            @Override // java.lang.Runnable
            public final void run() {
                bbae bbaeVar = (bbae) this.a.b.b();
                String str2 = str;
                if (bbaeVar.h(str2, bsjhVar)) {
                    return;
                }
                ekrw ekrwVarJ = amwx.a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/message/content/download/DownloadContentManagerImpl", "saveIncomingThumbnailTransferInBugleDb$lambda$1", 113, "DownloadContentManagerImpl.kt")).t("Failed to save incoming thumbnail in BugleDb with partId: %s.", str2);
            }
        });
        return fctx.a;
    }
}
