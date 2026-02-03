package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rft implements rfh {
    @Override // defpackage.rfh
    public final /* synthetic */ rfi a(Object obj) {
        return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
    }

    @Override // defpackage.rfh
    public final Class b() {
        return ParcelFileDescriptor.class;
    }
}
