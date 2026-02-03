package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpe implements rez {
    private final ron a;

    public rpe(ron ronVar) {
        this.a = ronVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        ron ronVar = this.a;
        return ronVar.a(new rpa((ParcelFileDescriptor) obj, ronVar.g, ronVar.f), i, i2, rexVar, ron.e);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && ParcelFileDescriptorRewinder.d();
    }
}
