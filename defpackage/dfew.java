package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfew extends dffa {
    private final dfhn c;
    private final FileInformation d;
    private final PendingIntent e;
    private final String f;

    public dfew(Context context, dfes dfesVar, dfhn dfhnVar, FileInformation fileInformation, PendingIntent pendingIntent, String str) {
        super(context, dfesVar);
        this.c = dfhnVar;
        this.d = fileInformation;
        this.e = pendingIntent;
        this.f = str;
    }

    @Override // defpackage.dffa
    protected final String a() {
        return this.f;
    }

    @Override // defpackage.dfif
    public final void b(byte[] bArr, Uri uri) throws PendingIntent.CanceledException {
        dhja.c("HTTP file transfer download successful for download ID %s", this.f);
        final dfhe dfheVar = new dfhe();
        FileInformation fileInformation = this.d;
        dfheVar.f(fileInformation.a());
        dfheVar.h(fileInformation.i());
        dfheVar.c(fileInformation.b().toString());
        dfheVar.i("temporary id until the TODO is done");
        fileInformation.h().ifPresent(new Consumer() { // from class: dfev
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dfheVar.e((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (!Uri.EMPTY.equals(uri)) {
            dfheVar.d(uri);
        } else if (bArr.length > 0) {
            dfheVar.l(bArr);
            dfheVar.k(fileInformation.b().toString());
        }
        Bundle bundleA = this.c.a(dfheVar.a());
        Optional optionalG = fileInformation.g();
        Intent intentPutExtras = new Intent((optionalG.isEmpty() || efis.FILE.equals(optionalG.get())) ? RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED : RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE).putExtras(bundleA);
        try {
            Context context = this.a;
            dhff.c(context, intentPutExtras);
            this.e.send(context, 0, intentPutExtras);
        } catch (Exception e) {
            dhja.i(e, "Callback intent canceled for downloadFile. download ID: %s", this.f);
        }
        this.b.o(this.f);
    }
}
