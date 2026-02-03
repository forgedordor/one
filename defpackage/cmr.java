package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cmr {
    public static cms a(clg clgVar) throws ClassNotFoundException {
        try {
            ServiceInfo serviceInfoA = ckq.a(clgVar);
            String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (cms) Class.forName(string).getConstructor(null).newInstance(null);
            }
            throw new ClassNotFoundException("ResultManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }
}
