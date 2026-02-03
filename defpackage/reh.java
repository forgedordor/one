package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class reh implements req {
    final /* synthetic */ ParcelFileDescriptorRewinder a;
    final /* synthetic */ rig b;

    public reh(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, rig rigVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = rigVar;
    }

    @Override // defpackage.req
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
        rpg rpgVar;
        try {
            rpgVar = new rpg(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(rpgVar);
                rpgVar.b();
                this.a.a();
                return imageTypeC;
            } catch (Throwable th) {
                th = th;
                if (rpgVar != null) {
                    rpgVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rpgVar = null;
        }
    }
}
