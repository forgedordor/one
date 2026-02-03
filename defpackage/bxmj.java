package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmj extends bxmy {
    private static final cqce g = cqce.g("BugleResizing", "ImageResizingJob");
    private final int h;
    private final int i;
    private final Context j;
    private final cqsu k;

    public bxmj(Context context, fcsu fcsuVar, ayju ayjuVar, MessagePartCoreData messagePartCoreData, bxmx bxmxVar) {
        super(messagePartCoreData, bxmxVar, ayjuVar);
        this.j = context;
        this.k = (cqsu) fcsuVar.b();
        if (messagePartCoreData.c() <= 0 || messagePartCoreData.b() <= 0) {
            messagePartCoreData.af();
        }
        this.h = messagePartCoreData.c();
        this.i = messagePartCoreData.b();
    }

    @Override // defpackage.bxmy
    protected final boolean b() {
        int i;
        eieu eieuVarK = eiiy.k("ImageResizingJob#runInBackground");
        try {
            Uri uri = this.c;
            if (uri == null) {
                g.r("Cannot resize image with null contentUri");
            } else {
                int i2 = this.h;
                if (i2 <= 0 || (i = this.i) <= 0) {
                    if (i2 <= 0) {
                        g.r("Cannot resize image with unknown width");
                    }
                    if (this.i <= 0) {
                        g.r("Cannot resize image with unknown height");
                    }
                } else {
                    byte[] bArrO = this.k.o(i2, i, i2, i, this.d, uri, this.e);
                    if (bArrO == null) {
                        cqca.n("Bugle", "Could not resize image");
                    } else {
                        z = cqmz.d(this.j, new ByteArrayInputStream(bArrO), this.b) != null;
                        if (z && le.k(this.e)) {
                            this.e = "image/jpeg";
                            z = true;
                        }
                    }
                }
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.bxmy
    protected final void a() {
    }
}
