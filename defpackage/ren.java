package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ren implements reo {
    final /* synthetic */ ParcelFileDescriptorRewinder a;
    final /* synthetic */ rig b;

    public ren(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, rig rigVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = rigVar;
    }

    @Override // defpackage.reo
    public final boolean a(ImageHeaderParser imageHeaderParser) throws Throwable {
        rpg rpgVar;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a.a().getFileDescriptor());
            rig rigVar = this.b;
            rpgVar = new rpg(fileInputStream, rigVar);
            try {
                boolean zE = imageHeaderParser.e(rpgVar, rigVar);
                rpgVar.b();
                this.a.a();
                return zE;
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
